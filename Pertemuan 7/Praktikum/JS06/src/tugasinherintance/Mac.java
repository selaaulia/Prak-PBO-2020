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
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei,String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security        : " +security);
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
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei,String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security        : " +security);
    }   
}
>>>>>>> 5443b57432ce8c383dc054fe4d280e29ed4df1b2
