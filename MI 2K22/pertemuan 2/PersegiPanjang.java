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
public class PersegiPanjang {
    public double panjang;
    public double lebar;
    
public double getKeliling(){
    return 2*(panjang + lebar);
}

public double getLuas(){
    return panjang * lebar;
}

public void displayInfo(){
    System.out.println("Panjang     : " + panjang);
    System.out.println("Lebar       : " + lebar);
    System.out.println("Keliling    : " + getKeliling());
    System.out.println("Luas        : " + getLuas());
}
}