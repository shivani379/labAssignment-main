package lab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import lab.entity.Author;

public class InsertAuthorDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author();
		//author.setAuthorId(1);
		author.setFirstName("Aniket");
		author.setMiddleName("Dattatray");
		author.setLastName("Mandlik");
		author.setPhoneNo("8790356373");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();

		EntityTransaction txn = em.getTransaction();
		txn.begin();

		em.persist(author);

		txn.commit();

		System.out.println("Author Details Saved");

		em.close();
		emf.close();

	}

}
