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
public class Speaker {

    int volume;

    public void on() {
        System.out.println("Speaker On");
    }

    public void off() {
        System.out.println("Speaker Off");
    }

    public void VolumeUp() {
        volume++;
        System.out.println("VolumeUp " + volume);
    }

    public void VolumeDown() {
        volume--;
        System.out.println("VolumeDown " + volume);
    }

}
