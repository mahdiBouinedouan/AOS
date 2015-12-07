package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tabletypedepense")

public class Typedepense implements Serializable {

    @OneToMany(targetEntity = Scolarite.class, mappedBy = "typedepense")
    private List<Scolarite> scolarites;

    @Column(name = "IDTypeDepense", table = "tabletypedepense", nullable = false)
    @Id
    private Integer iDTypeDepense;

    @OneToMany(targetEntity = Prestation.class, mappedBy = "typedepense")
    private List<Prestation> prestations;

    @OneToMany(targetEntity = Depense.class, mappedBy = "typedepense")
    private List<Depense> depenses;

    @Column(name = "TypeDepense", table = "tabletypedepense", nullable = false, length = 2147483647)
    @Lob
    @Basic
    private String typeDepense;

    public Typedepense() {

    }

    public List<Scolarite> getScolarites() {
        return this.scolarites;
    }

    public void setScolarites(List<Scolarite> scolarites) {
        this.scolarites = scolarites;
    }

    public Integer getIDTypeDepense() {
        return this.iDTypeDepense;
    }

    public void setIDTypeDepense(Integer iDTypeDepense) {
        this.iDTypeDepense = iDTypeDepense;
    }

    public List<Prestation> getPrestations() {
        return this.prestations;
    }

    public void setPrestations(List<Prestation> prestations) {
        this.prestations = prestations;
    }

    public List<Depense> getDepenses() {
        return this.depenses;
    }

    public void setDepenses(List<Depense> depenses) {
        this.depenses = depenses;
    }

    public String getTypeDepense() {
        return this.typeDepense;
    }

    public void setTypeDepense(String typeDepense) {
        this.typeDepense = typeDepense;
    }
}
