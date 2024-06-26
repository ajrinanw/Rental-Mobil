/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalMobil;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wahyudi
 */
public class Pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form Pengembalian
     */
    public Pengembalian() {
        initComponents();
        table();
        del();
        LoadNoPeminjaman();
    }
    
    public void table(){
        DefaultTableModel tb1 = new DefaultTableModel();
        tb1.addColumn("Nama Pelanggan");
        tb1.addColumn("No Polisi");
        tb1.addColumn("Tgl Peminjaman");
        tb1.addColumn("Tgl Pengembalian");
        tb1.addColumn("Lama Peminjaman");
        tb1.addColumn("Harga/Hari");
        tb1.addColumn("Total Harga");
        
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pengembalian");
            
            while(rs.next()){
                tb1.addRow(new Object[] {
                    rs.getString("namaPelanggan"),
                    rs.getString("noPolisi"),
                    rs.getString("tglPinjam"),
                    rs.getString("tglBalik"),
                    rs.getString("lama"),
                    rs.getString("hargaSewa"),
                    rs.getString("totHarga"),
                });
            }
            tablePengembalian.setModel(tb1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
    }
    
    void del(){
        txtNama.setText("");
        txtNoPolisi.setText("");
        txtTglPinjam.setText("");
        txtTglBalik.setText("");
        txtLama.setText("");
        txtHargaSewa.setText("");
        txtHargaAll.setText("");
    }
    
    public void LoadNoPeminjaman(){
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);
            PreparedStatement pst = con.prepareStatement("SELECT No FROM penyewa");
            ResultSet rs = pst.executeQuery();
            
            cmbNoPinjam.removeAllItems();
            
            while(rs.next()){
                cmbNoPinjam.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNoPolisi = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglBalik = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        cmbNoPinjam = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        txtHargaAll = new javax.swing.JTextField();
        btnOK1 = new javax.swing.JButton();
        subTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePengembalian = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtHargaSewa = new javax.swing.JTextField();
        Lanjutkan = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));

        jLabel1.setBackground(new java.awt.Color(176, 58, 48));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(176, 58, 48));
        jLabel1.setText("RENTAL CAR MANEGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(176, 58, 48));
        jPanel2.setForeground(new java.awt.Color(176, 58, 48));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(217, 217, 217));
        title.setText("PENGEMBALIAN MOBIL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 217, 217));
        jLabel2.setText("No Peminjaman");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Nama Pelanggan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(217, 217, 217));
        jLabel4.setText("Tanggal Peminjaman");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 217, 217));
        jLabel5.setText("Lama Peminjaman");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 217, 217));
        jLabel6.setText("Tanggal Pengembalian");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 217, 217));
        jLabel7.setText("Harga / Hari");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 217, 217));
        jLabel8.setText("No Polisi Mobil");

        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNoPolisi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTglPinjam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTglBalik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtLama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cmbNoPinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnOK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(176, 58, 48));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        txtHargaAll.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnOK1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOK1.setForeground(new java.awt.Color(176, 58, 48));
        btnOK1.setText("hitung");
        btnOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK1ActionPerformed(evt);
            }
        });

        subTitle.setBackground(new java.awt.Color(217, 217, 217));
        subTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        subTitle.setForeground(new java.awt.Color(217, 217, 217));
        subTitle.setText("LIST PENGEMBALIAN MOBIL");

        tablePengembalian.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePengembalian.setRowHeight(20);
        tablePengembalian.setSelectionBackground(new java.awt.Color(176, 58, 48));
        tablePengembalian.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablePengembalianAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablePengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePengembalianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePengembalian);

        btnEdit.setBackground(new java.awt.Color(217, 217, 217));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(176, 58, 48));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(217, 217, 217));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(176, 58, 48));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(217, 217, 217));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(176, 58, 48));
        btnHapus.setText("HAPUS ");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 217, 217));
        jLabel9.setText("Total Harga");

        txtHargaSewa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Lanjutkan.setBackground(new java.awt.Color(217, 217, 217));
        Lanjutkan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lanjutkan.setForeground(new java.awt.Color(176, 58, 48));
        Lanjutkan.setText("KEMBALI");
        Lanjutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanjutkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Lanjutkan)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(subTitle)
                                .addGap(294, 294, 294)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtHargaSewa))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbNoPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnOK)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(txtTglBalik, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtHargaAll, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOK1))
                                            .addComponent(jLabel9))))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNoPolisi)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(80, 80, 80))
                                    .addComponent(txtLama)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTglBalik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOK)
                                    .addComponent(cmbNoPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHargaAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK1)
                            .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subTitle)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus)
                        .addComponent(btnEdit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Lanjutkan)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String NoPinjam = cmbNoPinjam.getSelectedItem().toString();
        
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM penyewa WHERE No = ?");
            pst.setString(1, NoPinjam);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()==true){
                txtNama.setText(rs.getString(2));
                txtNoPolisi.setText(rs.getString(5));
                txtTglPinjam.setText(rs.getString(6));
                txtHargaSewa.setText(rs.getString(7));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK1ActionPerformed
        double lama,price,totHarga;
        
        lama = Double.parseDouble(txtLama.getText());
        price = Double.parseDouble(txtHargaSewa.getText());
        
        totHarga = lama*price;
        
        txtHargaAll.setText(""+totHarga);
    }//GEN-LAST:event_btnOK1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);

            String Nama = txtNama.getText();
            String NoPolisi = txtNoPolisi.getText();
            String TglPinjam = txtTglPinjam.getText();
            String TglBalik = txtTglBalik.getText();
            String Lama = txtLama.getText();
            String HargaSewa = txtHargaSewa.getText();
            String TotalHarga = txtHargaAll.getText();

            Statement st = (Statement) con.createStatement();
            st.executeUpdate("UPDATE pengembalian SET noPolisi='"+NoPolisi+"', tglPinjam='"+TglPinjam+"', tglBalik='"+TglBalik+"', lama='"+Lama+"', totharga='"+TotalHarga+"'  WHERE namaPelanggan='"+Nama+"'");
        }catch(SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

        table();
        del();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);

            String Nama = txtNama.getText();
            String NoPolisi = txtNoPolisi.getText();
            String TglPinjam = txtTglPinjam.getText();
            String TglBalik = txtTglBalik.getText();
            String Lama = txtLama.getText();
            String HargaSewa = txtHargaSewa.getText();
            String TotalHarga = txtHargaAll.getText();

            Statement st = (Statement) con.createStatement();
            st.executeUpdate("INSERT INTO pengembalian ( namaPelanggan, noPolisi, tglPinjam, tglBalik, lama, hargaSewa, totHarga) VALUES ('"+Nama+"', '"+NoPolisi+"', '"+TglPinjam+"', '"+TglBalik+"', '"+Lama+"', '"+HargaSewa+"', '"+TotalHarga+"')");

        }catch(SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

        table();
        del();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:mysql://localhost:3306/rental_mobil",
            user = "root",
            pass = "";
            Connection con = (Connection) DriverManager.getConnection(host, user, pass);

            String Nama = txtNama.getText();

            Statement st = (Statement) con.createStatement();
            st.executeUpdate("DELETE FROM `pengembalian` WHERE namaPelanggan = '"+Nama+"'");
        }catch(SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

        table();
        del();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void LanjutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanjutkanActionPerformed
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_LanjutkanActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void tablePengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePengembalianMouseClicked
        // TODO add your handling code here:
        int row = tablePengembalian.rowAtPoint(evt.getPoint());
        String Nama = tablePengembalian.getValueAt(row, 0).toString();
        txtNama.setText(Nama);
        String NoPolisi = tablePengembalian.getValueAt(row, 1).toString();
        txtNoPolisi.setText(NoPolisi);
        String TglPinjam = tablePengembalian.getValueAt(row, 2).toString();
        txtTglPinjam.setText(TglPinjam);
        String TglBalik = tablePengembalian.getValueAt(row, 3).toString();
        txtTglBalik.setText(TglBalik);
        String Lama = tablePengembalian.getValueAt(row, 4).toString();
        txtLama.setText(Lama);
        String HargaSewa = tablePengembalian.getValueAt(row, 5).toString();
        txtHargaSewa.setText(HargaSewa);
        String TotalHarga = tablePengembalian.getValueAt(row, 6).toString();
        txtHargaAll.setText(TotalHarga);
    }//GEN-LAST:event_tablePengembalianMouseClicked

    private void tablePengembalianAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablePengembalianAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePengembalianAncestorAdded

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lanjutkan;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOK1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbNoPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel subTitle;
    private javax.swing.JTable tablePengembalian;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtHargaAll;
    private javax.swing.JTextField txtHargaSewa;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoPolisi;
    private javax.swing.JTextField txtTglBalik;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
