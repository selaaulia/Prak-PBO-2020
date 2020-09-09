/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class Game {
    public String id;
    public String member;
    public String game;
    public int sewa;
    
    public int hitungHargaBayar(){
        int hargaBayar = sewa * 50000;
        return hargaBayar;
    }
    
    public void tampil(){
        System.out.println("           VIDEO GAME          ");
        System.out.println("===============================");
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + member);
        System.out.println("Nama Game   : " + game);
        System.out.println("Lama Sewa   : " + sewa + " hari");
        System.out.println("-------------------------------");
        System.out.println("Harga Bayar : Rp " + hitungHargaBayar());
        System.out.println("-------------------------------");
    }
}
