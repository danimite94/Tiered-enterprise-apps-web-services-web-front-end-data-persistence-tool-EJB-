package jpaa;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import commona.Citationoficial;
import commona.GetCitationsinfo;

public class JPAWriteCitations {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

		List<Citationoficial> mylist = GetCitationsinfo.get();
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		for (Citationoficial st : mylist)
			em.persist(st);
		tx.commit();
		// after commit we have ids:

		for (Citationoficial st : mylist){
			System.out.println(st.gettitle());
		}
		// Close an application-managed entity manager.
		em.close();
		// Close the factory, releasing any resources that it holds.
		emf.close();
	}

}
