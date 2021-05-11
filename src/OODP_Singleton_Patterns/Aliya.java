package OODP_Singleton_Patterns;

public class Aliya {

    private static Aliya a = new Aliya();
    
    private Aliya() {

    }

    public static Aliya show1() {

        return a;
    }
    
     public void show() {

        System.out.println("OK");
       
    }
   
    int health = 100 ;

}



