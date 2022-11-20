package com.caio.structuralpatterns.facade;

import java.util.List;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address a : addresses) {
            System.out.println("ID:"+a.getId() +", City:"+a.getCity()+", Street:"+a.getStreetName());
        }
    }
}
