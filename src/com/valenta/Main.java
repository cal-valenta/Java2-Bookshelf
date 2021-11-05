package com.valenta;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {





        Book b4 = new ChildrensBook("Java for Kids", "Logan", "Calvin");



        Book b1 = new Book("Java Generics", "Cal");
        Book b2 = new Book("Java Collections", "Cal");
        Book b3 = new Book("Java Collections", "Logan");

        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(b1);
        bookshelf.add(b2);
        bookshelf.add(b3);
        bookshelf.add(0, b4);

        for(int i = 0; i < bookshelf.size(); i++){
            System.out.println(bookshelf.get(i));

        }
        bookshelf.remove(0);
        bookshelf.indexOf(b1);
        bookshelf.indexOf(b2);
        bookshelf.indexOf(b3);
        bookshelf.indexOf(b4);

        bookshelf.set(1, b4);
        bookshelf.forEach(System.out::println);


    }
}

