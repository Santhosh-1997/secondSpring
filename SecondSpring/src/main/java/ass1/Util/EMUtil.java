package ass1.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("secondSpring");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
