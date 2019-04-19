/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.controller;

import java.util.List;
import org.hibernate.Query;
import sala.model.Jelovnik;
import sala.pomocno.HibernateUtil;
import sala.pomocno.ObradaSucelje;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class ObradaJelovnik extends Obrada<Jelovnik> implements ObradaSucelje<Jelovnik>{
    
    public ObradaJelovnik(){
        super();
    }

    @Override
    public List<Jelovnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Jelovnik").list();
    }

    @Override
    public void kontrola(Jelovnik je) throws SalatestException {
        
    }

    @Override
    public Jelovnik spremi(Jelovnik je) throws SalatestException {
        kontrola(je);
        return dao.save(je);
    }

    @Override
    public void obrisi(Jelovnik je) throws SalatestException {
        if(je.getSvadba().size()>0) {
            throw new SalatestException("jelovnik se ne može izbrisati dodan je svadbi");
        }
        dao.delete(je);
    }

    public List<Jelovnik> getLista(String uvjet, boolean isSelected) {
        Query query = HibernateUtil.getSession().createQuery("from Jelovnik a " +
                 " where concat (a.naziv) like :uvjet").setString("uvjet", "%" + uvjet + "%");
        if(isSelected) {
            query.setMaxResults(20);
        }
        return query.list();
        
    }

    
}
