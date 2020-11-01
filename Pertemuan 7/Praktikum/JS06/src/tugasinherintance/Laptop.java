<<<<<<< HEAD
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
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       :" + jnsBatrei);
    }

}
=======
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
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       :" + jnsBatrei);
    }

}
>>>>>>> 5443b57432ce8c383dc054fe4d280e29ed4df1b2
