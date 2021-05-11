/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Facade_Patterns;



/**
 *
 * @author Lasitha
 */
public class Play_Facde {

    TV tv;
    DvD_Player dvdPlayer;
    DvD dvd;
    Project project;
    Speaker speaker;

    public Play_Facde(TV tv, DvD_Player dvdPlayer, DvD dvd, Project project, Speaker speaker) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.dvd = dvd;
        this.project = project;
        this.speaker = speaker;
    }


    public void Play_Facde_Move() {
        tv.on();
        dvdPlayer.on();
        dvdPlayer.Insert(dvd);
        project.on();
        project.ChangeResolution(1366, 768);
        speaker.on();

        for (int i = 0; i < 5; i++) {
            speaker.VolumeUp();

        }

        dvdPlayer.Play();

    }

}
