package org.skypro.skyshop.product;

public class Article implements Searchable {
    String name;
    String text;

    public Article(String title, String text) {
        this.text = text;
        this.name = title;
    }

    @Override
    public String toString() {
        return name + "\n" + text;
    }


    @Override
    public String searchTerm() {
        return "Тип article \n" + toString();
    }

    @Override
    public String getTypeContent() {
        return "Тип article";
    }

    @Override
    public String getName() {
        return name;
    }
}

interface Searchable {
    String searchTerm();

    String getTypeContent();

    String getName();

    default String getStringRepresentation() {
        return "Имя " + "-объекта—тип " + "-объекта";
    }

}
