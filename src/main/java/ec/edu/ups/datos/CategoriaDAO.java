package ec.edu.ups.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Usuario;


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
		em.remove(buscarCategoria(isbn));
		
}
	public Categoria buscarCategoria(int isbn) {
		em.find(Categoria.class, isbn);
		return null;
}
	public List<Categoria> listarCategorias() {
		String jpql = "select l from Categorias l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Categoria> c = query.getResultList();

		return c;
	}

}
