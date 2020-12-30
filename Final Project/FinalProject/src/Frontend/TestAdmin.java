/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Admin;

/**
 *
 * @author HUAWEI
 */
public class TestAdmin {

    public static void main(String[] args) {
        Admin a1 = new Admin("diva ardhia", "mojokerto", "divardhiass@gmail.com", "081231111222");
        Admin a2 = new Admin("sela aulia", "mojokerto", "selaaulia7@gmail.com", "081233222333");
        Admin a3 = new Admin("septian enggar", "malang", "septian01@email.co.id", "081222333444");

        // test insert
        a1.save();
        a2.save();
        a3.save();

        // test update
        a2.setAlamat("malang");
        a2.save();

        // test delete
        a3.delete();

        // test select all
        for (Admin a : new Admin().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() 
                                + ", Email: " + a.getEmail() + ", Telepon: " + a.getTelepon());
        }
    }
}
