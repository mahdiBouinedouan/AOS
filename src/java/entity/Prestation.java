package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tableprestation")

public class Prestation implements Serializable {

    @ManyToOne(targetEntity = Typedepense.class)
    private Typedepense typedepense;

    @OneToMany(targetEntity = Adherent.class, mappedBy = "prestation")
    private Collection<Adherent> adherents;

    @Column(name = "DateCreation", table = "tableprestation", nullable = false, length = 10)
    @Basic
    private String dateCreation;

    @Column(name = "IDPrestation", table = "tableprestation", nullable = false)
    @Id
    private Integer iDPrestation;

    @Column(name = "IDEchelle", table = "tableprestation", nullable = false)
    @Basic
    private int iDEchelle;

    @Column(name = "IDLieu", table = "tableprestation", nullable = false)
    @Basic
    private int iDLieu;

    @Column(name = "DateMandatement", table = "tableprestation", length = 10)
    @Basic
    private String dateMandatement;

    @Column(name = "IDAnnee", table = "tableprestation", nullable = false)
    @Basic
    private int iDAnnee;

    @Column(name = "Active", table = "tableprestation", nullable = false)
    @Basic
    private int active;

    @Column(name = "IDMontant", table = "tableprestation", nullable = false)
    @Basic
    private int iDMontant;

    public Prestation() {

    }

    public Typedepense getTypedepense() {
        return this.typedepense;
    }

    public void setTypedepense(Typedepense typedepense) {
        this.typedepense = typedepense;
    }

    public Collection<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(Collection<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getIDPrestation() {
        return this.iDPrestation;
    }

    public void setIDPrestation(Integer iDPrestation) {
        this.iDPrestation = iDPrestation;
    }

    public int getIDEchelle() {
        return this.iDEchelle;
    }

    public void setIDEchelle(int iDEchelle) {
        this.iDEchelle = iDEchelle;
    }

    public int getIDLieu() {
        return this.iDLieu;
    }

    public void setIDLieu(int iDLieu) {
        this.iDLieu = iDLieu;
    }

    public String getDateMandatement() {
        return this.dateMandatement;
    }

    public void setDateMandatement(String dateMandatement) {
        this.dateMandatement = dateMandatement;
    }

    public int getIDAnnee() {
        return this.iDAnnee;
    }

    public void setIDAnnee(int iDAnnee) {
        this.iDAnnee = iDAnnee;
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getIDMontant() {
        return this.iDMontant;
    }

    public void setIDMontant(int iDMontant) {
        this.iDMontant = iDMontant;
    }
}
