package cit;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITATIONS_TABLE")
public class Citationoficial implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITATIONID")
	private Long id;
	private String title;
	private int publicationdate;
	private String publicacaocorrespondente;

	
	public Citationoficial() {
	
	}

	public Long getId(){
		return id;
	}
	public void setid(long id){
		this.id=id;
	}

	public String gettitle() {
		return title;
	}
	public void settitle(String title){
		this.title=title;
	}
	
	public int getpublicationdate() {
		return publicationdate;
	}
	public void setpublicationdate(int publicationdate){
		this.publicationdate=publicationdate;
	}
	
	public String getpublicacaocorrespondente() {
		return publicacaocorrespondente;
	}
	public void setpublicacaocorrespondente(String publicacaocorrespondente){
		this.publicacaocorrespondente=publicacaocorrespondente;
	}


	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);

		return hash;
	}

	@Override

	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Citationoficial)) {
			return false;
		}
		Citationoficial other = (Citationoficial) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Citation" + id + ": " + title;
	}
}
