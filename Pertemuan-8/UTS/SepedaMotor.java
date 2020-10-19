/*(
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Asus
 */
public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        this.mesin = new Mesin();
        mesin.setMerek(merekMesin);
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin() {
        return mesin.getMerek();
    }

    public void tambahKecepatanMotor() {
        this.mesin.tambahKecepatan();
    }

    public void kurangiKecepatan() {
        this.mesin.kurangiKecepatan();
    }
}
