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
public class Project {

    public void on() {
        System.out.println("Project On");
    }

    public void off() {
        System.out.println("Project Off");
    }

    public void ChangeResolution(int x, int y) {
        System.out.println("Resolution Set to " + x + "*" + y + "");
    }

}
