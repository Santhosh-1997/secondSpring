package ass1.DAOLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ass1.Beans.Employee;
import ass1.Exception.EmployeeException;
import ass1.Util.EMUtil;

@Repository
public class EmployeeRepoImp implements EmployeeRepo {

	@Override
	public boolean saveEmployee(Employee emp) {

		boolean flag = false;

		EntityManager em = EMUtil.getEntityManager();

		// System.out.println(emp.toString());

		
		  try {
			  em.getTransaction().begin();
			  
			  em.persist(emp); 
			  flag = true;
			  
			  em.getTransaction().commit();
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
		  
		  em.close();
		 

		return flag;
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> allEmployee = null;

		EntityManager em = EMUtil.getEntityManager();

		String jpql = "from Employee";

		TypedQuery<Employee> tq = em.createQuery(jpql, Employee.class);

		allEmployee = tq.getResultList();

		em.close();

		return allEmployee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;

		EntityManager em = EMUtil.getEntityManager();

		try {
			employee = em.find(Employee.class, empId);
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}

		em.close();

		return employee;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		String result = null;

		EntityManager em = EMUtil.getEntityManager();

		try {
			Employee employee = em.find(Employee.class, empId);

			em.getTransaction().begin();

			em.remove(employee);

			em.getTransaction().commit();

			result = "deleted";

		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}

		em.close();

		return result;
	}

}
