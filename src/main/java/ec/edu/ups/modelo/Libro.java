package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name ="Libros")
public class Libro {
	@Id
	private int isbn;
	private String titulo;
	private String autor; 
	private String año;
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
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
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
//	public List<Categoria> getCategorias() {
//		return categorias;
//	}
//	public void setCategorias(List<Categoria> categorias) {
//		this.categorias = categorias;
//	}
//	public void addCategoria(Categoria categoria) {
//		if(categorias==null) {
//			categorias = new ArrayList<>();
//			categorias.add(categoria); 
//	}
		
	//}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", editorial="
				+ editorial + ", cantidad=" + cantidad + ", imagenS=" + imagenS + ", imagenM=" + imagenM + ", imagenG="
				+ imagenG + ", categorias=" + "]";
	}

	
	
	

	

}
