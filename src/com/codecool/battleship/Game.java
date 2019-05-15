package com.codecool.battleship;

import com.codecool.termlib.*;

public class Game {

    public static void main(String[] args) {
        
        int[][] fieldArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fieldArray[i][j] = 0;
            }
        }

        Terminal terminal = new Terminal();
        Color redColor = Color.RED;
        String red = terminal.getColor(redColor);

        String reset = terminal.getResetStyle();

        System.out.println("\n                    " + red + "**** Welcome to Battle Ships game ****");
        System.out.println("                          Right now, the sea is empty\n" + reset);
        
        Field field1 = new Field();
        Player player1 = new Player();

        field1.printField(fieldArray);
        player1.playerInput(fieldArray);
        field1.printField(fieldArray);
        player1.playerTurn(fieldArray);
    }

}