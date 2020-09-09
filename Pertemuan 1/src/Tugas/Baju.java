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
public class Baju {
    private String merek;
    private String warna;
    private String ukuran;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void setUkuran(String newValue){
        ukuran = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran : " + ukuran);
  
    }
}
