/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinherintance;

/**
 *
 * @author Asus
 */
public class TugasInherintance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("======================================================");
        System.out.println("                Tampil Laptop                         ");
        System.out.println("");
        Laptop lp = new Laptop("Asus",20,1944,"Intel Core 2 Quad2006","NiCd");
        lp.tampilData();
        
        System.out.println("=======================================================");
        System.out.println("                Tampil Mac                             ");
        System.out.println("");
        Mac mc = new Mac("Mac Pro",28,1944,"Intel Core 2 Quad2006","NiMH","Proteksi Virus");
        mc.tampilMac();
        
        System.out.println("======================================================");
        System.out.println("                Tampil Windows                        ");
        System.out.println("");
        Windows wd = new Windows("Lenovo G40",20,1944,"Intel Core i3","Lithium Ion","File Explorer Windows");
        wd.tampilWindows();
        
        System.out.println("======================================================");
        System.out.println("                Tampil Pc                              ");
        System.out.println("");
        PC pc = new PC("Samsung",20,1944,"Intel Core i3",14);
        pc.tampilPC();
    }
}
