<<<<<<< HEAD
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
public class Manager extends Karyawan{
    public int tunjangan;

    public Manager() {
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji + tunjangan));  
    }
}
=======
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
public class Manager extends Karyawan{
    public int tunjangan;

    public Manager() {
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       =" + tunjangan);
        System.out.println("Total Gaji      =" + (super.gaji + tunjangan));  
    }
}
>>>>>>> 5443b57432ce8c383dc054fe4d280e29ed4df1b2
