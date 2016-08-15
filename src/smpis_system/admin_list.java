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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vandens
 */
public class admin_list extends javax.swing.JPanel {

    public Connection dbconnect = dbconnection.getConnection();
    public DefaultTableModel table_list;
    public String sql;
    private String where = "";
    public String key;
    public Map<String, Object> params;
    /**
     * Creates new form admin_list
     */
    public admin_list() {
        initComponents();
        show_list(where);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        add_new = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        param1 = new javax.swing.JTextField();
        param2 = new javax.swing.JTextField();
        param4 = new javax.swing.JCheckBox();
        param5 = new javax.swing.JCheckBox();
        param6 = new javax.swing.JComboBox();
        filter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_list_admin = new javax.swing.JTable();

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        add_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/pencil_add.png"))); // NOI18N
        add_new.setText("Tambah");
        add_new.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_newActionPerformed(evt);
            }
        });
        jToolBar1.add(add_new);

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/pencil_go.png"))); // NOI18N
        edit.setText("Edit");
        edit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jToolBar1.add(edit);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/pencil_delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jToolBar1.add(delete);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filter Data Siswa"));

        jLabel1.setText("ID");

        jLabel2.setText("Nama Admin");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Status");

        param4.setText("Laki - Laki");

        param5.setText("Perempuan");

        param6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih satu", "Aktif", "Suspended" }));
        param6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                param6ActionPerformed(evt);
            }
        });

        filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/filter_add.png"))); // NOI18N
        filter.setText("Filter");
        filter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16/filter_delete.png"))); // NOI18N
        clear.setText("Clear");
        clear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(param2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(121, 121, 121)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(param4)
                                .addGap(18, 18, 18)
                                .addComponent(param5))
                            .addComponent(param6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(param4)
                    .addComponent(param5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(param6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filter)
                    .addComponent(clear))
                .addGap(23, 23, 23))
        );

        table_list_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_list_admin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void param6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_param6ActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        // TODO add your handling code here:

        String id                   = param1.getText();
        String name                 = param2.getText();
        String sex_l                = param4.getText();
        String sex_p                = param5.getText();
        String status               = (String) param6.getSelectedItem();

        boolean L_isSelected = param4.isSelected();
        boolean P_isSelected = param5.isSelected();

        where = "WHERE 1=1 ";
        if(!id.equals(""))                                      where = where+" AND admin_id          = '"+id+"'";
        if(!name.equals(""))                                    where = where+" AND admin_fullname    LIKE '%"+name+"%'";
        if(L_isSelected && !P_isSelected)                       where = where+" AND admin_sex         = 'L'";
        if(P_isSelected && !L_isSelected)                       where = where+" AND admin_sex         = 'P'";
        if(!status.equals("") && !status.equals("Pilih satu"))  where = where+" AND admin_status      = '"+status+"'";

        show_list(where);
    }//GEN-LAST:event_filterActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        param1.setText("");
        param2.setText("");
        param4.setSelected(false);
        param5.setSelected(false);
        param6.setSelectedItem("Pilih satu");
        where = "WHERE 1=1 ";
        show_list(where);
    }//GEN-LAST:event_clearActionPerformed

    private void add_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_newActionPerformed
        // TODO add your handling code here:
        String flag = "Add";
        admin_add_form form = new admin_add_form(flag);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_add_newActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:

        boolean is_selected = table_list_admin.getSelectedRowCount() > 0;
        if(!is_selected)
        JOptionPane.showMessageDialog(null,"Tidak ada baris terseleksi!","Error",JOptionPane.ERROR_MESSAGE);
        else{
            try{
                key = (String) table_list_admin.getValueAt(table_list_admin.getSelectedRow(),0);
                System.out.println(key);
                admin_add_form form = new admin_add_form(key);
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Exception : "+e,"Exception",JOptionPane.ERROR);
            }
        }

    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        boolean is_selected = table_list_admin.getSelectedRowCount() > 0;
        if(!is_selected)
        JOptionPane.showMessageDialog(null,"Tidak ada baris terseleksi!","Error",JOptionPane.ERROR_MESSAGE);
        else{

            try{

                key = (String) table_list_admin.getValueAt(table_list_admin.getSelectedRow(),0);
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Semua data tunggakan dan transaksi akan ikut terhapus.\n Anda yakin ingin melanjutkan?", "Konfirmasi", dialogButton);
                if(dialogResult == 0) {
                    try {
                        if(1!=1){
                            // tambahkan validasi lainnya disini
                            JOptionPane.showMessageDialog(null,"Add Validation Here");
                        }else{

                            Statement stmt = dbconnect.createStatement();
                            sql             = "DELETE FROM m_admin WHERE admin_id = '"+key+"'";
                            System.out.println(sql);
                            stmt.executeUpdate(sql);
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"Error : "+e,"Error",JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    System.out.println("No Option");
                }
                show_list(where);

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Exception : "+e,"Exception",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    
    private void show_list(String str_where) {
       
        Object [] rows={"NIS","Nama Lengkap ","Tempat Lahir","Tanggal Lahir","Jenis Kelamin","Alamat","Status"};
            table_list=new DefaultTableModel(null,rows);
            table_list_admin.setModel(table_list);
            table_list_admin.setBorder(null);
            jScrollPane1.setVisible(true);
            jScrollPane1.setViewportView(table_list_admin);
            try{
                
                //String sql="select * from m_student";
                 if(!str_where.equals("")){
                     sql  = "SELECT * FROM m_admin "+str_where;
                 }else{
                     sql  = "SELECT * FROM m_admin";
                 }
                 
                Statement st = dbconnect.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    String admin_id          = rs.getString("admin_id");
                    String admin_fullname    = rs.getString("admin_fullname");
                    String admin_bplace      = rs.getString("admin_bplace");
                    String admin_bday        = rs.getString("admin_bday");
                    String admin_sex         = rs.getString("admin_sex");
                    String admin_address     = rs.getString("admin_address");
                    String admin_status      = rs.getString("admin_status");

                    String [] tampil={admin_id,admin_fullname,admin_bplace,admin_bday,admin_sex,admin_address,admin_status};
                    table_list.addRow(tampil);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Terdapat kesalahan query : "+e);
            }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField param1;
    private javax.swing.JTextField param2;
    private javax.swing.JCheckBox param4;
    private javax.swing.JCheckBox param5;
    private javax.swing.JComboBox param6;
    private javax.swing.JTable table_list_admin;
    // End of variables declaration//GEN-END:variables
}