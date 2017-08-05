package br.com.livraria.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-04T21:07:33.321-0300")
@StaticMetamodel(Livro.class)
public class Livro_ {
	public static volatile SingularAttribute<Livro, Integer> id;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, String> isbn;
	public static volatile SingularAttribute<Livro, Double> preco;
	public static volatile SingularAttribute<Livro, String> dataLancamento;
	public static volatile ListAttribute<Livro, Autor> autores;
}
