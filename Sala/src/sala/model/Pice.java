/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Pice extends Entitet implements Serializable{
    
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
