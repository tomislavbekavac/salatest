/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sala.controller.ObradaJelo;
import sala.controller.ObradaJelovnik;
import sala.controller.ObradaPice;
import sala.model.Jelo;
import sala.model.Jelovnik;
import sala.model.Pice;
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class Jelovnici extends javax.swing.JFrame {

    private final ObradaJelovnik obradaEntitet;
    private final ObradaJelo obradaJelo;
    private final ObradaPice obradaPice;
    
    private Jelovnik jelovnik;
    
    
    /**
     * Creates new form Jelovnici
     */
    public Jelovnici() {
       
       initComponents();
       obradaEntitet = new ObradaJelovnik();
       obradaJelo = new ObradaJelo();
       obradaPice = new ObradaPice();
       
        
        
        
      ucitajPodatke();
    
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstJeloUBazi = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstJeloUJelovniku = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnDodajJeloNaJelovnik = new javax.swing.JButton();
        btnMakniJeloSJelovnika = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPiceUBazi = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPiceUJelovniku = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        btnDodajPiceUJelovnik = new javax.swing.JButton();
        btnMakniPiceSJelovnika = new javax.swing.JButton();
        txtUvjetJelo = new javax.swing.JTextField();
        txtUvjetPice = new javax.swing.JTextField();
        chbLimitatorPice = new javax.swing.JCheckBox();
        chbLimitatorJelo = new javax.swing.JCheckBox();
        btnOcistiPolja4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel3.setText("Naziv");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstJeloUBazi);

        jLabel4.setText("Jelo u Bazi");

        jScrollPane3.setViewportView(lstJeloUJelovniku);

        jLabel5.setText("Jelo u Jelovniku");

        btnDodajJeloNaJelovnik.setText(">>");
        btnDodajJeloNaJelovnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajJeloNaJelovnikActionPerformed(evt);
            }
        });

        btnMakniJeloSJelovnika.setText("<<");
        btnMakniJeloSJelovnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniJeloSJelovnikaActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(lstPiceUBazi);

        jLabel6.setText("Piće u Bazi");

        jScrollPane5.setViewportView(lstPiceUJelovniku);

        jLabel7.setText("Pice u Jelovniku");

        btnDodajPiceUJelovnik.setText(">>");
        btnDodajPiceUJelovnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPiceUJelovnikActionPerformed(evt);
            }
        });

        btnMakniPiceSJelovnika.setText("<<");
        btnMakniPiceSJelovnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniPiceSJelovnikaActionPerformed(evt);
            }
        });

        txtUvjetJelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetJeloActionPerformed(evt);
            }
        });

        txtUvjetPice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetPiceActionPerformed(evt);
            }
        });

        chbLimitatorPice.setText("Limitiraj Piće na 20");

        chbLimitatorJelo.setText("Limitiraj Jelo na 20");

        btnOcistiPolja4.setText("Očisti polja");
        btnOcistiPolja4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPolja4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnOcistiPolja4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnMakniJeloSJelovnika, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnDodajJeloNaJelovnik, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjetJelo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chbLimitatorJelo)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjetPice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chbLimitatorPice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMakniPiceSJelovnika, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodajPiceUJelovnik, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnDodaj)
                                .addGap(46, 46, 46)
                                .addComponent(btnPromjeni)
                                .addGap(32, 32, 32)
                                .addComponent(btnObrisi)
                                .addGap(60, 60, 60)
                                .addComponent(btnOcistiPolja4))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(btnDodajPiceUJelovnik)
                                    .addGap(72, 72, 72)
                                    .addComponent(btnMakniPiceSJelovnika))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUvjetJelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chbLimitatorJelo))
                                        .addComponent(txtUvjetPice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chbLimitatorPice))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(btnDodajJeloNaJelovnik)
                                    .addGap(67, 67, 67)
                                    .addComponent(btnMakniJeloSJelovnika)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
    if(evt.getValueIsAdjusting()) {
        return;
    }
    
    ocistiPolja();
    
    jelovnik = lstEntiteti.getSelectedValue();
    
    if (jelovnik == null) {
        return;
    }
       
    txtNaziv.setText(jelovnik.getNaziv());

    
        ucitajJela(jelovnik);
        ucitajPica(jelovnik);
    
    
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void txtUvjetJeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetJeloActionPerformed
      ucitajJela();
    }//GEN-LAST:event_txtUvjetJeloActionPerformed

    private Jelovnik preuzmiVrijednosti(Jelovnik j) {
        j.setNaziv(txtNaziv.getText());
       return j;
    }
    private void spremi(Jelovnik j) {
        try {
            obradaEntitet.spremi(j);
            ocistiPolja();
            ucitajPodatke();
        } catch (SalatestException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Jelovnik j = new Jelovnik();
        j = preuzmiVrijednosti(j);
        spremi(j);
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        jelovnik = lstEntiteti.getSelectedValue();
        if (jelovnik == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
            return;
        }
        jelovnik = preuzmiVrijednosti(jelovnik);
        spremi(jelovnik);
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
       jelovnik = lstEntiteti.getSelectedValue();
       if(jelovnik == null) {
           JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
           return;
       }
        try {
            obradaEntitet.obrisi(jelovnik);
            ocistiPolja();
            ucitajPodatke();
        } catch (SalatestException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtUvjetPiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetPiceActionPerformed
        ucitajPica();
    }//GEN-LAST:event_txtUvjetPiceActionPerformed

    private void btnDodajJeloNaJelovnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajJeloNaJelovnikActionPerformed
      if (jelovnik == null) {
          JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
          return;
      }
      
      
      lstJeloUBazi.getSelectedValuesList().forEach((p) -> {
      boolean postoji = false;
      for (int i = 0; i < lstJeloUJelovniku.getModel().getSize(); i++) {
          if (p.getSifra() == lstJeloUJelovniku.getModel().getElementAt(i).getSifra()) {
              postoji = true;
              break;
          }
      }
      if(!postoji) {
          jelovnik.getJelo().add(p);
      }
      });
      
        ucitajJela(jelovnik);
    }//GEN-LAST:event_btnDodajJeloNaJelovnikActionPerformed

    private void btnMakniJeloSJelovnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniJeloSJelovnikaActionPerformed
        
        if (jelovnik == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
            return;
        }
        
        List<Integer> zaBrisanje = new ArrayList<>();
        lstJeloUJelovniku.getSelectedValuesList().forEach((p) -> {
        zaBrisanje.add(p.getSifra());
        });
        
        for(int i=0; i<jelovnik.getJelo().size();i++) {
            for (int b : zaBrisanje) {
                if (jelovnik.getJelo().get(i).getSifra()==b) {
                    jelovnik.getJelo().remove(i);
                    break;
                }
            }
        }
        
        ucitajJela(jelovnik);
        
        
    }//GEN-LAST:event_btnMakniJeloSJelovnikaActionPerformed

    private void btnDodajPiceUJelovnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPiceUJelovnikActionPerformed
        if (jelovnik == null) {
          JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
          return;
      }
      
      
      lstPiceUBazi.getSelectedValuesList().forEach((p) -> {
      boolean postoji = false;
      for (int i = 0; i < lstPiceUJelovniku.getModel().getSize(); i++) {
          if (p.getSifra() == lstPiceUJelovniku.getModel().getElementAt(i).getSifra()) {
              postoji = true;
              break;
          }
      }
      if(!postoji) {
          jelovnik.getPice().add(p);
      }
      });
      
        ucitajPica(jelovnik);
    }//GEN-LAST:event_btnDodajPiceUJelovnikActionPerformed

    private void btnMakniPiceSJelovnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniPiceSJelovnikaActionPerformed
     if (jelovnik == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite jelovnik");
            return;
        }
        
        List<Integer> zaBrisanje = new ArrayList<>();
        lstPiceUJelovniku.getSelectedValuesList().forEach((p) -> {
        zaBrisanje.add(p.getSifra());
        });
        
        for(int i=0; i<jelovnik.getPice().size();i++) {
            for (int b : zaBrisanje) {
                if (jelovnik.getPice().get(i).getSifra()==b) {
                    jelovnik.getPice().remove(i);
                    break;
                }
            }
        }
        
        ucitajPica(jelovnik);
    }//GEN-LAST:event_btnMakniPiceSJelovnikaActionPerformed

    private void btnOcistiPolja4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPolja4ActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_btnOcistiPolja4ActionPerformed

    /**
     * @param args the command line arguments
     */

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        
        //</editor-fold>

        /* Create and display the form */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajJeloNaJelovnik;
    private javax.swing.JButton btnDodajPiceUJelovnik;
    private javax.swing.JButton btnMakniJeloSJelovnika;
    private javax.swing.JButton btnMakniPiceSJelovnika;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPolja4;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JCheckBox chbLimitatorJelo;
    private javax.swing.JCheckBox chbLimitatorPice;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Jelovnik> lstEntiteti;
    private javax.swing.JList<Jelo> lstJeloUBazi;
    private javax.swing.JList<Jelo> lstJeloUJelovniku;
    private javax.swing.JList<Pice> lstPiceUBazi;
    private javax.swing.JList<Pice> lstPiceUJelovniku;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjetJelo;
    private javax.swing.JTextField txtUvjetPice;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
        DefaultListModel<Jelovnik> m = new DefaultListModel<>();
        obradaEntitet.getLista().forEach((g) ->{
            m.addElement(g);
        });
        lstEntiteti.setModel(m);
    }
    

    private void ocistiPolja() {
       txtNaziv.setText("");
       lstJeloUJelovniku.setModel(new DefaultComboBoxModel<>());
       lstPiceUJelovniku.setModel(new DefaultComboBoxModel<>());
       
     
    }

    private void ucitajJela(Jelovnik j) {
       DefaultListModel<Jelo> m = new DefaultListModel<>();
       
       j.getJelo().forEach((p) ->{
           m.addElement(p);
    });
       lstJeloUJelovniku.setModel(m);
    }

    private void ucitajPica(Jelovnik j) {
        DefaultListModel<Pice> m = new DefaultListModel<>();
       
       j.getPice().forEach((p) ->{
           m.addElement(p);
    });
       lstPiceUJelovniku.setModel(m);
    }

    private void ucitajJela() {
    if(chbLimitatorJelo.isSelected()) {
        DefaultListModel<Jelo> m = new DefaultListModel<>();
        for (Jelo s : obradaJelo.getLista(txtUvjetJelo.getText().trim(), chbLimitatorJelo.isSelected())) {
            m.addElement(s);
        } 
        lstJeloUBazi.setModel(m);
    }else {
        DefaultListModel<Jelo> m = new DefaultListModel<>();
        Jelo j = new Jelo();
        j.setNaziv("Molim pričekati");
        m.addElement(j);
        lstJeloUBazi.setModel(m);
       Jelovnici.DuzeUcitanjeJela d = new Jelovnici.DuzeUcitanjeJela();
       d.start();
    }
    
           
           
       }
    
    private class DuzeUcitanjeJela extends Thread {
        @Override
        public void run() {
            DefaultListModel<Jelo> m = new DefaultListModel<>();
            for(Jelo s : obradaJelo.getLista(txtUvjetJelo.getText().trim(), chbLimitatorJelo.isSelected())) {
                m.addElement(s);
            }
            lstJeloUBazi.setModel(m);
        }
    }
    
    private class DuzeUcitanjePica extends Thread {
        @Override
        public void run() {
            DefaultListModel<Pice> m = new DefaultListModel<>();
            for(Pice s : obradaPice.getLista(txtUvjetPice.getText().trim(), chbLimitatorPice.isSelected())) {
                m.addElement(s);
            }
            lstPiceUBazi.setModel(m);
        }
    }

    private void ucitajPica() {
        if(chbLimitatorPice.isSelected()) {
        DefaultListModel<Pice> m = new DefaultListModel<>();
        for (Pice s : obradaPice.getLista(txtUvjetPice.getText().trim(), chbLimitatorPice.isSelected())) {
            m.addElement(s);
        } 
        lstPiceUBazi.setModel(m);
    }else {
        DefaultListModel<Pice> m = new DefaultListModel<>();
        Pice p = new Pice();
        p.setNaziv("Molim pričekati");
        m.addElement(p);
        lstPiceUBazi.setModel(m);
        Jelovnici.DuzeUcitanjePica d = new Jelovnici.DuzeUcitanjePica();
        d.start();
    }

   
    }
}

    


