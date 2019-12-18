package ec.edu.ups.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.VotoDAO;
import ec.edu.ups.modelo.Voto;
import ec.edu.ups.negocio.GestionarVoto;

@ManagedBean
public class VotoMB {
	private List<Voto>votos;
	private Voto voto;
	@Inject
	private GestionarVoto von;
	@PostConstruct
	public void init() {
		voto= new Voto();
		
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public Voto getVoto() {
		return voto;
	}
	public void setVoto(Voto voto) {
		this.voto = voto;
	}
	public void listar() {
		votos = von.listarVoto();
	}
	public String guardarVoto() {
		von.guardarVoto(voto);
		listar();
		return null;
		
	}
	public String actualizarVoto() {
		von.actualizarVoto(voto);
		listar();
		return null;
	}
	public String borrarVoto(int id) {
		von.borrarVoto(id);
		listar();
		return null;
	}
	

}
