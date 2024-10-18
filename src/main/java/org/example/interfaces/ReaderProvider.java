package org.example.interfaces;

import org.example.model.Reader;

public interface ReaderProvider {
    Reader createReader(Input inputProvider);  // Method to create a reader using input
}
