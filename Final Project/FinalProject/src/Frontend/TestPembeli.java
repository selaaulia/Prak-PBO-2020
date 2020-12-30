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
public class TestPembeli {

    public static void main(String[] args) {
        Member m = new Member("3208978901234567", "malik tuan", "Lamongan", "maliktuan@email.co.id", "089234543222", "Member");
        Member m1 = new Member("3334567890989990", "jaka jier", "Surabaya", "jaka.jier@gmail.com", "082345333444", "Member");
        NonMember n = new NonMember("3212223330009990", "Januar Brow", "Malang", "jaybrow@email.com", "089999000987", "Non Member");

        Pembeli p = m;
        Pembeli p1 = m1;
        Pembeli p2 = n;

        // test insert
        p.save();
        p1.save();
        p2.save();

        // test update
        p2.setAlamat("Surabaya");
        p2.save();

        // test select all
        for (Pembeli pem : new Pembeli().getAll()) {
            System.out.println("Nama: " + pem.getNama() + ", NIK: " + pem.getNik() + ", Alamat: " + pem.getAlamat()
                    + ", Email: " + pem.getEmail() + ", Telepon: " + pem.getTelepon() + ", Jenis: " + pem.getJenis());
        }

        // test search
        for (Pembeli pem : new Pembeli().search("brow")) {
            System.out.println();
            System.out.println("Nama: " + pem.getNama() + ", NIK: " + pem.getNik() + ", Alamat: " + pem.getAlamat()
                    + ", Email: " + pem.getEmail() + ", Telepon: " + pem.getTelepon() + ", Jenis: " + pem.getJenis());
        }
    }
}
