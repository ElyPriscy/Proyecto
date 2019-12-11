package ec.edu.ups.datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Voto;


@Stateless
public class VotoDAO {
	@Inject
	private EntityManager em;
	
	public void insertarVoto(Voto voto) {
		em.persist(voto);
			
	}
	public void actualizarVoto(Voto voto) {
		em.merge(voto);
		
		
	}
	public void borrarVoto(int isbn) {
		em.remove(leerVoto(isbn));
	
}
	public Voto leerVoto(int isbn) {
		em.find(Voto.class, isbn);
		return null;
}

}
