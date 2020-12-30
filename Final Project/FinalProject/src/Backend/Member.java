/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author HUAWEI
 */
public class Member extends Pembeli {

    private String jenis;
    private int total;
    private int diskon;

    public Member() {

    }

   public Member(String nik, String nama, String alamat, String email, String telepon, 
            String jenis) {
        super(nik, nama, alamat, email, telepon, jenis);
    }
    
    @Override
    public int diskon(int harga, int jumlah) {
        double diskon;
        harga = 150000;
        int diskonHarga = 0;
        if (jumlah > 3) {
            diskon = (int) harga * 0.2;
            diskonHarga = (int) diskon * jumlah;
        }
        return diskonHarga;
    }

    @Override
    public int total(int harga, int jumlah) {
        harga = 150000;
        int total = (harga * jumlah) - diskon(harga,jumlah);
        return total;
    }
}
