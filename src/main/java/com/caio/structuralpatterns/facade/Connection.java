package com.caio.structuralpatterns.facade;

import java.io.Closeable;
import java.io.IOException;

public class Connection implements Closeable {
    public Statement createStatement() {
        return new Statement();
    }

    @Override
    public void close() throws IOException {

    }
}
