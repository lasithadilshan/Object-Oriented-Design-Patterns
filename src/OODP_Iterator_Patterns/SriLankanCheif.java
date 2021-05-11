/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

import java.util.ArrayList;

public class SriLankanCheif {

    ArrayList<MenuItem> Menu;

    public SriLankanCheif() {
        Menu = new ArrayList<MenuItem>();

    }

    public void addItem(String name, String descreption, double price, boolean vegitarian) {
        MenuItem item = new MenuItem(name, descreption, price, vegitarian);
        Menu.add(item);

    }

    /*public ArrayList<MenuItem> getMenu() {
        return this.Menu;

    }*/
    
    // After Create SrilankanMenu_Iterator
   
    public Iterator getMenu() {
        return  new SrilankanMenu_Iterator(Menu);

    }
}
