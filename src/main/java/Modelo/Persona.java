package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Personatbl")
public class Persona {

	@Id
	@Column(name="codigoper")
	@NotNull
	private int codigo;
	
	@Column(name="nombreper")
	private String nombre;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
}
