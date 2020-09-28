/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4.Tugas;

/**
 *
 * @author Asus
 */
public class Kereta {
    private String nama;
    private String kelas;
    private String kode;
    private Kursi[] arrayKursi;
    private Petugas masinis;
    private Petugas coMasinis;
    
    Kereta (String nama, String kelas, Petugas masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    Kereta (String nama, String kelas, Petugas masinis, Petugas coMasinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.coMasinis = coMasinis;
    }
    
     public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    private void initKursi() {
        for(int i=0; i<arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    Kereta (String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    
    public String info1() {
        String info = "";
        info += "-------INFORMASI PESAWAT -------------\n";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        info += "Co-Masinis : " + this.coMasinis.info() + "\n";
        return info;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}
