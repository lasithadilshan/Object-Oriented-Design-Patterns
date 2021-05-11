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
public class AK_47 implements Gun {

    int Unda;

    @Override
    public void Wedithiyanwa() {
        Unda--;
        System.out.println("Undaen Weditiba tawa unda " + Unda + " ithru");
    }

    @Override
    public void setUnda(int Count) {
        this.Unda = Count;
    }

    @Override
    public int getUnda() {
        return this.Unda;
    }

}
