/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    public double phi = 3.14;
    public double r;
    
    public double hitungLuas(){
        double luas = phi * r;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = phi * 2 * r;
        return keliling;
    }
    
    public void tampil(){
        System.out.println("       OPERASI HITUNG LINGKARAN        ");
        System.out.println("=======================================");
        System.out.println("Jari-jari lingkarang : " + r + " cm");
        System.out.println("Keliling Lingkaran   : " + hitungKeliling() + (" cm"));
        System.out.println("Luas Lingkaran       : " + hitungLuas() + (" cm2"));
        System.out.println("---------------------------------------");
    }
}
