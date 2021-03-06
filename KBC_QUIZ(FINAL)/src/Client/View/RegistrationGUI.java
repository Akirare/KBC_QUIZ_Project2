/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.View;

import Client.Controller.RegisterValidate;
import Client.Main.Starting;
import Models.UserAccount;
import Server.Controller.ServerDAO;
import Server.Controller.UserManage;
import Server.Controller.ServerCtr;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.Drag;

/**
 *
 * @author MyPC
 */
public class RegistrationGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationGUI
     */
    UserAccount member;
    public RegistrationGUI() {
        initComponents();
        setLocationRelativeTo(null);
        pnl_Show2.setVisible(false);
        
        //Open Socket and connect SQL Server
//        UserManage userCtr = new UserManage();
//        userCtr.openSocket();
        ServerDAO dao;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbl_Close = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        pnl_Side = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_Show1 = new keeptoo.KGradientPanel();
        txt_userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Next = new keeptoo.KButton();
        lbl_loginLink = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pas_confirmPassword = new javax.swing.JPasswordField();
        pas_userPassword = new javax.swing.JPasswordField();
        pnl_Show2 = new keeptoo.KGradientPanel();
        txt_userFullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Reset = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txt_userPhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_userEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_userAddress = new javax.swing.JTextField();
        btn_userCreate = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 450));

        bg.setBackground(new java.awt.Color(102, 102, 102));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Close.setBackground(new java.awt.Color(0, 0, 255));
        lbl_Close.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_Close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Close.setText("x");
        lbl_Close.setOpaque(true);
        lbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseExited(evt);
            }
        });
        bg.add(lbl_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 50));

        lbl_Title.setBackground(new java.awt.Color(0, 0, 255));
        lbl_Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_user_52px_white.png"))); // NOI18N
        lbl_Title.setText("REGISTRATION");
        lbl_Title.setOpaque(true);
        bg.add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        pnl_Side.setkBorderRadius(0);
        pnl_Side.setkEndColor(new java.awt.Color(51, 51, 51));
        pnl_Side.setkStartColor(new java.awt.Color(204, 204, 204));
        pnl_Side.setMaximumSize(new java.awt.Dimension(200, 380));
        pnl_Side.setMinimumSize(new java.awt.Dimension(200, 380));
        pnl_Side.setOpaque(false);
        pnl_Side.setPreferredSize(new java.awt.Dimension(200, 380));
        pnl_Side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kbc_logo(160x160).png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_Side.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_property_100px_blue.png"))); // NOI18N
        jLabel2.setText("<html><p align='center'>Welcom to <br>new member!</p></html>");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnl_Side.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 160));

        bg.add(pnl_Side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 400));

        pnl_Show1.setkBorderRadius(0);
        pnl_Show1.setkEndColor(new java.awt.Color(102, 102, 102));
        pnl_Show1.setkStartColor(new java.awt.Color(153, 153, 153));
        pnl_Show1.setMaximumSize(new java.awt.Dimension(380, 380));
        pnl_Show1.setMinimumSize(new java.awt.Dimension(380, 380));
        pnl_Show1.setPreferredSize(new java.awt.Dimension(380, 380));
        pnl_Show1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_userName.setBackground(new java.awt.Color(153, 153, 153));
        txt_userName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(255, 255, 255));
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });
        pnl_Show1.add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/keyboard_48px_white.png"))); // NOI18N
        jLabel3.setText("Please enter new account...");
        pnl_Show1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        pnl_Show1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm password:");
        pnl_Show1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 20));

        btn_Next.setText("NEXT");
        btn_Next.setkBorderRadius(30);
        btn_Next.setkEndColor(new java.awt.Color(0, 0, 255));
        btn_Next.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        btn_Next.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_Next.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btn_Next.setkStartColor(new java.awt.Color(51, 51, 255));
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });
        pnl_Show1.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 110, -1));

        lbl_loginLink.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_loginLink.setForeground(new java.awt.Color(255, 255, 255));
        lbl_loginLink.setText("Already click here login...");
        lbl_loginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_loginLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_loginLinkMouseExited(evt);
            }
        });
        pnl_Show1.add(lbl_loginLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 140, 40));
        pnl_Show1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User name:");
        pnl_Show1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 20));
        pnl_Show1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 120, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 3));
        pnl_Show1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 20));
        pnl_Show1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 10));

        pas_confirmPassword.setBackground(new java.awt.Color(153, 153, 153));
        pas_confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pas_confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        pas_confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pas_confirmPasswordActionPerformed(evt);
            }
        });
        pnl_Show1.add(pas_confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 290, 30));

        pas_userPassword.setBackground(new java.awt.Color(153, 153, 153));
        pas_userPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pas_userPassword.setForeground(new java.awt.Color(255, 255, 255));
        pas_userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pas_userPasswordActionPerformed(evt);
            }
        });
        pnl_Show1.add(pas_userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, 30));

        bg.add(pnl_Show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 400, 400));

        pnl_Show2.setEnabled(false);
        pnl_Show2.setkBorderRadius(0);
        pnl_Show2.setkEndColor(new java.awt.Color(102, 102, 102));
        pnl_Show2.setkStartColor(new java.awt.Color(153, 153, 153));
        pnl_Show2.setMaximumSize(new java.awt.Dimension(380, 380));
        pnl_Show2.setMinimumSize(new java.awt.Dimension(380, 380));
        pnl_Show2.setPreferredSize(new java.awt.Dimension(380, 380));
        pnl_Show2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_userFullName.setBackground(new java.awt.Color(153, 153, 153));
        txt_userFullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userFullName.setForeground(new java.awt.Color(255, 255, 255));
        txt_userFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userFullNameActionPerformed(evt);
            }
        });
        pnl_Show2.add(txt_userFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 290, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/keyboard_48px_white.png"))); // NOI18N
        jLabel6.setText("Please enter information...");
        pnl_Show2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 60));

        btn_Reset.setText("Reset");
        btn_Reset.setkBorderRadius(30);
        btn_Reset.setkEndColor(new java.awt.Color(0, 0, 255));
        btn_Reset.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        btn_Reset.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_Reset.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btn_Reset.setkStartColor(new java.awt.Color(51, 51, 255));
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });
        pnl_Show2.add(btn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Full name:");
        pnl_Show2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(0, 3));
        pnl_Show2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone No.");
        pnl_Show2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 30));

        txt_userPhone.setBackground(new java.awt.Color(153, 153, 153));
        txt_userPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userPhone.setForeground(new java.awt.Color(255, 255, 255));
        txt_userPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userPhoneActionPerformed(evt);
            }
        });
        pnl_Show2.add(txt_userPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 290, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email:");
        pnl_Show2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 30));

        txt_userEmail.setBackground(new java.awt.Color(153, 153, 153));
        txt_userEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userEmail.setForeground(new java.awt.Color(255, 255, 255));
        txt_userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userEmailActionPerformed(evt);
            }
        });
        pnl_Show2.add(txt_userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address:");
        pnl_Show2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 30));

        txt_userAddress.setBackground(new java.awt.Color(153, 153, 153));
        txt_userAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userAddress.setForeground(new java.awt.Color(255, 255, 255));
        txt_userAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userAddressActionPerformed(evt);
            }
        });
        pnl_Show2.add(txt_userAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 290, 30));

        btn_userCreate.setText("CREATE");
        btn_userCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_userCreate.setkBorderRadius(30);
        btn_userCreate.setkEndColor(new java.awt.Color(0, 0, 255));
        btn_userCreate.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        btn_userCreate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_userCreate.setkSelectedColor(new java.awt.Color(255, 0, 0));
        btn_userCreate.setkStartColor(new java.awt.Color(51, 51, 255));
        btn_userCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userCreateActionPerformed(evt);
            }
        });
        pnl_Show2.add(btn_userCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 150, -1));

        bg.add(pnl_Show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseClicked
        // TODO add your handling code here:
        if (lbl_Close.isFocusable())
            if (JOptionPane.showConfirmDialog(null, "Do you want exit? (Yes/No)","Warning!", 0)==0)
                this.dispose();
        try {
            new Starting().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserLoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbl_CloseMouseClicked

    private void lbl_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseEntered
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.red);
    }//GEN-LAST:event_lbl_CloseMouseEntered

    private void lbl_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseExited
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.blue);
    }//GEN-LAST:event_lbl_CloseMouseExited

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        new Drag(rootPane).onPress(evt);
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        new Drag(rootPane).moveWindow(evt);
    }//GEN-LAST:event_bgMouseDragged

    private void lbl_loginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginLinkMouseClicked
        // TODO add your handling code here:
        new UserLoginGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_loginLinkMouseClicked

    private void lbl_loginLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginLinkMouseEntered
        // TODO add your handling code here:
        lbl_loginLink.setText("<html><u><i>Already click here login...</i></u></html>");
        lbl_loginLink.setForeground(Color.blue);
    }//GEN-LAST:event_lbl_loginLinkMouseEntered

    private void lbl_loginLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginLinkMouseExited
        // TODO add your handling code here:
        lbl_loginLink.setText("Already click here login...");
        lbl_loginLink.setForeground(Color.white);
    }//GEN-LAST:event_lbl_loginLinkMouseExited

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // TODO add your handling code here:
        txt_userFullName.setText("");
        txt_userPhone.setText("");
        txt_userAddress.setText("");
        txt_userEmail.setText("");
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        // TODO add your handling code here:
        ServerDAO dao  = new ServerDAO();
        RegisterValidate vld = new RegisterValidate();
        String username         = txt_userName.getText();
        String password         = String.valueOf(pas_userPassword.getPassword());
        String comfirm_password = String.valueOf(pas_confirmPassword.getPassword());
        if (username.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username cannot be null, please try again!");
        }
        else if((dao.queryAccount(username)))
        {
            JOptionPane.showMessageDialog(null, "Username already existed, please try again!");
        }
        else if(!vld.isUsernameValid(username))
        {
            JOptionPane.showMessageDialog(null, "Username must start with a character and have 6-20 characters long, please try again!");
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password cannot be null, please try again!");
        }
        else if(comfirm_password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Comfirm password cannot be null, please try again!");
        }
        else if(!vld.isPasswordValid(password))
        {
            JOptionPane.showMessageDialog(null, "Password must be 6-20 characters long, please try again!");
        }
        else if(!password.equalsIgnoreCase(comfirm_password))
        {
            JOptionPane.showMessageDialog(null, "Password does not match, please try again!!");
        }
        else {
            pnl_Show1.setVisible(false);
            pnl_Show2.setVisible(true);
        }

    }//GEN-LAST:event_btn_NextActionPerformed

    private void btn_userCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userCreateActionPerformed
        // TODO add your handling code here:
        RegisterValidate vld = new RegisterValidate();
        UserAccount user = new UserAccount();
        String phone        = txt_userPhone.getText();
        String mail         = txt_userEmail.getText();
        if(phone.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Phone number cannot be null, please try again!");
        }
        else if(phone.length() < 10 && phone.length() > 11)
        {
            JOptionPane.showMessageDialog(null, "Phone number must have 10-11 numbers, please try again!");
        }
        else if(!vld.isPhoneValid(phone))
        {
            JOptionPane.showMessageDialog(null, "Phone number is not valid, please try again!");
        }
        else if(mail.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Mail cannot be null, please try again!");
        }
        else if(!vld.isMailValid(mail))
        {
            JOptionPane.showMessageDialog(null, "Mail is not valid, please try again!");
        }
        else {
            user.setUser_Username(txt_userName.getText());
            user.setUser_Password(String.valueOf(pas_userPassword.getPassword()));
            user.setUser_Phone(txt_userPhone.getText());
            user.setUser_Mail(txt_userEmail.getText());
            user.setUser_Fullname(txt_userFullName.getText());
            user.setUser_Address(txt_userAddress.getText());
            user.setUser_MetBeforeQuestionID("0");
            
            UserManage userManage = new UserManage();
//            ServerCtr serverCtr = new ServerCtr();
            
            userManage.openSocket();
            userManage.sendUser(user);
//            serverCtr.execute_addUser();
            member = new UserAccount();
            member = user;
            String res = userManage.getResult();
            
            if (res.equals("ok")) {
                JOptionPane.showMessageDialog(rootPane, "Register Success!");
                new UserInfoGUI(member).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Failed! Please try again...");
            }
            userManage.closeConnection();
        }
        
    }//GEN-LAST:event_btn_userCreateActionPerformed

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        // TODO add your handling code here:
        btn_NextActionPerformed(evt);
    }//GEN-LAST:event_txt_userNameActionPerformed

    private void pas_userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pas_userPasswordActionPerformed
        // TODO add your handling code here:
        btn_NextActionPerformed(evt);
    }//GEN-LAST:event_pas_userPasswordActionPerformed

    private void pas_confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pas_confirmPasswordActionPerformed
        // TODO add your handling code here:
        btn_NextActionPerformed(evt);
    }//GEN-LAST:event_pas_confirmPasswordActionPerformed

    private void txt_userFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userFullNameActionPerformed
        // TODO add your handling code here:
        btn_userCreateActionPerformed(evt);
    }//GEN-LAST:event_txt_userFullNameActionPerformed

    private void txt_userPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userPhoneActionPerformed
        // TODO add your handling code here:
        btn_userCreateActionPerformed(evt);
    }//GEN-LAST:event_txt_userPhoneActionPerformed

    private void txt_userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userEmailActionPerformed
        // TODO add your handling code here:
        btn_userCreateActionPerformed(evt);
    }//GEN-LAST:event_txt_userEmailActionPerformed

    private void txt_userAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userAddressActionPerformed
        // TODO add your handling code here:
        btn_userCreateActionPerformed(evt);
    }//GEN-LAST:event_txt_userAddressActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private keeptoo.KButton btn_Next;
    private keeptoo.KButton btn_Reset;
    private keeptoo.KButton btn_userCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_Close;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_loginLink;
    private javax.swing.JPasswordField pas_confirmPassword;
    private javax.swing.JPasswordField pas_userPassword;
    private keeptoo.KGradientPanel pnl_Show1;
    private keeptoo.KGradientPanel pnl_Show2;
    private keeptoo.KGradientPanel pnl_Side;
    private javax.swing.JTextField txt_userAddress;
    private javax.swing.JTextField txt_userEmail;
    private javax.swing.JTextField txt_userFullName;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JTextField txt_userPhone;
    // End of variables declaration//GEN-END:variables
}
