package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tabletypeadhesion")

public class Typeadhesion implements Serializable {

    @ManyToMany(targetEntity = Adherent.class, mappedBy = "tabletypeadhesions")
    private List<Adherent> adherents;

    @Column(name = "IDTypeAdhesion", table = "tabletypeadhesion", nullable = false)
    @Id
    private Integer iDTypeAdhesion;

    @Column(name = "TypeAdhesion", table = "tabletypeadhesion", length = 2147483647)
    @Lob
    @Basic
    private String typeAdhesion;

    public Typeadhesion() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Integer getIDTypeAdhesion() {
        return this.iDTypeAdhesion;
    }

    public void setIDTypeAdhesion(Integer iDTypeAdhesion) {
        this.iDTypeAdhesion = iDTypeAdhesion;
    }

    public String getTypeAdhesion() {
        return this.typeAdhesion;
    }

    public void setTypeAdhesion(String typeAdhesion) {
        this.typeAdhesion = typeAdhesion;
    }
}
