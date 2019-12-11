package ec.edu.ups.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Resourse {
	@Produces
	@PersistenceContext
	private EntityManager em;
	

}
