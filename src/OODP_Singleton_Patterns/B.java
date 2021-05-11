
package OODP_Singleton_Patterns;

import OODP_Singleton_Patterns.A;


public class B {
    public static void main(String[] args) {
        
        A a = new A();
        
        System.out.println(a.a);
        
        System.out.println(A.b);
    }
    
}
