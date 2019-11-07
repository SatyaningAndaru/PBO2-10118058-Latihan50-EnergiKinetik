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
public class PBO210118058Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fisika f = new Fisika(145,25);
        System.out.println("Energi kinetiknya : " +f.energiKinetik());
        System.out.println("Usaha pada bola : " +f.usaha());
    }
    
}
