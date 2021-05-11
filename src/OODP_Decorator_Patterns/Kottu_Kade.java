package OODP_Decorator_Patterns;

public class Kottu_Kade {

    public static void main(String[] args) {

        Meal m = new Roty_Kottu();
        System.out.println(m.getPrice() + "Rs." + m.getPrice());
        m = new Cheese(m);
        System.out.println(m.getPrice() + "Rs." + m.getPrice());
        m = new Chicken(m);
        System.out.println(m.getPrice() + "Rs." + m.getPrice());

    }

}
