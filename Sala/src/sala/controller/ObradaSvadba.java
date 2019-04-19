/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.math.BigDecimal;
import java.util.List;
import sala.model.Svadba;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaSvadba extends Obrada<Svadba> implements ObradaSucelje<Svadba>{
    
    public ObradaSvadba() {
        super();
    }

    @Override
    public List<Svadba> getLista() {
        return HibernateUtil.getSession().createQuery("from Svadba").list();
    }

    @Override
    public void kontrola(Svadba s) throws SalatestException {
       if(s.getBroj_gostiju()==null) {
           throw new SalatestException("Broj gostiju je null, obavezan unos");
       }
         if(s.getBroj_gostiju().trim().isEmpty()) {
           throw new SalatestException("Broj gostiju je prazan, obavezan unos");
       }
         if(s.getCijena()!=null &&  s.getCijena().compareTo(BigDecimal.ZERO)<0){
            throw  new SalatestException("Cijena mora biti pozitivan broj");
        }
         
    }

    @Override
    public Svadba spremi(Svadba s) throws SalatestException {
        kontrola(s);
        return dao.save(s);
    }

    @Override
    public void obrisi(Svadba s) throws SalatestException {
       
        dao.delete(s);
    }
    
    
    
}
