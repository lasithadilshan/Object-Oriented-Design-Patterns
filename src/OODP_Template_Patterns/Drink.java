package OODP_Template_Patterns;

public abstract class Drink {
    
       public final void prepare(){
    
        boileWater();
        brew();
        pourInCup();
       
        if(customerWantsCondiments()){
             addCondiments();
        }
    }    
    
    public void boileWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pour in cup");
    }    
    
    public abstract void brew();
    public abstract void addCondiments();  
    
    public boolean customerWantsCondiments(){
        return true;
    }
}
