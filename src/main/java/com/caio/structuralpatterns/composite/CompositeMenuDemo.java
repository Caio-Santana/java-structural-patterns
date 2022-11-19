package com.caio.structuralpatterns.composite;

public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main","/main");

        MenuItem safetyMenuItem = new MenuItem("Safety","/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsMenu = new Menu("Claims","/claims");

        mainMenu.add(claimsMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claims","/personalClaims");

        claimsMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
