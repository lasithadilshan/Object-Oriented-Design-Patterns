/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Strategy_Patterns;

import javax.swing.JTextField;

/**
 *
 * @author Lasitha
 */
public class CreditCardStrategy implements Strategy {

    JTextField name;
    JTextField Card_Number;
    JTextField Cvv;

    public CreditCardStrategy(JTextField name, JTextField Card_Number, JTextField Cvv) {
        this.name = name;
        this.Card_Number = Card_Number;
        this.Cvv = Cvv;
    }

    

    @Override
    public void Show(boolean Status) {
        name.setEditable(Status);
        Card_Number.setEditable(Status);
        Cvv.setEditable(Status);

    }

}
