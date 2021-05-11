/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OODP_Iterator_Patterns;

import java.util.ArrayList;

public class Waitor {

    public static void main(String[] args) {

        SriLankanCheif SriLankancheif = new SriLankanCheif();
        SriLankancheif.addItem("Nudles", "Not Yet", 80, true);
        SriLankancheif.addItem("Chiken Rice", "Not Yet", 180, false);
        SriLankancheif.addItem("Vegitabale", "Not Yet", 120, true);
        SriLankancheif.addItem("Chiken Kottu", "Not Yet", 180, true);

        ChineseCheif Chinesecheif = new ChineseCheif();
        Chinesecheif.addItem("Nudles", "Not Yet", 80, true);
        Chinesecheif.addItem("Rice", "Not Yet", 80, true);
        Chinesecheif.addItem("Chiken Rice", "Not Yet", 180, false);
        Chinesecheif.addItem("Vegitabale", "Not Yet", 120, true);
        Chinesecheif.addItem("Chiken Kottu", "Not Yet", 180, true);

        /* MenuItem[] ChineseMenu = Chinesecheif.getMenu();
         ArrayList<MenuItem> SriLankanMenu = SriLankancheif.getMenu();
         for (int i = 0; i < ChineseMenu.length; i++) {
         System.out.println(ChineseMenu[i].getName());
         System.out.println(ChineseMenu[i].getDescreption());
         System.out.println(ChineseMenu[i].getPrice());
         System.out.println(ChineseMenu[i].isVegitarian());

         }
         for (int i = 0; i < SriLankanMenu.size(); i++) {
         System.out.println(SriLankanMenu.get(i).getName());
         System.out.println(SriLankanMenu.get(i).getDescreption());
         System.out.println(SriLankanMenu.get(i).getPrice());
         System.out.println(SriLankanMenu.get(i).isVegitarian());
         }*/
        // After Create ChineseMenu_Iterator && SrilankanMenu_Iterator
        Iterator ChineseMenu = Chinesecheif.getMenu();
        Iterator SriLankanMenu = SriLankancheif.getMenu();

        while (ChineseMenu.hasNext()) {

            MenuItem item = (MenuItem) ChineseMenu.next();

            System.out.println(item.getName());
            System.out.println(item.getDescreption());
            System.out.println(item.getPrice());
            System.out.println(item.isVegitarian());

        }

        System.err.println("//////////////___\\\\\\\\\\\\");

        while (SriLankanMenu.hasNext()) {
            MenuItem item = (MenuItem) SriLankanMenu.next();

            System.out.println(item.getName());
            System.out.println(item.getDescreption());
            System.out.println(item.getPrice());
            System.out.println(item.isVegitarian());

        }

    }

}
