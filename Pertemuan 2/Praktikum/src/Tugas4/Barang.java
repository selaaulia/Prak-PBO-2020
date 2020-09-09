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
public class Barang {
    public String kode;
    public String nama;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar / 100));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("               BARANG              ");
        System.out.println("===================================");
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Barang : Rp " + hargaDasar);
        System.out.println("Diskon       : " + diskon + " %");
        System.out.println("-----------------------------------");
        System.out.println("Total        : Rp " + hitungHargaJual());
        System.out.println("-----------------------------------");
    }
}
