/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Observer_Patterns;

/**
 *
 * @author Lasitha
 */
public class Hiru implements Obsever {

    int x;
    int y;
    int z;

    public Hiru(Election_Data ed) {
        ed.Register_Obsever(this);
    }

    @Override
    public void Update(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        System.out.println("Hiru");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    @Override
    public void Display(int x, int y, int z) {
        System.out.println("Hiru Tv");
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
        System.out.println("Z = " + this.z);
    }
}
