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
@Table(name = "tablecycle")

public class Cycle implements Serializable {

    @Column(name = "IDCycle", table = "tablecycle", nullable = false)
    @Id
    private Integer iDCycle;

    @OneToMany(targetEntity = Enfant.class, mappedBy = "cycle")
    private List<Enfant> enfants;

    @Column(name = "Cycle", table = "tablecycle", length = 2147483647)
    @Lob
    @Basic
    private String cycle;

    public Cycle() {

    }

    public Integer getIDCycle() {
        return this.iDCycle;
    }

    public void setIDCycle(Integer iDCycle) {
        this.iDCycle = iDCycle;
    }

    public List<Enfant> getEnfants() {
        return this.enfants;
    }

    public void setEnfants(List<Enfant> enfants) {
        this.enfants = enfants;
    }

    public String getCycle() {
        return this.cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }
}
