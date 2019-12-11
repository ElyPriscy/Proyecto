package ec.edu.ups.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Voto.class)
public abstract class Voto_ {

	public static volatile SingularAttribute<Voto, Integer> votoID;
	public static volatile SingularAttribute<Voto, Libro> libro;
	public static volatile SingularAttribute<Voto, Usuario> usuario;

}

