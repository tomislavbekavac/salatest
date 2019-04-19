
package sala.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Svadba extends Entitet implements Serializable {
    
   private BigDecimal cijena;
   private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
   
    
    private String broj_gostiju;
    private String stolovi;
    private String komentar;

    
    @Temporal(TemporalType.DATE)
    private Date datum;
    
    
    @ManyToMany
    private List<Osoblje> osoblje = new ArrayList<>();
    
    @ManyToOne
    private Jelovnik jelovnik;
    
    @ManyToMany
    private List<Mladenci> mladenci = new ArrayList<>();

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBroj_gostiju() {
        return broj_gostiju;
    }

    public void setBroj_gostiju(String broj_gostiju) {
        this.broj_gostiju = broj_gostiju;
    }

    public String getStolovi() {
        return stolovi;
    }

    public void setStolovi(String stolovi) {
        this.stolovi = stolovi;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public List<Osoblje> getOsoblje() {
        return osoblje;
    }

    public void setOsoblje(List<Osoblje> osoblje) {
        this.osoblje = osoblje;
    }

    public Jelovnik getJelovnik() {
        return jelovnik;
    }

    public void setJelovnik(Jelovnik jelovnik) {
        this.jelovnik = jelovnik;
    }

    public List<Mladenci> getMladenci() {
        return mladenci;
    }

    public void setMladenci(List<Mladenci> mladenci) {
        this.mladenci = mladenci;
    }

   
    @Override
    public String toString() {
        return getNaziv();
    }

  

   
   

    
    
    
    
    
}
