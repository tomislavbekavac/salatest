/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.pomocno;

import java.util.List;

/**
 *
 * @author Profesor
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws SalatestException;
    public T spremi(T t)  throws SalatestException;
    public void obrisi(T t) throws SalatestException;
    
}
