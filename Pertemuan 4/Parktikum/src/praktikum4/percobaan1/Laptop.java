/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4.percobaan1;

/**
 *
 * @author Asus
 */
public class Laptop {

   private String merk;
    private Processor proc;

    public Laptop() {

    }

    public Laptop(String m, Processor p) {
        merk = m;
        proc = p;

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}

