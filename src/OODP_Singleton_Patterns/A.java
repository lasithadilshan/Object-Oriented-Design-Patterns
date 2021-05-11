
package OODP_Singleton_Patterns;

public class A {
    public int a =10;
    public static  int b =20;
    
    public static void main(String[] args) {
        A a = new A();
        
        System.out.println(a.a);
        
        System.out.println(A.b);
    }
    
    
}
