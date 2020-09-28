/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4.Tugas;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345678", "Septian Alvaro");
        Pesawat pesawat = new Pesawat("US123", 10);
        pesawat.setPenumpang(p, 1);
        System.out.println(pesawat.info());
        
        Petugas pilot = new Petugas("23456789", "Galaksi Aldebaran");
        Petugas coPilot = new Petugas("23456788", "Bams Apriliano");
        Pesawat p1 = new Pesawat("Garuda Indonesia", "First Class", pilot, coPilot);
        System.out.println(p1.info1());
    } 
}
