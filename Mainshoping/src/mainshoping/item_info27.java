/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

/**
 *
 * @author omare
 */
public class item_info27 extends javax.swing.JPanel {

    /**
     * Creates new form item_info27
     */
    admin Admin;
    customer cust;
    item it;
    user_operations umi;
    public item_info27(admin d ,customer cust,item it,user_operations umi ){
        initComponents();
        this.umi=umi;
        this.Admin=d;
        this.it=it;
        this.cust=cust;
        this.lblitemcat.setText(this.lblitemcat.getText()+it.getCategory());
        this.lblitemname.setText(this.lblitemname.getText()+it.getName());
        this.lblitemid.setText(this.lblitemid.getText()+String.valueOf(it.getId()));
        this.lblitemprice.setText(this.lblitemprice.getText()+String.valueOf(it.getPrice()));
        this.lblitemperiod.setText(this.lblitemperiod.getText()+String.valueOf(it.getPeriod()));
        this.lblquantity.setText(this.lblquantity.getText()+String.valueOf(it.getPeriod()));        
     
//          lblpicitem.setIcon(new ImageIcon(img.getScaledInstance(lblpicitem.getWidth(),
//           lblpicitem.getHeight(), Image.SCALE_SMOOTH)));
    }
    public item_info27() {
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

        pnliteminfo = new javax.swing.JPanel();
        lblitemname = new javax.swing.JLabel();
        lblitemid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblitemcat = new javax.swing.JLabel();
        lblitemprice = new javax.swing.JLabel();
        lblquantity = new javax.swing.JLabel();
        btnaddtomycart = new javax.swing.JButton();
        lblitemperiod = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnliteminfo.setBackground(new java.awt.Color(0, 153, 153));
        pnliteminfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblitemname.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lblitemname.setText("Item Name");
        pnliteminfo.add(lblitemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 17, 293, -1));

        lblitemid.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lblitemid.setText("Item ID");
        pnliteminfo.add(lblitemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 68, 293, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        jLabel5.setText("ITem Descrption :");
        pnliteminfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 112, -1, -1));

        lblitemcat.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblitemcat.setText("Category :          ");
        pnliteminfo.add(lblitemcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 159, 293, -1));

        lblitemprice.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblitemprice.setText("Price :       ");
        pnliteminfo.add(lblitemprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 227, 226, -1));

        lblquantity.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblquantity.setText("Quantity :");
        pnliteminfo.add(lblquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 193, -1, -1));

        btnaddtomycart.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnaddtomycart.setText("Add To My Cart");
        btnaddtomycart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtomycartActionPerformed(evt);
            }
        });
        pnliteminfo.add(btnaddtomycart, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 236, -1, -1));

        lblitemperiod.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblitemperiod.setText("Estimated Delevery Time :       ");
        pnliteminfo.add(lblitemperiod, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 256, 275, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnliteminfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 46, 210, 214));

        add(pnliteminfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 829, 328));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddtomycartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtomycartActionPerformed
        // TODO add your handling code here:
     
//        umi.pnluseroperations.removeAll();
        umi.transferFocus();
        cart c=new cart(cust.carts.size());
        c.items.put(it.getId(), it);
        cust.carts.put(c.getId(), c);
        umi.pnluseroperations.add(new user_cart_operation(Admin,cust,umi));
        umi.pnluseroperations.setVisible(true);
        umi.validate();
        umi.repaint();  
    }//GEN-LAST:event_btnaddtomycartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnaddtomycart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblitemcat;
    private javax.swing.JLabel lblitemid;
    private javax.swing.JLabel lblitemname;
    private javax.swing.JLabel lblitemperiod;
    private javax.swing.JLabel lblitemprice;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JPanel pnliteminfo;
    // End of variables declaration//GEN-END:variables
}
