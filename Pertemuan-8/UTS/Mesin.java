/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Asus
 */
public class Mesin {

    private String merek;
    private double kecepatan = 0;

    public Mesin() {

    }

    public void setMerek(String merekMesin) {
        merek = merekMesin;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if (merek.equals("Honda")){
            if(kecepatan <= 100){
                kecepatan += 10;
                System.out.println(kecepatan + "km/jam");
            }else{
                System.out.println("Kecepatan Maksimum 100");
            }
        }
        else if(merek.equals("Yamaha")){
            if(kecepatan <= 100){
                kecepatan += 15;
                System.out.println(kecepatan + "km/jam");
            }else{
                System.out.println("Kecepatan Maksimum 100");
            }
        }
    }

    public void kurangiKecepatan() {
        if (merek == "Honda"){
            if(kecepatan <= 0){
                System.out.println("Kecepatan Minimum 0");
            }else{
                kecepatan -= 5;
                System.out.println(kecepatan + "km/jam");
            }
        }
        else if(merek == "Yamaha"){
            if(kecepatan <= 0){
                System.out.println("Kecepatan Minimum 0");
            }else{
                kecepatan -= 10;
                System.out.println(kecepatan + "km/jam");
            }
        }
    }
}
