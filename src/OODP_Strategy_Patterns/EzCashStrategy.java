/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Strategy_Patterns;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lasitha
 */
public class EzCashStrategy implements Strategy {

    JTextField Mobile_number;
    JTextField Pin;

    public EzCashStrategy(JTextField Mobile_number, JTextField Pin) {
        this.Mobile_number = Mobile_number;
        this.Pin = Pin;
    }

   
    

    @Override
    public void Show(boolean Status) {
       Mobile_number.setEditable(Status);
        Pin.setEditable(Status);}

}
