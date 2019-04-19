/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Osoblje;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaOsoblje extends Obrada<Osoblje> implements ObradaSucelje<Osoblje>{

    public ObradaOsoblje() {
        super();
    }
    
    

    @Override
    public List<Osoblje> getLista() {
        return HibernateUtil.getSession().createQuery("from Osoblje").list();
    }

    @Override
    public void kontrola(Osoblje o) throws SalatestException {
        if(o.getIme()==null) {
            throw new SalatestException("Ime je null, obavezan unos");
        }
          if(o.getIme().trim().isEmpty()) {
            throw new SalatestException("Ime je prazan, obavezan unos");
        }
            if(o.getPrezime()==null) {
            throw new SalatestException("Prezime je null, obavezan unos");
        }
              if(o.getPrezime().trim().isEmpty()) {
            throw new SalatestException("Prezime je prazan, obavezan unos");
        }
                if(o.getRadnoMjesto()==null) {
            throw new SalatestException("radno mjesto je null, obavezan unos");
        }
                  if(o.getRadnoMjesto().trim().isEmpty()) {
            throw new SalatestException("radno mjesto je prazan, obavezan unos");
        }
    }

    @Override
    public Osoblje spremi(Osoblje o) throws SalatestException {
        kontrola(o);
        return dao.save(o);
    }

    @Override
    public void obrisi(Osoblje o) throws SalatestException {
       
        dao.delete(o);
    }

    public List<Osoblje> spremi(List<Osoblje> osoblja) throws SalatestException{
        for ( Osoblje o : osoblja) {
            kontrola(o);
        }
        return dao.save(osoblja);
    }

    public List<Osoblje> getLista(String uvjet, boolean isSelected) {
       Query query = HibernateUtil.getSession().createQuery("from Osoblje a "
                 + " where concat(a.ime) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
    }
    
    
    
}
