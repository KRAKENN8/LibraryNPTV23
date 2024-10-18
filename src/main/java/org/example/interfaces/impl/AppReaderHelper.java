package org.example.interfaces.impl;

import org.example.interfaces.Input;
import org.example.interfaces.ReaderProvider;
import org.example.model.Reader;

public class AppReaderHelper implements ReaderProvider {

    @Override
    public Reader createReader(Input inputProvider) {
        System.out.print("Введите имя читателя: ");
        String name = inputProvider.getInput();
        System.out.print("Введите фамилию читателя: ");
        String surname = inputProvider.getInput();
        System.out.print("Введите номер телефона читателя: ");
        String phone = inputProvider.getInput();

        return new Reader(name, surname, phone);
    }
}
