/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.util.Map;

/**
 *
 * @author Ahmed Gamal
 */
public class container_users extends javax.swing.JPanel {

    /**
     * Creates new form container_users
     */
    admin Admin;
    public container_users(admin d) {
        initComponents();
        this.Admin=d;
        this.transferFocus();
        
         for (Map.Entry<Integer, customer> user : Admin.users.entrySet()) {
            Integer key = user.getKey();
            customer value = user.getValue();
             this.pnlusersccontainers.add(new delete_user_single(Admin,value,this));
            
        }
        this.pnlusersccontainers.setVisible(true);
        this.validate();
        this.repaint();
    }
    public  void refreash()
    {
    for (Map.Entry<Integer, customer> user : Admin.users.entrySet()) {
            Integer key = user.getKey();
            customer value = user.getValue();
             this.pnlusersccontainers.add(new delete_user_single(Admin,value,this));
            
        }
    
    }
    public container_users() {
        initComponents();
        this.transferFocus();
        this.pnlusersccontainers.add(new delete_user_single());
        this.pnlusersccontainers.add(new delete_user_single());
        this.pnlusersccontainers.add(new delete_user_single());

        this.pnlusersccontainers.setVisible(true);
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
        pnlusersccontainers = new javax.swing.JPanel();

        pnlusersccontainers.setLayout(new java.awt.GridLayout(20, 4, 2, 2));
        jScrollPane1.setViewportView(pnlusersccontainers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlusersccontainers;
    // End of variables declaration//GEN-END:variables
}
