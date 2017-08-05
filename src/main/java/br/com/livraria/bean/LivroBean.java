package br.com.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.livraria.dao.DAO;
import br.com.livraria.modelo.Livro;

@SuppressWarnings("deprecation")
@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando Livro " + this.livro.getTitulo());
		
		if(livro.getAutores().isEmpty()) {
			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
		}
		
		new DAO<Livro>(Livro.class).adiciona(this.livro);
		
	}

	
}
