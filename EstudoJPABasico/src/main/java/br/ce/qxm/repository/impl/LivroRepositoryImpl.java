package br.ce.qxm.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.ce.qxm.model.Livro;
import br.ce.qxm.repository.LivroRepository;

public class LivroRepositoryImpl implements LivroRepository {
	private EntityManager em;

	public LivroRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	public void adicionar(Livro livro) {
		this.em.persist(livro);

	}

	public Livro buscar(int id) {
		return this.em.find(Livro.class, id);

	}

	public List<Livro> listar() {
		return this.em.createQuery("SELECT l FROM Livro l", Livro.class)
				.getResultList();
	}
}