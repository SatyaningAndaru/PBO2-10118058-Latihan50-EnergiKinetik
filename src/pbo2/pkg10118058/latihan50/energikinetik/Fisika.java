/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan50.energikinetik;

/**
 *
 * @author user
 */
class Fisika {
    private double massa;
    private float kecepatan;

    public Fisika(double massa, float kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }
    

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(float kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double energiKinetik(){
    
    return (0.5 *massa*kecepatan*kecepatan);
    }
    
    public float usaha (){
    
       return (0-kecepatan);
    }
}
