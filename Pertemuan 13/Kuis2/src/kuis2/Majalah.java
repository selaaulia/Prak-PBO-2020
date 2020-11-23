/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author SelaAulia
 */
public class Majalah extends MediaInformasi{
    @Override
    public void setJMLHalaman(int jml){
        super.setJMLHalaman(jml);
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut: " + (jml+2));
    }
    
    @Override
    public void reputasi(){
        super.reputasi();
        System.out.println("Penerbit majalah ini bereputasi!");
    }
}
