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
public interface Subject {

    public void Notify_Observer() ;

    public void Register_Obsever(Obsever Ob);

    public void Remove_Obsever(Obsever Ob);

}
