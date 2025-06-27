package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    int basePrice;
    int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return basePrice * (100 - discount) / 100;
    }

    @Override
    public String toString() {
        return name + ": " + basePrice + " " + discount + "%";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
