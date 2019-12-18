package ec.edu.ups.negocio;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.VotoDAO;
import ec.edu.ups.modelo.Voto;

@Stateless
public class GestionarVoto {
	
	@Inject
	private VotoDAO vdao;
	
	
	public Voto guardarVoto(Voto voto) {
		vdao.insertarVoto(voto);
		return voto;
		
	}
	public Voto actualizarVoto(Voto voto) {
		vdao.actualizarVoto(voto);
		
		return voto;
	}
	public void borrarVoto(int id) {
		vdao.borrarVoto(id);
		
	}
	public Voto buscarVoto(int id) {
		return vdao.buscarVoto(id);
	}
	public List<Voto> listarVoto() {
		
		return vdao.listarVotos();
	}

}
