package code;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee House Blend";
    }

    @Override
    public double cost() {
        return 1.4;
    }
}
