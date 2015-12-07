package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Conjoint extends Personne implements Serializable {

    private String employeurConjoint;

    @OneToOne(targetEntity = Adherent.class, mappedBy = "conjoint")
    private Adherent adherent;

    private String fonctionConjoint;

    public Conjoint() {

    }

    public String getEmployeurConjoint() {
        return this.employeurConjoint;
    }

    public void setEmployeurConjoint(String employeurConjoint) {
        this.employeurConjoint = employeurConjoint;
    }

    public Adherent getAdherent() {
        return this.adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public String getFonctionConjoint() {
        return this.fonctionConjoint;
    }

    public void setFonctionConjoint(String fonctionConjoint) {
        this.fonctionConjoint = fonctionConjoint;
    }
}
