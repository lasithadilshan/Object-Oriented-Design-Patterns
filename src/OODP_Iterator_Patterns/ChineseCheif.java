/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

import java.util.ArrayList;

public class ChineseCheif {

    MenuItem[] menu;
    int nextindex;

    public ChineseCheif() {
        menu = new MenuItem[5];

    }

    public void addItem(String name, String descreption, double price, boolean vegitarian) {
        MenuItem item = new MenuItem(name, descreption, price, vegitarian);
        menu[nextindex] = item;
        nextindex++;

    }

    /*public MenuItem[] getMenu() {
        return this.menu;

    }*/
    
    // After Create ChineseMenu_Iterator
   
    public ChineseMenu_Iterator getMenu() {
        return new ChineseMenu_Iterator(menu);

    }
}
