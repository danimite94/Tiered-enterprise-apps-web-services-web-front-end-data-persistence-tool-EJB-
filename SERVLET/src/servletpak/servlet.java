package servletpak;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import artifac.Publicationoficial;
import artifac.Webservice;
import artifac.WebserviceService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {
private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		try {
			
			WebserviceService as = new WebserviceService();
			Webservice asp = as.getWebservicePort();
			
			
			List<Publicationoficial> pubs = null;
			
			pubs = asp.getordenas(3);
			
			List<String> b = new ArrayList<String>();	
			
			for(int c=0;c<pubs.size();c++){
				
				b.add(pubs.get(c).getTitle());
				
			}		
					
			
			List<String> titles = new ArrayList<String>();	

			titles = asp.gettitleList();

			request.setAttribute("Publicacoes", b);
			request.setAttribute("Titles", titles);

			request.getRequestDispatcher("/display.jsp").forward(request, response);

		} catch (Exception ex) {

		}
	}
}