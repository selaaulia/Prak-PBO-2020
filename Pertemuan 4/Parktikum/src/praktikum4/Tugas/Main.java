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
        Kereta kereta = new Kereta("Gerbong 1", 10);
        kereta.setPenumpang(p, 1);
        System.out.println(kereta.info());
        
        Petugas masinis = new Petugas("23456789", "Galaksi Aldebaran");
        Petugas coMasinis = new Petugas("23456788", "Bams Apriliano");
        Kereta p1 = new Kereta("Jenggala", "Ekonomi", masinis, coMasinis);
        System.out.println(p1.info1());
    } 
}
