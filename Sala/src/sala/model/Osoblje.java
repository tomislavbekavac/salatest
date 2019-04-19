/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Osoblje extends Entitet implements Serializable{
    
    private String ime;
    private String prezime;
    private String radnoMjesto;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getRadnoMjesto() {
        return radnoMjesto;
    }

    public void setRadnoMjesto(String radnoMjesto) {
        this.radnoMjesto = radnoMjesto;
    }

    

    
    
    
    

    
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
    
    
    
    
}
