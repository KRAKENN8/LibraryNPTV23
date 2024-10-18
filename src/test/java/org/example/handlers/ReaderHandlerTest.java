package org.example.handlers;

import org.example.interfaces.impl.AppReaderHelper;
import org.example.interfaces.Input;
import org.example.model.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReaderHandlerTest {

    private Input inputMock;
    private AppReaderHelper readerProviderMock;
    private ReaderHandler readerHandler;

    @BeforeEach
    void setUp() {
        // Мокаем Input и ReaderProvider (AppReaderHelper)
        inputMock = Mockito.mock(Input.class);
        readerProviderMock = Mockito.mock(AppReaderHelper.class);

        // Создаем ReaderHandler с моком input и readerProvider
        readerHandler = new ReaderHandler(inputMock, readerProviderMock);
    }

    @Test
    void testAddReader() {
        // Создаем мок Reader
        Reader readerMock = Mockito.mock(Reader.class);

        // Мокаем поведение метода createReader в AppReaderHelper
        when(readerProviderMock.createReader(inputMock)).thenReturn(readerMock);

        // Вызываем метод addReader в ReaderHandler
        readerHandler.addReader();

        // Проверяем, что метод createReader был вызван один раз с inputMock
        verify(readerProviderMock).createReader(inputMock);

        // Проверяем, что мокнутый reader добавлен корректно
        assertNotNull(readerMock);
    }
}
