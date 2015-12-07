package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tablefscolarite")

public class Scolarite implements Serializable {

    @Column(name = "Reference", table = "tablefscolarite", nullable = false, length = 2147483647)
    @Lob
    @Basic
    private String reference;

    @Column(name = "IDFScolarite", table = "tablefscolarite", nullable = false)
    @Id
    private Integer iDFScolarite;

    @ManyToOne(targetEntity = Typedepense.class)
    private Typedepense typedepense;

    @Column(name = "DateCreation", table = "tablefscolarite", nullable = false, length = 10)
    @Basic
    private String dateCreation;

    @Column(name = "IDDepense", table = "tablefscolarite")
    @Basic
    private Integer iDDepense;

    @Column(name = "IDPeriode", table = "tablefscolarite", nullable = false)
    @Basic
    private int dateDebut;

    @Column(name = "Montant", table = "tablefscolarite", nullable = false)
    @Basic
    private double montant;

    @Basic
    private String etablissement;

    @Column(name = "IDAnnee", table = "tablefscolarite", nullable = false)
    @Basic
    private int dateFin;

    @OneToMany(targetEntity = Enfant.class, mappedBy = "scolarite")
    private Collection<Enfant> enfant;

    @ManyToOne(targetEntity = Typescolarite.class)
    private Typescolarite tabletypescolarite;

    public Scolarite() {

    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getIDFScolarite() {
        return this.iDFScolarite;
    }

    public void setIDFScolarite(Integer iDFScolarite) {
        this.iDFScolarite = iDFScolarite;
    }

    public Typedepense getTypedepense() {
        return this.typedepense;
    }

    public void setTypedepense(Typedepense typedepense) {
        this.typedepense = typedepense;
    }

    public String getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getIDDepense() {
        return this.iDDepense;
    }

    public void setIDDepense(Integer iDDepense) {
        this.iDDepense = iDDepense;
    }

    public int getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(int dateDebut) {
        this.dateDebut = dateDebut;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getEtablissement() {
        return this.etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public int getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(int dateFin) {
        this.dateFin = dateFin;
    }

    public Collection<Enfant> getEnfant() {
        return this.enfant;
    }

    public void setEnfant(Collection<Enfant> enfant) {
        this.enfant = enfant;
    }

    public Typescolarite getTabletypescolarite() {
        return this.tabletypescolarite;
    }

    public void setTabletypescolarite(Typescolarite tabletypescolarite) {
        this.tabletypescolarite = tabletypescolarite;
    }
}
