package com.codecool.battleship;

public class Game {

    public static void main(String[] args) {
        
        System.out.println("\n**** Welcome to Battle Ships game ****");
        System.out.println("      Right now, the sea is empty\n");
        
        Field field1 = new Field();
        field1.printField();
    }

}