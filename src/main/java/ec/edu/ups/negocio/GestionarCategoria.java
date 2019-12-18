package ec.edu.ups.negocio;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.CategoriaDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;

@Stateless
public class GestionarCategoria {

	@Inject
	private CategoriaDAO cdao;
	
	
	
	
	public Categoria guardarCategoria(Categoria categoria) {
		cdao.insertarCategoria(categoria);
		return categoria;
		
	}
	public Categoria actualizarCategoria(Categoria categoria) {
		cdao.actualizarCategoria(categoria);
		
		return categoria;
	}
	public void borrarCategoria(int id) {
		cdao.borrarCategoria(id);
		
	}
	public Categoria buscarCategoria(int id) {
		return cdao.buscarCategoria(id);
	}
	public List<Categoria> listarCategorias() {
		
		return cdao.listarCategorias();
	}
	

}
