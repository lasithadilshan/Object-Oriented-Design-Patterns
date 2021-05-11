/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

/**
 *
 * @author Lasitha
 */
public class MenuItem {

    private String name;
    private String descreption;
    private double price;
    private boolean vegitarian;

    public MenuItem(String name, String descreption, double price, boolean vegitarian) {
        this.name = name;
        this.descreption = descreption;
        this.price = price;
        this.vegitarian = vegitarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegitarian() {
        return vegitarian;
    }

    public void setVegitarian(boolean vegitarian) {
        this.vegitarian = vegitarian;
    }

}
