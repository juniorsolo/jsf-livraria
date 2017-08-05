package br.com.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.livraria.dao.DAO;
import br.com.livraria.modelo.Autor;

@SuppressWarnings("deprecation")
@ManagedBean
public class AutorBean {
	
	private Autor autor = new Autor();
	
	public Autor geAutor() {
		return autor;
	}
	
	public void gravar() {
		
		System.out.println("Gravando autor " + autor.getNome());
		
		new DAO<Autor>(Autor.class).adiciona(autor);
	}
}
