package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    protected String name;


    public Product(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("название не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String searchTerm() {
        return "Тип PRODUCT, название " + name;
    }

    @Override
    public String getTypeContent() {
        return "Тип PRODUCT";
    }
}
