/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_la;

/**
 *
 * @author sydd
 */

public class Motor extends Kendaraan {
    private boolean adaBox;

    public void setAdaBox(boolean adaBox) {
        this.adaBox = adaBox;
    }

    public boolean getAdaBox() {
        return adaBox;
    }

    // Polymorphism (Override)
    @Override
    void jalan() {
        System.out.println("Motor " + getMerk() + " sedang melaju di jalan kecil.");
    }
}

