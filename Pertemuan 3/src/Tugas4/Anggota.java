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
    private String noKTP;
    private String nama;
    private float limit;
    private float pinjam;
    private float angsuran;
    
    Anggota(String noKTP, String nama){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = 0;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }   
    public String getNoKTP(){
        return noKTP;
    }
    public String getNama(){
        return nama;
    }
    public float getLimitPinjaman(){
        return limit;
    }
    public float getJumlahPinjaman(){
        return pinjam;
    }
    public float getAngsuran(){
        return angsuran;
    }
    
}
