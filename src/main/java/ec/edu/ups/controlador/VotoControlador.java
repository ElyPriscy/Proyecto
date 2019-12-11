package ec.edu.ups.controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.VotoDAO;
import ec.edu.ups.modelo.Voto;

@ManagedBean
public class VotoControlador {
	private List<Voto>votos;
	private Voto voto;
	@Inject
	private VotoDAO vdao;
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
	public String guardarVoto() {
		vdao.insertarVoto(voto);
		return null;
		
	}
	public String actualizarVoto() {
		vdao.actualizarVoto(voto);
		
		return null;
	}
	public String borrarVoto() {
		vdao.borrarVoto(voto.getVotoID());
		return null;
	}
	public String listarVoto() {
		vdao.leerVoto(voto.getVotoID());
		return null;
	}

}
