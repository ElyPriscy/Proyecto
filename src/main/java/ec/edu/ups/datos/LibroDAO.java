package ec.edu.ups.datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Categoria;
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
		em.remove(leerLibro(isbn));
	
}
	public Libro leerLibro(int isbn) {
		em.find(Libro.class, isbn);
		return null;
}
	

}
