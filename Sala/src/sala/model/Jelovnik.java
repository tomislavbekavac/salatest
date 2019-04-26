/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Jelovnik extends Entitet implements Serializable{
    
    
    private String naziv;
    

  
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
    @ManyToMany 
    private List<Pice> pice = new ArrayList<>();
    
    
    @ManyToMany 
    private List<Jelo> jelo = new ArrayList<>();
    
    

    public List<Pice> getPice() {
        return pice;
    }

    public void setPice(List<Pice> pice) {
        this.pice = pice;
    }

    public List<Jelo> getJelo() {
        return jelo;
    }

    public void setJelo(List<Jelo> jelo) {
        this.jelo = jelo;
    }

    

    @Override
    public String toString() {
        return getNaziv() + " " + getJelo() + " " + getPice();
    }

    
    
   
    
}
