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
public class Main {

    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.setNama("Budi");
        d1.setSKS(19);

        Pegawai p1 = new Pegawai();
        p1.setNama("Kay");

        DaftarGaji df = new DaftarGaji(2);
        df.addPegawai(d1);
        df.addPegawai(p1);
        df.printSemuaGaji();
    }
}
