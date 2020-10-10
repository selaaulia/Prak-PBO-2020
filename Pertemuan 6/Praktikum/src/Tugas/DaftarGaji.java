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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int pegawaiSekarang = 0;
    
    public DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    public void addPegawai(Pegawai p){
        listPegawai[pegawaiSekarang] = p;
        pegawaiSekarang++;
    }
    public void printSemuaGaji(){
        for(int i=0; i<pegawaiSekarang; i++){
            System.out.print(listPegawai[i].getNama()+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
