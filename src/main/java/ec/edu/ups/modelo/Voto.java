package ec.edu.ups.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "votos")
public class Voto {
	@Id
	@GeneratedValue
	private int votoID;
	
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Libro libro;
	public int getVotoID() {
		return votoID;
	}
	public void setVotoID(int votoID) {
		this.votoID = votoID;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Voto [votoID=" + votoID + ", usuario=" + usuario + ", libro=" + libro + "]";
	}

}
