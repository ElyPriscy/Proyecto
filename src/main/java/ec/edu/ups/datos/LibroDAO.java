package ec.edu.ups.datos;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Libro;

@Stateless
public class LibroDAO {
	@Inject
	private EntityManager em;
	
	public void insertarLibro(Libro libro) {
		em.persist(libro);
			
	}
	public void actualizarLibro(Libro libro) {
		em.merge(libro);
		
		
	}
	
	public void borrarLibro(int isbn) {
		em.remove(buscarLibro(isbn));
	
}
	public Libro buscarLibro(int isbn) {
		
		return em.find(Libro.class, isbn);
}
	public List<Libro> listarLibros() {
		String jpql = "select l from Libros l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Libro> libroz = query.getResultList();

		return libroz;
	}
	
		
	
	

}
