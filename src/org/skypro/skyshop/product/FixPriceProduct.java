package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    static final int PRICE = 109;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public String toString() {
        return name + ": фиксированная цена " + PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String searchTerm() {
        return "Тип fix price product, название " + name;
    }

    @Override
    public String getTypeContent() {
        return "Тип fix price product";
    }
}
