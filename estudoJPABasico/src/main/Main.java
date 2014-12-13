package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;
import repository.LivroRepository;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		try {
			LivroRepository livroRepository = new LivroRepository(em);
			livroRepository.adicionar(new Livro("Sistemas de Banco de Dados",
					"Navathe"));
			em.getTransaction().begin();
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}
