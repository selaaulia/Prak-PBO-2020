/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HUAWEI
 */
public class FrmTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form FrmTransaksi
     */
    public FrmTransaksi() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        tampilkanData();
        tampilkanDataAdmin();
        tampilkanDataPembeli();
        tampilkanDataTiket();
        kosongkanForm();
    }

    public boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public void kosongkanForm() {
        txtId.setText("0");
        txtAdmin.setText("");
        txtNamaPembeli.setText("");
        txtJenisPembeli.setText("");
        txtNamaTiket.setText("");
        txtKategoriTiket.setText("");
        txtHarga.setText("");
        txtJumlah.setText("1");
        txtTanggalTransaksi.setText("");
        txtDiskon.setText("");
        txtTotal.setText("");
    }

    public final void tampilkanData() {
        String[] kolom = {"ID", "Karyawan", "Pemesan", "Jenis", "Konser", "Kategori",
            "Harga", "Jumlah", "Tanggal Transaksi", "Potongan", "Total"};
        ArrayList<Transaksi> tr = new Transaksi().getAll();
        Object rowData[] = new Object[11];

        tblTransaksi.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < tr.size(); i++) {
            rowData[0] = tr.get(i).getIdtransaksi();
            rowData[1] = tr.get(i).getAdmin().getNama();
            rowData[2] = tr.get(i).getPembeli().getNama();
            rowData[3] = tr.get(i).getPembeli().getJenis();
            rowData[4] = tr.get(i).getTiket().getKonser();
            rowData[5] = tr.get(i).getTiket().getKategori();
            rowData[6] = tr.get(i).getHargaTiket();
            rowData[7] = tr.get(i).getJumlah();
            rowData[8] = tr.get(i).getTglBeli();
            rowData[9] = tr.get(i).getDiskon();
            rowData[10] = tr.get(i).getTotal();

            ((DefaultTableModel) tblTransaksi.getModel()).addRow(rowData);
        }
    }

    public final void tampilkanDataAdmin() {
        String[] kolom = {"ID", "Nama", "Alamat", "Email", "Telepon"};
        ArrayList<Admin> list = new Admin().getAll();
        Object rowData[] = new Object[5];

        tblAdmin.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Admin ad : list) {
            rowData[0] = ad.getIdadmin();
            rowData[1] = ad.getNama();
            rowData[2] = ad.getAlamat();
            rowData[3] = ad.getEmail();
            rowData[4] = ad.getTelepon();

            ((DefaultTableModel) tblAdmin.getModel()).addRow(rowData);
        }
    }

    public final void tampilkanDataTiket() {
        String[] kolom = {"ID", "Konser", "Kategori", "Harga", "Tanggal"};
        ArrayList<Tiket> list = new Tiket().getAll();
        Object rowData[] = new Object[5];

        tblTiket1.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Tiket tik : list) {
            rowData[0] = tik.getIdtiket();
            rowData[1] = tik.getKonser();
            rowData[2] = tik.getKategori();
            rowData[3] = tik.getHarga();
            rowData[4] = tik.getTgl();

            ((DefaultTableModel) tblTiket1.getModel()).addRow(rowData);
        }
    }

    public final void tampilkanDataPembeli() {
        String[] kolom = {"ID", "NIK", "Nama", "Alamat", "Email", "Telepon", "Jenis"};
        ArrayList<Pembeli> list = new Pembeli().getAll();
        Object rowData[] = new Object[7];

        tblPembeli.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Pembeli p : list) {
            rowData[0] = p.getIdpembeli();
            rowData[1] = p.getNik();
            rowData[2] = p.getNama();
            rowData[3] = p.getAlamat();
            rowData[4] = p.getEmail();
            rowData[5] = p.getTelepon();
            rowData[6] = p.getJenis();

            ((DefaultTableModel) tblPembeli.getModel()).addRow(rowData);
        }
    }

    private boolean checkInput(String jumlah, String tanggalBeli,
            String potongan, String total) {
        boolean res = true;
        if (jumlah.equals("") || tanggalBeli.equals("") || potongan.equals("")
                || total.equals("")) {
            res = false;
        }
        return res;
    }

    public final void cariTiket(String keyword) {
        String[] kolom = {"ID", "Konser", "Kategori", "Harga", "Tanggal"};
        ArrayList<Tiket> list = new Tiket().search(keyword);
        Object rowData[] = new Object[5];

        tblTiket1.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Tiket tik : list) {
            rowData[0] = tik.getIdtiket();
            rowData[1] = tik.getKonser();
            rowData[2] = tik.getKategori();
            rowData[3] = tik.getHarga();
            rowData[4] = tik.getTgl();

            ((DefaultTableModel) tblTiket1.getModel()).addRow(rowData);
        }
    }

    public final void cariAdmin(String keyword) {
        String[] kolom = {"ID", "Nama", "Alamat", "Email", "Telepon"};
        ArrayList<Admin> list = new Admin().search(keyword);
        Object rowData[] = new Object[5];

        tblAdmin.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Admin ad : list) {
            rowData[0] = ad.getIdadmin();
            rowData[1] = ad.getNama();
            rowData[2] = ad.getAlamat();
            rowData[3] = ad.getEmail();
            rowData[4] = ad.getTelepon();

            ((DefaultTableModel) tblAdmin.getModel()).addRow(rowData);
        }
    }

    public final void cariPembeli(String keyword) {
        String[] kolom = {"ID", "NIK", "Nama", "Alamat", "Email", "Telepon", "Jenis"};
        ArrayList<Pembeli> list = new Pembeli().search(keyword);
        Object rowData[] = new Object[7];

        tblPembeli.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Pembeli p : list) {
            rowData[0] = p.getIdpembeli();
            rowData[1] = p.getNik();
            rowData[2] = p.getNama();
            rowData[3] = p.getAlamat();
            rowData[4] = p.getEmail();
            rowData[5] = p.getTelepon();
            rowData[6] = p.getJenis();

            ((DefaultTableModel) tblPembeli.getModel()).addRow(rowData);
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

        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTiket = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamaPembeli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNamaTiket = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        txtTanggalTransaksi = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        txtCariAdmin = new javax.swing.JTextField();
        btnCariAdmin = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPembeli = new javax.swing.JTable();
        txtCariPembeli = new javax.swing.JTextField();
        btnCariPembeli = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTiket1 = new javax.swing.JTable();
        txtCariTiket = new javax.swing.JTextField();
        btnCariTiket = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtJenisPembeli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKategoriTiket = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        tblTiket.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTiketMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTiket);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID");

        jLabel3.setText("Nama Admin");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtAdmin.setEditable(false);
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });

        jLabel5.setText("Nama Pembeli");

        txtNamaPembeli.setEditable(false);

        jLabel7.setText("Nama Konser");

        txtNamaTiket.setEditable(false);

        jLabel11.setText("Jumlah");

        jLabel12.setText("Potongan");

        jLabel13.setText("Total");

        txtDiskon.setEditable(false);

        jButton3.setText("Kembali");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        jLabel9.setText("Tanggal Transaksi");

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel10.setText("Format: YYYY-MM-DD");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setText("TRANSAKSI");

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblAdmin);

        txtCariAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariAdminActionPerformed(evt);
            }
        });

        btnCariAdmin.setText("Cari");
        btnCariAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAdminActionPerformed(evt);
            }
        });

        tblPembeli.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPembeliMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblPembeli);

        txtCariPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariPembeliActionPerformed(evt);
            }
        });

        btnCariPembeli.setText("Cari");
        btnCariPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPembeliActionPerformed(evt);
            }
        });

        tblTiket1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTiket1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTiket1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblTiket1);

        txtCariTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariTiketActionPerformed(evt);
            }
        });

        btnCariTiket.setText("Cari");
        btnCariTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariTiketActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis Pembeli");

        txtJenisPembeli.setEditable(false);
        txtJenisPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisPembeliActionPerformed(evt);
            }
        });

        jLabel8.setText("Kategori Tiket");

        txtKategoriTiket.setEditable(false);

        jLabel14.setText("Harga");

        txtHarga.setEditable(false);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel15.setText("NB : Member mendapatkan harga khusus pada setiap kategori yaitu Rp 150.000");

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel16.setText("Member mendapatkan diskon sebesar 20% jika membeli lebih dari 3 tiket");

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel17.setText("Non Member mendapatkan diskon sebesar 10% dengan pembelian lebih dari 3 tiket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKategoriTiket, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(txtJenisPembeli)
                                            .addComponent(txtNamaTiket)
                                            .addComponent(txtHarga)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(93, 93, 93)
                                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(104, 104, 104)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnTambahBaru)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnHapus))
                                                .addComponent(btnSimpan))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(28, 28, 28)
                                                .addComponent(txtTanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnHitung)))))
                                .addGap(185, 185, 185))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCariAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCariAdmin)))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCariPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCariPembeli))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCariTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariTiket))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCariAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCariAdmin))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNamaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJenisPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNamaTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCariPembeli)
                            .addComponent(txtCariPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtKategoriTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHitung))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSimpan)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnHapus)
                                    .addComponent(btnTambahBaru)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCariTiket)
                                    .addComponent(txtCariTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(74, 74, 74))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void tblTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTiketMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblTiketMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Transaksi tr = new Transaksi();
        boolean res = checkInput(txtJumlah.getText(), txtTanggalTransaksi.getText(),
                txtDiskon.getText(), txtTotal.getText());

        if (res) {
            boolean tglbeli = isValidDate(txtTanggalTransaksi.getText());
            if (tglbeli == false) {
                JOptionPane.showMessageDialog(this, "Format tanggal invalid!");
            } else {
                ArrayList<Admin> admin = new Admin().search(txtAdmin.getText());
                ArrayList<Pembeli> pembeli = new Pembeli().search(txtNamaPembeli.getText());
                ArrayList<Tiket> tiket = new Tiket().search(txtNamaTiket.getText());

                tr.setAdmin(admin.get(0));
                tr.setPembeli(pembeli.get(0));
                tr.setTiket(tiket.get(0));
                tr.setIdtransaksi(Integer.parseInt(txtId.getText()));
                tr.setJumlah(Integer.parseInt(txtJumlah.getText()));
                tr.setTglBeli(txtTanggalTransaksi.getText());
                tr.setDiskon(Integer.parseInt(txtDiskon.getText()));
                tr.setTotal(Integer.parseInt(txtTotal.getText()));
                tr.save();
                if(Integer.parseInt(txtId.getText()) != 0){
                    JOptionPane.showMessageDialog(this, "Transaksi berhasil diupdate");
                }else{
                    JOptionPane.showMessageDialog(this, "Transaksi berhasil");
                }
                tampilkanData();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tambah transaksi gagal!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if (tblTransaksi.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus!");
            kosongkanForm();
        } else {
            DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
            int row = tblTransaksi.getSelectedRow();

            Transaksi tr = new Transaksi().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            tr.delete();
            JOptionPane.showMessageDialog(this, "Transaksi berhasil dihapus");
            kosongkanForm();
            tampilkanData();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
        int row = tblTransaksi.getSelectedRow();

        Transaksi tr = new Transaksi().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        txtId.setText(String.valueOf(tr.getIdtransaksi()));
        txtAdmin.setText(tr.getAdmin().getNama());
        txtNamaPembeli.setText(tr.getPembeli().getNama());
        txtJenisPembeli.setText(tr.getPembeli().getJenis());
        txtNamaTiket.setText(tr.getTiket().getKonser());
        txtKategoriTiket.setText(tr.getTiket().getKategori());
        txtHarga.setText(Integer.toString(tr.getTiket().getHarga()));
        txtJumlah.setText(Integer.toString(tr.getJumlah()));
        txtTanggalTransaksi.setText(tr.getTglBeli());
        txtDiskon.setText(Integer.toString(tr.getDiskon()));
        txtTotal.setText(Integer.toString(tr.getTotal()));
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAdmin.getModel();
        int row = tblAdmin.getSelectedRow();
        Admin admin = new Admin();

        admin = admin.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

        txtAdmin.setText(admin.getNama());
    }//GEN-LAST:event_tblAdminMouseClicked

    private void txtCariAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariAdminActionPerformed

    private void tblPembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPembeliMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPembeli.getModel();
        int row = tblPembeli.getSelectedRow();

        Pembeli pembeli = new Pembeli().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        txtNamaPembeli.setText(pembeli.getNama());
        txtJenisPembeli.setText(pembeli.getJenis());
    }//GEN-LAST:event_tblPembeliMouseClicked

    private void txtCariPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariPembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariPembeliActionPerformed

    private void btnCariPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPembeliActionPerformed
        // TODO add your handling code here:
        if (txtCariPembeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan masukkan keyword pencarian!");
            tampilkanData();
        } else {
            cariPembeli(txtCariPembeli.getText());
        }
    }//GEN-LAST:event_btnCariPembeliActionPerformed

    private void tblTiket1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTiket1MouseClicked
        // TODO add your handling code here:
        if (txtNamaPembeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih pembeli dahulu");
        } else {
            DefaultTableModel model = (DefaultTableModel) tblTiket1.getModel();
            int row = tblTiket1.getSelectedRow();
            DefaultTableModel modelPembeli = (DefaultTableModel) tblPembeli.getModel();
            int rowPembeli = tblPembeli.getSelectedRow();

            Pembeli pembeli = new Pembeli().getById(Integer.parseInt(modelPembeli.getValueAt(rowPembeli, 0).toString()));

            Tiket tik = new Tiket().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            Transaksi tr = new Transaksi();
            tr.setTiket(tik);
            tr.setPembeli(pembeli);
            txtNamaTiket.setText(tik.getKonser());
            txtKategoriTiket.setText(tik.getKategori());
            txtHarga.setText(Integer.toString(tr.getHargaTiket()));
        }
    }//GEN-LAST:event_tblTiket1MouseClicked

    private void txtCariTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariTiketActionPerformed

    private void btnCariTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariTiketActionPerformed
        // TODO add your handling code here:
        if (txtCariTiket.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan masukkan keyword pencarian!");
            tampilkanData();
        } else {
            cariTiket(txtCariTiket.getText());
        }
    }//GEN-LAST:event_btnCariTiketActionPerformed

    private void txtJenisPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisPembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisPembeliActionPerformed

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        Transaksi tr = new Transaksi().getById(Integer.parseInt(txtId.getText()));
        DefaultTableModel model = (DefaultTableModel) tblTiket1.getModel();
        int row = tblTiket1.getSelectedRow();
        DefaultTableModel modelPembeli = (DefaultTableModel) tblPembeli.getModel();
        int rowPembeli = tblPembeli.getSelectedRow();

        Tiket tik = new Tiket().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        Pembeli pembeli = new Pembeli().getById(Integer.parseInt(modelPembeli.getValueAt(rowPembeli, 0).toString()));
        tr.setJumlah(Integer.parseInt(txtJumlah.getText()));
        tr.setTiket(tik);
        tr.Pembayaran(pembeli);
        
        txtDiskon.setText(Integer.toString(tr.getDiskon()));
        txtTotal.setText(Integer.toString(tr.getTotal()));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAdminActionPerformed
        // TODO add your handling code here:
        if (txtCariAdmin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan masukkan keyword pencarian!");
            tampilkanData();
        } else {
            cariAdmin(txtCariAdmin.getText());
        }
    }//GEN-LAST:event_btnCariAdminActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAdmin;
    private javax.swing.JButton btnCariPembeli;
    private javax.swing.JButton btnCariTiket;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTable tblPembeli;
    private javax.swing.JTable tblTiket;
    private javax.swing.JTable tblTiket1;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtCariAdmin;
    private javax.swing.JTextField txtCariPembeli;
    private javax.swing.JTextField txtCariTiket;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJenisPembeli;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKategoriTiket;
    private javax.swing.JTextField txtNamaPembeli;
    private javax.swing.JTextField txtNamaTiket;
    private javax.swing.JTextField txtTanggalTransaksi;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
