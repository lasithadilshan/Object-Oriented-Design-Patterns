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
public class LapTop implements State {  // show HAS-A & IS-A behaviors 

    State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void runningService() {
        state.runningService();
    }

    @Override
    public void playingVideo() {
        state.playingVideo();
    }

    @Override
    public void viewBatteryLevel() {
        state.viewBatteryLevel();
    }

}
