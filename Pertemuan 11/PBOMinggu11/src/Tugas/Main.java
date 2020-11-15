/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author SelaAulia
 */
public class Main {
    public static void main(String[] args) {
        Singa s = new Singa("CingaCing", 4 , "Roaar Roaaar", "Coklat");
        Keledai k = new Keledai("Kedelai", 4, "Hehehehe", "Abu-abu");
        Gorilla g = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        
        k.displayBinatang();
        k.displayMakan();
        k.displayData();
        System.out.println();
        
        g.displayBinatang();
        g.displayMakan();
        g.displayData();
        System.out.println();
        
        s.displayBinatang();
        s.displayMakan();
        s.displayData();
        System.out.println();
    }
}
