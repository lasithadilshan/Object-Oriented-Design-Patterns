/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Proxy_Patterns;

//import com.sun.xml.internal.bind.v2.model.core.Adapter;

/**
 *
 * @author Lasitha
 */
public class Test {

    public static void main(String[] args) {
        Admin admin = new Admin();

        admin.UserName = "abc";
        admin.Password = "123";

        admin.PlaySong("OOJHHHHHH");
        admin.CreateDocument("a.txt");
        admin.InstallSowftware("office 2017");

        User user = new User();
        
        user.UserName = "chama";
        user.Password = "11111";

        user.admin = admin;  //admin kenkwa set krna oni..admin haraha thmayi userta soft instaled karanna puluwan.

        user.PlaySong("OOJHHHHHH");
        user.CreateDocument("a.txt");
        user.InstallSowftware("office 2017");

        user.adminpassword = "123"; //admin password eka denna oni nethnm error ekata ynne.

        user.InstallSowftware("office 2017");

    }

}
