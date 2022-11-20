package com.caio.structuralpatterns.facade;

public class DbSingleton {

    private static DbSingleton instance;

    private DbSingleton() {

    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            return new DbSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return new Connection();
    }
}
