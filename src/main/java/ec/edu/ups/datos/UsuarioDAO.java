package ec.edu.ups.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Usuario;

@Stateless
public class UsuarioDAO {
	@Inject
	private EntityManager em;
	
	public void insertarUsuario(Usuario u) {
		em.persist(u);
			
	}
	public void actualizarUsuario(Usuario u) {
		em.merge(u);
		
		
	}
	public void borrarUsuario(int userID) {
		em.remove(buscarUsuario(userID));
	
}
	public Usuario buscarUsuario(int userID) {
		//em.find(Usuario.class, userID);
		return em.find(Usuario.class, userID);
}
	public List<Usuario> listarUsuarios() {
		String jpql = "select l from Usuarios l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Usuario> u = query.getResultList();

		return u;
	}

}
