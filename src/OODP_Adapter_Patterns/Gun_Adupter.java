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
public class Gun_Adupter implements Dunna {

    Gun gun;

    public Gun_Adupter(Gun gunn) {
        this.gun = gunn;
    }

    @Override
    public void Vidinawa() {
        gun.Wedithiyanwa();
    }

    @Override
    public void setIthala(int Count) {
        gun.setUnda(Count);
    }

    @Override
    public int getIthala() {
        return gun.getUnda();
    }

}
