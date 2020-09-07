/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Prisoners extends javax.swing.JFrame {

    /**
     * Creates new form Prisoners
     */
    public Prisoners() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jprisoner_id = new javax.swing.JLabel();
        jprisoner_name = new javax.swing.JLabel();
        jcategory = new javax.swing.JLabel();
        prisoner_id = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        cate = new javax.swing.JComboBox<>();
        jEnter = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        sname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRISON MANAGEMENT");
        setBackground(new java.awt.Color(0, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(3936, 2624));
        jPanel2.setMinimumSize(new java.awt.Dimension(3936, 2624));
        jPanel2.setPreferredSize(new java.awt.Dimension(1400, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         PRISONERS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 192, 51));

        jprisoner_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jprisoner_id.setForeground(new java.awt.Color(255, 255, 255));
        jprisoner_id.setText("PRISONER ID");
        jPanel2.add(jprisoner_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 127, 29));

        jprisoner_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jprisoner_name.setForeground(new java.awt.Color(255, 255, 255));
        jprisoner_name.setText("PRISONER FIRST NAME");
        jPanel2.add(jprisoner_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 28));

        jcategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcategory.setForeground(new java.awt.Color(255, 255, 255));
        jcategory.setText("PRISONER CATEGORY");
        jPanel2.add(jcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 31));
        jPanel2.add(prisoner_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 168, -1));

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnameKeyTyped(evt);
            }
        });
        jPanel2.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 168, -1));

        cate.setBackground(new java.awt.Color(0, 0, 0));
        cate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cate.setForeground(new java.awt.Color(255, 255, 255));
        cate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "A", "B", "C", "D", "H", "N", "S", "T", " " }));
        cate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateActionPerformed(evt);
            }
        });
        jPanel2.add(cate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 170, 30));

        jEnter.setBackground(new java.awt.Color(0, 0, 0));
        jEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jEnter.setForeground(new java.awt.Color(255, 255, 255));
        jEnter.setText("SAVE");
        jEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnterActionPerformed(evt);
            }
        });
        jPanel2.add(jEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 122, 63));

        jClear.setBackground(new java.awt.Color(0, 0, 0));
        jClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jClear.setForeground(new java.awt.Color(255, 255, 255));
        jClear.setText("CLEAR");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        jPanel2.add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 120, 63));

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 120, 64));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 122, 60));
        jPanel2.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRISONER SECOND NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 196, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("G:\\NISHA\\prison\\p13.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cateActionPerformed

    private void jEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnterActionPerformed
        // TODO add your handling code here:
        if(prisoner_id.getText().trim().isEmpty() && jname.getText().trim().isEmpty()  && cate.getSelectedItem()=="SELECT")
        {
            JOptionPane.showMessageDialog(null, "Empty");
        }else if(prisoner_id.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Empty");
        }
      
        else if(jname.getText().trim().isEmpty() )
        {
             JOptionPane.showMessageDialog(null, "Empty");
        } 
        else if(sname.getText().trim().isEmpty() )
        {
             JOptionPane.showMessageDialog(null, "Empty");
        } 
        
        else if( cate.getSelectedItem()=="SELECT")
        {
            cate=null;
             JOptionPane.showMessageDialog(null, "Empty");
        }
        else
       
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prison","root","081721998@ling");
            
            String sql="insert into prisoners values(?,?,?,?)";
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,prisoner_id.getText());
        
               if(!jname.getText().matches("^[a-zA-Z]+$") ){
                  JOptionPane.showMessageDialog(null,"Enter only alphabets");
               } else if(!sname.getText().matches("^[a-zA-Z]+$"))
               {
                   JOptionPane.showMessageDialog(null,"Enter only alphabets");
               }else  {
                  pstmt.setString(2,jname.getText()); 
                  pstmt.setString(3,sname.getText());                
               
               
               
              
             
            if(cate.getSelectedItem()=="SELECT")
            {
                cate=null;
            }
            if(cate.getSelectedItem()=="A")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="B")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="C")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="D")
            {
               cate.getSelectedItem();
            }
            
            if(cate.getSelectedItem()=="H")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="N")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="S")
            {
               cate.getSelectedItem();
            }
            if(cate.getSelectedItem()=="T")
            {
               cate.getSelectedItem();
            }
            pstmt.setString(4,cate.getSelectedItem().toString());
            pstmt.executeUpdate();
              
             JOptionPane.showMessageDialog(null, "Insertion Successfull");
               }
             conn.close();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }//GEN-LAST:event_jEnterActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // TODO add your handling code here:
        prisoner_id.setText("");
        jname.setText("");
        sname.setText("");
        cate.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_jClearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        NextPage np=new NextPage();
                 np.setVisible(true);
                 np.pack();
                 np.setLocationRelativeTo(null);
                 np.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        Prisonerdi p=new Prisonerdi();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void jnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnameKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jnameKeyTyped

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

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
            java.util.logging.Logger.getLogger(Prisoners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prisoners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prisoners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prisoners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prisoners().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cate;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jcategory;
    private javax.swing.JTextField jname;
    private javax.swing.JLabel jprisoner_id;
    private javax.swing.JLabel jprisoner_name;
    private javax.swing.JButton next;
    private javax.swing.JTextField prisoner_id;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}