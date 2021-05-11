/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

public class ChineseMenu_Iterator implements Iterator{

    MenuItem[] Menu;
    public int Current_index;

    public ChineseMenu_Iterator(MenuItem[] menu) {
        this.Menu = menu;

    }

    public boolean hasNext() {
        if (Current_index < Menu.length) {
            return true;
        } else {
            return false;
        }

    }

    public Object next() {
        return Menu[Current_index++];
    }

    @Override
    public boolean getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
