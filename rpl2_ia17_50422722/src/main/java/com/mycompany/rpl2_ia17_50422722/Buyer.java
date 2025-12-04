/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_ia17_50422722;

/**
 *
 * @author sydd
 */
public class Buyer extends User{
    
    @Override
    public void login(){
        System.out.println("Buyer melakukan login");
    }
    
    @Override
    public void logout() {
        System.out.println("Buyer melakukan logout");
    }
}
