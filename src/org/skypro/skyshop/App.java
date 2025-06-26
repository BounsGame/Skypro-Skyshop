package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.product;

public class App {
    public static void main(String[] args) {
        product product1 = new product(140, "Lays");
        product product2 = new product(59, "Saint Spring");
        product product3 = new product(99, "Monster");
        product product4 = new product(129, "Yogurt");
        product product5 = new product(109, "Milk");
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