package br.ce.qxm.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
//		try {
//			LivroRepository livroRepository = new LivroRepository(em);
//			livroRepository.adicionar(new Livro("Sistemas de Banco de Dados",
//					"Navathe"));
//			livroRepository.adicionar(new Livro("Sistemas de Banco de Dados",
//					"silberschatz"));
//			
//			em.getTransaction().begin();
//			em.getTransaction().commit();
//
//			for (Livro livro : livroRepository.listar()) {
//				System.out.println("Livro:" + livro.getTitulo());
//				System.out.println("Autor:" + livro.getAutor() + "\n\n");
//			}
//
//		} catch (Exception e) {
//			em.getTransaction().rollback();
//		} finally {
//			em.close();
//			emf.close();
//		}
		em.close();
		emf.close();
//
	}

}
