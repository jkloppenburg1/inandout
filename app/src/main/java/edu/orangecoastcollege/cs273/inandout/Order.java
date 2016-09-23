package edu.orangecoastcollege.cs273.inandout;

/**
 * Created by jkloppenburg1 on 9/22/2016.
 * Calculates an order's cost
 */


public class Order {
    /**
     * Different menu items
     */
    private int cheeseburgers;
    private int doubleDoubles;
    private int frenchFries;
    private int shakes;
    private int smallDrinks;
    private int mediumDrinks;
    private int largeDrinks;

    /**
     * Menu prices
     */
    private static final double PRICE_DOUBLE_DOUBLE = 3.60;
    private static final double PRICE_CHEESEBURGER = 2.15;
    private static final double PRICE_FRENCH_FRIES = 1.65;
    private static final double PRICE_SHAKES = 2.20;
    private static final double PRICE_SMALL_DRINK = 1.45;
    private static final double PRICE_MEDIUM_DRINK = 1.55;
    private static final double PRICE_LARGE_DRINK = 1.75;
    private static final double TAX_RATE = 0.08;

    public Order()
    {
        this.cheeseburgers = 0;
        this.doubleDoubles = 0;
        this.frenchFries = 0;
        this.shakes = 0;
        this.smallDrinks = 0;
        this.mediumDrinks = 0;
        this.largeDrinks = 0;
    }

    public Order(int cheeseburgers, int doubleDoubles, int frenchFries, int shakes, int smallDrinks, int mediumDrinks, int largeDrinks) {
        this.cheeseburgers = cheeseburgers;
        this.doubleDoubles = doubleDoubles;
        this.frenchFries = frenchFries;
        this.shakes = shakes;
        this.smallDrinks = smallDrinks;
        this.mediumDrinks = mediumDrinks;
        this.largeDrinks = largeDrinks;
    }

    public double calculateSubtotal()
    {
        /**
         * Calculates the total before taxes
         *
         * @return Subtotal as double
         */
        double total = 0.0;
        total += this.cheeseburgers * PRICE_CHEESEBURGER;
        total += this.doubleDoubles * PRICE_DOUBLE_DOUBLE;
        total += this.frenchFries * PRICE_FRENCH_FRIES;
        total += this.shakes * PRICE_SHAKES;
        total += this.smallDrinks * PRICE_SMALL_DRINK;
        total += this.mediumDrinks * PRICE_MEDIUM_DRINK;
        total += this.largeDrinks * PRICE_LARGE_DRINK;

        return total;
    }

    public double calculateTax()
    {
        /**
         * Calculates the tax to be added
         * @return Tax amount as double
         */
        return calculateSubtotal() * TAX_RATE;
    }

    public double  calculateTotal()
    {
        /**
         * Calculates total (subtotal plus tax)
         * @return Total as a double
         */
        return calculateSubtotal() + calculateTax();
    }

    public int calculateNumberOfItems()
    {
        /**
         * Calculates the number of items ordered
         * @return number of items as int
         */
        int total = 0;
        total += this.cheeseburgers;
        total += this.doubleDoubles;
        total += this.frenchFries;
        total += this.shakes;
        total += this.smallDrinks;
        total += this.mediumDrinks;
        total += this.largeDrinks;

        return total;
    }

    //Getters and setters
    public int getCheeseburgers() {
        return cheeseburgers;
    }

    public void setCheeseburgers(int cheeseburgers) {
        this.cheeseburgers = cheeseburgers;
    }

    public int getDoubleDoubles() {
        return doubleDoubles;
    }

    public void setDoubleDoubles(int doubleDoubles) {
        this.doubleDoubles = doubleDoubles;
    }

    public int getFrenchFries() {
        return frenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        this.frenchFries = frenchFries;
    }

    public int getShakes() {
        return shakes;
    }

    public void setShakes(int shakes) {
        this.shakes = shakes;
    }

    public int getSmallDrinks() {
        return smallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        this.smallDrinks = smallDrinks;
    }

    public int getMediumDrinks() {
        return mediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        this.mediumDrinks = mediumDrinks;
    }

    public int getLargeDrinks() {
        return largeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        this.largeDrinks = largeDrinks;
    }

    public static double getPriceDoubleDouble() {
        return PRICE_DOUBLE_DOUBLE;
    }

    public static double getPriceCheeseburger() {
        return PRICE_CHEESEBURGER;
    }

    public static double getPriceFrenchFries() {
        return PRICE_FRENCH_FRIES;
    }

    public static double getPriceShakes() {
        return PRICE_SHAKES;
    }

    public static double getPriceSmallDrink() {
        return PRICE_SMALL_DRINK;
    }

    public static double getPriceMediumDrink() {
        return PRICE_MEDIUM_DRINK;
    }

    public static double getPriceLargeDrink() {
        return PRICE_LARGE_DRINK;
    }

    public static double getTaxRate() {
        return TAX_RATE;
    }

}
