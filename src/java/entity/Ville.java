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
@Table(name = "tableville")

public class Ville implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tableville")
    private List<Adherent> adherents;

    @Column(name = "IDVille", table = "tableville", nullable = false)
    @Id
    private Integer iDVille;

    @Column(name = "Ville", table = "tableville", length = 2147483647)
    @Lob
    @Basic
    private String ville;

    public Ville() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Integer getIDVille() {
        return this.iDVille;
    }

    public void setIDVille(Integer iDVille) {
        this.iDVille = iDVille;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
