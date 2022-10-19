/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Anggota {
    private String nik;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nik, String nama, int limitPinjaman) {
        this.nik = nik;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    public void pinjam(int pinjaman){
        if (jumlahPinjaman + pinjaman <= limitPinjaman) {
            jumlahPinjaman += pinjaman;
        } else {
            System.out.println("Lebih Limit");
        }
    }
    public void angsur(int angsur){
        if (angsur >= 0.1 * jumlahPinjaman) {
          if (jumlahPinjaman - angsur >= 0) {
            jumlahPinjaman -= angsur;
        } else {
            System.out.println("Jumlah angsuran" + (angsur - jumlahPinjaman));
            jumlahPinjaman = 0;
        }
        } else {
            System.out.println("Maaf Harus 10%");
        }
    }
    
}
