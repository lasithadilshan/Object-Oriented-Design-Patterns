/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Proxy_Patterns;

/**
 *
 * @author Lasitha
 */
public class Admin implements Privilages {

    String UserName;
    String Password;

    @Override
    public void PlaySong(String File) {
        System.out.println("Admin Playing" + File);
    }

    @Override
    public void CreateDocument(String File) {
        System.out.println("Admin Create Document" + File);
    }

    @Override
    public void InstallSowftware(String File) {
        System.out.println("Admin Install Sowftware" + File);
    }

}
