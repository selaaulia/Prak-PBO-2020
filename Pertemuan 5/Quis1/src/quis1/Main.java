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
        Manusia m = new Manusia();
        Pria p = new Pria();
        Wanita w = new Wanita();
        
        System.out.println("======================================");
        System.out.println("         Umur diatas 22 tahun         ");
        System.out.println("======================================");
        Pria p1 = new Pria();
        p1.setNama("Lucas");
        p1.setUmur(27);
        p1.infoPria();
        Wanita w1 = new Wanita();
        w1.setNama("Alexa");
        w1.setUmur(24);
        w1.infoWanita();
        Manusia m1 = new Manusia();
        m1.setNama("Sean");
        m1.setUmur(4);
        m1.info();
        System.out.println();
        System.out.println("======================================");
        System.out.println("       Umur di bawah 22 tahun         ");
        System.out.println("======================================");
        Pria p2 = new Pria();
        p2.setNama("Alvaro");
        p2.setUmur(19);
        p2.infoPria();
        Wanita w2 = new Wanita();
        w2.setNama("Steffi");
        w2.setUmur(15);
        w2.infoWanita();
    }
}
