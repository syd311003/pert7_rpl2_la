/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_la;

/**
 *
 * @author sydd
 */

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    // Polymorphism (Override)
    @Override
    void jalan() {
        System.out.println("Mobil " + getMerk() + " keluaran tahun " + getTahun() + " sedang melaju di jalan raya.");
    }
}

