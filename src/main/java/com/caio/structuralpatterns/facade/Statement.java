package com.caio.structuralpatterns.facade;

import java.io.Closeable;
import java.io.IOException;

public class Statement implements Closeable {
    public int executeUpdate(String s) {
        return 1;
    }

    @Override
    public void close() throws IOException {

    }

    public ResultSet executeQuery(String s) {
        return new ResultSet();
    }
}
