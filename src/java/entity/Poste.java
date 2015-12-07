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
@Table(name = "tableposte")

public class Poste implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tableposte")
    private List<Adherent> adherents;

    @Column(name = "TypePoste", table = "tableposte", length = 2147483647)
    @Lob
    @Basic
    private String typePoste;

    @Column(name = "IDPoste", table = "tableposte", nullable = false)
    @Id
    private Integer iDPoste;

    @Column(name = "poste", table = "tableposte", length = 2147483647)
    @Lob
    @Basic
    private String poste;

    public Poste() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getTypePoste() {
        return this.typePoste;
    }

    public void setTypePoste(String typePoste) {
        this.typePoste = typePoste;
    }

    public Integer getIDPoste() {
        return this.iDPoste;
    }

    public void setIDPoste(Integer iDPoste) {
        this.iDPoste = iDPoste;
    }

    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
