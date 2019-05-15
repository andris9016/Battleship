package com.codecool.battleship;

import java.util.Scanner;


public class Player {

    public static void playerInput(int[][] arr) {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter your x coordinate: ");
        x = reader.nextInt();
        System.out.print("\nEnter your y coordinate: ");
        y = reader.nextInt();
        if ((x >= 10) || (y >= 10)) {
            System.out.println("Invalid");
        } else if (arr[x][y] == 1) {
            System.out.println("Already entered this point");
        } else {
            arr[x][y] = 1;
            System.out.println("\nYOUR SHIP is deployed x = " + x + " y = " + y);
        }
    }

    public static void playerTurn(int[][] arr) {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.println("ATTACK");
        System.out.print("Pleas enter the x coordinate: ");
        x = reader.nextInt();
        System.out.print("Please enter the y coordinate: ");
        y = reader.nextInt();
        if ((x >= 10) || (y >= 10)) {
            System.out.println("Invalid");
        } else if (arr[x][y] == 1) {
            System.out.println("You hit the enemy! And you WON!!!");
        }
    }
}