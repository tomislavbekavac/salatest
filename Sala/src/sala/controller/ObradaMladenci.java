/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Mladenci;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaMladenci extends Obrada<Mladenci> implements ObradaSucelje<Mladenci>{
    
    public ObradaMladenci() {
        super();
    }

    @Override
    public List<Mladenci> getLista() {
        return HibernateUtil.getSession().createQuery("from Mladenci").list();
    }

     public List<Mladenci> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Mladenci a "
                 + " where concat(a.korisnik) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
     }
    
    @Override
    public void kontrola(Mladenci m) throws SalatestException {
        if(m.getKorisnik()==null) {
            throw new SalatestException("Korisnik je null, obavezan unos");
        }
        if(m.getKorisnik().trim().isEmpty()) {
            throw new SalatestException("Korisnik nije unesen, obavezan unos");
        }
        if(m.getAdresa()==null) {
            throw new SalatestException("Adresa je null, obavezan unos");
        }
        if(m.getAdresa().trim().isEmpty()) {
            throw new SalatestException("Adresa je prazna, obavezan unos");
        }
        if(m.getMobitel()==null) {
            throw new SalatestException("Mobitel je null, obavezan unos");
        }
        if(m.getMobitel().trim().isEmpty()) {
            throw new SalatestException("Mobitel je prazan, obavezan unos");
        }
        if(m.getUgovor()==null) {
            throw new SalatestException("Ugovor je null, obavezan unos");
        }
        if(m.getUgovor().trim().isEmpty()) {
            throw new SalatestException("Ugovor je prazan, obavezan unos");
        }
    }

    @Override
    public Mladenci spremi(Mladenci m) throws SalatestException {
        kontrola(m);
        return dao.save(m);
    }

    @Override
    public void obrisi(Mladenci m) throws SalatestException {
    
    dao.delete(m);
    }

    public List<Mladenci> spremi(List<Mladenci> mladencii) throws SalatestException{
       for (Mladenci m : mladencii) {
              
            kontrola(m);
         }
        
         
         return dao.save(mladencii);
    }
    
    
    
}
