/*
Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
rights reserved.
*/
package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

// A class that implements the BookDao interface
public class MemBookDao implements BookDao {

    private List<Book> books;

    // Adding 5 books to the array
    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("9780385504225", "The Lost Symbol",
                "A gripping mystery novel by Dan Brown that takes readers on a thrilling journey through the hidden secrets of Washington, D.C.",
                528, new ArrayList<>(List.of("Dan Brown"))));

        this.books.add(new Book("9780385541190", "The Whistler",
                "The Whistler by John Grisham is a legal thriller that centers on an investigation of corrupt business operations involving Native American gaming.",
                384, new ArrayList<>(List.of("John Grisham"))));

        this.books.add(new Book("059305430X", "The Traveler",
                "The Traveler by John Twelve Hawks explores a parallel world that exists alongside our own. A world that exists in the shadows of our own.",
                449, new ArrayList<>(List.of("John Twelve Hawks"))));

        this.books.add(new Book("9781250178657", "The Women: A Novel",
                "Kristin Hannah shines a light on the story of all women who put themselves in harm's way to help others.",
                464, new ArrayList<>(List.of("Kristin Hannah"))));

        this.books.add(new Book("9781668002179", "Fairy Tale",
                "Stephen King goes deep into the well of his imagination in this spellbinding novel about a seventeen-year-old boy who inherits the keys to a parallel world.",
                608, new ArrayList<>(List.of("Stephen King"))));
    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}