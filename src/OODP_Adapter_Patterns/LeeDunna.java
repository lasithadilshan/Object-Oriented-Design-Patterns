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
public class LeeDunna implements Dunna {

    int Ethala;

    @Override
    public void Vidinawa() {
        Ethala--;
        System.out.println("Lee Dunna WIdda " + Ethala + "");
    }

    @Override
    public void setIthala(int Count) {
        this.Ethala = Count;
    }

    @Override
    public int getIthala() {
        return this.Ethala ; }

}
