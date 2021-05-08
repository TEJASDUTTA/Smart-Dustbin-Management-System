/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_project;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 *
 * @author HP
 */
public class van_register extends javax.swing.JFrame {

    /**
     * Creates new form van_register
     */
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    public static boolean isValidNumber(String phone) 
    { 
        String phoneRegex = "(0/91)?[7-9][0-9]{9}"; 
                              
        Pattern pat = Pattern.compile(phoneRegex); 
        if (phone == null) 
            return false; 
        return pat.matcher(phone).matches(); 
    } 
  
    public van_register() {
        initComponents();
        
        //next two lines will show the frame in center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
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
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        vanno = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_close_window_48px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 30, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VAN REGISTRATION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 350, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Van Number");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 160, 30));

        vanno.setBackground(new java.awt.Color(51, 37, 78));
        vanno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vanno.setForeground(new java.awt.Color(153, 153, 153));
        vanno.setText("Enter Van number");
        vanno.setBorder(null);
        vanno.setCaretColor(new java.awt.Color(153, 153, 153));
        vanno.setOpaque(false);
        vanno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vannoFocusGained(evt);
            }
        });
        vanno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vannoActionPerformed(evt);
            }
        });
        jPanel1.add(vanno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 280, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 280, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SAVE");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 70, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 160, 30));

        email.setBackground(new java.awt.Color(51, 37, 78));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("abc@gmail.com");
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(153, 153, 153));
        email.setOpaque(false);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 280, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 280, 10));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 160, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 160, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Van Driver Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 160, 30));

        phone.setBackground(new java.awt.Color(51, 37, 78));
        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 153, 153));
        phone.setText("Enter Phone no.");
        phone.setBorder(null);
        phone.setCaretColor(new java.awt.Color(153, 153, 153));
        phone.setOpaque(false);
        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFocusGained(evt);
            }
        });
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 280, 30));

        name.setBackground(new java.awt.Color(51, 37, 78));
        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setText("Enter name");
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(153, 153, 153));
        name.setOpaque(false);
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 280, 30));

        username.setBackground(new java.awt.Color(51, 37, 78));
        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter username");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(153, 153, 153));
        username.setOpaque(false);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 280, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 280, 10));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 160, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 280, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 280, 10));

        password.setBackground(new java.awt.Color(51, 37, 78));
        password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("enter password");
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(153, 153, 153));
        password.setOpaque(false);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 280, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 280, 10));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSignUpSwitch.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 130, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightPanel.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 510, 590));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("SMART DUSTBIN MANAGEMENT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 400, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vanlogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 390, 250));

        jLabel2.setForeground(new java.awt.Color(100, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftPanelBack.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 510, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 980, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        
        String USERNAME = username.getText();
        String NAME = name.getText();
        String PASSWORD = password.getText();
        String EMAIL = email.getText();
        String PHONE = phone.getText();
        String VANNUMBER = vanno.getText();
        int flag = 0;
        
        if(!isValid(EMAIL))
        {
            JOptionPane.showMessageDialog(null,"Invalid email address","Please enter valid email id",JOptionPane.ERROR_MESSAGE);
           email.setText("");
           flag = 1;
        }
        if(!isValidNumber(PHONE))
        {
            JOptionPane.showMessageDialog(null,"Invalid Phone Number","Please enter valid phone number",JOptionPane.ERROR_MESSAGE);
           phone.setText("");
           flag = 1;
        }
        
        int flag1 = 0;
        
        for (int i = 0; i < se_project.SE_Project.vanlist.size(); i++) { 
           if(se_project.SE_Project.vanlist.get(i).username.equals(USERNAME))
           {      
                flag1 = 1;
 
           }
        } 
        if(flag1 == 1)
        {
           JOptionPane.showMessageDialog(null,"Username already exists","Invalid Username",JOptionPane.ERROR_MESSAGE);
           username.setText("");
        }
        
        int flag2 = 0;
        
        for (int i = 0; i < se_project.SE_Project.vanlist.size(); i++) { 
           if(se_project.SE_Project.vanlist.get(i).vanNumber.equals(VANNUMBER))
           {      
                flag2 = 1;
 
           }
        } 
        if(flag2 == 1)
        {
           JOptionPane.showMessageDialog(null,"Van Number already exists","Invalid Van Number",JOptionPane.ERROR_MESSAGE);
           vanno.setText("");
        }
        if (flag1 == 0 && flag == 0 && flag2 == 0) 
        {
        Van v = new Van();
        v.setVanNumber(VANNUMBER);
        v.setPhoneNumber(PHONE);
        v.setEmail(EMAIL);
        v.setName(NAME);
        v.setUserName(USERNAME);
        v.setPass(PASSWORD);     
        v.display();
        se_project.SE_Project.vanlist.add(v);
        JOptionPane.showMessageDialog(null,"Successfully Registered !!","Van Registered successfully.",JOptionPane.INFORMATION_MESSAGE);
        
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        se_project.SE_Project.logreport.add("Van Registered Van Number="+VANNUMBER+", Timestamp="+strDate);
        dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusGained
        // TODO add your handling code here:
        phone.setText("");
    }//GEN-LAST:event_phoneFocusGained

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        // TODO add your handling code here:
        name.setText("");
    }//GEN-LAST:event_nameFocusGained

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void vannoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vannoFocusGained
        // TODO add your handling code here:
        vanno.setText("");
    }//GEN-LAST:event_vannoFocusGained

    private void vannoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vannoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vannoActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(van_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(van_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(van_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(van_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new van_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField username;
    private javax.swing.JTextField vanno;
    // End of variables declaration//GEN-END:variables
}
