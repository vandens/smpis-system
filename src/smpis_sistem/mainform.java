/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_sistem;

import java.awt.Component;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vandens
 */
public class mainform extends javax.swing.JFrame {
    public static String user_id = "vandens";
    /**
     * Creates new form mainform
     * @param user_id
     */
    public mainform(String user_id) {
        initComponents();
        check_privilege(user_id);  
        Date date = new java.util.Date();
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
        toolbar = new javax.swing.JToolBar();
        btn_student_list = new javax.swing.JButton();
        btn_debt_list = new javax.swing.JButton();
        btn_payment_list = new javax.swing.JButton();
        btn_sms_list = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        btn_user_id = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        student_list = new javax.swing.JMenuItem();
        debt_list = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        payment_list = new javax.swing.JMenuItem();
        sms_list = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        debt_report_list = new javax.swing.JMenuItem();
        payment_report_list = new javax.swing.JMenuItem();
        sms_report_list = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Pembayaran SPP");

        toolbar.setRollover(true);

        btn_student_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32/user_student_female.png"))); // NOI18N
        btn_student_list.setText("Siswa");
        btn_student_list.setFocusable(false);
        btn_student_list.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_student_list.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_student_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_listActionPerformed(evt);
            }
        });
        toolbar.add(btn_student_list);

        btn_debt_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32/account_balances.png"))); // NOI18N
        btn_debt_list.setText("Tunggakan");
        btn_debt_list.setFocusable(false);
        btn_debt_list.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_debt_list.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_debt_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_debt_listActionPerformed(evt);
            }
        });
        toolbar.add(btn_debt_list);

        btn_payment_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32/money_add.png"))); // NOI18N
        btn_payment_list.setText("Transaksi");
        btn_payment_list.setFocusable(false);
        btn_payment_list.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_payment_list.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_payment_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payment_listActionPerformed(evt);
            }
        });
        toolbar.add(btn_payment_list);

        btn_sms_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32/email_error.png"))); // NOI18N
        btn_sms_list.setText("SMS Info");
        btn_sms_list.setFocusable(false);
        btn_sms_list.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sms_list.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btn_sms_list);

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32/door_out.png"))); // NOI18N
        btn_logout.setText("Keluar");
        btn_logout.setFocusable(false);
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        toolbar.add(btn_logout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        btn_user_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/administrator.png"))); // NOI18N
        btn_user_id.setText("user_id");
        btn_user_id.setBorderPainted(false);
        btn_user_id.setFocusPainted(false);
        btn_user_id.setFocusable(false);
        btn_user_id.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar2.add(btn_user_id);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Master Data");

        student_list.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        student_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/user_student_female.png"))); // NOI18N
        student_list.setText("Data Siswa");
        student_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_listActionPerformed(evt);
            }
        });
        jMenu1.add(student_list);

        debt_list.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        debt_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/account_balances.png"))); // NOI18N
        debt_list.setText("Data Tunggakan");
        debt_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debt_listActionPerformed(evt);
            }
        });
        jMenu1.add(debt_list);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/door_out.png"))); // NOI18N
        logout.setText("Keluar");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        payment_list.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        payment_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/money_add.png"))); // NOI18N
        payment_list.setText("Pembayaran");
        payment_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_listActionPerformed(evt);
            }
        });
        jMenu2.add(payment_list);

        sms_list.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        sms_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/email_error.png"))); // NOI18N
        sms_list.setText("SMS Pending");
        jMenu2.add(sms_list);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laporan");

        debt_report_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/chart_bar.png"))); // NOI18N
        debt_report_list.setText("Tunggakan");
        jMenu3.add(debt_report_list);

        payment_report_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/chart_curve.png"))); // NOI18N
        payment_report_list.setText("Transaksi");
        jMenu3.add(payment_report_list);

        sms_report_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/chart_bullseye.png"))); // NOI18N
        sms_report_list.setText("SMS Terkirim");
        jMenu3.add(sms_report_list);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Bantuan");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/telephone.png"))); // NOI18N
        jMenuItem9.setText("Kontak");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        logout();      
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_logoutActionPerformed

    private void btn_student_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_listActionPerformed
        // TODO add your handling code here:
        student_list_form form   =   new student_list_form(); 
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        form.toFront();
        desktopPane.add(form);
    }//GEN-LAST:event_btn_student_listActionPerformed

    private void btn_debt_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_debt_listActionPerformed
        // TODO add your handling code here:
        debt_list_form form   =   new debt_list_form(); 
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        desktopPane.add(form);
    }//GEN-LAST:event_btn_debt_listActionPerformed

    private void student_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_listActionPerformed
        // TODO add your handling code here:
        student_list_form form   =   new student_list_form(); 
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        desktopPane.add(form);
    }//GEN-LAST:event_student_listActionPerformed

    private void debt_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debt_listActionPerformed
        // TODO add your handling code here:
        debt_list_form form   =   new debt_list_form(); 
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        desktopPane.add(form);
    }//GEN-LAST:event_debt_listActionPerformed

    private void btn_payment_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payment_listActionPerformed
        // TODO add your handling code here:
        payment_list_form form = new payment_list_form();
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        desktopPane.add(form);
    }//GEN-LAST:event_btn_payment_listActionPerformed

    private void payment_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_listActionPerformed
        // TODO add your handling code here:
        payment_list_form form = new payment_list_form();
        form.setVisible(true);
        form.setFocusCycleRoot(true);
        desktopPane.add(form);
    }//GEN-LAST:event_payment_listActionPerformed

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
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainform mdiparent = new mainform(user_id);       
                mdiparent.pack();
                mdiparent.setLocationRelativeTo(null);
                //mdiparent.setExtendedState(mainform.MAXIMIZED_BOTH); //tampilkan full screen
                mdiparent.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_debt_list;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_payment_list;
    private javax.swing.JButton btn_sms_list;
    private javax.swing.JButton btn_student_list;
    private javax.swing.JButton btn_user_id;
    private javax.swing.JMenuItem debt_list;
    private javax.swing.JMenuItem debt_report_list;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem payment_list;
    private javax.swing.JMenuItem payment_report_list;
    private javax.swing.JMenuItem sms_list;
    private javax.swing.JMenuItem sms_report_list;
    private javax.swing.JMenuItem student_list;
    private javax.swing.JToolBar toolbar;
    // End of variables declaration//GEN-END:variables

    private void logout() {
        try{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "Konfirmasi", dialogButton);
            if(dialogResult == 0) {
                 login_form form = new login_form();
                 form.setLocationRelativeTo(form);
                 form.setVisible(true);
                 this.dispose();
                 
            } else {
              System.out.println("No Option");
            }             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan : "+e);
        }
    }

    private void check_privilege(String user_id) {
        btn_user_id.setText(" :  "+user_id);
    }


}
