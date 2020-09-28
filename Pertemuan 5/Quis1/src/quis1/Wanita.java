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
public class Wanita extends Manusia {

    private Pria suami;
    private Manusia anak;

    public Wanita() {

    }
    public Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
        this.suami = suami;
        this.anak = anak;
    }
    
    public void tambahAturan(){
        if (umur >= 22){
            setDewasa(true);
            System.out.println("Telah menikah");
            System.out.println("-----Suami-----");
            
            System.out.println("-----Anak------");
        } else{
            System.out.println("Wanita ini masih kuliah");
        }
    }
    
    public void infoWanita(){
        System.out.println("-----INFORMASI WANITA------");
        super.info();
        tambahAturan();
    }
}
