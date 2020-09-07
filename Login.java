/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {
    Connection  conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUserName = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRISON MANAGEMENT");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 122, 115, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 184, 115, -1));
        jPanel1.add(jtxtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 126, 215, -1));

        jtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 188, 215, -1));

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 135, 41));

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 108, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("G:\\NISHA\\prison\\login page.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(jtxtUserName.getText().trim().isEmpty() && jtxtPassword.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Username and Password is Empty"); 
        }
        else if(jtxtUserName.getText().trim().isEmpty())
        {
             JOptionPane.showMessageDialog(null,"Username is Empty"); 
        }
        else if(jtxtPassword.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(null,"Password is Empty"); 
        }
        else{
        conn=MySqlConnection.ConnectDB();
        String Sql="Select * from user where username=? and password=?";
        try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,jtxtUserName.getText());
             pst.setString(2,jtxtPassword.getText());
             rs=pst.executeQuery();
             
             if(rs.next()){
                
                 JOptionPane.showMessageDialog(null, "Welcome "+jtxtUserName.getText(),"Successful Login",JOptionPane.PLAIN_MESSAGE);
                 
                NextPage np=new NextPage();
                 np.setVisible(true);
                 
                 this.dispose();
               
                 
             }else{
                JOptionPane.showMessageDialog(null, "Invalied User or Password", "accesss denied",JOptionPane.ERROR_MESSAGE);
                }
             conn.close();
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void jtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPasswordActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
       
        jtxtUserName.setText("");
        jtxtPassword.setText("");
        
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUserName;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
