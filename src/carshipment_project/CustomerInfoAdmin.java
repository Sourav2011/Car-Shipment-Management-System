/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshipment_project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class CustomerInfoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInfoAdmin
     */
    public CustomerInfoAdmin() {
        initComponents();
        UpdateTable();
        filecombo();
    }
    public void close()
    {
        WindowEvent winCloseEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseEvent);
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
        usertable = new javax.swing.JTable();
        namecombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        paid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Mail", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 13, 720, 130);

        namecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        getContentPane().add(namecombo);
        namecombo.setBounds(197, 212, 78, 22);

        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(43, 215, 63, 16);

        jButton1.setText("Delete User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 211, 130, 25);

        jButton2.setText("Return ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 330, 164, 33);

        jLabel2.setText("Paid");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(43, 283, 63, 25);

        paid.setText("-----------");
        getContentPane().add(paid);
        paid.setBounds(113, 287, 83, 16);

        jLabel3.setText("Due");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(223, 287, 35, 16);

        due.setText("---------");
        getContentPane().add(due);
        due.setBounds(306, 287, 76, 16);

        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(343, 211, 77, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshipment_project/Flag_of_Taliban_(original).svg.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 530);
        

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        finalselect();
    }//GEN-LAST:event_jButton3ActionPerformed

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
             PreparedStatement ps = conn.prepareStatement("DELETE FROM USERS WHERE NAME =? ");
             ps.setString(1, (String) namecombo.getSelectedItem());
             ps.executeQuery();
             PreparedStatement dsellinfo = conn.prepareStatement("DELETE FROM SELL_INFO WHERE NAME =? ");
             dsellinfo.setString(1, (String) namecombo.getSelectedItem());
             dsellinfo.executeQuery();
             CustomerInfoAdmin ciadmin = new CustomerInfoAdmin();
             ciadmin.setVisible(true);
             ciadmin.setSize(740, 440);
             close();
             
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "table creation failed","Click ok to try angain",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CustomerInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInfoAdmin().setVisible(true);
            }
        });
    }
    void filecombo()
    {
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM USERS ");
             
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 String name = rs.getString("NAME");
                 namecombo.addItem(name);
                 
             }
             
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "combo failde","Click ok to try angain",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    void UpdateTable()
    {
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
             PreparedStatement ps = conn.prepareStatement("SELECT NAME,MAIL,CONTACT FROM USERS ");
             
             ResultSet rs = ps.executeQuery();
             usertable.setModel(DbUtils.resultSetToTableModel(rs));
             
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "table creation failed","Click ok to try angain",JOptionPane.ERROR_MESSAGE);
        }
    }
    void finalselect(){
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
             PreparedStatement ps = conn.prepareStatement("SELECT *  FROM SELL_INFO WHERE NAME=? ");
             ps.setString(1, (String) namecombo.getSelectedItem());
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 String pay = rs.getString("PAID");
                 paid.setText(pay);
                 String brnd = rs.getString("DUE");
                 due.setText(brnd);
                 
                 
                 
             }
             
             
             
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "failed","Click ok to try angain",JOptionPane.ERROR_MESSAGE);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JLabel paid;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
