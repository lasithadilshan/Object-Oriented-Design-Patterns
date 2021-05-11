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
public class ScreenLightOff implements State {

    @Override
    public void runningService() {
        System.out.println("Services running");
    }

    @Override
    public void playingVideo() {
        System.out.println("Video Play");
    }

    @Override
    public void viewBatteryLevel() {
        System.out.println("Baterry Reducing");
    }

}
