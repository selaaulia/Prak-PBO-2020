/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author HUAWEI
 */
public class Pembeli extends Pengguna implements IPembayaran {

    private int idpembeli;
    private String nik;
    private String jenis;

    public Pembeli() {

    }

    public Pembeli(String nik, String nama, String alamat, String email, String telepon, String jenis) {
        super(nama, alamat, email, telepon);
        this.nik = nik;
        this.jenis = jenis;
    }

    public void setIdpembeli(int idpembeli) {
        this.idpembeli = idpembeli;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getIdpembeli() {
        return idpembeli;
    }

    public String getNik() {
        return nik;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public Pembeli getById(int id) {
        Pembeli pem = new Pembeli();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembeli "
                + " WHERE idpembeli = '" + id + "'");

        try {
            while (rs.next()) {
                pem = new Pembeli();
                pem.setIdpembeli(rs.getInt("idpembeli"));
                pem.setNik(rs.getString("nik"));
                pem.setNama(rs.getString("nama"));
                pem.setAlamat(rs.getString("alamat"));
                pem.setEmail(rs.getString("email"));
                pem.setTelepon(rs.getString("telepon"));
                pem.setJenis(rs.getString("jenis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Pembeli> getAll() {
        ArrayList<Pembeli> ListPembeli = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembeli");

        try {
            while (rs.next()) {
                Pembeli pem = new Pembeli();
                pem.setIdpembeli(rs.getInt("idpembeli"));
                pem.setNik(rs.getString("nik"));
                pem.setNama(rs.getString("nama"));
                pem.setAlamat(rs.getString("alamat"));
                pem.setEmail(rs.getString("email"));
                pem.setTelepon(rs.getString("telepon"));
                pem.setJenis(rs.getString("jenis"));

                ListPembeli.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPembeli; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Pembeli> search(String keyword) {
        ArrayList<Pembeli> ListPembeli = new ArrayList();

        String sql = "SELECT * FROM pembeli WHERE "
                + "     nik LIKE '%" + keyword + "%' "
                + "     OR nama LIKE '%" + keyword + "%' "
                + "     OR alamat LIKE '%" + keyword + "%' "
                + "     OR email LIKE '%" + keyword + "%' "
                + "     OR telepon LIKE '%" + keyword + "%' "
                + "     OR jenis LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Pembeli pem = new Pembeli();
                pem.setIdpembeli(rs.getInt("idpembeli"));
                pem.setNik(rs.getString("nik"));
                pem.setNama(rs.getString("nama"));
                pem.setAlamat(rs.getString("alamat"));
                pem.setEmail(rs.getString("email"));
                pem.setTelepon(rs.getString("telepon"));
                pem.setJenis(rs.getString("jenis"));

                ListPembeli.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPembeli;
    }

    @Override
    public void save() {
        if (getById(idpembeli).getIdpembeli() == 0) {
            String SQL = "INSERT INTO pembeli (nik, nama, alamat, email, telepon,jenis) Values("
                    + "        '" + this.nik + "', "
                    + "        '" + this.nama + "', "
                    + "        '" + this.alamat + "', "
                    + "        '" + this.email + "', "
                    + "        '" + this.telepon + "', "
                    + "        '" + this.jenis + "' "
                    + "        )";
            this.idpembeli = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pembeli SET "
                    + "     nik =   '" + this.nik + "', "
                    + "     nama =   '" + this.nama + "', "
                    + "     alamat =  '" + this.alamat + "', "
                    + "     email =   '" + this.email + "', "
                    + "     telepon =   '" + this.telepon + "', "
                    + "     jenis =     '" + this.jenis + "' "
                    + "     WHERE idpembeli = '" + this.idpembeli + "'";
            DBHelper.executeQuery(SQL);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete() {
        String SQL = "DELETE FROM pembeli WHERE idpembeli = '" + this.idpembeli + "'";
        DBHelper.executeQuery(SQL);
    }

    @Override
    public int diskon(int harga, int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int total(int harga, int jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
