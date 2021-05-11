package OODP_Template_Patterns;

public class Cafe {
    
    
    public static void main(String[] args) {
        Tea tea1 = new Tea();
        tea1.prepare();
               
        Tea tea2 = new Tea();
        tea2.prepare();
        
        Coffee coffee = new Coffee();
        coffee.prepare();
        
        Nescafe nescafe = new Nescafe();
        nescafe.prepare();
    }
}
