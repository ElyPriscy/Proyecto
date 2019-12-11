package ec.edu.ups.controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.CategoriaDAO;
import ec.edu.ups.modelo.Categoria;

@ManagedBean
public class CategoriaControlador {
	private List<Categoria>categorias;
	private Categoria categoria;
	@Inject
	private CategoriaDAO cdao;
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
		cdao.insertarCategoria(categoria);
		return null;
		
	}
	public String actualizarCategoria() {
		cdao.actualizarCategoria(categoria);
		
		return null;
	}
	public String borrarCategoria() {
		cdao.borrarCategoria(categoria.getCategoriaID());
		return null;
	}
	public String listarCategoria() {
		cdao.leerCategoria(categoria.getCategoriaID());
		return null;
	}
	

}
