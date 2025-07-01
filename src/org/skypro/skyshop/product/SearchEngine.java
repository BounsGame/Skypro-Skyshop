package org.skypro.skyshop.product;

public class SearchEngine {
    private Searchable[] searchable;
    private static int counter = 0;

    public SearchEngine(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("размер массива должен быть больше 0");
        }
        this.searchable = new Searchable[size];
    }

    public Searchable[] search(String text) {
        Searchable[] find = new Searchable[5];
        int i = 0;
        for (Searchable searchable1 : searchable) {
            if (searchable1.searchTerm().contains(text)) {
                find[i] = searchable1;
                i++;
            }
            if (i == 5) {
                break;
            }
        }
        return find;
    }

    public void add(Searchable newElement) {
        searchable[counter] = newElement;
        counter++;
    }
}
