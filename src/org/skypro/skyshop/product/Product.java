package org.skypro.skyshop.product;

public class Product {
    private String name;
    private int price;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}
