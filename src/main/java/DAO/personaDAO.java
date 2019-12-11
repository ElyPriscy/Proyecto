package DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import Modelo.Persona;

@Stateless
public class personaDAO {

	@Inject
	private EntityManager em; 
	
	public void insertar(Persona p)
	{
		em.persist(p);
	}
}
