package com.codecool.battleship;

public class Field {

    public static void printField() {
        for (int i = 0; i < 10; i++) {
            System.out.print("        ");
            for (int j = 0; j < 10; j++) {
                System.out.print("~ ");
            }
            System.out.println();
        }
        
    }
}