package ec.edu.ups.controlador;



import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

@ManagedBean
public class UsuarioControlador {
	
	private Usuario usuario;
	private List<Usuario>usuarios;

	@Inject
	private UsuarioDAO udao;
	
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();

		
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
public String guardarUusuario() {
	udao.insertarUsuario(usuario);
	return null;
	
}
public String actualizarUsuario() {
	udao.actualizarUsuario(usuario);
	return null;
}
public String borrarUsuario() {
	udao.borrarUsuario(usuario.getUserId());
	return null;
}
public String listarUsuario() {
	udao.leerUsuario(usuario.getUserId());
	return null;
}
	

}
