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
public class Mobil {
    public String produsen;
    public String warna;
    public int kecepatan;
    public int gear;

public int tambahKecepatan(int kecepatan, int increment){
    kecepatan += increment;
    return kecepatan;
}

public int kurangiKecepatan(int kecepatan, int decrement){
    kecepatan -= decrement;
    return kecepatan;
}

public int tambahGear(int gear, int increment){
    gear += increment;
    return gear;
}

public int kurangiGear(int gear, int decrement){
    gear -= decrement;
    return gear;
}

public void displayInfo1(){
    System.out.println("Produsen                    : " + produsen);
    System.out.println("Warna                       : " + warna);
    System.out.println("Kecepatan                   : " + kecepatan);
    System.out.println("Gear                        : " + gear);
    System.out.println("Hasil Tambah Gear           : " + tambahGear(gear, 1));
    System.out.println("Hasil  Tambah Kecepatan     : " + tambahKecepatan(kecepatan, 10));
}

public void displayInfo2(){
    System.out.println("Produsen                   : " + produsen);
    System.out.println("Warna                      : " + warna);
    System.out.println("Kecepatan                  : " + kecepatan);
    System.out.println("Gear                       : " + gear);
    System.out.println("Hasil Kurang Gear          : " + kurangiGear(gear, 1));
    System.out.println("Hasil Kurang Kecepatan     : " + kurangiKecepatan(kecepatan, 10));
}
}
