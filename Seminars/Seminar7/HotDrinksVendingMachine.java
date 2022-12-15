package Seminars.Seminar7;

import java.util.Map;

public class HotDrinksVendingMachine extends VendingMachine {

    // public HotDrinksVendingMachine(Map<Integer, Product> products) {
    // super(products);
    // }

    public int chooseTemperature() {
        System.out.println("Укажите  желаемую температуру напитка: ");
        int temperature = scanner.nextInt();
        return temperature;
    }

    @Override
    public void addProduct(int key, Product product) {
        super.addProduct(key, product);
    }

    @Override
    public void showProducts(Map<Integer, Product> productsMap) {
        super.showProducts(productsMap);
    }

    @Override
    public int chooseProduct() {
        return super.chooseProduct();
    }

    @Override
    public void giveProduct(Product product) {
        super.giveProduct(product);
    }

    @Override
    public void buyProduct() {
        showProducts(productsMap);
        HotDrink product = (HotDrink) productsMap.get(chooseProduct());
        product.setTemperature(chooseTemperature());

        System.out.println("Вы выбрали " + product.getName() + " с температурой " + product.getTemperature()
                + "C. С вас " + product.getPrice() + " р.");

        System.out.println("Внесите деньги в автомат: ");
        float deposit = 0;

        while (true) {
            int cash = scanner.nextInt();
            deposit += cash;
            if (deposit < product.getPrice()) {
                System.out.printf("Не хватает еще %f\n", product.getPrice() - deposit);
            } else if (deposit > product.getPrice()) {
                System.out.printf("Ваша сдача %f\n", deposit - product.getPrice());
                System.out.println("Возьмите товар. Спасибо за покупку!");
                giveProduct(product);
                break;
            } else {
                System.out.println("Возьмите товар. Спасибо за покупку!");
                giveProduct(product);
                break;
            }
        }
    }

}
