package ec.edu.ups.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.CategoriaDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.negocio.GestionarCategoria;

@ManagedBean
public class CategoriaMB {
	private List<Categoria>categorias;
	private Categoria categoria;
	@Inject
	private GestionarCategoria con;
	@PostConstruct
	public void init() {
		categoria= new Categoria();
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public String guardarCategoria() {
		con.guardarCategoria(categoria);
		listar();
		return null;
		
	}
	public void listar() {
		categorias = con.listarCategorias();
	}
	public String actualizarCategoria() {
		con.actualizarCategoria(categoria);
		listar();
		return null;
	}
	public String borrarCategoria(int id) {
		con.borrarCategoria(id);
		listar();
		return null;
	}
	
	

}
