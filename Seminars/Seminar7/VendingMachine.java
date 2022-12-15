package Seminars.Seminar7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class VendingMachine {

    protected Map<Integer, Product> productsMap = new HashMap<>();
    protected Scanner scanner = new Scanner(System.in);

    // public VendingMachine(Map<Integer, Product> products) {
    // this.productsMap = products;
    // }

    public void addProduct(int key, Product product) {
        productsMap.put(key, product);
    }

    public void showProducts(Map<Integer, Product> productsMap) {
        Set<Entry<Integer, Product>> set = productsMap.entrySet();
        for (Map.Entry<Integer, Product> product : set) {
            System.out.print(product.getKey() + ": ");
            System.out.println(product.getValue());
        }
    }

    public int chooseProduct() {
        System.out.println("Укажите номер товара: ");
        int productNumber = scanner.nextInt();
        return productNumber;
    }

    public void buyProduct() {
        showProducts(productsMap);
        Product product = productsMap.get(chooseProduct());
        System.out.println("Вы выбрали " + product.getName() + ". С вас " + product.getPrice() + " р.");

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

    public void giveProduct(Product product) {
        int quantity = product.getQuantity();
        product.setQuantity(quantity - 1);
    }

    // @Override
    // public String toString() {
    // return "Список продуктов: " + productsMap;
    // }

}
