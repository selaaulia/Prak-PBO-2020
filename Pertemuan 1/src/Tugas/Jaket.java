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
public class Jaket extends Baju {

    private String tipeJaket;

    public void SetTipeJaket(String newValue) {
        tipeJaket = newValue;
   
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Jaket : " + tipeJaket);
              System.out.println("==========================================================");
    }
}
