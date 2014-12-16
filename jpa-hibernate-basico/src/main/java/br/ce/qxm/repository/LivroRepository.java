package br.ce.qxm.repository;

import java.util.List;

import br.ce.qxm.model.Livro;

public interface LivroRepository {

	public void adicionar(Livro livro);

	public Livro buscar(int id);

	public List<Livro> listar();
}