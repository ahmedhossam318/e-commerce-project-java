/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.util.Map;

/**
 *
 * @author omare
 */
public class Cat_item extends javax.swing.JPanel {

    /**
     * Creates new form Cat_item
     */
    admin Admin;
    item it;
    public Cat_item(admin d,item it) {
        initComponents();
        this.Admin=d;
        this.it=it;
        this.txtitemname.setText(it.getName());
        this.txtitemprice.setText(String.valueOf(it.getPrice()));        
    }
    public Cat_item() {
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
        pnlitemcat = new javax.swing.JPanel();
        lblpicitem_click = new javax.swing.JLabel();
        txtitemname = new javax.swing.JLabel();
        txtitemprice = new javax.swing.JLabel();
        lbldeltecat = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(203, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(203, 220));

        pnlitemcat.setBackground(new java.awt.Color(51, 255, 204));

        lblpicitem_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpicitem_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpicitem_clickMouseClicked(evt);
            }
        });

        txtitemname.setText("Item Name");

        txtitemprice.setText("Item Price");

        javax.swing.GroupLayout pnlitemcatLayout = new javax.swing.GroupLayout(pnlitemcat);
        pnlitemcat.setLayout(pnlitemcatLayout);
        pnlitemcatLayout.setHorizontalGroup(
            pnlitemcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlitemcatLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtitemprice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(txtitemname)
                .addGap(38, 38, 38))
            .addGroup(pnlitemcatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpicitem_click, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlitemcatLayout.setVerticalGroup(
            pnlitemcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlitemcatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblpicitem_click, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlitemcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitemname)
                    .addComponent(txtitemprice))
                .addContainerGap())
        );

        lbldeltecat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldeltecat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        lbldeltecat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldeltecatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnlitemcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldeltecat, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbldeltecat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlitemcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblpicitem_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpicitem_clickMouseClicked
        // TODO add your handling code here:
        iteminfo_show ii= new iteminfo_show();
        ii.setVisible(true);

    }//GEN-LAST:event_lblpicitem_clickMouseClicked

    private void lbldeltecatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldeltecatMouseClicked
        // TODO add your handling code here:
        int id=0;
        for (Map.Entry<Integer, category> cats : Admin.categories.entrySet()) {
            Integer key = cats.getKey();
            category value = cats.getValue();
            if(value.getName().equals(it.getCategory()))
            {
                id=value.getId();
            }
            
        }
        Admin.categories.get(id).Items.remove(it.getId());
    }//GEN-LAST:event_lbldeltecatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldeltecat;
    private javax.swing.JLabel lblpicitem_click;
    private javax.swing.JPanel pnlitemcat;
    public javax.swing.JLabel txtitemname;
    public javax.swing.JLabel txtitemprice;
    // End of variables declaration//GEN-END:variables
}
