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
public interface Obsever {

    public abstract void Update(int x, int y, int z);

    public abstract void Display(int x, int y, int z);
}
