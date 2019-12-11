package ec.edu.ups.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libro.class)
public abstract class Libro_ {

	public static volatile SingularAttribute<Libro, String> editorial;
	public static volatile SingularAttribute<Libro, String> imagenG;
	public static volatile SingularAttribute<Libro, String> imagenS;
	public static volatile SingularAttribute<Libro, Integer> isbn;
	public static volatile ListAttribute<Libro, Categoria> categorias;
	public static volatile SingularAttribute<Libro, String> titulo;
	public static volatile SingularAttribute<Libro, Integer> cantidad;
	public static volatile ListAttribute<Libro, Voto> votos;
	public static volatile SingularAttribute<Libro, String> autor;
	public static volatile SingularAttribute<Libro, String> anio;
	public static volatile SingularAttribute<Libro, String> imagenM;

}

