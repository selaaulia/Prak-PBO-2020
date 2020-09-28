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
public class Main {

    public static void main(String[] args) {
        
        Pria p1 = new Pria();
        Pria p2 = new Pria();
        Wanita w1 = new Wanita();
        Wanita w2 = new Wanita();
        Wanita w3 = new Wanita();
        System.out.println("======================================");
        System.out.println("         Umur diatas 22 tahun         ");
        System.out.println("======================================");
        p1.setNama("Lucas");
        p1.setUmur(30);
        p1.setNamaIstri(w1);
        
        w1.setNama("Lulu");
        w1.setUmur(25);
        w1.setNamaSuami(p1);
        w1.setNamaAnak(p1);
        
        w2.setNama("Sean");
        w2.setUmur(17);
        
        p1.info();
        w1.info();
        w2.info();
        
        System.out.println("======================================");
        System.out.println("       Umur di bawah 22 tahun         ");
        System.out.println("======================================");
        p2.setNama("Alvaro");
        p2.setUmur(19);
        p2.info();
        w3.setNama("Steffi");
        w3.setUmur(15);
        w3.info();
    }
}
