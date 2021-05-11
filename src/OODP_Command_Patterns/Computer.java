/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Command_Patterns;

/**
 *
 * @author Lasitha
 */
public class Computer implements Command {

    @Override
    public void execute() {
        System.out.println("Computer On");
    }

    public void ReStart() {
        System.out.println("ReStart.....");
    }
}
