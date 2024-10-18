package org.example;

import org.example.handlers.BookHandler;
import org.example.handlers.ReaderHandler;
import org.example.interfaces.BookProvider;
import org.example.interfaces.Input;
import org.example.interfaces.ReaderProvider;
import org.example.interfaces.impl.AppBookHelper;
import org.example.interfaces.impl.AppReaderHelper;
import org.example.interfaces.impl.ConsoleInput;

public class LibraryNPTV23 {
    public static void main(String[] args) {
        Input inputProvider = new ConsoleInput();  // Initialize ConsoleInput
        BookProvider bookProvider = new AppBookHelper();  // Initialize BookProvider
        ReaderProvider readerProvider = new AppReaderHelper();  // Initialize ReaderProvider
        BookHandler bookHandler = new BookHandler(inputProvider, bookProvider);  // Pass BookHandler
        ReaderHandler readerHandler = new ReaderHandler(inputProvider, readerProvider);  // Pass ReaderHandler

        System.out.println("-------------NPTV23Library-------------Vers+1.00.05");
        App app = new App(bookHandler, readerHandler, inputProvider);  // Pass both handlers
        app.run();  // Start the application
    }
}
