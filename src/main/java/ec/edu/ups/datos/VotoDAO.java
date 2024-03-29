package ec.edu.ups.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Libro;
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
		em.remove(buscarVoto(isbn));
	
}
	public Voto buscarVoto(int isbn) {
		em.find(Voto.class, isbn);
		return null;
}
	public List<Voto> listarVotos() {
		String jpql = "select l from Votos l";
		Query query = em.createQuery(jpql, Libro.class);
		List<Voto> v = query.getResultList();

		return v;
	}

}
