/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaxml;

/**
 *
 * @author andreachiella
 */
public class Olive {
    
    String anno,codice,regione,olive_superficie__ha_,olive_superficie_in_produzione__ha_,olive_produzione__quintali_,olive_da_tavola_produzione_raccolta__quintali_,olive_da_tavola_produzione__quintali_,olive_da_olio_produzione__quintali_,olio_di_pressione_resa_di_produzione__quintali_,olio_di_pressione_produzione__quintali_;

    @Override
    public String toString() {
        return "Olive{" + "anno=" + anno + ", codice=" + codice + ", regione=" + regione + ", olive_superficie__ha_=" + olive_superficie__ha_ + ", olive_superficie_in_produzione__ha_=" + olive_superficie_in_produzione__ha_ + ", olive_produzione__quintali_=" + olive_produzione__quintali_ + ", olive_da_tavola_produzione_raccolta__quintali_=" + olive_da_tavola_produzione_raccolta__quintali_ + ", olive_da_tavola_produzione__quintali_=" + olive_da_tavola_produzione__quintali_ + ", olive_da_olio_produzione__quintali_=" + olive_da_olio_produzione__quintali_ + ", olio_di_pressione_resa_di_produzione__quintali_=" + olio_di_pressione_resa_di_produzione__quintali_ + ", olio_di_pressione_produzione__quintali_=" + olio_di_pressione_produzione__quintali_ + '}';
    }

    public Olive(String anno, String codice, String regione, String olive_superficie__ha_, String olive_superficie_in_produzione__ha_, String olive_produzione__quintali_, String olive_da_tavola_produzione_raccolta__quintali_, String olive_da_tavola_produzione__quintali_, String olive_da_olio_produzione__quintali_, String olio_di_pressione_resa_di_produzione__quintali_, String olio_di_pressione_produzione__quintali_) {
        this.anno = anno;
        this.codice = codice;
        this.regione = regione;
        this.olive_superficie__ha_ = olive_superficie__ha_;
        this.olive_superficie_in_produzione__ha_ = olive_superficie_in_produzione__ha_;
        this.olive_produzione__quintali_ = olive_produzione__quintali_;
        this.olive_da_tavola_produzione_raccolta__quintali_ = olive_da_tavola_produzione_raccolta__quintali_;
        this.olive_da_tavola_produzione__quintali_ = olive_da_tavola_produzione__quintali_;
        this.olive_da_olio_produzione__quintali_ = olive_da_olio_produzione__quintali_;
        this.olio_di_pressione_resa_di_produzione__quintali_ = olio_di_pressione_resa_di_produzione__quintali_;
        this.olio_di_pressione_produzione__quintali_ = olio_di_pressione_produzione__quintali_;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getOlive_superficie__ha_() {
        return olive_superficie__ha_;
    }

    public void setOlive_superficie__ha_(String olive_superficie__ha_) {
        this.olive_superficie__ha_ = olive_superficie__ha_;
    }

    public String getOlive_superficie_in_produzione__ha_() {
        return olive_superficie_in_produzione__ha_;
    }

    public void setOlive_superficie_in_produzione__ha_(String olive_superficie_in_produzione__ha_) {
        this.olive_superficie_in_produzione__ha_ = olive_superficie_in_produzione__ha_;
    }

    public String getOlive_produzione__quintali_() {
        return olive_produzione__quintali_;
    }

    public void setOlive_produzione__quintali_(String olive_produzione__quintali_) {
        this.olive_produzione__quintali_ = olive_produzione__quintali_;
    }

    public String getOlive_da_tavola_produzione_raccolta__quintali_() {
        return olive_da_tavola_produzione_raccolta__quintali_;
    }

    public void setOlive_da_tavola_produzione_raccolta__quintali_(String olive_da_tavola_produzione_raccolta__quintali_) {
        this.olive_da_tavola_produzione_raccolta__quintali_ = olive_da_tavola_produzione_raccolta__quintali_;
    }

    public String getOlive_da_tavola_produzione__quintali_() {
        return olive_da_tavola_produzione__quintali_;
    }

    public void setOlive_da_tavola_produzione__quintali_(String olive_da_tavola_produzione__quintali_) {
        this.olive_da_tavola_produzione__quintali_ = olive_da_tavola_produzione__quintali_;
    }

    public String getOlive_da_olio_produzione__quintali_() {
        return olive_da_olio_produzione__quintali_;
    }

    public void setOlive_da_olio_produzione__quintali_(String olive_da_olio_produzione__quintali_) {
        this.olive_da_olio_produzione__quintali_ = olive_da_olio_produzione__quintali_;
    }

    public String getOlio_di_pressione_resa_di_produzione__quintali_() {
        return olio_di_pressione_resa_di_produzione__quintali_;
    }

    public void setOlio_di_pressione_resa_di_produzione__quintali_(String olio_di_pressione_resa_di_produzione__quintali_) {
        this.olio_di_pressione_resa_di_produzione__quintali_ = olio_di_pressione_resa_di_produzione__quintali_;
    }

    public String getOlio_di_pressione_produzione__quintali_() {
        return olio_di_pressione_produzione__quintali_;
    }

    public void setOlio_di_pressione_produzione__quintali_(String olio_di_pressione_produzione__quintali_) {
        this.olio_di_pressione_produzione__quintali_ = olio_di_pressione_produzione__quintali_;
    }
  
    

  

    public Olive() {
        this.anno = "";
        this.codice = "";
        this.olive_superficie__ha_ = "";
        this.olive_superficie_in_produzione__ha_ = "";
        this.olive_produzione__quintali_ = "";
        this.olive_da_tavola_produzione_raccolta__quintali_ = "";
        this.olive_da_tavola_produzione__quintali_ = "";
        this.olive_da_olio_produzione__quintali_ = "";
        this.olio_di_pressione_produzione__quintali_ = "";
        this.olio_di_pressione_resa_di_produzione__quintali_ = "";
        this.regione = "";
    }
    

    
}
