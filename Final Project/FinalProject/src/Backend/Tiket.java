/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HUAWEI
 */
public class Tiket {

    private int idtiket;
    private String konser;
    private String kategori;
    private int harga;
    private String tgl;

    public Tiket() {
    }

    public Tiket(String konser, String kategori, int harga, String tgl) {
        this.konser = konser;
        this.kategori = kategori;
        this.harga = harga;
        this.tgl = tgl;
    }

    public void setIdtiket(int idtiket) {
        this.idtiket = idtiket;
    }

    public void setKonser(String konser) {
        this.konser = konser;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga() {
        if (kategori.equalsIgnoreCase("standing A")) {
            harga = 1750000;
        } else if (kategori.equalsIgnoreCase("standing B")) {
            harga = 1500000;
        } else if (kategori.equalsIgnoreCase("seating A")) {
            harga = 2600000;
        } else if (kategori.equalsIgnoreCase("seating B")) {
            harga = 2000000;
        }
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public int getIdtiket() {
        return idtiket;
    }

    public String getKonser() {
        return konser;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }

    public int getHargaMember() {
        return 150000;
    }

    public String getTgl() {
        return tgl;
    }

    public Tiket getById(int id) {
        Tiket t = new Tiket();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM tiket "
                + " WHERE idtiket = '" + id + "'");

        try {
            while (rs.next()) {
                t = new Tiket();
                t.setIdtiket(rs.getInt("idtiket"));
                t.setKonser(rs.getString("konser"));
                t.setKategori(rs.getString("kategori"));
                t.setHarga(rs.getInt("harga"));
                t.setTgl(rs.getString("tanggal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public ArrayList<Tiket> getAll() {
        ArrayList<Tiket> ListTiket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM tiket");

        try {
            while (rs.next()) {
                Tiket t = new Tiket();
                t.setIdtiket(rs.getInt("idtiket"));
                t.setKonser(rs.getString("konser"));
                t.setKategori(rs.getString("kategori"));
                t.setHarga(rs.getInt("harga"));
                t.setTgl(rs.getString("tanggal"));

                ListTiket.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTiket;
    }

    public ArrayList<Tiket> search(String keyword) {
        ArrayList<Tiket> ListTiket = new ArrayList();

        String sql = "SELECT * FROM tiket WHERE "
                + "     konser LIKE '%" + keyword + "' "
                + "     OR kategori LIKE '%" + keyword + "%' "
                + "     OR harga LIKE '%" + keyword + "%' "
                + "     OR tanggal LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Tiket t = new Tiket();
                t.setIdtiket(rs.getInt("idtiket"));
                t.setKonser(rs.getString("konser"));
                t.setKategori(rs.getString("kategori"));
                t.setHarga(rs.getInt("harga"));
                t.setTgl(rs.getString("tanggal"));

                ListTiket.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListTiket;
    }

    public void save() {
        if (getById(idtiket).getIdtiket() == 0) {
            String SQL = "INSERT INTO tiket (konser, kategori, harga, tanggal) VALUES ("
                    + "        '" + this.konser + "', "
                    + "        '" + this.kategori + "', "
                    + "        '" + this.harga + "', "
                    + "        '" + this.tgl + "' "
                    + "        )";
            this.idtiket = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE tiket SET "
                    + "     konser =   '" + this.konser + "', "
                    + "     kategori =   '" + this.kategori + "', "
                    + "     harga =   '" + this.harga + "', "
                    + "     tanggal =   '" + this.tgl + "' "
                    + "     WHERE idtiket = '" + this.idtiket + "'";
            DBHelper.executeQuery(SQL);
        } //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        String SQL = "DELETE FROM tiket WHERE idtiket = '" + this.idtiket + "'";
        DBHelper.executeQuery(SQL);
    }
}
