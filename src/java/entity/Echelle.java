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
@Table(name = "tableechelle")

public class Echelle implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tableechelle")
    private List<Adherent> adherents;

    @Column(name = "Echelle", table = "tableechelle", length = 2147483647)
    @Lob
    @Basic
    private String echelle;

    @Column(name = "IDEchelle", table = "tableechelle", nullable = false)
    @Id
    private Integer iDEchelle;

    @Column(name = "IDCategorie", table = "tableechelle")
    @Basic
    private Integer iDCategorie;

    public Echelle() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getEchelle() {
        return this.echelle;
    }

    public void setEchelle(String echelle) {
        this.echelle = echelle;
    }

    public Integer getIDEchelle() {
        return this.iDEchelle;
    }

    public void setIDEchelle(Integer iDEchelle) {
        this.iDEchelle = iDEchelle;
    }

    public Integer getIDCategorie() {
        return this.iDCategorie;
    }

    public void setIDCategorie(Integer iDCategorie) {
        this.iDCategorie = iDCategorie;
    }
}
