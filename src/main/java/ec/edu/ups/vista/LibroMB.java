package ec.edu.ups.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.datos.LibroDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.negocio.GestionarCategoria;
import ec.edu.ups.negocio.GestionarLibro;

@ManagedBean
@ViewScoped
public class LibroMB {
private Libro libro;
private List<Libro>libros;

@Inject
private GestionarLibro lon;

@Inject
private GestionarCategoria con;


@PostConstruct
public void init() {
	libro= new Libro();
	//libros=lon.listarLibro();
	//libro.addCategorias(new Categoria());
}


public Libro getLibro() {
	return libro;
}


public void setLibro(Libro libro) {
	this.libro = libro;
}


public List<Libro> getLibros() {
	return libros;
}


public void setLibros(List<Libro> libros) {
	this.libros = libros;
}
public String crearLibro() {
	lon.guardarLibro(libro);
	libro = null;
	listar();
	return null;
}
public void listar() {
	libros = lon.listarLibro();
}
public String eliminar(int isbn) {
	lon.borrarLibro(isbn);
	listar();
	return null;
}
public Categoria buscarCategoria(int id) {
	
	return con.buscarCategoria(id);
}
public String addCategoria(int id) {
	libro.addCategorias(buscarCategoria(id));
	return null;
}

}
