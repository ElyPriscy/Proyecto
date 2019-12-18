package ec.edu.ups.negocio;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import ec.edu.ups.datos.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

@Stateless
public class GestionarUsuario {
	


	@Inject
	private UsuarioDAO udao;
	
	
	
	

public Usuario guardarUusuario(Usuario usuario) {
	udao.insertarUsuario(usuario);
	//usuarios.add(usuario);
	return usuario;
	
}
public Usuario actualizarUsuario(Usuario usuario) {
	udao.actualizarUsuario(usuario);
	return usuario;
}
public void borrarUsuario(int id) {
	udao.borrarUsuario(id);
	
}
public Usuario buscarUsuario(int id) {
	return udao.buscarUsuario(id);
}

public List<Usuario>listarUsuarios(){
	return udao.listarUsuarios();
	
}
	

}
