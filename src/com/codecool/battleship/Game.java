package com.codecool.battleship;

import java.util.Scanner;

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
        field1.printField(fieldArray);
        playerInput(fieldArray);
        field1.printField(fieldArray);
    }

    public static void playerInput(int[][] arr) {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your x coordinate: ");
        x = reader.nextInt();
        System.out.print("Enter your y coordinate: ");
        y = reader.nextInt();
        if ((x >= 10) || (y >= 10)) {
            System.out.println("invalid");
        } else if (arr[x][y] == 1) {
            System.out.println("already entered,plz enter again:");
        } else {
            arr[x][y] = 1;
            System.out.println("YOUR SHIP is deployed x = " + x + " y = " + y);
        }
    }

}