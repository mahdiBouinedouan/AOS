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
@Table(name = "tablelieu")

public class Llieu implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "llieu")
    private List<Adherent> adherents;

    @Column(name = "IDLieu", table = "tablelieu", nullable = false)
    @Id
    private Integer iDLieu;

    @Column(name = "Lieu", table = "tablelieu", length = 2147483647)
    @Lob
    @Basic
    private String lieu;

    public Llieu() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Integer getIDLieu() {
        return this.iDLieu;
    }

    public void setIDLieu(Integer iDLieu) {
        this.iDLieu = iDLieu;
    }

    public String getLieu() {
        return this.lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
