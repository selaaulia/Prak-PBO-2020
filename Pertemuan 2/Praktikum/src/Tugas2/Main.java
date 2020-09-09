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
public class Main {
    public static void main(String[] args) {
        Game gm1 = new Game();
        Game gm2 = new Game();
        
        gm1.id = ("00001");
        gm1.member = ("BAYU");
        gm1.game = ("Minecraft");
        gm1.sewa = 4;
        gm1.hitungHargaBayar();
        gm1.tampil();
        
        gm2.id = ("00002");
        gm2.member = ("ALDO");
        gm2.game = ("Free Fire");
        gm2.sewa = 6;
        gm2.hitungHargaBayar();
        gm2.tampil();
    }
}
