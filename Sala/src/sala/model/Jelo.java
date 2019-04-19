
package sala.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Jelo extends Entitet implements Serializable{
    
  private String naziv;
  private BigDecimal cijenaPoGlavi;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijenaPoGlavi() {
        return cijenaPoGlavi;
    }

    public void setCijenaPoGlavi(BigDecimal cijenaPoGlavi) {
        this.cijenaPoGlavi = cijenaPoGlavi;
    }

    @Override
    public String toString() {
        return getNaziv();
    }
  
  
  
  
    
}
