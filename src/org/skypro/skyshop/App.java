package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product(140, "Lays");
        Product product2 = new Product(59, "Saint Spring");
        Product product3 = new Product(99, "Monster");
        Product product4 = new Product(129, "Yogurt");
        Product product5 = new Product(109, "Milk");
        ProductBasket basket1 = new ProductBasket();
        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);
        basket1.addProduct(product4);
        basket1.addProduct(product5);
        basket1.addProduct(product1);
        basket1.printContentsBasket();

        if (basket1.checkProduct("Monster")) {
            System.out.println("Тавар есть в корзине");
        } else {
            System.out.println("Тавара нет в корзине");
        }

        if (basket1.checkProduct("Perfume")) {
            System.out.println("Тавар есть в корзине");
        } else {
            System.out.println("Тавара нет в корзине");
        }

        basket1.clearBasket();
        basket1.printContentsBasket();

        if (basket1.checkProduct("Monster")) {
            System.out.println("Тавар есть в корзине");
        } else {
            System.out.println("Тавара нет в корзине");
        }
    }
}