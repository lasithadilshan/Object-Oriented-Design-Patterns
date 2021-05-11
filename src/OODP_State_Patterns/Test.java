/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_State_Patterns;

/**
 *
 * @author Lasitha
 */
public class Test {

    public static void main(String[] args) {
        LapTop laptop = new LapTop();
        
        laptop.setState(new PowerOff());
        
        laptop.playingVideo();
        laptop.viewBatteryLevel();
        laptop.runningService();
        
        System.out.println("------------------------");
        
        laptop.setState(new Lock());
        
        laptop.playingVideo();
        laptop.viewBatteryLevel();
        laptop.runningService();
        
         System.out.println("------------------------");
        
        laptop.setState(new ScreenLightOff());
        
        laptop.playingVideo();
        laptop.viewBatteryLevel();
        laptop.runningService();
    }
    
}
