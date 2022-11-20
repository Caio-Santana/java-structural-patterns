package com.caio.structuralpatterns.facade;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultSet implements Closeable {

    private boolean hasNext = true;

    public boolean next() {
        if (hasNext) {
            hasNext = false;
            return true;
        }

        return hasNext;
    }

    public String getString(Integer index) {
        Map map = new HashMap<Integer,String>();
        map.put(1,"1");
        map.put(2,"123 Street");
        map.put(3,"Rainbow City");
        return (String) map.get(index);
    }

    @Override
    public void close() throws IOException {

    }
}
