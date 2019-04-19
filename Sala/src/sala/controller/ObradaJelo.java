/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Jelo;
import sala.model.Mladenci;
import sala.model.Pice;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;
import sala.view.Jela;

/**
 *
 * @author Tomislav
 */
public class ObradaJelo extends Obrada<Jelo> implements ObradaSucelje<Jelo>{
    
    public ObradaJelo(){
    super();
}

    @Override
    public List<Jelo> getLista() {
        return HibernateUtil.getSession().createQuery("from Jelo").list();
    }
    
   

    @Override
    public void kontrola(Jelo j) throws SalatestException {
         
        
    }

    @Override
    public Jelo spremi(Jelo j) throws SalatestException {
            kontrola(j);
            return dao.save(j);
    }

    @Override
    public void obrisi(Jelo j) throws SalatestException {
        
        dao.delete(j);
    }

    public List<Jelo> getLista(String uvjet, boolean isSelected) {
        
        Query query = HibernateUtil.getSession().createQuery("from Jelo a " +
                 " where concat (a.naziv,' ',a.cijenaPoGlavi) like :uvjet").setString("uvjet", "%" + uvjet + "%");
        if(isSelected) {
            query.setMaxResults(20);
        }
        return query.list();
        
    }

   

    }
    
    
    

