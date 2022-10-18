/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Muhammad Islahuddin
 */
public class DemoMobil {
    public static void main(String[] args) {
        //Mobil 1
        Mobil mb1 = new Mobil();
        mb1.produsen = "Ferarri";
        mb1.warna = "Biru";
        mb1.gear = 1;
        mb1.kecepatan = 100;
        
        mb1.displayInfo1();
        
        //Mobil 2
        Mobil mb2 = new Mobil();
        mb2.produsen = "Ferarri";
        mb2.warna = "Pink";
        mb2.gear = 2;
        mb2.kecepatan = 100;
        
        mb2.displayInfo2();
    }
}
