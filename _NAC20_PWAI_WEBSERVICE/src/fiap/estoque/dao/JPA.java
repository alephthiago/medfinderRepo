package fiap.estoque.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("FIAPDB");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
