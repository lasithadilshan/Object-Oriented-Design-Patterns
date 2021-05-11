/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Facade_Patterns;

/**
 *
 * @author Lasitha
 */
public class DvD_Player {

    DvD dvd;

    public void on() {
        System.out.println("DvD Player On");
    }

    public void off() {
        System.out.println("DvD Player  Off");
    }

    public void Insert(DvD dvd) {
        this.dvd = dvd;
        System.out.println(dvd.name + " Disk Inserted");

    }

    public void Play() {

        System.out.println("Playing " + dvd.name);
    }
}
