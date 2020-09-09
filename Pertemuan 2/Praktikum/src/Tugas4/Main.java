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
public class Main {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        Barang br2 = new Barang();
        
        br1.kode = ("00001");
        br1.nama = ("Kemeja");
        br1.diskon = 10;
        br1.hargaDasar = 200000;
        br1.hitungHargaJual();
        br1.tampilData();
        
        br2.kode = ("00002");
        br2.nama = ("Jaket");
        br2.diskon = 5;
        br2.hargaDasar = 300000;
        br2.hitungHargaJual();
        br2.tampilData();
    }
}
