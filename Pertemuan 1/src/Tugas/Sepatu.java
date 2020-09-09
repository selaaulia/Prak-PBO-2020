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
public class Sepatu extends Sandal {
    private String warnaTali;
    private String model;

    public void SetWarnaTali(String newValue) {
        warnaTali = newValue;
   
    }
    public void SetModel(String newValue){
        model = newValue;
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Warna Tali : " + warnaTali);
        System.out.println("Model Sepatu : " + model);
              System.out.println("=========================================================");
    }
}
