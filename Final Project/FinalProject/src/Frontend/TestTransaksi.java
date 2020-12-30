/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Admin;
import Backend.Member;
import Backend.Pembeli;
import Backend.Tiket;
import Backend.Transaksi;

/**
 *
 * @author HUAWEI
 */
public class TestTransaksi {

    public static void main(String[] args) {
        Admin a1 = new Admin().getById(22);
        Admin a2 = new Admin().getById(23);

        Pembeli p1 = new Pembeli().getById(32);
        Pembeli p2 = new Pembeli().getById(33);
        Pembeli p3 = new Pembeli().getById(34);

        Tiket t1 = new Tiket().getById(41);
        Tiket t2 = new Tiket().getById(42);
        Tiket t3 = new Tiket().getById(45);

        Transaksi tr1 = new Transaksi();
        tr1.setAdmin(a1);
        tr1.setPembeli(p1);
        tr1.setTiket(t1);
        tr1.setJumlah(5);
        tr1.setTglBeli("2020-11-17");
        tr1.getTiket().setHarga(150000);
        tr1.Pembayaran(p1);

        Transaksi tr2 = new Transaksi();
        tr2.setAdmin(a2);
        tr2.setPembeli(p2);
        tr2.setTiket(t2);
        tr2.setJumlah(1);
        tr2.setTglBeli("2020-11-20");
        tr2.getTiket().setHarga(150000);
        tr2.Pembayaran(p2);

        Transaksi tr3 = new Transaksi();
        tr3.setAdmin(a2);
        tr3.setPembeli(p3);
        tr3.setTiket(t3);
        tr3.setJumlah(8);
        tr3.setTglBeli("2020-11-25");
        tr3.Pembayaran(p3);

        // Test Insert
        tr1.save();
        tr2.save();
        tr3.save();

        // Test Delete
        tr2.delete();

        // Test Update
        tr1.setJumlah(1);
        tr1.Pembayaran(p1);
        tr1.save();

        // Test getAll
        System.out.println("Test menampilkan seluruh data transaksi");
        System.out.println("======================================================");
        for (Transaksi tr : new Transaksi().getAll()) {
            System.out.println("Nama Admin: " + tr.getAdmin().getNama() + ", Nama Pembeli: " + tr.getPembeli().getNama()
                    + ", Jenis: " + tr.getPembeli().getJenis() + ", Nama Konser: " + tr.getTiket().getKonser() + ", Kategori: " + tr.getTiket().getKategori()
                    + ", \nHarga Tiket: " + tr.getHargaTiket() + ", Jumlah: " + tr.getJumlah()
                    + ", Tanggal Beli: " + tr.getTglBeli() + ", Diskon: " + tr.getDiskon() + ", Total: " + tr.getTotal());
            System.out.println("======================================================");
        }
        System.out.println();

        // Test getbyid
        System.out.println("Test menampilkan transaksi dengan id = 32");
        System.out.println("======================================================");
        Transaksi tr4 = new Transaksi().getById(32);
        System.out.println("Nama Admin: " + tr4.getAdmin().getNama() + ", Nama Pembeli: " + tr4.getPembeli().getNama()
                + ", Jenis: " + tr4.getPembeli().getJenis() + ", Nama Konser: " + tr4.getTiket().getKonser() + ", Kategori: " + tr4.getTiket().getKategori()
                + ", \nHarga Tiket: " + tr4.getHargaTiket() + ", Jumlah: " + tr4.getJumlah()
                + ", Tanggal Beli: " + tr4.getTglBeli() + ", Diskon: " + tr4.getDiskon() + ", Total: " + tr4.getTotal());
        System.out.println("======================================================");
        System.out.println();

        // Test Search
        System.out.println("Test mencari data transaksi berdasarkan nama pembeli");
        System.out.println("======================================================");
        for (Transaksi tr5 : new Transaksi().search("januar")) {
            System.out.println("Nama Admin: " + tr5.getAdmin().getNama() + ", Nama Pembeli: " + tr5.getPembeli().getNama()
                    + ", Jenis: " + tr5.getPembeli().getJenis() + ", Nama Konser: " + tr5.getTiket().getKonser() + ", Kategori: " + tr5.getTiket().getKategori()
                    + ", \nHarga Tiket: " + tr5.getHargaTiket() + ", Jumlah: " + tr5.getJumlah()
                    + ", Tanggal Beli: " + tr5.getTglBeli() + ", Diskon: " + tr5.getDiskon() + ", Total: " + tr5.getTotal());
            System.out.println("======================================================");
        }
        System.out.println();
    }
}
