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
@Table(name = "tablegrade")

public class Grade implements Serializable {

    @OneToMany(targetEntity = Adherent.class, mappedBy = "tablegrade")
    private List<Adherent> adherents;

    @Column(name = "Grade", table = "tablegrade", length = 2147483647)
    @Lob
    @Basic
    private String grade;

    @Column(name = "IDGrade", table = "tablegrade", nullable = false)
    @Id
    private Integer iDGrade;

    public Grade() {

    }

    public List<Adherent> getAdherents() {
        return this.adherents;
    }

    public void setAdherents(List<Adherent> adherents) {
        this.adherents = adherents;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getIDGrade() {
        return this.iDGrade;
    }

    public void setIDGrade(Integer iDGrade) {
        this.iDGrade = iDGrade;
    }
}
