package repository;

import java.util.List;

import javax.persistence.EntityManager;

import model.Livro;

public class LivroRepository {
	private EntityManager em;
	
	public LivroRepository(EntityManager em){
		this.em = em;
	}
	
	public void adicionar(Livro livro){
		this.em.persist(livro);
		
	}
	public Livro buscar(int id){
		return this.em.find(Livro.class,id);
		
	}
	public List<Livro> listar(){
		return this.em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
	}
}
