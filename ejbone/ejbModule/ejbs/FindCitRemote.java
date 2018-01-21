package ejbs;

import java.util.List;
import javax.ejb.Remote;
import cit.Citationoficial;

@Remote
public interface FindCitRemote {

    public List<Citationoficial> getcit(String pubtitle);
    	

}
