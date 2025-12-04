/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_ia17_50422722;

/**
 *
 * @author sydd
 */
public class Rpl2_ia17_50422722 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi goreng");
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
    }
}
