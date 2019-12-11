package ec.edu.ups.datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Categoria;


@Stateless
public class CategoriaDAO {
	@Inject
	private EntityManager em;
	
	public void insertarCategoria(Categoria categoria) {
		em.persist(categoria);
			
	}
	public void actualizarCategoria(Categoria categoria) {
		em.merge(categoria);
		
		
	}
	public void borrarCategoria(int isbn) {
		em.remove(leerCategoria(isbn));
		
}
	public Categoria leerCategoria(int isbn) {
		em.find(Categoria.class, isbn);
		return null;
}

}
