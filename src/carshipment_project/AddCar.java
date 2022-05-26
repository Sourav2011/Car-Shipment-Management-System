/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshipment_project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class AddCar extends javax.swing.JFrame {

    /**
     * Creates new form AddCar
     */
    public AddCar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brand = new javax.swing.JTextField();
        cmodel = new javax.swing.JTextField();
        adate = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        colour = new javax.swing.JTextField();
        numofcars = new javax.swing.JTextField();
        carnumber = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(brand);
        brand.setBounds(118, 36, 160, 30);

        cmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmodelActionPerformed(evt);
            }
        });
        getContentPane().add(cmodel);
        cmodel.setBounds(118, 79, 160, 30);

        adate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adateActionPerformed(evt);
            }
        });
        getContentPane().add(adate);
        adate.setBounds(120, 120, 160, 32);
        getContentPane().add(status);
        status.setBounds(120, 160, 162, 34);
        getContentPane().add(colour);
        colour.setBounds(120, 210, 162, 30);

        numofcars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numofcarsActionPerformed(evt);
            }
        });
        getContentPane().add(numofcars);
        numofcars.setBounds(120, 250, 162, 33);
        getContentPane().add(carnumber);
        carnumber.setBounds(120, 300, 162, 30);
        getContentPane().add(price);
        price.setBounds(120, 350, 162, 30);

        jLabel1.setText("Brand");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 36, 88, 28);

        jLabel2.setText("Car Model");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 59, 30);

        jLabel3.setText("Arrival Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 67, 16);

        jLabel4.setText("Status");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 50, 20);

        jLabel5.setText("Colour");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 210, 37, 16);

        jLabel6.setText(" Number of Cars");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 254, 100, 16);

        jLabel7.setText("Car Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 300, 69, 16);

        jLabel8.setText("Price");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 350, 28, 16);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 200, 131, 30);

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(627, 24, 134, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshipment_project/25-cars-worth-waiting-for-lp-ford-gt-photo-658253-s-original.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 920, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmodelActionPerformed

    private void adateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adateActionPerformed

    private void numofcarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numofcarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numofcarsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin_Home hm = new Admin_Home();
        hm.setVisible(true);
        hm.setSize(790,430);
        close();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO CAR VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1,brand.getText());
            ps.setString(2,cmodel.getText());
            ps.setString(3,adate.getText());
            ps.setString(4,status.getText());
            ps.setString(5,colour.getText());
            ps.setString(6,numofcars.getText());
            ps.setString(7,carnumber.getText());
            ps.setString(8,price.getText());
            ps.executeQuery();
            brand.setText("");
            cmodel.setText("");
            adate.setText("");
            status.setText("");
            colour.setText("");
            numofcars.setText("");
            carnumber.setText("");
            price.setText("");
            
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adate;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField carnumber;
    private javax.swing.JTextField cmodel;
    private javax.swing.JTextField colour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numofcars;
    private javax.swing.JTextField price;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables

    public void close()
    {
        WindowEvent winCloseEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseEvent);
    }
}
