package Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import DAO.personaDAO;
import Modelo.Persona;


@ManagedBean
public class PersonaController {

	private Persona persona;
	
	
	@Inject
	private personaDAO pdao;
	
	@PostConstruct
	public void init(){
		 persona = new Persona();
	}
	
	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public personaDAO getPdao() {
		return pdao;
	}


	public void setPdao(personaDAO pdao) {
		this.pdao = pdao;
	}


	public String cargarDatos(){
		pdao.insertar(persona);
		return null;
	}


	
	
}
