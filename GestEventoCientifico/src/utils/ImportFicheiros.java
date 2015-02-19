/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author pedro_000
 */
import java.awt.HeadlessException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ImportFicheiros {

    //Leitura de ficheiros de CSV
    public static ArrayList<String[]> LerFichCSV(File x) throws FileNotFoundException {
            ArrayList data = new ArrayList();
                 try {
            Scanner in = new Scanner(x);
            while (in.hasNextLine()) {
                data.add(in.nextLine());
            }
            in.close();
        } catch (IOException erro) {
            throw erro;
        }
                 JOptionPane.showMessageDialog(null, "Ficheiro carregado com sucesso");
       return data;
    }

    public static ArrayList<ArrayList> LerFichXML(File str) throws ParserConfigurationException, SAXException, IOException {
        
        ArrayList data = new ArrayList();
        ArrayList linha = new ArrayList();
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(str);

         //normalize text representation
        doc.getDocumentElement().normalize();
        

        NodeList listOfPersons = doc.getElementsByTagName("event");
     

        for (int s = 0; s < listOfPersons.getLength(); s++) {
            Node firstPersonNode = listOfPersons.item(s);
            if (firstPersonNode.getNodeType() == Node.ELEMENT_NODE) {

                Element firstPersonElement = (Element) firstPersonNode;

               // trata da informação dentro da tag year
                NodeList yearList = firstPersonElement.getElementsByTagName("year");
                Element yearElement = (Element) yearList.item(0);
                NodeList textYearList = yearElement.getChildNodes();
                linha.add(((Node) textYearList.item(0)).getNodeValue().trim());

                //trata da informação dentro da tag name
                NodeList nameList = firstPersonElement.getElementsByTagName("name");
                Element nameElement = (Element) nameList.item(0);
                NodeList textNameList = nameElement.getChildNodes();
                linha.add(((Node) textNameList.item(0)).getNodeValue().trim());

                //trata da informação dentro da tag host
                NodeList hostList = firstPersonElement.getElementsByTagName("host");
                Element hostElement = (Element) hostList.item(0);
                NodeList textHostList = hostElement.getChildNodes();
                linha.add(((Node) textHostList.item(0)).getNodeValue().trim());

                //trata da informação dentro da tag city
                NodeList cityList = firstPersonElement.getElementsByTagName("city");
                Element cityElement = (Element) cityList.item(0);
                NodeList textCityList = cityElement.getChildNodes();
                linha.add(((Node) textCityList.item(0)).getNodeValue().trim());

               // trata da informação dentro da tag country
                NodeList countryList = firstPersonElement.getElementsByTagName("country");
                Element countryElement = (Element) countryList.item(0);
                NodeList textCountryList = countryElement.getChildNodes();
                linha.add(((Node) textCountryList.item(0)).getNodeValue().trim());

               // trata da informação dentro da tag begin date
                NodeList BeginDTList = firstPersonElement.getElementsByTagName("begin_date");
                Element BeginDTElement = (Element) BeginDTList.item(0);
                NodeList textBeginDTList = BeginDTElement.getChildNodes();
                linha.add(((Node) textBeginDTList.item(0)).getNodeValue().trim());

               // trata da informação dentro da tag end date
                NodeList EndDTList = firstPersonElement.getElementsByTagName("end_date");
                Element EndDTElement = (Element) EndDTList.item(0);
                NodeList textEndDTList = EndDTElement.getChildNodes();
                linha.add(((Node) textEndDTList.item(0)).getNodeValue().trim());

                //trata da informação dentro da tag webpage
                NodeList webPList = firstPersonElement.getElementsByTagName("web_page");
                Element webPElement = (Element) webPList.item(0);
                NodeList textWebPList = webPElement.getChildNodes();
                if (webPElement.hasChildNodes()) {
                    linha.add(((Node) textWebPList.item(0)).getNodeValue().trim());
                } else {
                    linha.add("--");
                }

               // trata da informação dentro da tag organizer
                NodeList orgList = firstPersonElement.getElementsByTagName("organizer");

                for (int r = 0; r < orgList.getLength(); r++) {
                    Node orgNode = orgList.item(r);
                    if (orgNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element orgElement = (Element) orgNode;
                        //trata informação dentro da tag org_name
                        NodeList orgNList = orgElement.getElementsByTagName("org_name");
                        Element orgNElement = (Element) orgNList.item(0);
                        NodeList textorgNList = orgNElement.getChildNodes();
                        linha.add(((Node) textorgNList.item(0)).getNodeValue().trim());

                        //trata informação dentro da tag email
                        NodeList orgEMList = orgElement.getElementsByTagName("email");
                        Element orgEMElement = (Element) orgEMList.item(0);
                        NodeList textorgEMList = orgEMElement.getChildNodes();
                        linha.add(((Node) textorgEMList.item(0)).getNodeValue().trim());

                    }
                }
            }
            data.add(linha.toString());
            linha.clear();
        }
        JOptionPane.showMessageDialog(null, "Ficheiro carregado com sucesso!");
    return data;   
    }
}
