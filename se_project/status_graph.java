/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_project;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import se_project.Mail;
/**
 *
 * @author HP
 */
public class status_graph extends javax.swing.JFrame {

    /**
     * Creates new form status_graph
     */
    public status_graph() {
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
        jLabel8 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        r1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        r2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        r3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        r4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        r5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        r6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIVE MONITORING");

        check.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        check.setText("CHECK");
        check.setBorder(null);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (186).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LEVEL BAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b1.setText("DUSTBIN 1");
        b1.setBorder(null);
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 40));

        b2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b2.setText("DUSTBIN 2");
        b2.setBorder(null);
        b2.setFocusable(false);
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 110, 40));

        b3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b3.setText("DUSTBIN 3");
        b3.setBorder(null);
        b3.setFocusable(false);
        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, 40));

        b4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b4.setText("DUSTBIN 4");
        b4.setBorder(null);
        b4.setFocusable(false);
        jPanel2.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 110, 40));

        b5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b5.setText("DUSTBIN 5");
        b5.setBorder(null);
        b5.setFocusable(false);
        jPanel2.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 110, 40));

        b6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b6.setText("DUSTBIN 6");
        b6.setBorder(null);
        b6.setFocusable(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel2.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 110, 40));

        i1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 110));

        i2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, 110));

        i3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 80, 110));

        i4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 80, 110));

        i5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, 110));

        i6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 80, 110));

        r1.setEditable(false);
        r1.setBackground(new java.awt.Color(51, 37, 78));
        r1.setColumns(20);
        r1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setLineWrap(true);
        r1.setRows(5);
        r1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r1.setFocusable(false);
        jScrollPane1.setViewportView(r1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 200, 110));

        r2.setEditable(false);
        r2.setBackground(new java.awt.Color(51, 37, 78));
        r2.setColumns(20);
        r2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setLineWrap(true);
        r2.setRows(5);
        r2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r2.setFocusable(false);
        jScrollPane2.setViewportView(r2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 200, 110));

        r3.setEditable(false);
        r3.setBackground(new java.awt.Color(51, 37, 78));
        r3.setColumns(20);
        r3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setLineWrap(true);
        r3.setRows(5);
        r3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r3.setFocusable(false);
        jScrollPane3.setViewportView(r3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 200, 110));

        r4.setEditable(false);
        r4.setBackground(new java.awt.Color(51, 37, 78));
        r4.setColumns(20);
        r4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setLineWrap(true);
        r4.setRows(5);
        r4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r4.setFocusable(false);
        jScrollPane4.setViewportView(r4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 200, 110));

        r5.setEditable(false);
        r5.setBackground(new java.awt.Color(51, 37, 78));
        r5.setColumns(20);
        r5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setLineWrap(true);
        r5.setRows(5);
        r5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r5.setFocusable(false);
        jScrollPane5.setViewportView(r5);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 200, 110));

        r6.setEditable(false);
        r6.setBackground(new java.awt.Color(51, 37, 78));
        r6.setColumns(20);
        r6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setLineWrap(true);
        r6.setRows(5);
        r6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 37, 78)));
        r6.setFocusable(false);
        jScrollPane6.setViewportView(r6);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 200, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 960, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        
        String authuorityEmail="iit2019099@iiita.ac.in";
        
        Random x1 = new Random();
        int d1 = x1.nextInt(100);
        
        Random x2 = new Random();
        int d2 = x2.nextInt(100);
        
        Random x3 = new Random();
        int d3 = x3.nextInt(100);
        
        Random x4 = new Random();
        int d4 = x4.nextInt(100);
        
        Random x5 = new Random();
        int d5 = x5.nextInt(100);
        
        Random x6 = new Random();
        int d6 = x6.nextInt(100);
        
        Random x7 = new Random();
        int d7 = x7.nextInt(100);
        
        Random x8 = new Random();
        int d8 = x8.nextInt(100);
        
        se_project.SE_Project.dustbinlist.get(0).level = d1;
        se_project.SE_Project.dustbinlist.get(1).level = d2;
        se_project.SE_Project.dustbinlist.get(2).level = d3;
        se_project.SE_Project.dustbinlist.get(3).level = d4;
        
        se_project.SE_Project.dustbinlist.get(0).moisture = d5;
        se_project.SE_Project.dustbinlist.get(1).moisture = d6;
        se_project.SE_Project.dustbinlist.get(2).moisture = d7;
        se_project.SE_Project.dustbinlist.get(3).moisture = d8;
        
        if(se_project.SE_Project.dustbinlist.size() == 5)
        {   
            se_project.SE_Project.dustbinlist.get(4).level = d5;
            se_project.SE_Project.dustbinlist.get(4).moisture = d1;
        }
        if(se_project.SE_Project.dustbinlist.size() >= 6)
        {   
            se_project.SE_Project.dustbinlist.get(4).level = d5;
            se_project.SE_Project.dustbinlist.get(5).level = d6;
            
            se_project.SE_Project.dustbinlist.get(4).moisture = d1;
            se_project.SE_Project.dustbinlist.get(5).moisture = d2;
        }

        String l1 = se_project.SE_Project.dustbinlist.get(0).location;
        String l2 = se_project.SE_Project.dustbinlist.get(1).location;
        String l3 = se_project.SE_Project.dustbinlist.get(2).location;
        String l4 = se_project.SE_Project.dustbinlist.get(3).location;
        String l5 = null,l6 = null;
        
        if(se_project.SE_Project.dustbinlist.size() == 5)
        {
            l5 = se_project.SE_Project.dustbinlist.get(4).location;
        }
        if(se_project.SE_Project.dustbinlist.size() >= 6)
        {
            l5 = se_project.SE_Project.dustbinlist.get(4).location;
            l6 = se_project.SE_Project.dustbinlist.get(5).location;
        }
        
        int threshold = se_project.SE_Project.moisture_sensor;
        if(d5 < threshold)
            r1.setText("LEVEL: "+ d1 + "\n" + "LOCATION: " + l1 + "\n" + "MOISTURE:  DRY");
        else
            r1.setText("LEVEL: "+ d1 + "\n" + "LOCATION: " + l1 + "\n" + "MOISTURE:  WET");
        
        if(d6 < threshold)
            r2.setText("LEVEL: "+ d2 + "\n" + "LOCATION: " + l2 + "\n" + "MOISTURE:  DRY");
        else
            r2.setText("LEVEL: "+ d2 + "\n" + "LOCATION: " + l2 + "\n" + "MOISTURE:  WET");

        
        if(d7 < threshold)
            r3.setText("LEVEL: "+ d3 + "\n" + "LOCATION: " + l3 + "\n" + "MOISTURE:  DRY");
        else
            r3.setText("LEVEL: "+ d3 + "\n" + "LOCATION: " + l3 + "\n" + "MOISTURE:  WET");
        
        if(d8 < threshold)
            r4.setText("LEVEL: "+ d4 + "\n" + "LOCATION: " + l4 + "\n" + "MOISTURE:  DRY");
        else
            r4.setText("LEVEL: "+ d4 + "\n" + "LOCATION: " + l4 + "\n" + "MOISTURE:  WET");
        
         if(se_project.SE_Project.dustbinlist.size() == 5)
        {
            r6.setText("DUSTBIN"+"\n"+"NOT"+"\n"+"REGISTERED");
            if(d1 < threshold)
            r5.setText("LEVEL: "+ d5 + "\n" + "LOCATION: " + l5 + "\n" + "MOISTURE:  DRY");
            else
            r5.setText("LEVEL: "+ d5 + "\n" + "LOCATION: " + l5 + "\n" + "MOISTURE:  WET");
        }
         else if(se_project.SE_Project.dustbinlist.size() >= 6)
        {
            if(d1 < threshold)
            r5.setText("LEVEL: "+ d5 + "\n" + "LOCATION: " + l5 + "\n" + "MOISTURE:  DRY");
            else
            r5.setText("LEVEL: "+ d5 + "\n" + "LOCATION: " + l5 + "\n" + "MOISTURE:  WET");
            
            if(d2 < threshold)
            r6.setText("LEVEL: "+ d6 + "\n" + "LOCATION: " + l6 + "\n" + "MOISTURE:  DRY");
            else
            r6.setText("LEVEL: "+ d6 + "\n" + "LOCATION: " + l6 + "\n" + "MOISTURE:  WET");
        }   
        else
         {
             r5.setText("DUSTBIN"+"\n"+"NOT"+"\n"+"REGISTERED");
             r6.setText("DUSTBIN"+"\n"+"NOT"+"\n"+"REGISTERED");
         }
        
        //for dustbin 1 
        if(d1>90)
        {   
            String text="The incharge of the VAN, Dustbin=1 ( level= "+d1+" ) requested to clean the Dustbin in the location: "+l1+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();

            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=1 ( level= "+d1+" ) is not cleaned till now, in the location: "+l1+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(0).id);
            t1.start();
            
            b1.setBackground(Color.red);
            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r1.setForeground(Color.red);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(0).id+ " at Timestamp="+strDate);
        }
        else if(d1>60)
        {
            b1.setBackground(new Color(255,148,0));
            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r1.setForeground(new Color(255,148,0));
        }
        else if(d1>30)
        {
            b1.setBackground(Color.YELLOW);
            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r1.setForeground(Color.YELLOW);
        }
        else
        {
            b1.setBackground(Color.GREEN);
            i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r1.setForeground(Color.GREEN);
        }
        
        //for dustbin 2 
        if(d2>90)
        {   
            String text="The incharge of the VAN, Dustbin=2 ( level= "+d2+" ) requested to clean the Dustbin in the location: "+l2+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=2 ( level= "+d2+" ) is not cleaned till now, in the location: "+l2+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(1).id);
            t1.start();
            
            b2.setBackground(Color.red);
            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r2.setForeground(Color.red);
            
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(1).id+ " at Timestamp="+strDate);
        }
        else if(d2>60)
        {
            b2.setBackground(new Color(255,148,0));
            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r2.setForeground(new Color(255,148,0));
        }
        else if(d2>30)
        {
            b2.setBackground(Color.YELLOW);
            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r2.setForeground(Color.YELLOW);
        }
        else
        {
            b2.setBackground(Color.GREEN);
            i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r2.setForeground(Color.GREEN);
        }
        
        
        //for dustbin 3 
        if(d3>90)
        {   
            String text="The incharge of the VAN, Dustbin=3 ( level= "+d3+" ) is requested to clean the Dustbin in the location: "+l3+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=3 ( level= "+d3+" ) is not cleaned till now, in the location: "+l3+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(2).id);
            t1.start();
            
            b3.setBackground(Color.red);
            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r3.setForeground(Color.red);
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(2).id+ " at Timestamp="+strDate);
        }
        else if(d3>60)
        {
            b3.setBackground(new Color(255,148,0));
            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r3.setForeground(new Color(255,148,0));
        }
        else if(d3>30)
        {
            b3.setBackground(Color.YELLOW);
            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r3.setForeground(Color.YELLOW);
        }
        else
        {
            b3.setBackground(Color.GREEN);
            i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r3.setForeground(Color.GREEN);
        }
        
        
        //for dustbin 4 
        if(d4>90)
        {   
            String text="The incharge of the VAN, Dustbin=4( level= "+d4+" ) is requested to clean the Dustbin in the location: "+l4+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=4 ( level= "+d4+" ) is not cleaned till now, in the location: "+l4+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(3).id);
            t1.start();
            
            b4.setBackground(Color.red);
            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r4.setForeground(Color.red);
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(3).id+ " at Timestamp="+strDate);
        }
        else if(d4>60)
        {
            b4.setBackground(new Color(255,148,0));
            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r4.setForeground(new Color(255,148,0));
        }
        else if(d4>30)
        {
            b4.setBackground(Color.YELLOW);
            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r4.setForeground(Color.YELLOW);
        }
        else
        {
            b4.setBackground(Color.GREEN);
            i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r4.setForeground(Color.GREEN);
        }
        
        // for dustbin 5
        if(se_project.SE_Project.dustbinlist.size() == 5)
        {
            if(d5>90)
            {      
            String text="The incharge of the VAN, Dustbin=5 ( level= "+d5+" ) is requested to clean the Dustbin in the location: "+l5+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=5 ( level= "+d5+" ) is not cleaned till now, in the location: "+l5+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(4).id);
            t1.start();
            
            b5.setBackground(Color.red);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r5.setForeground(Color.red);
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(4).id+ " at Timestamp="+strDate);
            }
            else if(d5>60)
            {
            b5.setBackground(new Color(255,148,0));
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r5.setForeground(new Color(255,148,0));
            }
            else if(d5>30)
            {
            b5.setBackground(Color.YELLOW);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r5.setForeground(Color.YELLOW);
            }
            else
            {
            b5.setBackground(Color.GREEN);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r5.setForeground(Color.GREEN);
            }  
            
            b6.setBackground(Color.GRAY);
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_8.png")));
            r6.setForeground(Color.GRAY);
            
        }
        else if(se_project.SE_Project.dustbinlist.size() >= 6)
        {
            if(d5>90)
            {      
            String text="The incharge of the VAN, Dustbin=5 ( level= "+d5+" ) is requested to clean the Dustbin in the location: "+l5+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            String text1="Dustbin=5 ( level= "+d5+" ) is not cleaned till now, in the location: "+l5+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(4).id);
            t1.start();
            
            b5.setBackground(Color.red);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r5.setForeground(Color.red);
            
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(4).id+ " at Timestamp="+strDate);
            }
            else if(d5>60)
            {
            b5.setBackground(new Color(255,148,0));
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r5.setForeground(new Color(255,148,0));
            }
            else if(d5>30)
            {
            b5.setBackground(Color.YELLOW);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r5.setForeground(Color.YELLOW);
            }
            else
            {
            b5.setBackground(Color.GREEN);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r5.setForeground(Color.GREEN);
            }  
            //dustbin 6
            if(d6>90)
            {      
            String text="The incharge of the VAN, Dustbin=6 ( level= "+d6+" ) is requested to clean the Dustbin in the location: "+l6+" ." ;
            String subject="CLEAN DUSTBIN";  
            Mail mail=new Mail();
            int max=se_project.SE_Project.vanlist.size();
            int min=0;
            Random rand=new Random();
            int randomNum = rand.nextInt(max - min) + min;
            String email=se_project.SE_Project.vanlist.get(randomNum).email;
            
            mail.sendMail(email,text,subject);
            
            String text1="Dustbin=6 ( level= "+d6+" ) is not cleaned till now, in the location: "+l6+"." ;
            String subject1="DUSTBIN NOT CLEARED"; 
            TestSleepMethod1 t1=new TestSleepMethod1(authuorityEmail,text1,subject1,se_project.SE_Project.dustbinlist.get(5).id);
            t1.start();
            
            b6.setBackground(Color.red);
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_5.png")));
            r6.setForeground(Color.red);
            String drivername=se_project.SE_Project.vanlist.get(randomNum).name;
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to Van Driver= "+ drivername +" for Dustbin Id= "+se_project.SE_Project.dustbinlist.get(5).id+ " at Timestamp="+strDate);
            }
            else if(d6>60)
            {
            b6.setBackground(new Color(255,148,0));
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_6.png")));
            r6.setForeground(new Color(255,148,0));
            }
            else if(d6>30)
            {
            b6.setBackground(Color.YELLOW);
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_7.png")));
            r6.setForeground(Color.YELLOW);
            }
            else
            {
            b6.setBackground(Color.GREEN);
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_4.png")));
            r6.setForeground(Color.GREEN);
            }             
        }
        else
        {
            b5.setBackground(Color.GRAY);
            i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_8.png")));
            r5.setForeground(Color.GRAY);
            
            
            b6.setBackground(Color.GRAY);
            i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_60px_8.png")));
            r6.setForeground(Color.GRAY);
        }
       
        

    }//GEN-LAST:event_checkActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

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
            java.util.logging.Logger.getLogger(status_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(status_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(status_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(status_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new status_graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton check;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel i5;
    private javax.swing.JLabel i6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea r1;
    private javax.swing.JTextArea r2;
    private javax.swing.JTextArea r3;
    private javax.swing.JTextArea r4;
    private javax.swing.JTextArea r5;
    private javax.swing.JTextArea r6;
    // End of variables declaration//GEN-END:variables
}
