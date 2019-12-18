package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Libros")
public class Libro {
	@Id
	@GeneratedValue
	private int isbn;
	private String titulo;
	private String autor; 
	private String anio;
	private String editorial;
	private int cantidad; 
	private String imagenS;
	private String imagenM;
	private String imagenG;
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name = "libro", referencedColumnName = "isbn")
	//@JoinColumn(name="libro")
	private List<Categoria> categorias;
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "votos")
	private List<Voto>votos;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getImagenS() {
		return imagenS;
	}
	public void setImagenS(String imagenS) {
		this.imagenS = imagenS;
	}
	public String getImagenM() {
		return imagenM;
	}
	public void setImagenM(String imagenM) {
		this.imagenM = imagenM;
	}
	public String getImagenG() {
		return imagenG;
	}
	public void setImagenG(String imagenG) {
		this.imagenG = imagenG;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	
	public void addCategorias(Categoria categoria) {
		if(categorias==null) {
			categorias= new ArrayList<>();
			categorias.add(categoria);
		}
	
	}
	
}
