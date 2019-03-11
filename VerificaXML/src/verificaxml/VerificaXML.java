/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaxml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author andreachiella
 */
public class VerificaXML {


    /**
     * @param args the command line arguments
     */
    
         
     public static void main(String[] args) {
        List olive = null;
        Parser dom = new Parser();
        String anno;
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String scelta;
        String anno2;
        String regione;
        
        try {
            System.out.println("Ciao, 1) Anno e Regione   2)Olio di pressione Produzione 3)piu’ Olive da tavola Produzione raccolta 4)piu’ Olive Superficie in produzione");
            scelta=tastiera.readLine();
            if(scelta.equals("1")){
            System.out.println("INSERIRE L'Anno");
            anno=tastiera.readLine();
            System.out.println("INSERIRE La regione");
            regione=tastiera.readLine();
            olive = dom.parseDocument("verifica.xml",anno,regione);}
            if(scelta.equals("2")){
                System.out.println("INSERIRE l'Anno");
                anno2=tastiera.readLine();
                olive = dom.cercaTotaleOlio("verifica.xml",anno2);
            }
            if(scelta.equals("3")){
                olive = dom.piuOlio("verifica.xml");
            }
            if(scelta.equals("4")){
                olive = dom.piuOlioSuperficie("verifica.xml");
            }
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        Iterator iterator = olive.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
     }
    
}
