package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discount;

    public DiscountedProduct(String name, int basePrice, int discount) {
        super(name);
        try {
            if (basePrice <= 0) {
                throw new IllegalArgumentException("цена должна быть больше нуля");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("цена должна быть больше нуля");
        }
        try {
            if (discount > 100 | discount < 0) {
                throw new IllegalArgumentException("скидка не может быть меньше 0 или больше 100 процентов");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("скидка не может быть меньше 0 или больше 100 процентов");
        }
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
