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
public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;
    
public double getHargaBersih(){
    return hargaKotor - diskon * hargaKotor;
}

public void displayInfo(){
    System.out.println("Kode            : " + kode);
    System.out.println("Nama            : " + nama);
    System.out.println("Harga Kotor     : " + hargaKotor);
    System.out.println("Diskon          : " + diskon);
    System.out.println("Harga Bersih    : " + getHargaBersih());
} 
}


