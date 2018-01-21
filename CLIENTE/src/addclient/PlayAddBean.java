package addclient;

import java.util.List;
import java.util.Scanner;

import artifact.Publicationoficial;
import artifact.Webservice;
import artifact.WebserviceService;
import cit.Citationoficial;
import ejbs.FindCitRemote;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.soap.SOAPException;
import javax.xml.ws.soap.SOAPFaultException;

public class PlayAddBean {

	private static void showGUI() {
		System.out.println("**********************");
		System.out.print(
				"Options \n1. All Publications \n2. One publication \n3. All Publications ordered \n4. Exit \n Enter Choice: ");
	
	}
	private static void showGUI2() {
		System.out.println("**********************");
		System.out.println(
				"Type in the the corresponding number to the order criteria you want to respect (as follows): ");
		System.out.println(" 1) ID ");
		System.out.println(" 2) TITLE ");
		System.out.println(" 3) PUBLICATION DATE ");
		System.out.println(" 4) AUTORES ");
	}
	

	public static void main(String[] args) throws NamingException {
		
		
		Scanner sc = new Scanner(System.in);

		WebserviceService as = new WebserviceService();
		Webservice asp = as.getWebservicePort();
		int choice = 1;

		FindCitRemote a = (FindCitRemote) InitialContext.doLookup("EARCITATIONS/ejbone/FindCit!ejbs.FindCitRemote");

		List<Publicationoficial> pubs = null;
		List<Citationoficial> cits = null;
		
		while (choice != 4 ) {
			String PubName;
			showGUI();

			boolean m = false;
			
			while (m==false){
			
		       while(!sc.hasNextInt()) {
		          System.out.println("Invalid input!");
		          showGUI();
		          sc.next();
		    }
		       choice = sc.nextInt();
		       sc.nextLine();
		       if (choice==1 || choice==2 || choice==3 || choice==4){
				    m=true;
				}
				else{
					showGUI();
				}
			}
		       
			if (choice == 2) {
				
				try{
				System.out.print("Enter Publication name: ");
				PubName = sc.nextLine();

				Publicationoficial answer = asp.getsingle(PubName);

				System.out.println("Titulo="+answer.getTitle());
				System.out.println("Datapublicacao="+answer.getPubdate());
				System.out.println("Autores="+answer.getAuthors());

				cits = a.getcit(answer.getTitle());
				
				for (int j1 = 0; j1 < cits.size(); j1++) {
					String pubtitle1 = cits.get(j1).gettitle();
					System.out.println("Citacao associada="+pubtitle1);
				}
			} catch (SOAPFaultException e){
				System.out.println();
				System.out.println("Nao existe nenhuma publicacao com este titulo na base de dados!");
				System.out.println();
				System.out.println();
			
			}

			} 
			else if (choice == 1) {

				pubs = asp.getfullList();

				for (int j = 0; j < pubs.size(); j++) {
					System.out.println("Publicacao nº"+(j+1));
					System.out.println("Titulo="+pubs.get(j).getTitle());
					System.out.println("Datapublicacao="+pubs.get(j).getPubdate());
					System.out.println("Autores="+pubs.get(j).getAuthors());
					
					String pubtitle = pubs.get(j).getTitle();
					cits = a.getcit(pubtitle);
					
					for (int j1 = 0; j1 < cits.size(); j1++) {
						String pubtitle1 = cits.get(j1).gettitle();
						System.out.println("Citacao associada="+pubtitle1);
					}
					System.out.println();
					System.out.println();

				}
			} else if (choice == 3) {
				
				boolean r = false;
				int number=0;
				while (r==false){
					showGUI2();
			    while(!sc.hasNextInt()) {
				          System.out.println("Invalid input!");
				          showGUI2();
				          sc.next();
			    }
				    number = sc.nextInt();
				if (number==1 || number==2 || number==3 || number==4){
				    r=true;
				}
				}
				
				pubs = asp.getordenas(number);
				

				
				    
				    System.out.println("Publicacoes ordenadas:");
				    System.out.println();
				    System.out.println();
				    
				    
				    for (int j = 0; j < pubs.size(); j++) {
					System.out.println("Titulo="+pubs.get(j).getTitle());
					System.out.println("Datapublicacao="+pubs.get(j).getPubdate());
					System.out.println("Autores="+pubs.get(j).getAuthors());
					System.out.println();
				    }
			} else {
				break;
			}
		}

		sc.close();
	}

}
