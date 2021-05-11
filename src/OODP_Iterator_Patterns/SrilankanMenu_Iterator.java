/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

import java.util.ArrayList;

public class SrilankanMenu_Iterator implements Iterator {

    public ArrayList<MenuItem> Menu;
    public int Current_index;

    public SrilankanMenu_Iterator(ArrayList<MenuItem> menu) {

        this.Menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (Current_index < Menu.size()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Object next() {
        return Menu.get(Current_index++);
    }

    @Override
    public boolean getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
