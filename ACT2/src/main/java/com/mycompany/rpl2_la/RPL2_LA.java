/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_la;

/**
 *
 * @author sydd
 */

public class RPL2_LA {

    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil = new Mobil();
        mobil.setMerk("Toyota Avanza");
        mobil.setTahun(2022);
        mobil.setJumlahPintu(4);

        // Membuat objek motor
        Motor motor = new Motor();
        motor.setMerk("Honda Beat");
        motor.setTahun(2021);
        motor.setAdaBox(true);

        // Menampilkan hasil
        System.out.println("=== DATA MOBIL ===");
        System.out.println("Merk: " + mobil.getMerk());
        System.out.println("Tahun: " + mobil.getTahun());
        System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());
        mobil.jalan(); // Polymorphism

        System.out.println("\n=== DATA MOTOR ===");
        System.out.println("Merk: " + motor.getMerk());
        System.out.println("Tahun: " + motor.getTahun());
        System.out.println("Ada Box: " + (motor.getAdaBox() ? "Ya" : "Tidak"));
        motor.jalan(); // Polymorphism
    }
}

