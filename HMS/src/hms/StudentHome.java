/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StudentHome extends javax.swing.JFrame {
    
    /**
     * Creates new form StudentHome
     */
    MysqlConnector msg=new MysqlConnector();
    String std_id_recev;
    
    public StudentHome(String std_id) {
        initComponents();
        
        std_id_recev = std_id;
        System.out.println(std_id_recev);
        
        //student Details/Home Panel :=>
        try {
            Connection con=msg.getConnection();
            
            PreparedStatement pst = con.prepareStatement("select * from student where student_id = ?");
            pst.setString(1,std_id_recev);
            
            ResultSet re = pst.executeQuery();
            
            if(re.next())
            {   
                stuid.setText(re.getString(1));
                stuname.setText(re.getString(2));
                stuemail.setText(re.getString(4));
                stucontact.setText(re.getString(3));
                studob.setText(re.getString(5));   
                admroomno.setText(re.getString(6));
                admhostelid.setText(re.getString(7));
                admmessid.setText(re.getString(9));
                stuaddr.setText(re.getString(10));
                
                String hos_id = admhostelid.getText();
                
                PreparedStatement pst1 = con.prepareStatement("select * from hostel where hostel_id = ?");
                pst1.setString(1,hos_id);
                
                ResultSet re1 = pst1.executeQuery();
                
                if(re1.next())
                {
                    admhostelname.setText(re1.getString(2));
                }
            }    
            else
            {
            }
        }   
        catch (Exception e) {
        }
        
        //Warden details/Admin Details Panel:=>
            
        try {
            Connection con=msg.getConnection();
            String hos_id = admhostelid.getText();
            PreparedStatement pst = con.prepareStatement("select * from hostel where hostel_id = ?");
            pst.setString(1,hos_id);
            
            ResultSet re = pst.executeQuery();
            
            if(re.next())
            {
                String adm_id = re.getString(4);
                
                PreparedStatement pst1 = con.prepareStatement("select * from warden where admin_id = ?");
                pst1.setString(1,adm_id);
                ResultSet re1 = pst1.executeQuery();
                if(re1.next())
                {
                    adminidjf.setText(re1.getString(1));
                    adminnamejf.setText(re1.getString(2));
                    admincontjf.setText(re1.getString(3));
                    adminaddjf.setText(re1.getString(4));
                }
            }
            else
            {
            }
        }
        catch (Exception e) {
        }
        
        //Hostel Details:=>
        
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        int r1=jTable1.getRowCount();
        for(int i1=0;i1<r1;i1++)
        {
            dtm.removeRow(0);
        }
        try
        {
            Connection con=msg.getConnection();
            
            PreparedStatement pst = con.prepareStatement("select * from hostel");
            
            ResultSet re = pst.executeQuery();
            
            jTable1.setRowHeight(40);
            while(re.next())
            {
                dtm.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4)});
            }
        }
        catch(Exception e)
        {
        }
        
        //Notice:=>
        
        DefaultTableModel dtm1 = (DefaultTableModel)jTable2.getModel();
        int r2=jTable2.getRowCount();
        for(int i2=0;i2<r2;i2++)
        {
            dtm1.removeRow(0);
        }
        try
        {
            Connection con=msg.getConnection();
            String adm_id = adminidjf.getText();
            
            PreparedStatement pst = con.prepareStatement("select * from notice where admin_id = ?");
            pst.setString(1,adm_id);
            
            ResultSet re = pst.executeQuery();
            
            jTable2.setRowHeight(40);
            while(re.next())
            {
                dtm1.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4)});
            }
        }
        catch(Exception e)
        {
        } 
        
        //Bill Details
        try {
            Connection con=msg.getConnection();
            
            PreparedStatement pst = con.prepareStatement("select * from bill,student where student.student_id = ?");
            pst.setString(1,std_id_recev);
            
            ResultSet re = pst.executeQuery();
            
            if(re.next())
            {
                Billid.setText(re.getString(1));
                hostel_fee.setText(re.getString(2));
                Mess_fee.setText(re.getString(3));
                bill_other.setText(re.getString(4));
                billtotal.setText(re.getString(5));   
                billpaid.setText(re.getString(6));
                billpending.setText(re.getString(7));
                adm_bill_id.setText(re.getString(8));
                stu_bill_id.setText(re.getString(9));
            }
            else
            {
            }
        }
        catch (Exception e) {
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        Homelabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Wardenlabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        hosteldetlabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        complaintlabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        noticelabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        billlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Logoutlabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        cardpanel = new javax.swing.JPanel();
        Homepanel = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        stuname = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        stuaddr = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        stucontact = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        studob = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        stuemail = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        admhostelid = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        label45 = new javax.swing.JLabel();
        stuid = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        admmessid = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        admhostelname = new javax.swing.JTextField();
        admroomno = new javax.swing.JTextField();
        AdminDetailsPanel = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        adminnamejf = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        adminaddjf = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        admincontjf = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        adminidjf = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        Hostelpanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ComplaintPanel = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        complaintid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        clearcomplaintlabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        addcomplaintlabel = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        NoticePanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Billpanel = new javax.swing.JPanel();
        jSeparator30 = new javax.swing.JSeparator();
        hostel_fee = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        Mess_fee = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        billtotal = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        billpaid = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        bill_other = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        billpending = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        label46 = new javax.swing.JLabel();
        Billid = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();
        stu_bill_id = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        adm_bill_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dip.setBackground(new java.awt.Color(36, 47, 65));
        panel_dip.setForeground(new java.awt.Color(36, 47, 65));
        panel_dip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hostel Management System");
        panel_dip.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, -1));
        panel_dip.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/User Group Man Man_25px.png"))); // NOI18N
        jLabel3.setText("Student");
        panel_dip.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, -1));
        panel_dip.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 10));

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Homelabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Homelabel.setForeground(new java.awt.Color(204, 204, 204));
        Homelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Homelabel.setText("Home");
        Homelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomelabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomelabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomelabelMouseExited(evt);
            }
        });
        jPanel5.add(Homelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, 40));

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wardenlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Wardenlabel.setForeground(new java.awt.Color(204, 204, 204));
        Wardenlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wardenlabel.setText("Warden Details");
        Wardenlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WardenlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WardenlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WardenlabelMouseExited(evt);
            }
        });
        jPanel4.add(Wardenlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 40));

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosteldetlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        hosteldetlabel.setForeground(new java.awt.Color(204, 204, 204));
        hosteldetlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosteldetlabel.setText("Hostel Details");
        hosteldetlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hosteldetlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hosteldetlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hosteldetlabelMouseExited(evt);
            }
        });
        jPanel6.add(hosteldetlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, 40));

        jPanel7.setBackground(new java.awt.Color(36, 47, 65));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complaintlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        complaintlabel.setForeground(new java.awt.Color(204, 204, 204));
        complaintlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        complaintlabel.setText("Complaint");
        complaintlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complaintlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                complaintlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                complaintlabelMouseExited(evt);
            }
        });
        jPanel7.add(complaintlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 40));

        jPanel8.setBackground(new java.awt.Color(36, 47, 65));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noticelabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        noticelabel.setForeground(new java.awt.Color(204, 204, 204));
        noticelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noticelabel.setText("Notice");
        noticelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noticelabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noticelabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noticelabelMouseExited(evt);
            }
        });
        jPanel8.add(noticelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 40));

        jPanel9.setBackground(new java.awt.Color(36, 47, 65));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        billlabel.setForeground(new java.awt.Color(204, 204, 204));
        billlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billlabel.setText("Bill Details");
        billlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billlabelMouseExited(evt);
            }
        });
        jPanel9.add(billlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 40));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logoutlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Logoutlabel.setForeground(new java.awt.Color(204, 204, 204));
        Logoutlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logoutlabel.setText("Logout");
        Logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutlabelMouseExited(evt);
            }
        });
        jPanel2.add(Logoutlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        panel_dip.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 40));

        jPanel1.add(panel_dip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        X.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        X.setForeground(new java.awt.Color(57, 113, 177));
        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        jPanel3.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 820, 30));

        cardpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cardpanel.setLayout(new java.awt.CardLayout());

        Homepanel.setBackground(new java.awt.Color(204, 204, 204));
        Homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator10.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator10.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 300, 10));

        stuname.setEditable(false);
        stuname.setBackground(new java.awt.Color(204, 204, 204));
        stuname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stuname.setBorder(null);
        stuname.setCaretColor(new java.awt.Color(255, 255, 255));
        stuname.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        stuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stunameActionPerformed(evt);
            }
        });
        Homepanel.add(stuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, 30));

        jSeparator11.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator11.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 300, 10));

        stuaddr.setEditable(false);
        stuaddr.setBackground(new java.awt.Color(204, 204, 204));
        stuaddr.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stuaddr.setBorder(null);
        stuaddr.setCaretColor(new java.awt.Color(255, 255, 255));
        stuaddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuaddrActionPerformed(evt);
            }
        });
        Homepanel.add(stuaddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 300, 30));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(36, 47, 65));
        jLabel32.setText("Address");
        Homepanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jSeparator12.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator12.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 300, 10));

        stucontact.setEditable(false);
        stucontact.setBackground(new java.awt.Color(204, 204, 204));
        stucontact.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stucontact.setBorder(null);
        stucontact.setCaretColor(new java.awt.Color(255, 255, 255));
        stucontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stucontactActionPerformed(evt);
            }
        });
        Homepanel.add(stucontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 300, 30));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(36, 47, 65));
        jLabel33.setText("Contact No.");
        Homepanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(36, 47, 65));
        jLabel34.setText("DoB");
        Homepanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        studob.setEditable(false);
        studob.setBackground(new java.awt.Color(204, 204, 204));
        studob.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studob.setBorder(null);
        studob.setCaretColor(new java.awt.Color(255, 255, 255));
        studob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studobActionPerformed(evt);
            }
        });
        Homepanel.add(studob, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 300, 30));

        jSeparator13.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator13.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 300, 10));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(36, 47, 65));
        jLabel40.setText("Email");
        Homepanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        stuemail.setEditable(false);
        stuemail.setBackground(new java.awt.Color(204, 204, 204));
        stuemail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stuemail.setBorder(null);
        stuemail.setCaretColor(new java.awt.Color(255, 255, 255));
        stuemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuemailActionPerformed(evt);
            }
        });
        Homepanel.add(stuemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 300, 30));

        jSeparator19.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator19.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 300, 10));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(36, 47, 65));
        jLabel42.setText("Name");
        Homepanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(36, 47, 65));
        jLabel43.setText("Home");
        Homepanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(36, 47, 65));
        jLabel48.setText("Room No.");
        Homepanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        admhostelid.setEditable(false);
        admhostelid.setBackground(new java.awt.Color(204, 204, 204));
        admhostelid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        admhostelid.setBorder(null);
        admhostelid.setCaretColor(new java.awt.Color(255, 255, 255));
        admhostelid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admhostelidActionPerformed(evt);
            }
        });
        Homepanel.add(admhostelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 300, 30));

        jSeparator21.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator21.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 300, 10));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(36, 47, 65));
        jLabel49.setText("Hostel Id");
        Homepanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jSeparator22.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator22.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 300, 10));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(36, 47, 65));
        jLabel52.setText("Mess Id");
        Homepanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jSeparator24.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator24.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 300, 10));

        label45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label45.setForeground(new java.awt.Color(36, 47, 65));
        label45.setText("Student Id");
        Homepanel.add(label45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        stuid.setEditable(false);
        stuid.setBackground(new java.awt.Color(204, 204, 204));
        stuid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stuid.setBorder(null);
        stuid.setCaretColor(new java.awt.Color(255, 255, 255));
        stuid.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        stuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuidActionPerformed(evt);
            }
        });
        Homepanel.add(stuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 300, 30));

        jSeparator25.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator25.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 300, 10));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(36, 47, 65));
        jLabel50.setText("Hostel Name:");
        Homepanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        admmessid.setEditable(false);
        admmessid.setBackground(new java.awt.Color(204, 204, 204));
        admmessid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        admmessid.setBorder(null);
        admmessid.setCaretColor(new java.awt.Color(255, 255, 255));
        Homepanel.add(admmessid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 300, 30));

        jSeparator23.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator23.setForeground(new java.awt.Color(36, 47, 65));
        Homepanel.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 300, 10));

        admhostelname.setEditable(false);
        admhostelname.setBackground(new java.awt.Color(204, 204, 204));
        admhostelname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        admhostelname.setBorder(null);
        admhostelname.setCaretColor(new java.awt.Color(255, 255, 255));
        Homepanel.add(admhostelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 300, 30));

        admroomno.setEditable(false);
        admroomno.setBackground(new java.awt.Color(204, 204, 204));
        admroomno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        admroomno.setBorder(null);
        admroomno.setCaretColor(new java.awt.Color(255, 255, 255));
        Homepanel.add(admroomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 300, 30));

        cardpanel.add(Homepanel, "card2");

        AdminDetailsPanel.setBackground(new java.awt.Color(204, 204, 204));
        AdminDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator14.setForeground(new java.awt.Color(36, 47, 65));
        AdminDetailsPanel.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 300, 10));

        adminnamejf.setEditable(false);
        adminnamejf.setBackground(new java.awt.Color(204, 204, 204));
        adminnamejf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminnamejf.setBorder(null);
        adminnamejf.setCaretColor(new java.awt.Color(255, 255, 255));
        adminnamejf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminnamejfActionPerformed(evt);
            }
        });
        AdminDetailsPanel.add(adminnamejf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 300, 30));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(36, 47, 65));
        jLabel35.setText("Name");
        AdminDetailsPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jSeparator15.setForeground(new java.awt.Color(36, 47, 65));
        AdminDetailsPanel.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 300, 10));

        adminaddjf.setEditable(false);
        adminaddjf.setBackground(new java.awt.Color(204, 204, 204));
        adminaddjf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminaddjf.setBorder(null);
        adminaddjf.setCaretColor(new java.awt.Color(255, 255, 255));
        adminaddjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminaddjfActionPerformed(evt);
            }
        });
        AdminDetailsPanel.add(adminaddjf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 300, 30));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(36, 47, 65));
        jLabel36.setText("Address");
        AdminDetailsPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jSeparator16.setForeground(new java.awt.Color(36, 47, 65));
        AdminDetailsPanel.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 300, 10));

        admincontjf.setEditable(false);
        admincontjf.setBackground(new java.awt.Color(204, 204, 204));
        admincontjf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        admincontjf.setBorder(null);
        admincontjf.setCaretColor(new java.awt.Color(255, 255, 255));
        admincontjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admincontjfActionPerformed(evt);
            }
        });
        AdminDetailsPanel.add(admincontjf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 300, 30));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(36, 47, 65));
        jLabel37.setText("Contact No.");
        AdminDetailsPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(36, 47, 65));
        jLabel41.setText("Admin ID");
        AdminDetailsPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        adminidjf.setEditable(false);
        adminidjf.setBackground(new java.awt.Color(204, 204, 204));
        adminidjf.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminidjf.setBorder(null);
        adminidjf.setCaretColor(new java.awt.Color(255, 255, 255));
        adminidjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminidjfActionPerformed(evt);
            }
        });
        AdminDetailsPanel.add(adminidjf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 300, 30));

        jSeparator20.setForeground(new java.awt.Color(36, 47, 65));
        AdminDetailsPanel.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 300, 10));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(36, 47, 65));
        jLabel44.setText("Warden Details");
        AdminDetailsPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cardpanel.add(AdminDetailsPanel, "card2");

        Hostelpanel.setBackground(new java.awt.Color(204, 204, 204));
        Hostelpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(36, 47, 65));
        jLabel55.setText("Hostel Details");
        Hostelpanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hostel_id ", "Name ", "No. of Rooms ", "Admin_id "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setInheritsPopupMenu(true);
        jScrollPane3.setViewportView(jTable1);

        Hostelpanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 720, 190));

        cardpanel.add(Hostelpanel, "card2");

        ComplaintPanel.setBackground(new java.awt.Color(204, 204, 204));
        ComplaintPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(36, 47, 65));
        jLabel46.setText("Description");
        ComplaintPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(36, 47, 65));
        jLabel61.setText("Complaint Type");
        ComplaintPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jSeparator36.setForeground(new java.awt.Color(36, 47, 65));
        ComplaintPanel.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 300, 10));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(36, 47, 65));
        jLabel62.setText("Complaint");
        ComplaintPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(36, 47, 65));
        jLabel63.setText("Date");
        ComplaintPanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jSeparator37.setForeground(new java.awt.Color(36, 47, 65));
        ComplaintPanel.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 300, 10));

        complaintid.setBackground(new java.awt.Color(204, 204, 204));
        complaintid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        complaintid.setBorder(null);
        complaintid.setCaretColor(new java.awt.Color(255, 255, 255));
        complaintid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintidActionPerformed(evt);
            }
        });
        ComplaintPanel.add(complaintid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 300, 30));

        Description.setBackground(new java.awt.Color(204, 204, 204));
        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Description.setRows(5);
        Description.setBorder(null);
        jScrollPane2.setViewportView(Description);

        ComplaintPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 670, 150));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearcomplaintlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clearcomplaintlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearcomplaintlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Delete_25px.png"))); // NOI18N
        clearcomplaintlabel.setText("Clear");
        clearcomplaintlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearcomplaintlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearcomplaintlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearcomplaintlabelMouseExited(evt);
            }
        });
        jPanel15.add(clearcomplaintlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        ComplaintPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, 40));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addcomplaintlabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addcomplaintlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addcomplaintlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Add_25px.png"))); // NOI18N
        addcomplaintlabel.setText("Submit Complaint");
        addcomplaintlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcomplaintlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addcomplaintlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addcomplaintlabelMouseExited(evt);
            }
        });
        jPanel14.add(addcomplaintlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        ComplaintPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 190, 40));

        jLabel72.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("*");
        jLabel72.setToolTipText("");
        ComplaintPanel.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 20, 10));

        jSeparator41.setForeground(new java.awt.Color(36, 47, 65));
        ComplaintPanel.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 300, 10));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical", "Plumber", "Mess" }));
        jComboBox2.setBorder(null);
        ComplaintPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 300, 30));

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ComplaintPanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 300, 30));

        jLabel74.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(36, 47, 65));
        jLabel74.setText("Complaint ID");
        ComplaintPanel.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel75.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 0, 0));
        jLabel75.setText("*");
        jLabel75.setToolTipText("");
        ComplaintPanel.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 10, 10));

        jLabel76.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("*");
        jLabel76.setToolTipText("");
        ComplaintPanel.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 20, 10));

        jLabel77.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("*");
        jLabel77.setToolTipText("");
        ComplaintPanel.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 20, 10));

        cardpanel.add(ComplaintPanel, "card2");

        NoticePanel.setBackground(new java.awt.Color(204, 204, 204));
        NoticePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(36, 47, 65));
        jLabel58.setText("Notice");
        NoticePanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Notice Id", "Description", "Date", "Admin Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        NoticePanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 770, 380));

        cardpanel.add(NoticePanel, "card2");

        Billpanel.setBackground(new java.awt.Color(204, 204, 204));
        Billpanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BillpanelFocusGained(evt);
            }
        });
        Billpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator30.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator30.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 300, 10));

        hostel_fee.setEditable(false);
        hostel_fee.setBackground(new java.awt.Color(204, 204, 204));
        hostel_fee.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hostel_fee.setBorder(null);
        hostel_fee.setCaretColor(new java.awt.Color(255, 255, 255));
        hostel_fee.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        hostel_fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_feeActionPerformed(evt);
            }
        });
        Billpanel.add(hostel_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 300, 30));

        jSeparator31.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator31.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 300, 10));

        Mess_fee.setEditable(false);
        Mess_fee.setBackground(new java.awt.Color(204, 204, 204));
        Mess_fee.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Mess_fee.setBorder(null);
        Mess_fee.setCaretColor(new java.awt.Color(255, 255, 255));
        Mess_fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mess_feeActionPerformed(evt);
            }
        });
        Billpanel.add(Mess_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 300, 30));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(36, 47, 65));
        jLabel57.setText("Mess Fees");
        Billpanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jSeparator32.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator32.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 300, 10));

        billtotal.setEditable(false);
        billtotal.setBackground(new java.awt.Color(204, 204, 204));
        billtotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        billtotal.setBorder(null);
        billtotal.setCaretColor(new java.awt.Color(255, 255, 255));
        billtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billtotalActionPerformed(evt);
            }
        });
        billtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                billtotalKeyPressed(evt);
            }
        });
        Billpanel.add(billtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 300, 30));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(36, 47, 65));
        jLabel59.setText("Total");
        Billpanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(36, 47, 65));
        jLabel60.setText("Paid");
        Billpanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        billpaid.setEditable(false);
        billpaid.setBackground(new java.awt.Color(204, 204, 204));
        billpaid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        billpaid.setBorder(null);
        billpaid.setCaretColor(new java.awt.Color(255, 255, 255));
        billpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billpaidActionPerformed(evt);
            }
        });
        Billpanel.add(billpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 300, 30));

        jSeparator33.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator33.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 300, 10));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(36, 47, 65));
        jLabel67.setText("Other");
        Billpanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        bill_other.setEditable(false);
        bill_other.setBackground(new java.awt.Color(204, 204, 204));
        bill_other.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bill_other.setBorder(null);
        bill_other.setCaretColor(new java.awt.Color(255, 255, 255));
        bill_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_otherActionPerformed(evt);
            }
        });
        Billpanel.add(bill_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 300, 30));

        jSeparator34.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator34.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 300, 10));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(36, 47, 65));
        jLabel68.setText("Hostel Fees");
        Billpanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(36, 47, 65));
        jLabel69.setText("Bill");
        Billpanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 20));

        jLabel70.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(36, 47, 65));
        jLabel70.setText("Student Id");
        Billpanel.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        billpending.setEditable(false);
        billpending.setBackground(new java.awt.Color(204, 204, 204));
        billpending.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        billpending.setBorder(null);
        billpending.setCaretColor(new java.awt.Color(255, 255, 255));
        billpending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billpendingActionPerformed(evt);
            }
        });
        Billpanel.add(billpending, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 300, 30));

        jSeparator35.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator35.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 300, 10));

        jLabel71.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(36, 47, 65));
        jLabel71.setText("Pending");
        Billpanel.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jSeparator40.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator40.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 300, 10));

        label46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label46.setForeground(new java.awt.Color(36, 47, 65));
        label46.setText("Bill Id");
        Billpanel.add(label46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        Billid.setEditable(false);
        Billid.setBackground(new java.awt.Color(204, 204, 204));
        Billid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Billid.setBorder(null);
        Billid.setCaretColor(new java.awt.Color(255, 255, 255));
        Billid.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        Billid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillidActionPerformed(evt);
            }
        });
        Billpanel.add(Billid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 300, 30));

        jSeparator42.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator42.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 300, 10));

        jLabel73.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(36, 47, 65));
        jLabel73.setText("Admin Id");
        Billpanel.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        stu_bill_id.setEditable(false);
        stu_bill_id.setBackground(new java.awt.Color(204, 204, 204));
        stu_bill_id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        stu_bill_id.setBorder(null);
        stu_bill_id.setCaretColor(new java.awt.Color(255, 255, 255));
        Billpanel.add(stu_bill_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 300, 30));

        jSeparator43.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator43.setForeground(new java.awt.Color(36, 47, 65));
        Billpanel.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 300, 10));

        adm_bill_id.setEditable(false);
        adm_bill_id.setBackground(new java.awt.Color(204, 204, 204));
        adm_bill_id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adm_bill_id.setBorder(null);
        adm_bill_id.setCaretColor(new java.awt.Color(255, 255, 255));
        Billpanel.add(adm_bill_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 300, 30));

        cardpanel.add(Billpanel, "card2");

        jPanel1.add(cardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 820, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WardenlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WardenlabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(true);
        Homepanel.setVisible(false);
        Hostelpanel.setVisible(false);
        NoticePanel.setVisible(false);
        ComplaintPanel.setVisible(false);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_WardenlabelMouseClicked

    private void WardenlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WardenlabelMouseEntered
        // TODO add your handling code here:
        Wardenlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_WardenlabelMouseEntered

    private void WardenlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WardenlabelMouseExited
        // TODO add your handling code here:
        Wardenlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_WardenlabelMouseExited

    private void hosteldetlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hosteldetlabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(false);
        Homepanel.setVisible(false);
        Hostelpanel.setVisible(true);
        NoticePanel.setVisible(false);
        ComplaintPanel.setVisible(false);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_hosteldetlabelMouseClicked

    private void hosteldetlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hosteldetlabelMouseEntered
        // TODO add your handling code here:
        hosteldetlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_hosteldetlabelMouseEntered

    private void hosteldetlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hosteldetlabelMouseExited
        // TODO add your handling code here:
        hosteldetlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_hosteldetlabelMouseExited

    private void complaintlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintlabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(false);
        Homepanel.setVisible(false);
        Hostelpanel.setVisible(false);
        NoticePanel.setVisible(false);
        ComplaintPanel.setVisible(true);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_complaintlabelMouseClicked

    private void complaintlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintlabelMouseEntered
        // TODO add your handling code here:
        complaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_complaintlabelMouseEntered

    private void complaintlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintlabelMouseExited
        // TODO add your handling code here:
        complaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_complaintlabelMouseExited

    private void noticelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticelabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(false);
        Homepanel.setVisible(false);
        Hostelpanel.setVisible(false);
        NoticePanel.setVisible(true);
        ComplaintPanel.setVisible(false);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_noticelabelMouseClicked

    private void noticelabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticelabelMouseEntered
        // TODO add your handling code here:
        noticelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_noticelabelMouseEntered

    private void noticelabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticelabelMouseExited
        // TODO add your handling code here:
        noticelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_noticelabelMouseExited

    private void billlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billlabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(false);
        Homepanel.setVisible(false);
        Hostelpanel.setVisible(false);
        NoticePanel.setVisible(false);
        ComplaintPanel.setVisible(false);
        Billpanel.setVisible(true);
    }//GEN-LAST:event_billlabelMouseClicked

    private void billlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billlabelMouseEntered
        // TODO add your handling code here:
        billlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_billlabelMouseEntered

    private void billlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billlabelMouseExited
        // TODO add your handling code here:
        billlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_billlabelMouseExited

    private void LogoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutlabelMouseClicked
        // TODO add your handling code here:
        new  LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutlabelMouseClicked

    private void LogoutlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutlabelMouseEntered
        // TODO add your handling code here:
        Logoutlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_LogoutlabelMouseEntered

    private void LogoutlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutlabelMouseExited
        // TODO add your handling code here:
        Logoutlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_LogoutlabelMouseExited

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void stunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stunameActionPerformed

    private void stuaddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuaddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuaddrActionPerformed

    private void stucontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stucontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stucontactActionPerformed

    private void studobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studobActionPerformed

    private void stuemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuemailActionPerformed

    private void admhostelidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admhostelidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admhostelidActionPerformed

    private void stuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuidActionPerformed

    private void hostel_feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostel_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostel_feeActionPerformed

    private void Mess_feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mess_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mess_feeActionPerformed

    private void billtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billtotalActionPerformed

    private void billtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billtotalKeyPressed

    }//GEN-LAST:event_billtotalKeyPressed

    private void billpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billpaidActionPerformed

    private void bill_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_otherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_otherActionPerformed

    private void billpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billpendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billpendingActionPerformed

    private void BillidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillidActionPerformed

    private void BillpanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BillpanelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BillpanelFocusGained

    private void complaintidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complaintidActionPerformed

    private void addcomplaintlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcomplaintlabelMouseClicked
        // TODO add your handling code here:
        loop1:
        try {
            Connection con=msg.getConnection();
            
            String Id = complaintid.getText();
            String descr = Description.getText();
            String comptype = jComboBox2.getSelectedItem().toString();
            
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String compldate = dateformat.format(jDateChooser1.getDate());
             
            String admn_id = adminidjf.getText();
            
            if(Id.equals("") || descr.equals(""))
            {
                JOptionPane.showMessageDialog(this,"Please Check All mandatory Fields","Error",JOptionPane.ERROR_MESSAGE);
                break loop1;
            }
            
            PreparedStatement pst = con.prepareStatement("insert into complaint values (?,?,?,?,?,?)");

            pst.setString(1,Id);
            pst.setString(2,descr);
            pst.setString(3,comptype);
            pst.setString(4,compldate);
            pst.setString(5,std_id_recev);
            pst.setString(6,admn_id);
            
            if(pst.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"complaint added Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Unsuccessful","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_addcomplaintlabelMouseClicked

    private void addcomplaintlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcomplaintlabelMouseEntered
        // TODO add your handling code here:
        addcomplaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_addcomplaintlabelMouseEntered

    private void addcomplaintlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcomplaintlabelMouseExited
        // TODO add your handling code here:
        addcomplaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(204,204,204)));
    }//GEN-LAST:event_addcomplaintlabelMouseExited

    private void HomelabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomelabelMouseExited
        // TODO add your handling code here:
        Homelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_HomelabelMouseExited

    private void HomelabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomelabelMouseEntered
        // TODO add your handling code here:
        Homelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_HomelabelMouseEntered

    private void HomelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomelabelMouseClicked
        // TODO add your handling code here:
        AdminDetailsPanel.setVisible(false);
        Homepanel.setVisible(true);
        Hostelpanel.setVisible(false);
        NoticePanel.setVisible(false);
        ComplaintPanel.setVisible(false);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_HomelabelMouseClicked

    private void adminidjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminidjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminidjfActionPerformed

    private void admincontjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admincontjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admincontjfActionPerformed

    private void adminaddjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminaddjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminaddjfActionPerformed

    private void adminnamejfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminnamejfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminnamejfActionPerformed

    private void clearcomplaintlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearcomplaintlabelMouseClicked
        // TODO add your handling code here:
        complaintid.setText("");
        Description.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_clearcomplaintlabelMouseClicked

    private void clearcomplaintlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearcomplaintlabelMouseEntered
        // TODO add your handling code here:
        clearcomplaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
    }//GEN-LAST:event_clearcomplaintlabelMouseEntered

    private void clearcomplaintlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearcomplaintlabelMouseExited
        // TODO add your handling code here:
        clearcomplaintlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(36,47,65)));
    }//GEN-LAST:event_clearcomplaintlabelMouseExited

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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new StudentHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminDetailsPanel;
    private javax.swing.JTextField Billid;
    private javax.swing.JPanel Billpanel;
    private javax.swing.JPanel ComplaintPanel;
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel Homelabel;
    private javax.swing.JPanel Homepanel;
    private javax.swing.JPanel Hostelpanel;
    private javax.swing.JLabel Logoutlabel;
    private javax.swing.JTextField Mess_fee;
    private javax.swing.JPanel NoticePanel;
    private javax.swing.JLabel Wardenlabel;
    private javax.swing.JLabel X;
    private javax.swing.JLabel addcomplaintlabel;
    private javax.swing.JTextField adm_bill_id;
    private javax.swing.JTextField admhostelid;
    private javax.swing.JTextField admhostelname;
    private javax.swing.JTextField adminaddjf;
    private javax.swing.JTextField admincontjf;
    private javax.swing.JTextField adminidjf;
    private javax.swing.JTextField adminnamejf;
    private javax.swing.JTextField admmessid;
    private javax.swing.JTextField admroomno;
    private javax.swing.JTextField bill_other;
    private javax.swing.JLabel billlabel;
    private javax.swing.JTextField billpaid;
    private javax.swing.JTextField billpending;
    private javax.swing.JTextField billtotal;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JLabel clearcomplaintlabel;
    private javax.swing.JTextField complaintid;
    private javax.swing.JLabel complaintlabel;
    private javax.swing.JTextField hostel_fee;
    private javax.swing.JLabel hosteldetlabel;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label45;
    private javax.swing.JLabel label46;
    private javax.swing.JLabel noticelabel;
    private javax.swing.JPanel panel_dip;
    private javax.swing.JTextField stu_bill_id;
    private javax.swing.JTextField stuaddr;
    private javax.swing.JTextField stucontact;
    private javax.swing.JTextField studob;
    private javax.swing.JTextField stuemail;
    private javax.swing.JTextField stuid;
    private javax.swing.JTextField stuname;
    // End of variables declaration//GEN-END:variables
}
