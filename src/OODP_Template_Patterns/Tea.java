package OODP_Template_Patterns;

public class Tea extends Drink {
    

    
    public void brew(){
        System.out.println("steep Tea Bag");
    }
    

    public void addCondiments(){
        System.out.println("Add Lemon");
    }    
    
    public boolean customerWantsCondiments(){
        return false;
        
    }    
}
