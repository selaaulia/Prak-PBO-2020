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
public class Dosen extends Pegawai {

    private int SKS;
    private int TARIF_SKS = 120000;

    public Dosen() {

    }

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    @Override
    public int getGaji() {
        int totalGaji = SKS * TARIF_SKS;
        return totalGaji + super.getGaji();
    }
}
