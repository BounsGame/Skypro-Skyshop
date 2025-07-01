package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(int price, String name) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }

    @Override
    public String searchTerm() {
        return "Тип simple product, название " + name;
    }

    @Override
    public String getTypeContent() {
        return "Тип simple product";
    }
}
