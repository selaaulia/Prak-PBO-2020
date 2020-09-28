/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjam;
    private int pinjam;

    Anggota(String ktp, String nama, int limitPinjam) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public void setKTP(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public String getKTP() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjam;
    }

    public void pinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public void angsur(int angsur) {
        if(angsur >= 0.1 * pinjam){
            pinjam -= angsur;
        }
        else{
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public int getJumlahPinjaman() {
        if (pinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        return pinjam;
    }
    
}
