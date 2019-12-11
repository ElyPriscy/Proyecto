package ec.edu.ups.controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.LibroDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;

@ManagedBean
public class LibroControlador {
private Libro libro;
private List<Libro>libros;
@Inject
private LibroDAO ldao;


@PostConstruct
public void init() {
	libro= new Libro();
	libro.addCategorias(new Categoria());
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


public LibroDAO getLdao() {
	return ldao;
}


public void setLdao(LibroDAO ldao) {
	this.ldao = ldao;
}

public String guardarLibro() {
	ldao.insertarLibro(libro);
	return null;
	
}
public String actualizarLibro() {
	ldao.actualizarLibro(libro);
	
	return null;
}
public String borrarLibro() {
	ldao.borrarLibro(libro.getIsbn());
	return null;
}
public String listarLibro() {
	ldao.leerLibro(libro.getIsbn());
	return null;
}

}
