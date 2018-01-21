package ejbs;

import java.util.List;

import javax.ejb.LocalBean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cit.Citationoficial;


/**
 * Session Bean implementation class FindCit
 */
@Stateless
@LocalBean
public class FindCit implements FindCitRemote{

	/**
	 * Default constructor.
	 */
	public FindCit() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(name = "TestPersistence")
	EntityManager em;

	public List<Citationoficial> getcit(String pubtitle) throws IllegalArgumentException {

		String queryone = "SELECT s FROM Citationoficial s where s.publicacaocorrespondente= '" +pubtitle + "'";
		Query query = em.createQuery(queryone);
		@SuppressWarnings("unchecked")
		List<Citationoficial> resultList = query.getResultList();

		return resultList;
	}

}
