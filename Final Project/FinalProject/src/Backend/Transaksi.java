/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author HUAWEI
 */
public class Transaksi {

    private int idtransaksi;
    private Pembeli pembeli = new Pembeli();
    private Admin admin = new Admin();
    private Tiket tiket = new Tiket();
    private int jumlah;
    private String tglBeli;
    private int diskon;
    private int total;

    public Transaksi() {
    }

    public Transaksi(Pembeli pembeli, Admin admin, Tiket tiket, int jumlah, String tglBeli, int diskon, int total) {
        this.pembeli = pembeli;
        this.admin = admin;
        this.tiket = tiket;
        this.jumlah = jumlah;
        this.tglBeli = tglBeli;
        this.diskon = diskon;
        this.total = total;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTglBeli(String tglBeli) {
        this.tglBeli = tglBeli;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdtransaksi() {
        return idtransaksi;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getTglBeli() {
        return tglBeli;
    }

    public int getDiskon() {
        return diskon;
    }

    public int getTotal() {
        return total;
    }

    public int getHargaTiket() {
        int harga = 0;
        if (this.getPembeli().getJenis().equalsIgnoreCase("member")) {
            harga = this.getTiket().getHargaMember();
        } else if (this.getPembeli().getJenis().equalsIgnoreCase("non member")) {
            harga = this.getTiket().getHarga();
        }
        return harga;
    }

    public void Pembayaran(Pembeli pembeli) {
        int diskon;
        if (pembeli.getJenis().equalsIgnoreCase("member")) {
            pembeli = new Member();
            diskon = pembeli.diskon(this.getTiket().getHarga(), jumlah);
            this.setDiskon(diskon);
            this.setTotal(pembeli.total(this.getTiket().getHarga(), jumlah));
        } else if (pembeli.getJenis().equalsIgnoreCase("non member")) {
            pembeli = new NonMember();
            diskon = pembeli.diskon(this.getTiket().getHarga(), jumlah);
            this.setDiskon(diskon);
            this.setTotal(pembeli.total(this.getTiket().getHarga(), jumlah));
        }
    }

    public Transaksi getById(int id) {
        Transaksi tr = new Transaksi();
        ResultSet rs = DBHelper.selectQuery("SELECT tr.*, a.idadmin as idadmin, "
                + "a.nama as namaadmin, p.idpembeli as idpembeli, p.nama as namapembeli, p.jenis as jenis, "
                + "t.* FROM transaksi tr LEFT JOIN admin a ON tr.idadmin = a.idadmin "
                + "LEFT JOIN pembeli p ON tr.idpembeli = p.idpembeli "
                + "LEFT JOIN tiket t ON tr.idtiket = t.idtiket"
                + " WHERE idtransaksi = '" + id + "'");

        try {
            while (rs.next()) {
                tr = new Transaksi();

                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTglBeli(rs.getString("tglbeli"));
                tr.setDiskon(rs.getInt("diskon"));
                tr.setTotal(rs.getInt("total"));

                //Admin
                tr.getAdmin().setIdadmin(rs.getInt("idadmin"));
                tr.getAdmin().setNama(rs.getString("namaadmin"));

                //Pembeli
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNama(rs.getString("namapembeli"));
                tr.getPembeli().setJenis(rs.getString("jenis"));

                //Tiket
                tr.getTiket().setIdtiket(rs.getInt("idtiket"));
                tr.getTiket().setKonser(rs.getString("konser"));
                tr.getTiket().setKategori(rs.getString("kategori"));
                tr.getTiket().setHarga(rs.getInt("harga"));
                tr.getTiket().setTgl(rs.getString("tanggal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tr;
    }

    public ArrayList<Transaksi> getAll() {
        ArrayList<Transaksi> Transaksi = new ArrayList();
        String query = "SELECT tr.*, a.idadmin as idadmin, "
                + "a.nama as namaadmin, p.idpembeli as idpembeli, p.nama as namapembeli, p.jenis as jenis, "
                + "t.* FROM transaksi tr LEFT JOIN admin a ON tr.idadmin = a.idadmin "
                + "LEFT JOIN pembeli p ON tr.idpembeli = p.idpembeli "
                + "LEFT JOIN tiket t ON tr.idtiket = t.idtiket ";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Transaksi tr = new Transaksi();

                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTglBeli(rs.getString("tglbeli"));
                tr.setDiskon(rs.getInt("diskon"));
                tr.setTotal(rs.getInt("total"));

                //Admin
                tr.getAdmin().setIdadmin(rs.getInt("idadmin"));
                tr.getAdmin().setNama(rs.getString("namaadmin"));

                //Pembeli
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNama(rs.getString("namapembeli"));
                tr.getPembeli().setJenis(rs.getString("jenis"));

                //Tiket
                tr.getTiket().setIdtiket(rs.getInt("idtiket"));
                tr.getTiket().setKonser(rs.getString("konser"));
                tr.getTiket().setKategori(rs.getString("kategori"));
                tr.getTiket().setHarga(rs.getInt("harga"));
                tr.getTiket().setTgl(rs.getString("tanggal"));

                Transaksi.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Transaksi;
    }

    public ArrayList<Transaksi> search(String keyword) {
        ArrayList<Transaksi> ListTransaksi = new ArrayList();

        String query = "SELECT tr.*, a.idadmin as idadmin, "
                + "a.nama as namaadmin, p.idpembeli as idpembeli, p.nama as namapembeli, p.jenis as jenis, "
                + "t.* FROM transaksi tr LEFT JOIN admin a ON tr.idadmin = a.idadmin "
                + "LEFT JOIN pembeli p ON p.idpembeli = tr.idpembeli "
                + "LEFT JOIN tiket t ON t.idtiket = tr.idtiket "
                + "WHERE a.nama LIKE '%" + keyword + "%'"
                + "OR p.nama LIKE '%" + keyword + "%'"
                + "OR t.konser LIKE '%" + keyword + "%'"
                + "OR t.kategori LIKE '%" + keyword + "%'"
                + "OR t.harga LIKE '%" + keyword + "%'"
                + "OR t.tanggal LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Transaksi tr = new Transaksi();
                tr.setIdtransaksi(rs.getInt("idtransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTglBeli(rs.getString("tglbeli"));
                tr.setDiskon(rs.getInt("diskon"));
                tr.setTotal(rs.getInt("total"));

                //Admin
                tr.getAdmin().setIdadmin(rs.getInt("idadmin"));
                tr.getAdmin().setNama(rs.getString("namaadmin"));

                //Pembeli
                tr.getPembeli().setIdpembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNama(rs.getString("namapembeli"));
                tr.getPembeli().setJenis(rs.getString("jenis"));

                //Tiket
                tr.getTiket().setIdtiket(rs.getInt("idtiket"));
                tr.getTiket().setKonser(rs.getString("konser"));
                tr.getTiket().setKategori(rs.getString("kategori"));
                tr.getTiket().setHarga(rs.getInt("harga"));
                tr.getTiket().setTgl(rs.getString("tanggal"));

                ListTransaksi.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTransaksi;
    }

    public void save() {
        if (getById(idtransaksi).getIdtransaksi() == 0) {
            try {
                String SQL = "INSERT INTO transaksi (idadmin, idpembeli, idtiket, jumlah, tglbeli, diskon, total) VALUES("
                        + "'" + this.getAdmin().getIdadmin() + "',"
                        + "'" + this.getPembeli().getIdpembeli() + "',"
                        + "'" + this.getTiket().getIdtiket() + "',"
                        + "'" + this.jumlah + "',"
                        + "'" + this.tglBeli + "',"
                        + "'" + this.diskon + "',"
                        + "'" + this.total + "'"
                        + ")";

                this.idtransaksi = DBHelper.insertQueryGetId(SQL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String SQL = "UPDATE transaksi SET "
                    + "idadmin = '" + this.getAdmin().getIdadmin() + "',"
                    + "idpembeli = '" + this.getPembeli().getIdpembeli() + "',"
                    + "idtiket = '" + this.getTiket().getIdtiket() + "',"
                    + "jumlah = '" + this.jumlah + "',"
                    + "tglbeli = '" + this.tglBeli + "',"
                    + "diskon = '" + this.diskon + "',"
                    + "total = '" + this.total + "'"
                    + "WHERE idtransaksi = '" + this.idtransaksi + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM transaksi WHERE idtransaksi = '" + this.idtransaksi + "'";
        DBHelper.executeQuery(SQL);
    }
}
