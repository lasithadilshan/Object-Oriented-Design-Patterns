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
public class Run {

    public static void main(String[] args) {

        Election_Data ed = new Election_Data();

        Sirasa s = new Sirasa(ed);
        Hiru h = new Hiru(ed);
        Derana d = new Derana(ed);

        
        
        ed.setResult(100, 1010, 10200);

    }

}
