/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_la;

/**
 *
 * @author sydd
 */

public class Kendaraan {
    // --- Encapsulation ---
    private String merk;
    private int tahun;

    // Setter & Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getTahun() {
        return tahun;
    }

    // Metode umum
    void jalan() {
        System.out.println("Kendaraan sedang berjalan...");
    }
}

