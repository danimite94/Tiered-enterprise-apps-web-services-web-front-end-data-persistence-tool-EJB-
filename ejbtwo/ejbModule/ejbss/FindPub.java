package ejbss;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.rpc.soap.SOAPFaultException;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;

import pub.Publicationoficial;

/**
 * Session Bean implementation class FindPub
 */

@Stateless
@LocalBean

public class FindPub implements FindPubRemote {

	public FindPub() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(name = "TestPersistence")
	private EntityManager em;

	public List<Publicationoficial> getpub() {

		String queryone = "SELECT s FROM Publicationoficial s";
		Query query = em.createQuery(queryone);
		@SuppressWarnings("unchecked")
		List<Publicationoficial> resultList = query.getResultList();

		return resultList;
	}

	public Publicationoficial getunipub(String user) throws IllegalArgumentException , SOAPFaultException {

		String query = "SELECT e FROM Publicationoficial e WHERE e.title= '" + user + "'";

		Publicationoficial result = (Publicationoficial) em.createQuery(query).getSingleResult();

		return result;
	}
	public List<String> getpublicationtitle() {

		String queryone ="SELECT s.title FROM Publicationoficial s";
		Query query = em.createQuery(queryone);
		@SuppressWarnings("unchecked")
		List<String> resultList = query.getResultList();

		return resultList;
	}
	@SuppressWarnings("unchecked")
	public List<Publicationoficial> getordena(int u) {
		List<Publicationoficial> resultList = null;
		
		if(u==1){

		String queryone = "SELECT s FROM Publicationoficial s ORDER BY s.id ";
		Query query = em.createQuery(queryone);
		resultList = query.getResultList();
		
		
		}
		if(u==3){

		String queryone = "SELECT s FROM Publicationoficial s ORDER BY s.pubdate";
		Query query = em.createQuery(queryone);
		resultList = query.getResultList();
		
		for (int k=0;k<(resultList.size()-1);k++){
					
			
		String[] h = resultList.get(k).getpubdate().split("/");
		String[] l = resultList.get(k+1).getpubdate().split("/");
		
		
		if(Integer.parseInt(h[0])==Integer.parseInt(l[0])){
			
			if(Integer.parseInt(h[1])>Integer.parseInt(l[1])){
				Publicationoficial temp = resultList.get(k); 
				resultList.set(k,resultList.get(k+1));
				resultList.set(k+1,temp);
				
			}
			
		}
	
		}
		
		}
		if(u==2){

		String queryone = "SELECT s FROM Publicationoficial s ORDER BY s.title";
		Query query = em.createQuery(queryone);
		resultList = query.getResultList();
		
		}
		
		if(u==4){

		String queryone = "SELECT s FROM Publicationoficial s ORDER BY s.authors";
		Query query = em.createQuery(queryone);
		resultList = query.getResultList();
		
		}

		return resultList;
	}
	

}