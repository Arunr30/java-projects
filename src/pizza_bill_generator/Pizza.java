package pizza_bill_generator;

public class Pizza {
    private int price;
    private Boolean veg;

    Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }
    public void getPizzaPrice() {
        System.out.println(this.price);
    }
}
