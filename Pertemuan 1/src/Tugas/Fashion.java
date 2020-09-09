/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Asus
 */
public class Fashion {
    public static void main(String[] args) {
        Baju bj1 = new Baju();
        Baju bj2 = new Baju();
        Jaket jk = new Jaket();
      
        bj1.setMerek("Zara");
        bj1.setUkuran("M");
        bj1.setWarna("Hitam");
        bj1.cetakStatus();
        System.out.println("---------------------------------------------------------");
        
        bj2.setMerek("H&M");
        bj2.setUkuran("L");
        bj2.setWarna("Putih");
        bj2.cetakStatus();
        System.out.println("---------------------------------------------------------");
        
        jk.setMerek("H&M");
        jk.setUkuran("L");
        jk.setWarna("Abu");
        jk.SetTipeJaket("Parka");
        jk.cetakStatus();
        
        Sandal sd1 = new Sandal();
        Sandal sd2 = new Sandal();
        Sepatu sp = new Sepatu();
        
        sd1.setMerek("Nevada");
        sd1.setBahan("Karet");
        sd1.setWarna("Navy");
        sd1.setUkuran(38);
        sd1.cetakStatus();
        System.out.println("---------------------------------------------------------");
        
        sd2.setMerek("Fladeo");
        sd2.setBahan("Kulit");
        sd2.setWarna("Coklat");
        sd2.setUkuran(42);
        sd2.cetakStatus();
        System.out.println("---------------------------------------------------------");
        
        sp.setMerek("Converse");
        sp.setBahan("Kain");
        sp.setWarna("Putih");
        sp.setUkuran(38);
        sp.SetModel("High");
        sp.SetWarnaTali("Putih");
        sp.cetakStatus();

    }
}
