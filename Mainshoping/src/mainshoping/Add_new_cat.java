/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author omare
 */

public class Add_new_cat extends javax.swing.JPanel {

    /**
     * Creates new form Add_new_car
     */
     admin Admin;
     int itemcounts =0;
    public Add_new_cat(admin d)
    {
        this.Admin=d;
        initComponents();
        this.pnladditemuser.removeAll();
        this.transferFocus();
        GridLayout g =new GridLayout(4,2,4,2);     
        this.pnladditemuser.setLayout(g);  
        Adding_Item_User item =new Adding_Item_User(Admin,
        Integer.parseInt(this.txtcatid.getText()),
        this.txtcatname.getText(),this);
        this.pnladditemuser.add(item);        
        this.pnladditemuser.setVisible(true);
        this.validate();
        this.repaint();
    }
    public Add_new_cat() {
        initComponents();
        this.pnladditemuser.removeAll();
        this.transferFocus();
        Adding_Item_User item =new Adding_Item_User();
//        this.pnladditemuser.setLayout(new BorderLayout());
        GridLayout g =new GridLayout(4,2,4,2);
        this.pnladditemuser.setLayout(g);
        this.pnladditemuser.add(item); 
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.add(new Adding_Item_User());
        this.pnladditemuser.setVisible(true);
        
        this.validate();
        this.repaint();
    
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
        txtcatname = new javax.swing.JTextField();
        txtcatid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnaddcat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnladditemuser = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        jLabel1.setText("Category Name");

        jLabel2.setText("Category ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/categories.png"))); // NOI18N

        btnaddcat.setBackground(new java.awt.Color(0, 204, 0));
        btnaddcat.setText("Save");
        btnaddcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcatActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Adminset.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin Operations");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcatid, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtcatname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 536, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnaddcat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtcatname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnaddcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 111));

        pnladditemuser.setBackground(new java.awt.Color(153, 0, 0));
        pnladditemuser.setLayout(new java.awt.GridLayout(3, 3, 5, 5));
        jScrollPane1.setViewportView(pnladditemuser);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcatActionPerformed
        if(this.txtcatid.getText().equals("")||this.txtcatname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields");
            return;
        }
         JOptionPane.showMessageDialog(null,"Saved Successfully");
    }//GEN-LAST:event_btnaddcatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel pnladditemuser;
    private javax.swing.JTextField txtcatid;
    private javax.swing.JTextField txtcatname;
    // End of variables declaration//GEN-END:variables
}