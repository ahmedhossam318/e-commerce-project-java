/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.awt.BorderLayout;

/**
 *
 * @author omare
 */
public class delete_cat extends javax.swing.JPanel {

    /**
     * Creates new form delete_cat
     */
    admin Admin;
    public delete_cat(admin d) {
        initComponents();
        this.Admin=d;
        Category_list cl =new Category_list();
//        this.pnldeletecat.removeAll();
        this.transferFocus();
//        register user =new register(this);
        //this.pnldeletecat.setLayout(new BorderLayout());
        this.pnldeletecat.add(cl);
        this.pnldeletecat.add(new Category_list());
        this.pnldeletecat.add(new Category_list());

        this.pnldeletecat.setVisible(true);
   
        this.validate();
        this.repaint();
    }
    public delete_cat() {
        initComponents();
        Category_list cl =new Category_list();
//        this.pnldeletecat.removeAll();
        this.transferFocus();
//        register user =new register(this);
        //this.pnldeletecat.setLayout(new BorderLayout());
        this.pnldeletecat.add(cl);
        this.pnldeletecat.add(new Category_list());
        this.pnldeletecat.add(new Category_list());

        this.pnldeletecat.setVisible(true);
   
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pnldeletecat = new javax.swing.JPanel();

        pnldeletecat.setLayout(new java.awt.GridLayout(3, 1, 2, 2));
        jScrollPane1.setViewportView(pnldeletecat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel pnldeletecat;
    // End of variables declaration//GEN-END:variables
}
