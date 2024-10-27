package code;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee Espresso";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
