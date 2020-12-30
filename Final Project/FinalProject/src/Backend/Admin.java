/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author HUAWEI
 */
public class Admin extends Pengguna {

    private int idadmin;

    public Admin() {
    }

    public Admin(String nama, String alamat, String email, String telepon) {
        super(nama, alamat, email, telepon);
        this.idadmin = idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public int getIdadmin() {
        return idadmin;
    }

    @Override
    public Admin getById(int id) {
        Admin a = new Admin();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin "
                + " WHERE idadmin = '" + id + "'");

        try {
            while (rs.next()) {
                a = new Admin();
                a.setIdadmin(rs.getInt("idadmin"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setEmail(rs.getString("email"));
                a.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Admin> getAll() {
        ArrayList<Admin> ListAdmin = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin");

        try {
            while (rs.next()) {
                Admin a = new Admin();
                a.setIdadmin(rs.getInt("idadmin"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setEmail(rs.getString("email"));
                a.setTelepon(rs.getString("telepon"));

                ListAdmin.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAdmin;
    }

    public ArrayList<Admin> search(String keyword) {
        ArrayList<Admin> ListAdmin = new ArrayList();
        String sql = "SELECT * FROM admin WHERE "
                + "     nama LIKE '%" + keyword + "' "
                + "     OR alamat LIKE '%" + keyword + "%' "
                + "     OR email LIKE '%" + keyword + "%' "
                + "     OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Admin a = new Admin();
                a.setIdadmin(rs.getInt("idadmin"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setEmail(rs.getString("email"));
                a.setTelepon(rs.getString("telepon"));

                ListAdmin.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAdmin;
    }

    @Override
    public void save() {
        if (getById(idadmin).getIdadmin() == 0) {
            String SQL = "INSERT INTO admin (nama, alamat, email, telepon) VALUES ("
                    + "        '" + this.nama + "', "
                    + "        '" + this.alamat + "', "
                    + "        '" + this.email + "', "
                    + "        '" + this.telepon + "' "
                    + "        )";
            this.idadmin = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE admin SET "
                    + "     nama =   '" + this.nama + "', "
                    + "     alamat =  '" + this.alamat + "', "
                    + "     email =   '" + this.email + "', "
                    + "     telepon =   '" + this.telepon + "' "
                    + "     WHERE idadmin = '" + this.idadmin + "'";
            DBHelper.executeQuery(SQL);
        } //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        String SQL = "DELETE FROM admin WHERE idadmin = '" + this.idadmin + "'";
        DBHelper.executeQuery(SQL);
    }
}
