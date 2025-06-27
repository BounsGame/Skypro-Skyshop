package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private static int maxProduct = 5;
    private Product[] basket = new Product[maxProduct];


    public Product[] getBasket() {
        return basket;
    }

    public void addProduct(Product newProduct) {
        for (int i = 0; i < maxProduct; i++) {
            if (basket[i] == null) {
                basket[i] = newProduct;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int sumPrice() {
        int sum = 0;
        for (int i = 0; i < quantityProduct(); i++) {
            sum += basket[i].getPrice();
        }
        return sum;
    }

    public int quantityProduct() {
        int quantity = 0;
        for (int i = 0; i < maxProduct; i++) {
            if (basket[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }

    public void printContentsBasket() {
        if (quantityProduct() == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (int i = 0; i < quantityProduct(); i++) {
            System.out.println(basket[i].toString());
        }
        System.out.println("Итого: " + sumPrice());
    }

    public boolean checkProduct(String product) {
        for (int i = 0; i < quantityProduct(); i++) {
            if (product.equals(basket[i].getName())) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < maxProduct; i++) {
            basket[i] = null;
        }
    }

}
