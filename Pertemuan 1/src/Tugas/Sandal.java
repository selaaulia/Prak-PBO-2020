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
public class Sandal {
    private String merek;
    private String bahan;
    private String warna;
    private int ukuran;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setBahan(String newValue){
        bahan = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void setUkuran(int newValue){
        ukuran = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Bahan : " + bahan);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran : " + ukuran);
    }
}
