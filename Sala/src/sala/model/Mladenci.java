
package sala.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Mladenci extends Entitet implements Serializable {
    
private String korisnik;
private String mobitel;
private String adresa;
private String ugovor;








    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getUgovor() {
        return ugovor;
    }

    public void setUgovor(String ugovor) {
        this.ugovor = ugovor;
    }


@Override
public String toString() {
    return getKorisnik();
}

   
    
    
    
}
