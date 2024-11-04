/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.percobaan1;

import java.util.Scanner;
/**
 * Nama     : Agshar Daffaa Shidqii
 * NIM      : 23176030
 * Prodi    : Siste Informasi
 */
public class GantiKataLat28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        String kalimat, kataAsal, kataGanti, kalimatBaru;
        
        // Input kalimat dari user
        System.out.println("===== Program Mengganti Kata =====");
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        kalimat = inputan.nextLine();

        // Inputan kata yang akan diganti
        System.out.print("Ganti kata: ");
        kataAsal = inputan.nextLine();

        // Inputan kata pengganti
        System.out.print("Menjadi kata: ");
        kataGanti = inputan.nextLine();

        // Ganti kata dalam kalimat
        kalimatBaru = kalimat.replaceAll(kataAsal, kataGanti);

        // Tampilkan hasil
        System.out.println("\n===== Hasil Formatting =====");
        System.out.println("Kalimat awal\t: " +kalimat);
        System.out.println("Kalimat baru\t: " + kalimatBaru);
    }
    
}