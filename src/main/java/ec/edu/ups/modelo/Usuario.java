package ec.edu.ups.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario {
	@Id
	private int userID;
	private String nombre;
	private String apellido;
	private String direccion; 
	private int edad;
	private boolean rol;
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "votos")
	private List<Voto>votos;
	
	public int getUserId() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isRol() {
		return rol;
	}
	public void setRol(boolean rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Usuario [userID=" + userID + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", edad=" + edad + ", rol=" + rol + "]";
	} 
	
	
}
