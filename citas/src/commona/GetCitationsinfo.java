package commona;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class GetCitationsinfo {

	static List<Citationoficial> list;

	public static List<Citationoficial> get() throws ParserConfigurationException, SAXException, IOException {

		File inputFile = new File("C:/Users/postgres/workspace/publicas/src/commonb/trabalho.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		
		list = new ArrayList<Citationoficial>();

		NodeList nList = doc.getElementsByTagName("Publication");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				NodeList nList2 = eElement.getElementsByTagName("Citation");

				for (int tem = 0; tem < nList2.getLength(); tem++) {

					Citationoficial cita = new Citationoficial();

					Node nNode1 = nList2.item(tem);

					if (nNode1.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement1 = (Element) nNode1;

						cita.settitle(eElement1.getElementsByTagName("Title").item(0).getTextContent());
						cita.setpublicationdate(
								Integer.parseInt(eElement1.getElementsByTagName("Date").item(0).getTextContent()));
						cita.setpublicacaocorrespondente(
								eElement.getElementsByTagName("Title").item(0).getTextContent());
					}
					list.add(cita);
				}

			}
		}

		return list;
	}
}
