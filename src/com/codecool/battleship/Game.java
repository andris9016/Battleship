package com.codecool.battleship;


public class Game {

    public static void main(String[] args) {
        
        int[][] fieldArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fieldArray[i][j] = 0;
            }
        }
        System.out.println("\n**** Welcome to Battle Ships game ****");
        System.out.println("      Right now, the sea is empty\n");
        
        Field field1 = new Field();
        Player player1 = new Player();

        field1.printField(fieldArray);
        player1.playerInput(fieldArray);
        field1.printField(fieldArray);
        player1.playerTurn(fieldArray);
    }

    

}