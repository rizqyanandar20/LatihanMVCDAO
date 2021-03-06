/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizqyanandar.latihanmvcjdbc.view;

import edu.rizqyanandar.latihanmvcjdbc.controller.PelangganController;
import edu.rizqyanandar.latihanmvcjdbc.database.KingsbarbershopDatabase;
import edu.rizqyanandar.latihanmvcjdbc.entity.Pelanggan;
import edu.rizqyanandar.latihanmvcjdbc.error.PelangganException;
import edu.rizqyanandar.latihanmvcjdbc.event.PelangganListener;
import edu.rizqyanandar.latihanmvcjdbc.model.PelangganModel;
import edu.rizqyanandar.latihanmvcjdbc.model.tablePelangganModel;
import edu.rizqyanandar.latihanmvcjdbc.service.PelangganDAO;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Administrator
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class PelangganView extends javax.swing.JPanel implements PelangganListener , ListSelectionListener{

    /**
     *
     */
    private tablePelangganModel tableModel;
    private PelangganModel model;
    private PelangganController controller;
    
    
    public PelangganView() {
        tableModel = new tablePelangganModel();
        model = new PelangganModel();
        model.setListener(this);
        
        controller = new PelangganController();
        controller.setModel(model);
        
        
        initComponents();
        
        tablePelanggan.getSelectionModel().addListSelectionListener(this);
        tablePelanggan.setModel(tableModel);
        
    }

    public JTable getTablePelanggan() {
        return tablePelanggan;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTelepon() {
        return txtTelepon;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePelanggan = new javax.swing.JTable();
        btnUbah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MANAGEMENT DATA PELANGGAN ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 373, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("KINGS BARBERSHOP");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, 309, 31));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 52, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NAMA :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 102, 52, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ALAMAT :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 154, 52, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TELEPON :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 128, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("EMAIL :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 67, 189, -1));

        txtNama.setBackground(new java.awt.Color(204, 204, 204));
        txtNama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 99, 189, -1));

        txtTelepon.setBackground(new java.awt.Color(204, 204, 204));
        txtTelepon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 125, 189, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 174, 189, -1));

        txtAlamat.setBackground(new java.awt.Color(204, 204, 204));
        txtAlamat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 102)));
        add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 151, 189, -1));

        tablePelanggan.setBackground(new java.awt.Color(204, 204, 204));
        tablePelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablePelanggan);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 212, -1, 91));

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 321, -1, -1));

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 321, -1, -1));

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 321, -1, -1));

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 321, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
            // TODO add your handling code here:
        controller.updatePelanggan(this);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        controller.resetPelanggan(this);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insertPelanggan(this);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deletePelanggan(this);
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablePelanggan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(PelangganModel model) {
        txtId.setText(model.getId() + "");
        txtNama.setText(model.getNama());
        txtAlamat.setText(model.getAlamat());
        txtTelepon.setText(model.getTelepon());
        txtEmail.setText(model.getEmail());
    }

    @Override
    public void onUpdate(Pelanggan pelanggan) {
        int index = tablePelanggan.getSelectedRow();
        tableModel.set(index, pelanggan);
    }

    @Override
    public void onDelete() {
        int index = tablePelanggan.getSelectedRow();
        tableModel.remove(index);
    }

    @Override
    public void onInsert(Pelanggan pelanggan) {
        tableModel.add(pelanggan);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try {
            Pelanggan model = tableModel.get(tablePelanggan.getSelectedRow());
        txtId.setText(model.getId() + "");
        txtNama.setText(model.getNama());
        txtAlamat.setText(model.getAlamat());
        txtTelepon.setText(model.getTelepon());
        txtEmail.setText(model.getEmail());
        } catch (IndexOutOfBoundsException e) {
        }
    }

    /**
     *
     * @throws SQLException
     * @throws PelangganException
     */
    public void loadDatabase() throws SQLException,PelangganException {
        PelangganDAO dao = KingsbarbershopDatabase.getPelangganDAO();
        tableModel.setList(dao.selectAllPelanggan());
    }
}
