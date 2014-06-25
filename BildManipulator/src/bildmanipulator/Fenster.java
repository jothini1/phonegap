/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fenster.java
 *
 * Created on 02.05.2012, 09:25:22
 */
package bildmanipulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author tommy
 */
public class Fenster extends javax.swing.JFrame {

    
    BufferedImage bi=null;
    BufferedImage bildoriginal=null;
    /** Creates new form Fenster */
    public Fenster() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichneBild(g);
            }

        };
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datei:");

        jButton1.setText("Wählen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Kachelgröße:");

        jTextField2.setText("50");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("Erstelle Bild");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jButton3.setText("Bild speichern");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bild laden");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Zeichengröße:");

        jTextField3.setText("40");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addComponent(jButton3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        
        final JFileChooser fc = new JFileChooser();

//In response to a button click:
        
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
        jTextField1.setText(f.getAbsolutePath());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String pfad=jTextField1.getText();
        if (pfad!=null){
            try {
                bi=ImageIO.read(new File(pfad));
                
                bildoriginal=bi; // damit das original noch da ist
                jPanel1.repaint();
            } catch (IOException ex) {
                System.out.println("Fehler aufgetreten beim Lesen der Datei");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (bildoriginal!=null){
            
            int kantenlaenge=Integer.parseInt(jTextField2.getText());
            int zeichengroesse=Integer.parseInt(jTextField3.getText());
            int anzahlx=bildoriginal.getWidth()/kantenlaenge;
            int anzahly=bildoriginal.getHeight()/kantenlaenge;
            System.out.println("Kantenlänge "+kantenlaenge+", anzahlx "+anzahlx+" anzahly "+anzahly);
            Color [] [] rgb=new Color[anzahlx][anzahly];
            bi=new BufferedImage(kantenlaenge*anzahlx,kantenlaenge*anzahly,BufferedImage.TYPE_INT_ARGB);
           
            Graphics2D g2d=bildoriginal.createGraphics();
            Graphics2D g_bi=bi.createGraphics();
                    
            int anzahlZufall=(int)(Math.sqrt(kantenlaenge));
            int zaehler=0;
                        for (int xwert=0;xwert<kantenlaenge*anzahlx;xwert+=kantenlaenge){
                            for (int ywert=0;ywert<kantenlaenge*anzahly;ywert+=kantenlaenge){
                                int ro=0,gr=0,bl=0;
                                for (int az=0;az<anzahlZufall;az++){
                                    
                                    int co=bildoriginal.getRGB(xwert+(int)(Math.random()*kantenlaenge), ywert+(int)(Math.random()*kantenlaenge));
                                    Color c=new Color(co);
                                    
                                    
                                    bl+=c.getBlue();
                                  
                                    gr+=c.getGreen();
                                   
                                    ro+=c.getRed();
                                    
                                }
                                
                                if (ywert*100/bildoriginal.getHeight()>zaehler){
                                    
                                    System.out.println("Fortschritt: "+zaehler+" %");
                                    zaehler+=10;
                                }
                                
                                //System.out.println(xwert+" "+ ywert+" "+ro+" "+gr+" "+bl+"  az:"+anzahlZufall);
                                rgb[xwert/kantenlaenge][ywert/kantenlaenge]=new Color((int)(ro/anzahlZufall),(int)(gr/anzahlZufall),(int)(bl/anzahlZufall));
                                
                                g_bi.setColor(rgb[xwert/kantenlaenge][ywert/kantenlaenge]);
                                g_bi.fillRect(xwert, ywert, zeichengroesse, zeichengroesse);
                            }
                        }
        }
        jPanel1.repaint(); // bild zeichnen
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        final JFileChooser fc = new JFileChooser();

//In response to a button click:
        
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showSaveDialog(this);
        File f=fc.getSelectedFile();
        System.out.println("Speichern als "+f.getAbsolutePath());
        try {
            ImageIO.write(bi, "png", f);
        } catch (IOException ex) {
            System.out.println("Problem beim Speichern aufgetreten!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void zeichneBild(Graphics g){
        if (bi!=null){
            int w=jPanel1.getWidth();
            int hoeheneu=bi.getHeight()*w/bi.getWidth();
            System.out.println("Maße des Bildes original: "+bi.getWidth()+" "+bi.getHeight()+" , nach Anpassung: "+w+" "+hoeheneu);
            
            g.drawImage(bi,0 , 0, w,hoeheneu,this);
        } else {
            g.setColor(new Color(255,0,0));
            g.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
