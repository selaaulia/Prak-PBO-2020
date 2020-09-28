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
public class Pria extends Manusia {

    private Wanita istri;

    public Pria() {

    }

    public Pria(Wanita istri, int umur, String nama, boolean dewasa) {
        this.istri = istri;
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public void tambahAturan() {
        if (umur >= 22) {
            setDewasa(true);
            System.out.println("Telah Menikah");
        } else {
            System.out.println("Pria ini masih kuliah");
        }
    }

    public void infoPria() {
        System.out.println("----INFORMASI PRIA------");
        super.info();
        tambahAturan();
    }
}
