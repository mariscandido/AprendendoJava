package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		//* criar e salvar no banco de dados *//
		
		Pessoa p1 = new Pessoa(null, "Mariana Silveira", "marisilveira@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria Silvestre", "marisilvestre@gmail.com");
		Pessoa p3 = new Pessoa(null, "Mariane Silva", "marisilva@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
		

		//* buscar no banco de dados pelo id *//

		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
		
		//* deletar o banco de dados pelo id *//

		Pessoa pe = em.find(Pessoa.class, 2);

		em.getTransaction().begin();
		em.remove(pe);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}

}
