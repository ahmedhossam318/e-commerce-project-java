/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author omare
 */
public class Admin_Operations extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Operations
     */admin Admin;
    public Admin_Operations(admin d) {
        initComponents();
        this.Admin=new admin();
    }
    public Admin_Operations() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnladminoperation = new javax.swing.JPanel();
        btndeletecat = new javax.swing.JButton();
        btnaddcat = new javax.swing.JButton();
        btndeleteuser = new javax.swing.JButton();
        btnshowbills = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnloperation = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Name");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Operations");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Adminset.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Admin ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btndeletecat.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btndeletecat.setText("Edit Category");
        btndeletecat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeletecatMouseClicked(evt);
            }
        });
        btndeletecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletecatActionPerformed(evt);
            }
        });

        btnaddcat.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnaddcat.setText("Add new Category");
        btnaddcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcatActionPerformed(evt);
            }
        });

        btndeleteuser.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btndeleteuser.setText("Delete User");
        btndeleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteuserActionPerformed(evt);
            }
        });

        btnshowbills.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnshowbills.setText("Show Bills");
        btnshowbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowbillsActionPerformed(evt);
            }
        });

        pnloperation.setLayout(new javax.swing.BoxLayout(pnloperation, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(pnloperation);

        btnlogout.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnlogout.setText("Log out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnladminoperationLayout = new javax.swing.GroupLayout(pnladminoperation);
        pnladminoperation.setLayout(pnladminoperationLayout);
        pnladminoperationLayout.setHorizontalGroup(
            pnladminoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladminoperationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnladminoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnladminoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btndeletecat, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(btndeleteuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnshowbills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnaddcat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE))
        );
        pnladminoperationLayout.setVerticalGroup(
            pnladminoperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnladminoperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnaddcat)
                .addGap(24, 24, 24)
                .addComponent(btndeletecat)
                .addGap(18, 18, 18)
                .addComponent(btndeleteuser)
                .addGap(18, 18, 18)
                .addComponent(btnshowbills)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlogout)
                .addContainerGap(467, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnladminoperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnladminoperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeletecatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletecatActionPerformed
        // TODO add your handling code here:
        this.pnloperation.removeAll();
        this.transferFocus();
        for (Map.Entry<Integer, category> en : Admin.categories.entrySet()) {
        Integer key = en.getKey();
        category value = en.getValue();
        Category_list add_cat =new Category_list(Admin, value);
        this.pnloperation.add(add_cat);
        }
        this.pnloperation.setVisible(true);        
        this.validate();
        this.repaint();
        
        
        
        
    }//GEN-LAST:event_btndeletecatActionPerformed

    private void btnaddcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcatActionPerformed

        this.pnloperation.removeAll();
        this.transferFocus();
        Add_new_cat add_cat =new Add_new_cat(Admin);
//        this.pnloperation.setLayout(new BorderLayout());
        this.pnloperation.add(add_cat);
        this.pnloperation.setVisible(true);        
        this.validate();
        this.repaint();    
        
    }//GEN-LAST:event_btnaddcatActionPerformed

    private void btndeleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteuserActionPerformed
        // TODO add your handling code here:
        
        this.pnloperation.removeAll();
        this.transferFocus();
       
        container_users cu =new container_users();
        this.pnloperation.add(cu);

        this.pnloperation.setVisible(true);
        
        this.validate();
        this.repaint();    
    }//GEN-LAST:event_btndeleteuserActionPerformed

    private void btnshowbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowbillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshowbillsActionPerformed

    private void btndeletecatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeletecatMouseClicked

        this.pnloperation.removeAll();
        this.transferFocus();
         
       
        delete_cat dc =new delete_cat();
       
        this.pnloperation.add(dc);
        
        this.pnloperation.setVisible(true);
        
        this.validate();
        this.repaint();
    }//GEN-LAST:event_btndeletecatMouseClicked

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
          
            try {
                File name = new File("do.txt");
        
                    ObjectOutputStream sos = new ObjectOutputStream(new FileOutputStream(name));
                    sos.writeObject(Admin);
                    sos.close();
                }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e) {
                    System.err.println("error");
                }

        this.setVisible(false);
        Sign s=new Sign(Admin);
        s.setVisible(true);
        s.setDefaultCloseOperation(this ,DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcat;
    private javax.swing.JButton btndeletecat;
    private javax.swing.JButton btndeleteuser;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnshowbills;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnladminoperation;
    private javax.swing.JPanel pnloperation;
    // End of variables declaration//GEN-END:variables
}