/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan44.hukumohm;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai hukum = new Baterai();
        Baterai energizer = new Baterai(3,12);


        System.out.println("Kuat Arus\t: "+energizer.getKuatArus()+" ampere");
        System.out.println("Hambatan\t: "+energizer.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan\t: "+energizer.hitunTegangan()+" volt");
    }
    
}
