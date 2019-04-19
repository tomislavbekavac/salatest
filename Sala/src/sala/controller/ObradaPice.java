/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Pice;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaPice extends Obrada<Pice> implements ObradaSucelje<Pice>{
    
    public ObradaPice() {
        super();
    }
    

    @Override
    public List<Pice> getLista() {
        return HibernateUtil.getSession().createQuery("from Pice").list();
    }



    @Override
    public Pice spremi(Pice p) throws SalatestException {
        kontrola(p);
        return dao.save(p);
        
    }

    @Override
    public void obrisi(Pice p) throws SalatestException {
     dao.delete(p);
    }

    public List<Pice> getLista(String uvjet, boolean isSelected) {
        
        Query query = HibernateUtil.getSession().createQuery("from Pice a " +
                 " where concat (a.naziv,' ',a.cijenaPoGlavi) like :uvjet").setString("uvjet", "%" + uvjet + "%");
        if(isSelected) {
            query.setMaxResults(20);
        }
        return query.list();
        
    }

    @Override
    public void kontrola(Pice t) throws SalatestException {
       
    }

   

    
    
    
}
