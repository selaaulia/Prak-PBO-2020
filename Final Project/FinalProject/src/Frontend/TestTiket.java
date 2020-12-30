/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.*;

/**
 *
 * @author HUAWEI
 */
public class TestTiket {

    public static void main(String[] args) {
        Tiket t1 = new Tiket("EVERYWHERE", "seating A", 1750000, "2018/11/11");
        t1.setHarga();
        
        Tiket t2 = new Tiket("EVERYWHERE", "standing B", 2000000, "2018/11/11");
        t2.setHarga();
        
        Tiket t3 = new Tiket("EVERYWHERE", "seating A", 2000000, "2018/11/11");
        t3.setHarga();
        
        Tiket t4 = new Tiket("EVERYWHERE", "seating B", 2000000, "2018/11/11");
        t4.setHarga();
        
        Tiket t5 = new Tiket("EVERYWHERE", "seating A", 2600000, "2018/11/11");
        t5.setHarga();

        // test insert
        t1.save();
        t2.save();
        t3.save();
        t4.save();
        t5.save();

        // test update
        t1.setKategori("standing A");
        t1.save();

        // test delete
        t3.delete();
        
        // test select all
        for (Tiket t : new Tiket().getAll()) {
            System.out.println("Nama Konser: " + t.getKonser() + ", Kategori: " + t.getKategori() + ", Harga: " + t.getHarga()
                    + ", Tanggal: " + t.getTgl());
        }

        // test search
        for (Tiket t : new Tiket().search("seat")) {
            System.out.println();
            System.out.println("Nama Konser: " + t.getKonser() + ", Kategori: " + t.getKategori() + ", Harga: " + t.getHarga()
                    + ", Tanggal: " + t.getTgl());
        }
    }
}
