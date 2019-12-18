package ec.edu.ups.vista;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import ec.edu.ups.datos.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.negocio.GestionarUsuario;

@ManagedBean
public class UsuarioMB {
	
	private Usuario usuario;
	private List<Usuario>usuarios;

	@Inject
	private GestionarUsuario uon;
	
	
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
	
	public void listar() {
		usuarios = uon.listarUsuarios();
	}

public String guardarUusuario() {
	uon.guardarUusuario(usuario);
	//usuarios.add(usuario);
	listar();
	return null;
	
}
public String actualizarUsuario() {
	uon.actualizarUsuario(usuario);
	listar();
	return null;
}
public String borrarUsuario(int id) {
	uon.borrarUsuario(id);
	listar();
	return null;
}

}
