package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity


public class Enfant extends Personne implements Serializable {

    private Integer scolarise;

    @ManyToOne(targetEntity = Scolarite.class)
    private Scolarite scolarite;

    @ManyToOne(targetEntity = Adherent.class)
    private Adherent adherent;

  
    private String niveauEtude;


    private Long fraisScolariteMensuelle;

 
    private String observations;


    private Integer iDEtablissement;

    @ManyToOne(targetEntity = Cycle.class)
    private Cycle cycle;

    public Enfant() {

    }

    public Integer getScolarise() {
        return this.scolarise;
    }

    public void setScolarise(Integer scolarise) {
        this.scolarise = scolarise;
    }

    public Scolarite getScolarite() {
        return this.scolarite;
    }

    public void setScolarite(Scolarite scolarite) {
        this.scolarite = scolarite;
    }

    public Adherent getAdherent() {
        return this.adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public String getNiveauEtude() {
        return this.niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public Long getFraisScolariteMensuelle() {
        return this.fraisScolariteMensuelle;
    }

    public void setFraisScolariteMensuelle(Long fraisScolariteMensuelle) {
        this.fraisScolariteMensuelle = fraisScolariteMensuelle;
    }

    public String getObservations() {
        return this.observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Integer getIDEtablissement() {
        return this.iDEtablissement;
    }

    public void setIDEtablissement(Integer iDEtablissement) {
        this.iDEtablissement = iDEtablissement;
    }

    public Cycle getCycle() {
        return this.cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }
}
