package webser;


import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;

import pub.Publicationoficial;
import ejbss.FindPubRemote;

@Stateless
@WebService
public class webservice {

	List<Publicationoficial> list = null;
	List<String> sent_list = null;
	Publicationoficial pub = null;
	List<String> lista = null;

	@EJB
	private FindPubRemote findPub;

	@WebMethod
	public List<String> gettitle_list() {
		lista = findPub.getpublicationtitle();
		return lista;
	}

	@WebMethod
	public List<Publicationoficial> getfull_list() {
		list = findPub.getpub();
		return list;
	}

	@WebMethod
	public Publicationoficial getsingle(String user) {
		pub = findPub.getunipub(user);

		return pub;
	}
	@WebMethod
	public List<Publicationoficial> getordenas(int u){
		list = findPub.getordena(u);
		return list;
	}
}
