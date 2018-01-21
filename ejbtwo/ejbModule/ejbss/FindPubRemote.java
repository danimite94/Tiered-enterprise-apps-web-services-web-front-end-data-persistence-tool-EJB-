package ejbss;

import java.util.List;

import javax.ejb.Remote;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;

import pub.Publicationoficial;

@Remote
public interface FindPubRemote {
	
	public List<Publicationoficial> getpub();
	public List<Publicationoficial> getordena(int u);
	public Publicationoficial getunipub(String user);
	public List<String> getpublicationtitle();

}
