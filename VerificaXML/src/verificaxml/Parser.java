package verificaxml;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List olive;

    public Parser() {
        olive = new ArrayList();
    }

    public List parseDocument(String filename, String an,String reg)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        boolean coincide = false;
        String[] anni = null;
        String[] codice = null;
        String[] regione = null;
        String[] olive_superficie__ha_ni = null;
        String[] olive_superficie_in_produzione__ha_ = null;
        String[] olive_produzione__quintali_ = null;
        String[] olive_da_tavola_produzione_raccolta__quintali_ = null;
        String[] olive_da_tavola_produzione__quintali_ = null;
        String[] olive_da_olio_produzione__quintali_ = null;
        String[] olio_di_pressione_resa_di_produzione__quintali_ = null;
        String[] olio_di_pressione_produzione__quintali_ = null;
        

        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "link"
        nodelist = root.getElementsByTagName("row");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                anni = getTextValue(element, "anno");
                codice = getTextValue(element, "codice");
                regione = getTextValue(element, "regioni");
                olive_superficie__ha_ni = getTextValue(element, "olive_superficie__ha_");
                olive_superficie_in_produzione__ha_ = getTextValue(element, "olive_superficie_in_produzione__ha_");
                olive_produzione__quintali_ = getTextValue(element, "olive_produzione__quintali_");
                olive_da_tavola_produzione_raccolta__quintali_ = getTextValue(element, "olive_da_tavola_produzione_raccolta__quintali_");
                olive_da_tavola_produzione__quintali_ = getTextValue(element, "olive_da_tavola_produzione__quintali_");
                olive_da_olio_produzione__quintali_ = getTextValue(element, "olive_da_olio_produzione__quintali_");
                olio_di_pressione_resa_di_produzione__quintali_ = getTextValue(element, "olio_di_pressione_resa_di_produzione__quintali_");
                olio_di_pressione_produzione__quintali_ = getTextValue(element, "olio_di_pressione_produzione__quintali_");

                
               try {
                    Olive oliva = new Olive(anni[0], codice[0], regione[0],olive_superficie__ha_ni[0],olive_superficie_in_produzione__ha_[0],
                            olive_produzione__quintali_[0],olive_da_tavola_produzione_raccolta__quintali_[0],olive_da_tavola_produzione__quintali_[0],
                    olive_da_olio_produzione__quintali_[0],olio_di_pressione_resa_di_produzione__quintali_[0],olio_di_pressione_produzione__quintali_[0]);
                    if(oliva.anno.equals("\""+an+"\"")&&oliva.regione.equals("\""+reg+"\"")){
                    olive.add(oliva);
                    }
 
                } catch (Exception ex) {
                }
            }
        }
        return olive;
             
    }
    
    public List cercaTotaleOlio(String filename, String an)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        boolean coincide = false;
        String[] anni = null;
        String[] codice = null;
        String[] regione = null;
        String[] olive_superficie__ha_ni = null;
        String[] olive_superficie_in_produzione__ha_ = null;
        String[] olive_produzione__quintali_ = null;
        String[] olive_da_tavola_produzione_raccolta__quintali_ = null;
        String[] olive_da_tavola_produzione__quintali_ = null;
        String[] olive_da_olio_produzione__quintali_ = null;
        String[] olio_di_pressione_resa_di_produzione__quintali_ = null;
        String[] olio_di_pressione_produzione__quintali_ = null;
        int totaleOlio=0;
        

        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "link"
        nodelist = root.getElementsByTagName("row");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                anni = getTextValue(element, "anno");
                codice = getTextValue(element, "codice");
                regione = getTextValue(element, "regioni");
                olive_superficie__ha_ni = getTextValue(element, "olive_superficie__ha_");
                olive_superficie_in_produzione__ha_ = getTextValue(element, "olive_superficie_in_produzione__ha_");
                olive_produzione__quintali_ = getTextValue(element, "olive_produzione__quintali_");
                olive_da_tavola_produzione_raccolta__quintali_ = getTextValue(element, "olive_da_tavola_produzione_raccolta__quintali_");
                olive_da_tavola_produzione__quintali_ = getTextValue(element, "olive_da_tavola_produzione__quintali_");
                olive_da_olio_produzione__quintali_ = getTextValue(element, "olive_da_olio_produzione__quintali_");
                olio_di_pressione_resa_di_produzione__quintali_ = getTextValue(element, "olio_di_pressione_resa_di_produzione__quintali_");
                olio_di_pressione_produzione__quintali_ = getTextValue(element, "olio_di_pressione_produzione__quintali_");

                
                
               try {
                    Olive oliva = new Olive(anni[0], codice[0], regione[0],olive_superficie__ha_ni[0],olive_superficie_in_produzione__ha_[0],
                            olive_produzione__quintali_[0],olive_da_tavola_produzione_raccolta__quintali_[0],olive_da_tavola_produzione__quintali_[0],
                    olive_da_olio_produzione__quintali_[0],olio_di_pressione_resa_di_produzione__quintali_[0],olio_di_pressione_produzione__quintali_[0]);
                    if(!oliva.regione.equals("\""+"Italia"+"\"")){
                    if(oliva.anno.equals("\""+an+"\"")){
                    olive.add(oliva);
                    totaleOlio=totaleOlio+Integer.parseInt(oliva.olio_di_pressione_produzione__quintali_);
                    }
                    }
 
                } catch (Exception ex) {
                }
            }
        }
        System.out.println("Totale Olio: "+totaleOlio);
        return olive;
             
    }
    
      public List piuOlio(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        boolean coincide = false;
        String[] anni = null;
        String[] codice = null;
        String[] regione = null;
        String[] olive_superficie__ha_ni = null;
        String[] olive_superficie_in_produzione__ha_ = null;
        String[] olive_produzione__quintali_ = null;
        String[] olive_da_tavola_produzione_raccolta__quintali_ = null;
        String[] olive_da_tavola_produzione__quintali_ = null;
        String[] olive_da_olio_produzione__quintali_ = null;
        String[] olio_di_pressione_resa_di_produzione__quintali_ = null;
        String[] olio_di_pressione_produzione__quintali_ = null;
        
        int olioMax=0;
        String regioneMax="nessuna Regione";

        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "link"
        nodelist = root.getElementsByTagName("row");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                anni = getTextValue(element, "anno");
                codice = getTextValue(element, "codice");
                regione = getTextValue(element, "regioni");
                olive_superficie__ha_ni = getTextValue(element, "olive_superficie__ha_");
                olive_superficie_in_produzione__ha_ = getTextValue(element, "olive_superficie_in_produzione__ha_");
                olive_produzione__quintali_ = getTextValue(element, "olive_produzione__quintali_");
                olive_da_tavola_produzione_raccolta__quintali_ = getTextValue(element, "olive_da_tavola_produzione_raccolta__quintali_");
                olive_da_tavola_produzione__quintali_ = getTextValue(element, "olive_da_tavola_produzione__quintali_");
                olive_da_olio_produzione__quintali_ = getTextValue(element, "olive_da_olio_produzione__quintali_");
                olio_di_pressione_resa_di_produzione__quintali_ = getTextValue(element, "olio_di_pressione_resa_di_produzione__quintali_");
                olio_di_pressione_produzione__quintali_ = getTextValue(element, "olio_di_pressione_produzione__quintali_");

                
                
               try {
                    Olive oliva = new Olive(anni[0], codice[0], regione[0],olive_superficie__ha_ni[0],olive_superficie_in_produzione__ha_[0],
                            olive_produzione__quintali_[0],olive_da_tavola_produzione_raccolta__quintali_[0],olive_da_tavola_produzione__quintali_[0],
                    olive_da_olio_produzione__quintali_[0],olio_di_pressione_resa_di_produzione__quintali_[0],olio_di_pressione_produzione__quintali_[0]);
                    if(!oliva.regione.equals("\""+"Italia"+"\"")){
                    olive.add(oliva);
                    if(Integer.parseInt(oliva.olive_da_tavola_produzione_raccolta__quintali_)>olioMax){
                        olioMax=Integer.parseInt(oliva.olive_da_tavola_produzione_raccolta__quintali_);
                        regioneMax=oliva.regione;
                    }
                    }
                    
 
                } catch (Exception ex) {
                }
            }
            
        }
        System.out.println("Regione: "+regioneMax+"  quantità olio: "+olioMax);
        return olive;
             
    }
      
      public List piuOlioSuperficie(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        boolean coincide = false;
        String[] anni = null;
        String[] codice = null;
        String[] regione = null;
        String[] olive_superficie__ha_ni = null;
        String[] olive_superficie_in_produzione__ha_ = null;
        String[] olive_produzione__quintali_ = null;
        String[] olive_da_tavola_produzione_raccolta__quintali_ = null;
        String[] olive_da_tavola_produzione__quintali_ = null;
        String[] olive_da_olio_produzione__quintali_ = null;
        String[] olio_di_pressione_resa_di_produzione__quintali_ = null;
        String[] olio_di_pressione_produzione__quintali_ = null;
        
        int olioMax=0;
        String regioneMax="nessuna Regione";

        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "link"
        nodelist = root.getElementsByTagName("row");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                anni = getTextValue(element, "anno");
                codice = getTextValue(element, "codice");
                regione = getTextValue(element, "regioni");
                olive_superficie__ha_ni = getTextValue(element, "olive_superficie__ha_");
                olive_superficie_in_produzione__ha_ = getTextValue(element, "olive_superficie_in_produzione__ha_");
                olive_produzione__quintali_ = getTextValue(element, "olive_produzione__quintali_");
                olive_da_tavola_produzione_raccolta__quintali_ = getTextValue(element, "olive_da_tavola_produzione_raccolta__quintali_");
                olive_da_tavola_produzione__quintali_ = getTextValue(element, "olive_da_tavola_produzione__quintali_");
                olive_da_olio_produzione__quintali_ = getTextValue(element, "olive_da_olio_produzione__quintali_");
                olio_di_pressione_resa_di_produzione__quintali_ = getTextValue(element, "olio_di_pressione_resa_di_produzione__quintali_");
                olio_di_pressione_produzione__quintali_ = getTextValue(element, "olio_di_pressione_produzione__quintali_");

                
                
               try {
                    Olive oliva = new Olive(anni[0], codice[0], regione[0],olive_superficie__ha_ni[0],olive_superficie_in_produzione__ha_[0],
                            olive_produzione__quintali_[0],olive_da_tavola_produzione_raccolta__quintali_[0],olive_da_tavola_produzione__quintali_[0],
                    olive_da_olio_produzione__quintali_[0],olio_di_pressione_resa_di_produzione__quintali_[0],olio_di_pressione_produzione__quintali_[0]);
                    if(!oliva.regione.equals("\""+"Italia"+"\"")){
                    olive.add(oliva);
                    if(Integer.parseInt(oliva.olive_superficie__ha_)>olioMax){
                        olioMax=Integer.parseInt(oliva.olive_da_tavola_produzione_raccolta__quintali_);
                        regioneMax=oliva.regione;
                    }
                    }
                    
 
                } catch (Exception ex) {
                }
            }
            
        }
        System.out.println("Regione: "+regioneMax+"  quantità olio: "+olioMax);
        return olive;
             
    }
    private String GetContent(Element element) {
        return element.getFirstChild().getNodeValue();
    }

    // restituisce il valore testuale dell’elemento figlio specificato
    private String[] getTextValue(Element element, String tag) {
        NodeList td=element.getElementsByTagName("anno");
        if(tag.equals("anno")){
         td = element.getElementsByTagName("anno");
        }
        if(tag.equals("codice")){
         td = element.getElementsByTagName("codice");
        }
        
        if(tag.equals("regioni")){
         td = element.getElementsByTagName("regioni");
        }
       
        if(tag.equals("olive_superficie__ha_")){
         td = element.getElementsByTagName("olive_superficie__ha_");
        }
        if(tag.equals("olive_superficie_in_produzione__ha_")){
         td = element.getElementsByTagName("olive_superficie_in_produzione__ha_");
        }
        if(tag.equals("olive_produzione__quintali_")){
         td = element.getElementsByTagName("olive_produzione__quintali_");
        }
        if(tag.equals("olive_da_tavola_produzione_raccolta__quintali_")){
         td = element.getElementsByTagName("olive_da_tavola_produzione_raccolta__quintali_");
        }
        if(tag.equals("olive_da_tavola_produzione__quintali_")){
         td = element.getElementsByTagName("olive_da_tavola_produzione__quintali_");
        }
        if(tag.equals("olive_da_olio_produzione__quintali_")){
         td = element.getElementsByTagName("olive_da_olio_produzione__quintali_");
        }
        if(tag.equals("olio_di_pressione_resa_di_produzione__quintali_")){
         td = element.getElementsByTagName("olio_di_pressione_resa_di_produzione__quintali_");
        }
        if(tag.equals("olio_di_pressione_produzione__quintali_")){
         td = element.getElementsByTagName("olio_di_pressione_produzione__quintali_");
        }
   
        String[] datiOlive = new String[td.getLength()];
        for (int j = 0; j < td.getLength(); j++) {
            element = (Element) td.item(j);
            if (element != null && element.getFirstChild() != null) {
                String dati = GetContent(element);
                if (!dati.equals(null)) {
                    datiOlive[j] = dati;
                }
            }
        }
        return datiOlive;
    }
            
}
