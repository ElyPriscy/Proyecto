package resources;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class resource {

	@Produces
	@PersistenceContext
	private EntityManager em;
}
