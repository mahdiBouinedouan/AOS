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
@Table(name = "tablebanque")

public class Banque implements Serializable {

    @Column(name = "IDBanque", table = "tablebanque", nullable = false)
    @Id
    private Integer iDBanque;

    @OneToMany(targetEntity = Adherent.class, mappedBy = "banque")
    private List<Adherent> adherents;

    @Column(name = "Banque", table = "tablebanque", nullable = false, length = 2147483647)
    @Lob
    @Basic
    private String banque;

    public Banque() {

    }

    public Integer getIDBanque() {
        return this.iDBanque;
    }

    public void setIDBanque(Integer iDBanque) {
        this.iDBanque = iDBanque;
    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getBanque() {
        return this.banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }
}
