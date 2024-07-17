package pizza_bill_generator;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 200;
    private int backPack = 20;
    private int basePizza;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;


    Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizza = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheese;

    }
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppings;

    }
    public void takeAway() {
        isTakeAway = true;
        this.price += backPack;

    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizza);
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added" + extraCheese + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added," +  extraToppings +  "\n";
        }
        if(isTakeAway) {
            bill += "order is takeAway," + backPack + "\n";
        }
        bill += "Bill:" + this.price + "\n";
        System.out.println(bill);



    }
}
