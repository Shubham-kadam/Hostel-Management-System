/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        panel_dip.setBackground(new Color(0,0,0,200));
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
        panel_dip = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8Student = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        uname = new javax.swing.JTextField();
        upassword = new javax.swing.JPasswordField();
        jLabel27 = new javax.swing.JLabel();
        statuslabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uemail = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        sec_que = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        answer1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        alrmemlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dip.setBackground(new java.awt.Color(0, 0, 0));
        panel_dip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Hostel Management System");
        panel_dip.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, -1));

        jPanel1.add(panel_dip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/images.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8Student.setBackground(new java.awt.Color(36, 47, 65));
        jPanel8Student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8Student.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 300, 10));
        jPanel8Student.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 300, 10));

        uname.setBackground(new java.awt.Color(36, 47, 65));
        uname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(null);
        uname.setCaretColor(new java.awt.Color(255, 255, 255));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel8Student.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 300, 20));

        upassword.setBackground(new java.awt.Color(36, 47, 65));
        upassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        upassword.setForeground(new java.awt.Color(57, 113, 177));
        upassword.setToolTipText("");
        upassword.setBorder(null);
        upassword.setCaretColor(new java.awt.Color(255, 255, 255));
        upassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        upassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upasswordActionPerformed(evt);
            }
        });
        jPanel8Student.add(upassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 300, 20));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("PASSWORD");
        jPanel8Student.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        statuslabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        statuslabel.setForeground(new java.awt.Color(204, 204, 204));
        statuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statuslabel.setText("Status");
        statuslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statuslabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statuslabelMouseExited(evt);
            }
        });
        jPanel8Student.add(statuslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 170, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Student SignUp");
        jPanel8Student.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("USERNAME");
        jPanel8Student.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("EMAIL");
        jPanel13.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Sign Up_25px.png"))); // NOI18N
        jLabel32.setText("SignUp");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel8Student.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 300, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 113, 177));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel8Student.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 20, -1));

        uemail.setBackground(new java.awt.Color(36, 47, 65));
        uemail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        uemail.setForeground(new java.awt.Color(255, 255, 255));
        uemail.setBorder(null);
        uemail.setCaretColor(new java.awt.Color(255, 255, 255));
        uemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uemailActionPerformed(evt);
            }
        });
        jPanel8Student.add(uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 300, 20));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("EMAIL");
        jPanel8Student.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jPanel8Student.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 300, 10));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("STUDENT ID");
        jPanel8Student.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        sid.setBackground(new java.awt.Color(36, 47, 65));
        sid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        sid.setForeground(new java.awt.Color(255, 255, 255));
        sid.setBorder(null);
        sid.setCaretColor(new java.awt.Color(255, 255, 255));
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        jPanel8Student.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 300, 20));
        jPanel8Student.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, 10));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("SECURITY QUESTION");
        jPanel8Student.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        sec_que.setBackground(new java.awt.Color(36, 47, 65));
        sec_que.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        sec_que.setForeground(new java.awt.Color(255, 255, 255));
        sec_que.setBorder(null);
        sec_que.setCaretColor(new java.awt.Color(255, 255, 255));
        sec_que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_queActionPerformed(evt);
            }
        });
        jPanel8Student.add(sec_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 300, 20));
        jPanel8Student.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 300, 10));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("ANSWER");
        jPanel8Student.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        answer1.setBackground(new java.awt.Color(36, 47, 65));
        answer1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer1.setForeground(new java.awt.Color(255, 255, 255));
        answer1.setBorder(null);
        answer1.setCaretColor(new java.awt.Color(255, 255, 255));
        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });
        jPanel8Student.add(answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 300, 20));
        jPanel8Student.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 300, 10));

        alrmemlabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        alrmemlabel.setForeground(new java.awt.Color(204, 204, 204));
        alrmemlabel.setText("Already Member?");
        alrmemlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alrmemlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alrmemlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alrmemlabelMouseExited(evt);
            }
        });
        jPanel8Student.add(alrmemlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jPanel3.add(jPanel8Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 570, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void uemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uemailActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void upasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upasswordActionPerformed

    private void sec_queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_queActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec_queActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1ActionPerformed

    private void statuslabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statuslabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_statuslabelMouseEntered

    private void statuslabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statuslabelMouseExited

    }//GEN-LAST:event_statuslabelMouseExited

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        MysqlConnector msg=new MysqlConnector();
        loop1:
        try {
            Connection con=msg.getConnection();
            
            String username = uname.getText();
            String student_id = sid.getText();
            String email = uemail.getText();
            String password = new String(upassword.getPassword());
            String secque = sec_que.getText();
            String answer = answer1.getText();
            
            if(username.equals("") || student_id.equals("") || email.equals("") || password.equals("") || secque.equals("") || answer.equals(""))
            {
                JOptionPane.showMessageDialog(this,"Please Check All mandatory Fields","Error",JOptionPane.ERROR_MESSAGE);
                break loop1;
            }
            
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
            { 
                JOptionPane.showMessageDialog(this,"Please enter a valid email", "Error",JOptionPane.ERROR_MESSAGE);
                break loop1;
            }
            
            PreparedStatement pst = con.prepareStatement("insert into student_signup values(?,?,?,?,?,?)");
            
            pst.setString(1,username);
            pst.setString(2,student_id);
            pst.setString(3,password);
            pst.setString(4,email);
            pst.setString(5,secque);
            pst.setString(6,answer);
            
            if(pst.executeUpdate() == 1)
            {
               statuslabel.setVisible(true);
               statuslabel.setText("User Added Successfully");
               JOptionPane.showMessageDialog(this,"User added Successfully");
               new LoginPage().setVisible(true);
               this.dispose();
            }
            else
            {
               statuslabel.setVisible(true);
               statuslabel.setText("User Already Presenet");
            }
        }
        catch(Exception e)
        {
            statuslabel.setVisible(true);
            statuslabel.setText("User Already Presenet");
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void alrmemlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alrmemlabelMouseEntered
        // TODO add your handling code here:
        alrmemlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_alrmemlabelMouseEntered

    private void alrmemlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alrmemlabelMouseExited
        // TODO add your handling code here:
        alrmemlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_alrmemlabelMouseExited

    private void alrmemlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alrmemlabelMouseClicked
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alrmemlabelMouseClicked
  
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alrmemlabel;
    private javax.swing.JTextField answer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8Student;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panel_dip;
    private javax.swing.JTextField sec_que;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JTextField uemail;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upassword;
    // End of variables declaration//GEN-END:variables
}