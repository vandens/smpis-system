/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vandens
 */
public class student_add_form extends javax.swing.JDialog {

    public Connection dbconnect = dbconnection.getConnection();
    public String error_msg;
    public String sql;
    /**
     * Creates new form student_add_form
     * @param flag
     */
    public student_add_form(String flag) {
        initComponents();
        setModal(true);
        if(flag.equals("Add")){
            update.setEnabled(false);
            save.setEnabled(true);
        }else{
            update.setEnabled(true);
            save.setEnabled(false);
            param3.setEnabled(false);
            this.edit(flag);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        param1 = new javax.swing.JComboBox();
        param2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        param3 = new javax.swing.JTextField();
        param4 = new javax.swing.JTextField();
        param5 = new javax.swing.JTextField();
        param6 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        param7 = new javax.swing.JTextArea();
        date_param1 = new javax.swing.JComboBox();
        date_param2 = new javax.swing.JComboBox();
        date_param3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        param8 = new javax.swing.JComboBox();
        param9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setTitle("Form Data Siswa");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data Akademis"));

        jLabel3.setText("Tahun Penerimaan Siswa");

        jLabel5.setText("Kelas");

        param1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih satu", "2015/2016", "2016/2017", "2017/2018", "2018/2019", "2019/2020" }));
        param1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                param1ActionPerformed(evt);
            }
        });

        param2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih satu", "10-1", "10-2", "10-3", "10-4", "10-5", "10-6", "10-7", "10-8", "10-9", "10-10", "10-11", "10-12", "10-13", "10-14", "10-15", "11-1", "11-2", "11-3", "11-4", "11-5", "11-6", "11-7", "11-8", "11-9", "11-10", "11-11", "11-12", "11-13", "11-14", "11-15", "12-1", "12-2", "12-3", "12-4", "12-5", "12-6", "12-7", "12-8", "12-9", "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(param1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(param2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data Pribadi"));

        jLabel8.setText("Nomor Induk Siswa");

        jLabel9.setText("Nama Lengkap Siswa");

        jLabel10.setText("Tempat, Tanggal Lahir");

        jLabel11.setText("Agama");

        param3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                param3ActionPerformed(evt);
            }
        });

        param6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih satu", "Islam", "Katolik", "Protestan", "Hindu", "Budha", "Kong Hu Cu" }));
        param6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                param6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Alamat");

        param7.setColumns(20);
        param7.setRows(5);
        jScrollPane1.setViewportView(param7);

        date_param1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tgl", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date_param1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_param1ActionPerformed(evt);
            }
        });

        date_param2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        date_param2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_param2ActionPerformed(evt);
            }
        });

        date_param3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        date_param3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_param3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis Kelamin");

        param8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih satu", "Laki-laki", "Perempuan" }));

        param9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                param9ActionPerformed(evt);
            }
        });

        jLabel12.setText("No Telp Wali / Org Tua");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(70, 70, 70))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(89, 89, 89)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(param9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(param8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(param6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(param3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(param5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(date_param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(date_param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(param4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_param3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(param3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(param4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(param5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_param3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(param8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(param6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(param9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/update.png"))); // NOI18N
        update.setText("Update");
        update.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/save_as.png"))); // NOI18N
        save.setText("Simpan");
        save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/cancel.png"))); // NOI18N
        cancel.setText("Batal");
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sistem Informasi Pembayaran Sekolah");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("SMA Negeri 6 Kab. Tangerang");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel14.setText("Jalan Aria Jaya Sentika No. 52 Pasirnangka, Tigaraksa - Tangerang, 15720 - (021) 5990276");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smpis_system/logo-in.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(save)
                    .addComponent(cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void param1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_param1ActionPerformed

    private void param3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_param3ActionPerformed

    private void param6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_param6ActionPerformed

    private void date_param1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_param1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_param1ActionPerformed

    private void date_param2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_param2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_param2ActionPerformed

    private void date_param3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_param3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_param3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        student_update();
        this.dispose();
        revalidate();
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        student_save();
        revalidate();
        clear_text();
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void param9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_param9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox date_param1;
    private javax.swing.JComboBox date_param2;
    private javax.swing.JComboBox date_param3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox param1;
    private javax.swing.JComboBox param2;
    private javax.swing.JTextField param3;
    private javax.swing.JTextField param4;
    private javax.swing.JTextField param5;
    private javax.swing.JComboBox param6;
    private javax.swing.JTextArea param7;
    private javax.swing.JComboBox param8;
    private javax.swing.JTextField param9;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables


    public void clear_text(){
        param1.setSelectedItem("Pilih satu");
        param2.setSelectedItem("Pililh satu");
        param3.setText("");
        param4.setText("");
        param5.setText("");
        date_param1.setSelectedItem("Tgl");
        date_param2.setSelectedItem("Bulan");
        date_param3.setSelectedItem("Tahun");
        param6.setSelectedItem("Pilih satu");
        param7.setText("");
        param8.setSelectedItem("Pilih satu");
        param9.setText("");
    }
    
    public void student_save(){
        
        String years            = (String) param1.getSelectedItem();
        String class_name       = (String) param2.getSelectedItem();
        String student_id       = param3.getText();
        String student_fullname = param4.getText();
        String student_bplace   = param5.getText();
        String student_religion = (String) param6.getSelectedItem();
        String st_sex           = (String) param8.getSelectedItem();
        String date             = (String) date_param1.getSelectedItem();
        String month            = (String) date_param2.getSelectedItem();
        String year             = (String) date_param3.getSelectedItem();
        String student_address  = param7.getText();
        String student_phone    = param9.getText();
        
        
        // ------------------ validasi data dulu disini  -----------------
        if("".equals(years) || years.equals("Pilih satu"))                          error_msg = "Tahun penerimaan tidak boleh kosong";
        else if("".equals(student_id))                                              error_msg = "NIS tidak boleh kosong";
        else if("".equals(class_name)|| class_name.equals("Pilih satu"))            error_msg = "Kelas tidak boleh kosong";
        else if("".equals(student_fullname))                                        error_msg = "Nama lengkap tidak boleh kosong";
        else if("".equals(student_bplace))                                          error_msg = "Tempat lahir tidak boleh kosong";
        else if("".equals(date) || date.equals("Tgl"))                              error_msg = "Tanggal lahir tidak boleh kosong";
        else if("".equals(st_sex))                                                  error_msg = "Jenis kelamin tidak boleh kosong";
        else if("".equals(month) || month.equals("Bulan"))                          error_msg = "Bulan lahir tidak boleh kosong";
        else if("".equals(year) || year.equals("Tahun"))                            error_msg = "Tahun lahir tidak boleh kosong";
        // ------------------ tambah validasi lainnya disini -----------------        
        else error_msg = "";
        
        if(error_msg.equals("")){
            try {                  
                    String student_bday = year+"-"+month+"-"+date;
                    String student_sex  = ("Laki-laki".equals(st_sex)) ? "L" : "P";
                    Statement stmt = dbconnect.createStatement();
                    sql = "INSERT INTO m_student"
                                    + "(years, class_name, student_id, student_fullname, student_sex, student_bplace, student_bday, student_religion, student_parent_phone, student_address)"
                                    + " VALUE"
                                    + "('"+years+"','"+class_name+"','"+student_id+"','"+student_fullname+"','"+student_sex+"','"+student_bplace+"','"+student_bday+"','"+student_religion+"','"+student_phone+"','"+student_address+"')";
                    System.out.println(sql);
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan!","Simpan",JOptionPane.INFORMATION_MESSAGE);
                        
            } catch (SQLException ex) {
                    Logger.getLogger(student_list_form.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane,"Error : "+ex,"Error",JOptionPane.ERROR);
            }
            
        }else JOptionPane.showMessageDialog(rootPane,error_msg,"Error",JOptionPane.ERROR_MESSAGE);
        
    }
    
    private void edit(String key) {
       try{
           Statement stmt           = dbconnect.createStatement();
           sql                      = "SELECT years, class_name, student_id, student_fullname, student_sex, student_bplace, student_bday, student_religion, student_parent_phone, student_address"
                                    + " FROM m_student WHERE student_id = '"+key+"'";
           ResultSet rs   = stmt.executeQuery(sql);
           
           while(rs.next()){
               param1.setSelectedItem(rs.getString("years"));
               param2.setSelectedItem(rs.getString("class_name"));
               param3.setText(rs.getString("student_id"));
               param4.setText(rs.getString("student_fullname"));
               param5.setText(rs.getString("student_bplace"));
               param6.setSelectedItem(rs.getString("student_religion"));
               param7.setText(rs.getString("student_address"));
               String st_sex = ("L".equals(rs.getString("student_sex"))) ? "Laki-laki" : "Perempuan";
               param8.setSelectedItem(st_sex);  
               param9.setText(rs.getString("student_parent_phone"));          
              
               String[] split = rs.getString("student_bday").split("-");
               
               date_param1.setSelectedItem(split[2]);
               date_param2.setSelectedItem(split[1]);
               date_param3.setSelectedItem(split[0]);
           }
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane,"Error : "+e,"Error",JOptionPane.ERROR);
       }
       
    }

    private void student_update() {
       
        String years            = (String) param1.getSelectedItem();
        String class_name       = (String) param2.getSelectedItem();
        String student_id       = param3.getText();
        String student_fullname = param4.getText();
        String student_bplace   = param5.getText();
        String student_religion = (String) param6.getSelectedItem();
        String st_sex           = (String) param8.getSelectedItem();
        String date             = (String) date_param1.getSelectedItem();
        String month            = (String) date_param2.getSelectedItem();
        String year             = (String) date_param3.getSelectedItem();
        String student_address  = param7.getText();
        String student_phone    = param9.getText();
        
        
        // ------------------ validasi data dulu disini  -----------------
        if("".equals(years) || years.equals("Pilih satu"))                          error_msg = "Tahun penerimaan tidak boleh kosong";
        else if("".equals(student_id))                                              error_msg = "NIS tidak boleh kosong";
        else if("".equals(class_name)|| class_name.equals("Pilih satu"))            error_msg = "Kelas tidak boleh kosong";
        else if("".equals(student_fullname))                                        error_msg = "Nama lengkap tidak boleh kosong";
        else if("".equals(student_bplace))                                          error_msg = "Tempat lahir tidak boleh kosong";
        else if("".equals(date) || date.equals("Tgl"))                              error_msg = "Tanggal lahir tidak boleh kosong";
        else if("".equals(st_sex))                                                  error_msg = "Jenis kelamin tidak boleh kosong";
        else if("".equals(month) || month.equals("Bulan"))                          error_msg = "Bulan lahir tidak boleh kosong";
        else if("".equals(year) || year.equals("Tahun"))                            error_msg = "Tahun lahir tidak boleh kosong";
        // ------------------ tambah validasi lainnya disini -----------------        
        else error_msg = "";
        
        
        
        if(error_msg.equals("")){
            try {                  
                    String student_bday = year+"-"+month+"-"+date;
                    String student_sex  = ("Laki-laki".equals(st_sex)) ? "L" : "P";
                    Statement stmt = dbconnect.createStatement();
                    sql = "UPDATE m_student SET "
                                    + "years = '"+years+"', class_name = '"+class_name+"', student_fullname = '"+student_fullname+"', "
                                    + "student_sex = '"+student_sex+"', student_bplace = '"+student_bplace+"', student_bday = '"+student_bday+"', student_religion = '"+student_religion+"',"
                                    + " student_parent_phone = '"+student_phone+"',"
                                    + " student_address = '"+student_address+"' WHERE student_id = '"+student_id+"'";
                    System.out.println(sql);
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan!","Berhasil",JOptionPane.INFORMATION_MESSAGE);
                        
            } catch (SQLException ex) {
                    Logger.getLogger(student_list_form.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane,"Error : "+ex,"Error",JOptionPane.ERROR);
            }
            
        }else JOptionPane.showMessageDialog(rootPane,error_msg,"Error",JOptionPane.ERROR_MESSAGE);
        
    }
}
