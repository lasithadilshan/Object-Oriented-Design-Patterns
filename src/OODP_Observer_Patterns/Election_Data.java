/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Observer_Patterns;

import java.util.ArrayList;

/**
 *
 * @author Lasitha
 */
public class Election_Data implements Subject {

    int x;
    int y;
    int z;

    /*  Sirasa s;
        Hiru h;
        Derana d;   */
    // ArrayList<Observer> Observer;
    ArrayList<Obsever> Obsever;

    /* aluth chanel ekak alla gena store karanna ArrayList use*/
    public Election_Data() {
        Obsever = new ArrayList<>();
    }

    public void setResult(int x, int y, int z) {
        /* result store kara ganna */

        this.x = x;
        this.y = y;
        this.z = z;

        Notify_Observer();
    }

    @Override
    public void Notify_Observer() {
        for (int i = 0; i < Obsever.size(); i++) {
            Obsever.get(i).Update(x, y, z);
            Obsever.get(i).Display(x, y, z);
        }
    }

    @Override
    public void Register_Obsever(Obsever Ob) {
        Obsever.add(Ob);
    }

    @Override
    public void Remove_Obsever(Obsever Ob) {
        Obsever.add(Ob);
    }

}
