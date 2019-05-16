package com.codecool.battleship;


import com.codecool.termlib.*;

public class Field {

    
    public int[][] makeField() {
        int[][] fieldArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fieldArray[i][j] = 0;
            }
        }
        return fieldArray;
    }

    
    public static void printField(int[][] arr) {
        Terminal terminal = new Terminal();
        Color blue = Color.BLUE;

        for (int i = 0; i < 10; i++) {
            terminal.setColor(blue);
            System.out.print("        ");
            for (int j = 0; j < 10; j++) {
                if(arr[i][j] == 0) {
                    System.out.print(" ~~~ ");
                } else if (arr[i][j] == 0) {
                    System.out.print(" X ");
                }

            }
            terminal.resetStyle();
            System.out.println();
        }
        
    }
}
