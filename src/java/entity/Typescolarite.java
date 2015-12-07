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
@Table(name = "tabletypescolarite")

public class Typescolarite implements Serializable {

    @OneToMany(targetEntity = Scolarite.class, mappedBy = "tabletypescolarite")
    private List<Scolarite> scolarites;

    @Column(name = "IDTypeScolarite", table = "tabletypescolarite", nullable = false)
    @Id
    private Integer iDTypeScolarite;

    @Column(name = "TypeScolarite", table = "tabletypescolarite", length = 2147483647)
    @Lob
    @Basic
    private String typeScolarite;

    public Typescolarite() {

    }

    public List<Scolarite> getScolarites() {
        return this.scolarites;
    }

    public void setScolarites(List<Scolarite> scolarites) {
        this.scolarites = scolarites;
    }

    public Integer getIDTypeScolarite() {
        return this.iDTypeScolarite;
    }

    public void setIDTypeScolarite(Integer iDTypeScolarite) {
        this.iDTypeScolarite = iDTypeScolarite;
    }

    public String getTypeScolarite() {
        return this.typeScolarite;
    }

    public void setTypeScolarite(String typeScolarite) {
        this.typeScolarite = typeScolarite;
    }
}
