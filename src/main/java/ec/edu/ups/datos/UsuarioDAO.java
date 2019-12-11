package ec.edu.ups.datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

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
		em.remove(leerUsuario(userID));
	
}
	public Usuario leerUsuario(int userID) {
		em.find(Usuario.class, userID);
		return null;
}

}
