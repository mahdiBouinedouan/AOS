package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tabledepense")

public class Depense implements Serializable {

    @Column(name = "Reference", table = "tabledepense", nullable = false, length = 2147483647)
    @Lob
    @Basic
    private String reference;

    @ManyToOne(targetEntity = Typedepense.class)
    private Typedepense typedepense;

    @Column(name = "DateCreation", table = "tabledepense", nullable = false, length = 10)
    @Basic
    private String dateCreation;

    @Column(name = "IDDepense", table = "tabledepense", nullable = false)
    @Id
    private Integer iDDepense;

    @Column(name = "EmailEnvoye", table = "tabledepense", nullable = false)
    @Basic
    private int emailEnvoye;

    @Column(name = "Montant", table = "tabledepense", nullable = false)
    @Basic
    private double montant;

    @Column(name = "RIB", table = "tabledepense", nullable = false, length = 2147483647)
    @Lob
    @Basic
    private String rib;

    @Column(name = "Ok", table = "tabledepense", nullable = false)
    @Basic
    private int ok;

    public Depense() {

    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public int getEmailEnvoye() {
        return this.emailEnvoye;
    }

    public void setEmailEnvoye(int emailEnvoye) {
        this.emailEnvoye = emailEnvoye;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getRib() {
        return this.rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public int getOk() {
        return this.ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }
}
