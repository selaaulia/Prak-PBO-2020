/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        
        encap1.setNama("James");
        encap1.setAge(35);
        encap1.status();
        
        encap2.setNama("William");
        encap2.setAge(24);
        encap2.status();
    }
}
