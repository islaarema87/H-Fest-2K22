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
public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        
        m1.displayBiodata();
        
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023431";
        m2.nama = "Rojik";
        m2.alamat = "Nias, Sumatera Utara";
        m2.kelas = "2A";
        
        m2.displayBiodata();
        
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023430";
        m3.nama = "Mahbabah";
        m3.alamat = "Nias, Sumatera Utara";
        m3.kelas = "2A";
        
        m3.displayBiodata();
    }
}
