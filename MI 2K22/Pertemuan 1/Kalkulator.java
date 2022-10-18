/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, operasi, pilihan, hasil=0;
        System.out.println("1. Penjumlah");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        System.out.println("Masukkan Angka Pertama : ");
        angka1 = input.nextInt();
        System.out.println("Masukkan Angka kedua : ");
        angka2 = input.nextInt();
        
        System.out.println("Pilih Operasi : ");
        operasi = input.nextInt();
        
        switch(operasi){
            case 1 :
                hasil = angka1 + angka2;
                break;
            case 2 : 
                hasil = angka1 - angka2;
                break;
            case 3 :
                hasil = angka1 * angka2;
                break;
            case 4 :
                hasil = angka1 / angka2;
                break;
            default: System.out.println("Yang anda masukkan salah");
        }
            System.out.println("Hasil : " + hasil);
    }
}
