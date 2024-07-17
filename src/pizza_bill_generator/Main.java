package pizza_bill_generator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        DeluxPizza dPizza = new DeluxPizza(true);
//        pizza.addExtraToppings();
//        pizza.takeAway();
//        pizza.addExtraToppings();
//        pizza.getBill();
        dPizza.getBill();
    }
}