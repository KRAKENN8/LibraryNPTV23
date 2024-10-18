package org.example;

import org.example.handlers.BookHandler;
import org.example.handlers.ReaderHandler;
import org.example.interfaces.Input;
import org.example.model.Book;
import org.example.model.Reader;

public class App {
    public static Book[] books = new Book[100];
    public static Reader[] readers = new Reader[100];  // Добавили массив для хранения читателей

    private final BookHandler bookHandler;
    private final ReaderHandler readerHandler;  // Добавили ReaderHandler
    private final Input inputProvider;

    // Constructor accepting handlers
    public App(BookHandler bookHandler, ReaderHandler readerHandler, Input inputProvider) {
        this.bookHandler = bookHandler;
        this.readerHandler = readerHandler;
        this.inputProvider = inputProvider;
    }

    // Main method to run the application
    public void run() {
        System.out.println("------ Библиотека группы NPTV23 ------");
        System.out.println("--------------------------------------");
        boolean repeat = true;
        do {
            // Печатаем меню
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Вывести все книги");
            System.out.println("3. Поиск книги по названию");
            System.out.println("4. Добавить читателя");
            System.out.println("5. Вывести всех читателей");
            System.out.print("Введите номер задачи: ");

            int task = Integer.parseInt(inputProvider.getInput());

            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("----- Добавление книги -----");
                    bookHandler.addBook();
                    break;
                case 2:
                    System.out.println("----- Список книг -----");
                    bookHandler.listBooks(); // Выводим все книги
                    break;
                case 3:
                    System.out.println("----- Поиск книги -----");
                    bookHandler.findBookByTitle(); // Ищем книгу по названию
                    break;
                case 4:
                    System.out.println("----- Добавление читателя -----");
                    readerHandler.addReader();
                    break;
                case 5:
                    System.out.println("----- Список читателей -----");
                    readerHandler.listReaders();
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");
                    break;
            }
        } while (repeat);

        // Print exit message
        System.out.println("До свидания :)");
    }
}
