/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Adapter_Patterns;

/**
 *
 * @author Lasitha
 */
public class Game_Run {

    public static void main(String[] args) {

        Wadda wadda = new Wadda();
        LeeDunna ld = new LeeDunna();

        ld.setIthala(10);

        wadda.setName("johoo");
        wadda.setDunaa(ld);

        wadda.getDunaa().Vidinawa();
        wadda.getDunaa().Vidinawa();
        wadda.getDunaa().Vidinawa();

        //After create Adupter class
        AK_47 ak47 = new AK_47();
        wadda.setDunaa(new Gun_Adupter(ak47));
        wadda.getDunaa().setIthala(40);
        wadda.getDunaa().Vidinawa();

    }

}
