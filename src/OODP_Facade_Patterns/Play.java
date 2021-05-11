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
public class Play {

    public static void main(String[] args) {

        Play_Facde play_Facde = new Play_Facde(new TV(), new DvD_Player(), new DvD("King Auther"), new Project(), new Speaker());
        play_Facde.Play_Facde_Move();
    }

}
