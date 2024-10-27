package code;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        System.out.println("Your order is '" + beverage1.getDescription() + "', it's cost: " + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println("Your order is '" + beverage2.getDescription() + "', it's cost: " + beverage2.cost());
    }
}
