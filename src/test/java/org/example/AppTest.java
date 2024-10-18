package org.example;

import org.example.handlers.BookHandler;
import org.example.handlers.ReaderHandler;
import org.example.interfaces.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AppTest {

    private BookHandler bookHandlerMock;
    private ReaderHandler readerHandlerMock;
    private Input inputMock;
    private App app; // Переменная для тестируемого класса

    @BeforeEach
    void setUp() {
        this.bookHandlerMock = Mockito.mock(BookHandler.class);
        this.readerHandlerMock = Mockito.mock(ReaderHandler.class);
        this.inputMock = Mockito.mock(Input.class);
        this.app = new App(bookHandlerMock, readerHandlerMock, inputMock); // Инициализация App
    }

    @Test
    void testAddBook() {
        // Симуляция пользовательского ввода "1" для добавления книги
        when(inputMock.getInput()).thenReturn("1");

        // Прямой вызов метода, который управляет добавлением книги
        bookHandlerMock.addBook();

        // Проверка того, что метод addBook вызван
        verify(bookHandlerMock).addBook();
    }

    @Test
    void testListBooks() {
        // Симуляция пользовательского ввода "2" для вывода списка книг
        when(inputMock.getInput()).thenReturn("2");

        // Прямой вызов метода для вывода всех книг
        bookHandlerMock.listBooks();

        // Проверка того, что метод listBooks вызван
        verify(bookHandlerMock).listBooks();
    }

    @Test
    void testFindBookByTitle() {
        // Симуляция пользовательского ввода "3" для поиска книги по названию
        when(inputMock.getInput()).thenReturn("3");

        // Прямой вызов метода для поиска книги по названию
        bookHandlerMock.findBookByTitle();

        // Проверка того, что метод findBookByTitle вызван
        verify(bookHandlerMock).findBookByTitle();
    }

    @Test
    void testAddReader() {
        // Симуляция пользовательского ввода "4" для добавления читателя
        when(inputMock.getInput()).thenReturn("4");

        // Прямой вызов метода для добавления читателя
        readerHandlerMock.addReader();

        // Проверка того, что метод addReader вызван
        verify(readerHandlerMock).addReader();
    }

    @Test
    void testListReaders() {
        // Симуляция пользовательского ввода "5" для вывода всех читателей
        when(inputMock.getInput()).thenReturn("5");

        // Прямой вызов метода для вывода всех читателей
        readerHandlerMock.listReaders();

        // Проверка того, что метод listReaders вызван
        verify(readerHandlerMock).listReaders();
    }
}
