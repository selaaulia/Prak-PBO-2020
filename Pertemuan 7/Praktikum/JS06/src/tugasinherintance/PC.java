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
public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPC(){
        super.tampilData();
        System.out.println("Ukuran Monitor" + ukuranMonitor );
    }
}
