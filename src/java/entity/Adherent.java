package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Adherent extends Personne implements Serializable {

    @ManyToOne(targetEntity = Fonction.class)
    private Fonction tablefonction;

    private String numGSM;

    private String sessEnf;

    private String numGSMBis;

    private String rib;

    @ManyToOne(targetEntity = Grade.class)
    private Grade tablegrade;

    @ManyToOne(targetEntity = Situation.class)
    private Situation tablesituation;

    private Integer transportMinistere;

    private String emailBis;

    private String dateRappel;

    private String observations;

    @ManyToOne(targetEntity = Banque.class)
    private Banque banque;

    @ManyToOne(targetEntity = Ville.class)
    private Ville tableville;

   
    private String numImmatriculationCNOPS;

    @ManyToOne(targetEntity = Categorie.class)
    private Categorie tablecategorie;

    @OneToMany(targetEntity = Enfant.class, mappedBy = "adherent")
    private Collection<Enfant> enfants;

  
    private String numTelephone;

  
    private String email;


    private String numDRPP;


    private String valider;

  
    private String numImmatriculationCNSS;


    private String numAffiliationCNOPS;


    private String numPosteTelephonique;


    private Integer transportNavette;

    @ManyToOne(targetEntity = Prestation.class)
    private Prestation prestation;

    @OneToOne(targetEntity = Conjoint.class)
    private Conjoint conjoint;

  
    private Integer cantine;

 
    private String numAdherent;

  
    private String doti;

    @ManyToOne(targetEntity = Poste.class)
    private Poste tableposte;

   
    private String adresse;

    @ManyToOne(targetEntity = Echelle.class)
    private Echelle tableechelle;

  
    private String numAffiliationCNSS;

    @ManyToOne(targetEntity = Llieu.class)
    private Llieu llieu;

    @ManyToMany(targetEntity = Typeadhesion.class)
    private List<Typeadhesion> tabletypeadhesions;

    public Adherent() {

    }

    public Fonction getTablefonction() {
        return this.tablefonction;
    }

    public void setTablefonction(Fonction tablefonction) {
        this.tablefonction = tablefonction;
    }

    public String getNumGSM() {
        return this.numGSM;
    }

    public void setNumGSM(String numGSM) {
        this.numGSM = numGSM;
    }

    public String getSessEnf() {
        return this.sessEnf;
    }

    public void setSessEnf(String sessEnf) {
        this.sessEnf = sessEnf;
    }

    public String getNumGSMBis() {
        return this.numGSMBis;
    }

    public void setNumGSMBis(String numGSMBis) {
        this.numGSMBis = numGSMBis;
    }

    public String getRib() {
        return this.rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Grade getTablegrade() {
        return this.tablegrade;
    }

    public void setTablegrade(Grade tablegrade) {
        this.tablegrade = tablegrade;
    }

    public Situation getTablesituation() {
        return this.tablesituation;
    }

    public void setTablesituation(Situation tablesituation) {
        this.tablesituation = tablesituation;
    }

    public Integer getTransportMinistere() {
        return this.transportMinistere;
    }

    public void setTransportMinistere(Integer transportMinistere) {
        this.transportMinistere = transportMinistere;
    }

    public String getEmailBis() {
        return this.emailBis;
    }

    public void setEmailBis(String emailBis) {
        this.emailBis = emailBis;
    }

    public String getDateRappel() {
        return this.dateRappel;
    }

    public void setDateRappel(String dateRappel) {
        this.dateRappel = dateRappel;
    }

    public String getObservations() {
        return this.observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Banque getBanque() {
        return this.banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Ville getTableville() {
        return this.tableville;
    }

    public void setTableville(Ville tableville) {
        this.tableville = tableville;
    }

    public String getNumImmatriculationCNOPS() {
        return this.numImmatriculationCNOPS;
    }

    public void setNumImmatriculationCNOPS(String numImmatriculationCNOPS) {
        this.numImmatriculationCNOPS = numImmatriculationCNOPS;
    }

    public Categorie getTablecategorie() {
        return this.tablecategorie;
    }

    public void setTablecategorie(Categorie tablecategorie) {
        this.tablecategorie = tablecategorie;
    }

    public Collection<Enfant> getEnfants() {
        return this.enfants;
    }

    public void setEnfants(Collection<Enfant> enfants) {
        this.enfants = enfants;
    }

    public String getNumTelephone() {
        return this.numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumDRPP() {
        return this.numDRPP;
    }

    public void setNumDRPP(String numDRPP) {
        this.numDRPP = numDRPP;
    }

    public String getValider() {
        return this.valider;
    }

    public void setValider(String valider) {
        this.valider = valider;
    }

    public String getNumImmatriculationCNSS() {
        return this.numImmatriculationCNSS;
    }

    public void setNumImmatriculationCNSS(String numImmatriculationCNSS) {
        this.numImmatriculationCNSS = numImmatriculationCNSS;
    }

    public String getNumAffiliationCNOPS() {
        return this.numAffiliationCNOPS;
    }

    public void setNumAffiliationCNOPS(String numAffiliationCNOPS) {
        this.numAffiliationCNOPS = numAffiliationCNOPS;
    }

    public String getNumPosteTelephonique() {
        return this.numPosteTelephonique;
    }

    public void setNumPosteTelephonique(String numPosteTelephonique) {
        this.numPosteTelephonique = numPosteTelephonique;
    }

    public Integer getTransportNavette() {
        return this.transportNavette;
    }

    public void setTransportNavette(Integer transportNavette) {
        this.transportNavette = transportNavette;
    }

    public Prestation getPrestation() {
        return this.prestation;
    }

    public void setPrestation(Prestation prestation) {
        this.prestation = prestation;
    }

    public Conjoint getConjoint() {
        return this.conjoint;
    }

    public void setConjoint(Conjoint conjoint) {
        this.conjoint = conjoint;
    }

    public Integer getCantine() {
        return this.cantine;
    }

    public void setCantine(Integer cantine) {
        this.cantine = cantine;
    }

    public String getNumAdherent() {
        return this.numAdherent;
    }

    public void setNumAdherent(String numAdherent) {
        this.numAdherent = numAdherent;
    }

    public String getDoti() {
        return this.doti;
    }

    public void setDoti(String doti) {
        this.doti = doti;
    }

    public Poste getTableposte() {
        return this.tableposte;
    }

    public void setTableposte(Poste tableposte) {
        this.tableposte = tableposte;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Echelle getTableechelle() {
        return this.tableechelle;
    }

    public void setTableechelle(Echelle tableechelle) {
        this.tableechelle = tableechelle;
    }

    public String getNumAffiliationCNSS() {
        return this.numAffiliationCNSS;
    }

    public void setNumAffiliationCNSS(String numAffiliationCNSS) {
        this.numAffiliationCNSS = numAffiliationCNSS;
    }

    public Llieu getLlieu() {
        return this.llieu;
    }

    public void setLlieu(Llieu llieu) {
        this.llieu = llieu;
    }

    public List<Typeadhesion> getTabletypeadhesions() {
        return this.tabletypeadhesions;
    }

    public void setTabletypeadhesions(List<Typeadhesion> tabletypeadhesions) {
        this.tabletypeadhesions = tabletypeadhesions;
    }
}
