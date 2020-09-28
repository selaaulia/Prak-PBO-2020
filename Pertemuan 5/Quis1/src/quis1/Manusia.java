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
    private boolean dewasa;

    public Manusia() {

    }

    public Manusia(int umur, String nama, boolean dewasa) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public int getUmur() {
        return umur;
    }

    public String getNama() {
        return nama;
    }

    public boolean isDewasa() {
        return dewasa;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
