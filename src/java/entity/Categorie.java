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
@Table(name = "tablecategorie")

public class Categorie implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tablecategorie")
    private List<Adherent> adherents;

    @Column(name = "Categorie", table = "tablecategorie", length = 2147483647)
    @Lob
    @Basic
    private String categorie;

    @Column(name = "MAPFS", table = "tablecategorie")
    @Basic
    private Integer mapfs;

    @ManyToMany(targetEntity = Fonction.class, mappedBy = "categories")
    private Collection<Fonction> fonctions;

    @Column(name = "IDCategorie", table = "tablecategorie", nullable = false)
    @Id
    private Integer iDCategorie;

    @Column(name = "MAA", table = "tablecategorie")
    @Basic
    private Integer maa;

    public Categorie() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Integer getMapfs() {
        return this.mapfs;
    }

    public void setMapfs(Integer mapfs) {
        this.mapfs = mapfs;
    }

    public Collection<Fonction> getFonctions() {
        return this.fonctions;
    }

    public void setFonctions(Collection<Fonction> fonctions) {
        this.fonctions = fonctions;
    }

    public Integer getIDCategorie() {
        return this.iDCategorie;
    }

    public void setIDCategorie(Integer iDCategorie) {
        this.iDCategorie = iDCategorie;
    }

    public Integer getMaa() {
        return this.maa;
    }

    public void setMaa(Integer maa) {
        this.maa = maa;
    }
}
