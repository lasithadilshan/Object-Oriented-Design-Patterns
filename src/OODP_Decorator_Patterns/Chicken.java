package OODP_Decorator_Patterns;

public class Chicken extends Condiments_Decorator {

    Meal meal;

    public Chicken(Meal meal) {
        this.meal = meal;
    }

    @Override
    public boolean isVegitarian() {
        return false;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ",Chicken";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 50;
    }

}
