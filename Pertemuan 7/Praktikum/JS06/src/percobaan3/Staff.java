/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Asus
 */
public class Staff extends Karyawan{
    public int lembur, potongan;

    public Staff() {
    }

    public Staff(String nama,String alamat,String jk,int umur,int gaji,int lembur, int potongan) {
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        System.out.println("Nama            =" + nama);
        System.out.println("Alamat          =" + alamat);
        System.out.println("Jenis Kelamin   =" + jk);
        System.out.println("Umur            =" + umur);
        System.out.println("Gaji            =" + gaji);
        System.out.println("Lembur          =" + lembur);
        System.out.println("Potongan        =" + potongan);
        System.out.println("Total gaji      =" +(gaji+lembur+potongan));
    } 
}
