/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author omare
 */
public class register extends javax.swing.JPanel {

    /**
     * Creates new form register
     */
    
    admin Admin;
    person person1 ;
    Sign frmsign;
    public register(Sign frm,admin d)
    {
        this.Admin=d;
        this.frmsign=frm;
        
    }
    public register(  Sign frm) {
        initComponents();
//        this.Admin=d;
        this.frmsign=frm;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp5 = new javax.swing.JSeparator();
        redmale = new javax.swing.JRadioButton();
        redfemale = new javax.swing.JRadioButton();
        cbyear = new javax.swing.JComboBox<>();
        cbmonth = new javax.swing.JComboBox<>();
        cbcountry = new javax.swing.JComboBox<>();
        cbday = new javax.swing.JComboBox<>();
        lblbirth = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        sp4 = new javax.swing.JSeparator();
        txtfname = new javax.swing.JTextField();
        lblcredit = new javax.swing.JLabel();
        txtssn = new javax.swing.JPasswordField();
        lblfname = new javax.swing.JLabel();
        sp1 = new javax.swing.JSeparator();
        lbllname = new javax.swing.JLabel();
        txtcredit = new javax.swing.JPasswordField();
        txtlname = new javax.swing.JTextField();
        sp2 = new javax.swing.JSeparator();
        sp3 = new javax.swing.JSeparator();
        lblquestion = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        lblpass = new javax.swing.JLabel();
        btnsignin = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        lblretrivalcode = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtretrivalcode = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        txtemail = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sp5.setBackground(new java.awt.Color(0, 150, 153));
        add(sp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 701, 380, 5));

        redmale.setBackground(new java.awt.Color(0, 150, 153));
        redmale.setText("Male");
        add(redmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 361, -1, -1));

        redfemale.setBackground(new java.awt.Color(0, 150, 153));
        redfemale.setText("Female");
        add(redfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 361, -1, -1));

        cbyear.setBackground(new java.awt.Color(0, 150, 153));
        cbyear.setForeground(new java.awt.Color(255, 255, 255));
        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        add(cbyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 420, -1, -1));

        cbmonth.setBackground(new java.awt.Color(0, 150, 153));
        cbmonth.setForeground(new java.awt.Color(255, 255, 255));
        cbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        add(cbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 420, -1, -1));

        cbcountry.setBackground(new java.awt.Color(0, 150, 153));
        cbcountry.setForeground(new java.awt.Color(255, 255, 255));
        cbcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASIA", "AFRICA", "NORTH AMERICA", "SOUTH AMERICA", "EUROPE", "AUSTRLIA" }));
        add(cbcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 468, 257, 30));

        cbday.setBackground(new java.awt.Color(0, 150, 153));
        cbday.setForeground(new java.awt.Color(255, 255, 255));
        cbday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(cbday, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 420, -1, -1));

        lblbirth.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblbirth.setForeground(new java.awt.Color(0, 153, 153));
        lblbirth.setText("Birth Date");
        add(lblbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 417, 85, -1));

        lblgender.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblgender.setForeground(new java.awt.Color(0, 153, 153));
        lblgender.setText("Gender");
        add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 359, 85, -1));

        lblcountry.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblcountry.setForeground(new java.awt.Color(0, 153, 153));
        lblcountry.setText("Continent");
        add(lblcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 472, 85, -1));

        lblssn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblssn.setForeground(new java.awt.Color(0, 153, 153));
        lblssn.setText("SSN");
        add(lblssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 541, 85, -1));

        sp4.setBackground(new java.awt.Color(0, 150, 153));
        add(sp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 86, 380, 5));

        txtfname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 50, 380, 30));

        lblcredit.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblcredit.setForeground(new java.awt.Color(0, 153, 153));
        lblcredit.setText("Credit Card No.");
        add(lblcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 600, -1, -1));

        txtssn.setText("154488");
        add(txtssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 539, 380, 30));

        lblfname.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblfname.setForeground(new java.awt.Color(0, 153, 153));
        lblfname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfname.setText("First Name");
        add(lblfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 53, -1, -1));

        sp1.setBackground(new java.awt.Color(0, 150, 153));
        add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 575, 380, 5));

        lbllname.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lbllname.setForeground(new java.awt.Color(0, 153, 153));
        lbllname.setText("Last Name");
        add(lbllname, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 112, -1, -1));

        txtcredit.setText("58818");
        add(txtcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 598, 380, 30));

        txtlname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtlname.setText("elesialy");
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 109, 380, 30));

        sp2.setBackground(new java.awt.Color(0, 150, 153));
        add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 634, 380, 5));

        sp3.setBackground(new java.awt.Color(0, 150, 153));
        add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 145, 380, 5));

        lblquestion.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblquestion.setForeground(new java.awt.Color(0, 153, 153));
        lblquestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquestion.setText("you are already signed up?");
        add(lblquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 732, -1, -1));

        lblemail.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblemail.setForeground(new java.awt.Color(0, 153, 153));
        lblemail.setText("E-mail");
        add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 200, 85, -1));

        btnsignup.setBackground(new java.awt.Color(0, 204, 51));
        btnsignup.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(0, 150, 153));
        btnsignup.setText("Register");
        btnsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 726, 117, -1));

        lblpass.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblpass.setForeground(new java.awt.Color(0, 153, 153));
        lblpass.setText("Password");
        add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 263, 85, -1));

        btnsignin.setText("LOGIN");
        btnsignin.setBorder(null);
        btnsignin.setBorderPainted(false);
        btnsignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 734, 75, 25));

        txtpass.setText("lomacaaaaaaaaaaaaaaaaaaaaaaa");
        add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 261, 380, 30));

        lblretrivalcode.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblretrivalcode.setForeground(new java.awt.Color(0, 153, 153));
        lblretrivalcode.setText("Retrival Code");
        add(lblretrivalcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 667, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 150, 153));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 297, 380, -1));

        txtretrivalcode.setText("58818");
        add(txtretrivalcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 665, 380, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 150, 153));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 233, 380, 10));

        txtemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtemail.setText("omarelesaily@Yahoo.com");
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 197, 380, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        
        boolean txtcredit = lblcredit.isVisible();
       // JOptionPane.showMessageDialog(null, txtcredit);
        if(txtcredit == true)
        { 
//            validation of leaving any field empty
            
            if(this.txtfname.getText().equals("")||this.txtlname.getText().equals("")||this.txtemail.getText().equals("")||
                    this.txtpass.getText().equals("")||(!this.redmale.isSelected()&&!this.redfemale.isSelected())||
                    this.txtssn.getText().equals("")||this.txtcredit.getText().equals("")||this.txtretrivalcode.getText().equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields !!");
            return;
            }
//            end validation                      
            Admin = new admin();
            String gender="";
            if(this.redmale.isSelected()&&!this.redfemale.isSelected())
                gender = "Male";
            else if(!this.redmale.isSelected()&&this.redfemale.isSelected())
                gender = "Female";
            String Birth_date;
            Birth_date = this.cbday.getSelectedItem().toString()+"/"+
                    this.cbmonth.getSelectedItem().toString()+"/"+
                    this.cbyear.getSelectedItem().toString();
            String Continent= this.cbcountry.getSelectedItem().toString();
            customer cust = new customer(this.txtfname.getText(), this.txtlname.getText(),this.txtemail.getText(),
                    gender,Birth_date,this.txtssn.getText(),this.txtretrivalcode.getText(),
                    this.txtpass.getText(),Continent,1,
                    this.txtcredit.getText());
           person ps =new customer(cust);
           Admin.add_new_user(ps);
           JOptionPane.showMessageDialog(null, "Registed Successfully");
          
        frmsign.jPanel4.removeAll();
        this.transferFocus();
        login log = new login(Admin);
        frmsign.jPanel4.setLayout(new BorderLayout());
        frmsign.jPanel4.add(log);
        frmsign.jPanel4.setVisible(true);       
        frmsign.validate();
        frmsign.repaint(); 
        }else{        
//        admin case
//            validation of leaving any field empty
            
            if(this.txtfname.getText().equals("")||this.txtlname.getText().equals("")||this.txtemail.getText().equals("")||
                    this.txtpass.getText().equals("")||(!this.redmale.isSelected()&&!this.redfemale.isSelected())
                    ||this.txtretrivalcode.getText().equals(""))
            {
            JOptionPane. showMessageDialog(null, "Please Enter All Fields !!");
            return;
            }
//            end validation         
        String gender="";
        if(this.redmale.isSelected()&&!this.redfemale.isSelected())
            gender = "Male";
        else if(!this.redmale.isSelected()&&this.redfemale.isSelected())
            gender = "Female";
        String Birth_date;
        Birth_date = this.cbday.getSelectedItem().toString()+"/"+
                this.cbmonth.getSelectedItem().toString()+"/"+
                this.cbyear.getSelectedItem().toString();
        String Continent= this.cbcountry.getSelectedItem().toString();
        Admin = new admin(0,this.txtfname.getText(),this.txtlname.getText(),
                this.txtemail.getText(),gender,Birth_date,this.txtretrivalcode.getText(),this.txtpass.getText(),Continent);
         JOptionPane.showMessageDialog(null, " Admin Registed Successfully");
        frmsign.jPanel4.removeAll();
        this.transferFocus();
        login log = new login(Admin);
        frmsign.jPanel4.setLayout(new BorderLayout());
        frmsign.jPanel4.add(log);
        frmsign.jPanel4.setVisible(true);       
        frmsign.validate();
        frmsign.repaint();
        }
        
  
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
   frmsign.jPanel4.removeAll();
        this.transferFocus();
        login log = new login(Admin);
        frmsign.jPanel4.setLayout(new BorderLayout());
        frmsign.jPanel4.add(log);
        frmsign.jPanel4.setVisible(true);       
        frmsign.validate();
        frmsign.repaint();
        
    }//GEN-LAST:event_btnsigninActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnsignin;
    public javax.swing.JButton btnsignup;
    public javax.swing.JComboBox<String> cbcountry;
    public javax.swing.JComboBox<String> cbday;
    public javax.swing.JComboBox<String> cbmonth;
    public javax.swing.JComboBox<String> cbyear;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel lblbirth;
    public javax.swing.JLabel lblcountry;
    public javax.swing.JLabel lblcredit;
    public javax.swing.JLabel lblemail;
    public javax.swing.JLabel lblfname;
    public javax.swing.JLabel lblgender;
    public javax.swing.JLabel lbllname;
    public javax.swing.JLabel lblpass;
    public javax.swing.JLabel lblquestion;
    public javax.swing.JLabel lblretrivalcode;
    public javax.swing.JLabel lblssn;
    public javax.swing.JRadioButton redfemale;
    public javax.swing.JRadioButton redmale;
    public javax.swing.JSeparator sp1;
    public javax.swing.JSeparator sp2;
    public javax.swing.JSeparator sp3;
    public javax.swing.JSeparator sp4;
    public javax.swing.JSeparator sp5;
    public javax.swing.JPasswordField txtcredit;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfname;
    public javax.swing.JTextField txtlname;
    public javax.swing.JPasswordField txtpass;
    public javax.swing.JPasswordField txtretrivalcode;
    public javax.swing.JPasswordField txtssn;
    // End of variables declaration//GEN-END:variables
}