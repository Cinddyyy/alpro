/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konversi_051;

import java.util.Scanner;

/**
 *
 * @author owner
 */
public class Konversi_051 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, menu;
        int nim, pilih;
        double rupiah, dollar, yen, euro;
        
        System.out.println("Program Konversi Mata Uang Oleh\n");
        
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM  : "); 
        nim = input.nextInt();
        System.out.println("Menu ");
        System.out.println("1. Konversi ke US Dollar");
        System.out.println("2. Konversi ke Yen");
        System.out.println("3. Koversi ke Euro");
        System.out.print("Pilih ? ");
        pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.print("Masukkan nilai Rupiah : ");
                rupiah = input.nextDouble();
                dollar = rupiah/15565;
                System.out.println("Nilai dollar = " +dollar);
                break;
            case 2:
                System.out.print("Masukkan nilai Rupiah : ");
                rupiah = input.nextDouble();
                yen = rupiah/103.82;
                System.out.println("Nilai yen = " +yen);
                break;
            case 3:
                System.out.print("Masukkan nilai Rupiah : ");
                rupiah = input.nextDouble();
                euro = rupiah/15222;
                System.out.println("Nilai Euro = " +euro);
                break;
            default:
                System.out.println("Masukkan salah");
                break;            
        }
    }
}
