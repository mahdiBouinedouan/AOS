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
@Table(name = "tablesituation")

public class Situation implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tablesituation")
    private List<Adherent> adherents;

    @Column(name = "IDSituation", table = "tablesituation", nullable = false)
    @Id
    private Integer iDSituation;

    @Column(name = "Situation", table = "tablesituation", length = 2147483647)
    @Lob
    @Basic
    private String situation;

    public Situation() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public Integer getIDSituation() {
        return this.iDSituation;
    }

    public void setIDSituation(Integer iDSituation) {
        this.iDSituation = iDSituation;
    }

    public String getSituation() {
        return this.situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
