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

    private Wanita namaIstri;

    public Pria() {

    }

    public Pria(Wanita namaIstri, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.namaIstri = namaIstri;
    }

    public void setNamaIstri(Wanita namaIstri) {
        this.namaIstri = namaIstri;
    }

    public Wanita getNamaIstri() {
        return namaIstri;
    }

    public void aturanUmur() {
        if (umur >= 22) {
            setDewasa(true);
            System.out.println("Dewasa : " + isDewasa());
            System.out.println("Dewasa dan memiliki istri");
            System.out.println("Nama Istri : " + namaIstri.getNama());
        } else {
            setDewasa(false);
            System.out.println("Dewasa : " + isDewasa());
            System.out.println("Pria ini masih kuliah");
        }
    }

    @Override
    public void info() {
        super.info();
        aturanUmur();
        System.out.println("============================");
    }

}
