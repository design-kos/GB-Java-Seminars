package Seminars.Seminar7;

public class MainProgram {
    public static void main(String[] args) {
        VendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();

        Product latte = new HotDrink("Latte", 5, 49, 0, 0.5);
        hotDrinksVendingMachine.addProduct(1, latte);

        Product cappucino = new HotDrink("Cappucino", 15, 39, 0, 0.5);
        hotDrinksVendingMachine.addProduct(2, cappucino);

        Product tea = new HotDrink("Tea", 10, 29, 0, 0.4);
        hotDrinksVendingMachine.addProduct(3, tea);

        Product hotChocolate = new HotDrink("Hot Chocolate", 10, 79, 0, 0.5);
        hotDrinksVendingMachine.addProduct(4, hotChocolate);

        hotDrinksVendingMachine.buyProduct();
    }

}
