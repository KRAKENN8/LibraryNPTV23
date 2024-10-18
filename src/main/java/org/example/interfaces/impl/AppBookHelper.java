package org.example.interfaces.impl;

import org.example.interfaces.BookProvider;
import org.example.interfaces.Input;
import org.example.model.Author;
import org.example.model.Book;

public class AppBookHelper implements BookProvider {

    @Override
    public Book createBook(Input input) {
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setTitle(input.getInput());
        System.out.print("Количество авторов: ");
        int countAuthors = Integer.parseInt(input.getInput());
        Author[] authors = new Author[countAuthors];
        for (int i = 0; i < countAuthors; i++) {
            System.out.println("(" + (i + 1) + ") автор: ");
            Author author = new Author();
            System.out.print("Имя автора: ");
            author.setAuthorName(input.getInput());
            System.out.print("Фамилия автора: ");
            author.setAuthorSurname(input.getInput());
            authors[i] = author;
        }

        book.setAuthors(authors);

        System.out.print("Введите год публикации книги: ");
        int year = Integer.parseInt(input.getInput());  // Читаем год публикации
        book.setPublisherYear(year);  // Устанавливаем год публикации

        return book;
    }
}