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
public class BarangDemo {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1;
        
        barang1.displayInfo();
    }
}
