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
public abstract class Pengguna {

    protected String nama;
    protected String alamat;
    protected String email;
    protected String telepon;

    public Pengguna() {

    }

    public Pengguna(String nama, String alamat, String email, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.telepon = telepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getTelepon() {
        return telepon;
    }

    public abstract Pengguna getById(int id);

    public abstract void save();

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.nama + "'";
        DBHelper.executeQuery(SQL);
    }
}
