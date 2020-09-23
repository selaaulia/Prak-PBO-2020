/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4.percobaan4;

/**
 *
 * @author Asus
 */
public class Penumpang {

    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKTP(String ktp) {
        this.ktp = ktp;
    }

    public String getKTP() {
        return ktp;
    }

    public void setNama(String Nama) {
        this.nama = nama;
    }

    public String Nama() {
        return nama;
    }

    public String info() {
        String info = " ";
        info += "KTP : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}
