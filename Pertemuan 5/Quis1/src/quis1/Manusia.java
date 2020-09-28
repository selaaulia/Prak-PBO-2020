/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1;

/**
 *
 * @author Asus
 */
public class Manusia {

    public int umur;
    public String nama;
    boolean dewasa;

    public Manusia() {

    }

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa = false;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }

    public boolean getDewasa() {
        return dewasa;
    }

    public void info() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
    }
}
