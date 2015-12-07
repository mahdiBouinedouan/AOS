package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tablefonction")

public class Fonction implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tablefonction")
    private List<Adherent> adherents;

    @Column(name = "Fonction", table = "tablefonction", length = 2147483647)
    @Lob
    @Basic
    private String fonction;

    @Column(name = "idCategorie", table = "tablefonction")
    @Basic
    private Integer idCategorie;

    @ManyToMany(targetEntity = Categorie.class)
    private Collection<Categorie> categories;

    @Column(name = "IDFonction", table = "tablefonction", nullable = false)
    @Id
    private Integer iDFonction;

    public Fonction() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getFonction() {
        return this.fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Integer getIdCategorie() {
        return this.idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Collection<Categorie> getCategories() {
        return this.categories;
    }

    public void setCategories(Collection<Categorie> categories) {
        this.categories = categories;
    }

    public Integer getIDFonction() {
        return this.iDFonction;
    }

    public void setIDFonction(Integer iDFonction) {
        this.iDFonction = iDFonction;
    }
}
