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

    private Pria namaSuami;
    private Manusia namaAnak;

    public Wanita() {

    }

    public Wanita(Pria namaSuami, Manusia namaAnak, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.namaSuami = namaSuami;
        this.namaAnak = namaAnak;
    }

    public Pria getNamaSuami() {
        return namaSuami;
    }

    public Manusia getNamaAnak() {
        return namaAnak;
    }

    public void setNamaSuami(Pria namaSuami) {
        this.namaSuami = namaSuami;
    }

    public void setNamaAnak(Manusia namaAnak) {
        this.namaAnak = namaAnak;
    }

    public void aturanUmur() {
        if (umur >= 20) {
            setDewasa(true);
            System.out.println("Dewasa : " + isDewasa());
            System.out.println("Dewasa dan memiliki Suami dan Anak");
            System.out.println("Nama Suami : " + namaSuami.getNama());
            System.out.println("Nama Anak : " + namaAnak.getNama());
        } else {
            setDewasa(false);
            System.out.println("Dewasa : " + isDewasa());
            System.out.println("Wanita ini masih kuliah");
        }
    }

    @Override
    public void info() {
        super.info();
        aturanUmur();
        System.out.println("============================");
    }
}
