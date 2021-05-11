package OODP_Decorator_Patterns;

public class Cheese extends Condiments_Decorator {

    Meal meal;

    public Cheese(Meal meal) {
        this.meal = meal;
    }

    @Override
    public boolean isVegitarian() {
        return false;
    }

    @Override
    public String getDescription() {
        return meal.getDescription() + ",Cheese";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 80;
    }

}
