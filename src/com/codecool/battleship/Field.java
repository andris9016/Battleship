package com.codecool.battleship;


import com.codecool.termlib.*;

public class Field {

    
    public static void printField(int[][] arr) {
        Terminal terminal = new Terminal();
        Color blue = Color.BLUE;
        Color whiteBg = Color.WHITE_BACKGROUND;

        for (int i = 0; i < 10; i++) {
            terminal.setColor(blue);
            System.out.print("        ");
            terminal.setBgColor(whiteBg);
            for (int j = 0; j < 10; j++) {
                if(arr[i][j] == 0) {
                    System.out.print(" ~~~~ ");
                } else if(arr[i][j] == 1) {
                    System.out.print("__/\\__");
                }

            }
            terminal.resetStyle();
            System.out.println();
        }
        
    }
}