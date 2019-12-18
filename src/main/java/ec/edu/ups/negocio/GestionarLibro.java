package ec.edu.ups.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.edu.ups.datos.LibroDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;

@Stateless
public class GestionarLibro {

@Inject
private LibroDAO ldao;

public Libro guardarLibro(Libro libro) {
	ldao.insertarLibro(libro);
	return libro;
	
}
public Libro actualizarLibro(Libro libro) {
	ldao.actualizarLibro(libro);
	
	return libro;
}
public void borrarLibro(int isbn) {
	
	ldao.borrarLibro(isbn);
}
public Libro buscarLibro(int id) {
	return ldao.buscarLibro(id);
}
public List<Libro> listarLibro() {
	return ldao.listarLibros();
}
//public String addCategorias() {
//	libro.addCategorias(new Categoria());
//	return null;
//}
}
