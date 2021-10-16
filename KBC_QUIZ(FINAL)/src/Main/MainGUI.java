/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Admin.AdminLoginGUI;
import Client.Main.Starting;
import Server.Run.ServerRun;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import keeptoo.Drag;

/**
 *
 * @author MyPC
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public MainGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setFrameBG(450, 400, "/images/bg03.png");
    }

//method set background frame
    private void setFrameBG(int width, int height, String img_bg) {
        
        ImageIcon background_image = new ImageIcon(getClass().getResource(img_bg));

        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_image, JLabel.CENTER);

        background.setBounds(0, 0, width, height);
        add(background);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Close = new javax.swing.JLabel();
        pnl_bg = new javax.swing.JPanel();
        btn_Administrator = new javax.swing.JButton();
        btn_Starting = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lbl_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 400));
        setMinimumSize(new java.awt.Dimension(450, 400));
        setUndecorated(true);
        setSize(new java.awt.Dimension(450, 400));
        getContentPane().setLayout(null);

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
        getContentPane().add(lbl_Close);
        lbl_Close.setBounds(410, 0, 40, 50);

        pnl_bg.setOpaque(false);
        pnl_bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_bgMouseDragged(evt);
            }
        });
        pnl_bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_bgMousePressed(evt);
            }
        });
        pnl_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Administrator.setBackground(new java.awt.Color(0, 0, 255));
        btn_Administrator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Administrator.setForeground(new java.awt.Color(255, 255, 255));
        btn_Administrator.setText("ADMINISTRATOR");
        btn_Administrator.setOpaque(false);
        btn_Administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdministratorActionPerformed(evt);
            }
        });
        pnl_bg.add(btn_Administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 270, 40));

        btn_Starting.setBackground(new java.awt.Color(0, 0, 255));
        btn_Starting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Starting.setForeground(new java.awt.Color(255, 255, 255));
        btn_Starting.setText("START PROGRAM");
        btn_Starting.setOpaque(false);
        btn_Starting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartingActionPerformed(evt);
            }
        });
        pnl_bg.add(btn_Starting, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 270, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kbc_logo(160x160).png"))); // NOI18N
        pnl_bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 150));

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_Aptech.png"))); // NOI18N
        lbl_Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_bg.add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 110));

        getContentPane().add(pnl_bg);
        pnl_bg.setBounds(0, 0, 450, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseClicked
        // TODO add your handling code here:
        if (lbl_Close.isFocusable())
        if (JOptionPane.showConfirmDialog(null, "Do you want exit? (Yes/No)","Warning!", 0)==0)
        System.exit(0);
    }//GEN-LAST:event_lbl_CloseMouseClicked

    private void lbl_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseEntered
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.red);
    }//GEN-LAST:event_lbl_CloseMouseEntered

    private void lbl_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseExited
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.blue);
    }//GEN-LAST:event_lbl_CloseMouseExited

    private void pnl_bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_bgMouseDragged
        // TODO add your handling code here:
        new Drag(rootPane).moveWindow(evt);
    }//GEN-LAST:event_pnl_bgMouseDragged

    private void pnl_bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_bgMousePressed
        // TODO add your handling code here:
        new Drag(rootPane).onPress(evt);
    }//GEN-LAST:event_pnl_bgMousePressed

    private void btn_StartingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartingActionPerformed
        try {
            // TODO add your handling code here:
            new Starting().setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_StartingActionPerformed

    private void btn_AdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdministratorActionPerformed
        // TODO add your handling code here:
        new AdminLoginGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AdministratorActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Administrator;
    private javax.swing.JButton btn_Starting;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lbl_Close;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JPanel pnl_bg;
    // End of variables declaration//GEN-END:variables
}
