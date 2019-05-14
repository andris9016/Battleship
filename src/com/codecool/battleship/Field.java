package com.codecool.battleship;

public class Field {

    public static void printField(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.print("        ");
            for (int j = 0; j < 10; j++) {
                if(arr[i][j] == 0) {
                    System.out.print("~ ");
                } else if(arr[i][j] == 1) {
                    System.out.print("@ ");
                }

            }
            System.out.println();
        }
        
    }
}