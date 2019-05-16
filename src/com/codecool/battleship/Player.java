package com.codecool.battleship;

import java.util.Scanner;


public class Player {

    public static void playerInput(int[][] arr) {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter your row coordinate: ");
        x = reader.nextInt()-1;
        System.out.print("\nEnter your column coordinate: ");
        y = reader.nextInt()-1;
        while((x >= 10) || (y >= 10)) {
            System.out.println("Invalid");
            System.out.print("\nEnter your row coordinate: ");
            x = reader.nextInt()-1;
            System.out.print("\nEnter your column coordinate: ");
            y = reader.nextInt()-1;
        }
        if (arr[x][y] == 1) {
            System.out.println("Already entered this point");
        } else {
            arr[x][y] = 1;
            System.out.println("\nYOUR SHIP is deployed x = " + (x+1) + " y = " + (y+1));
        }
    }

    public static void playerTurn(int[][] arr) {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.println("ATTACK");
        System.out.print("Pleas enter the x coordinate: ");
        x = reader.nextInt()-1;
        System.out.print("Please enter the y coordinate: ");
        y = reader.nextInt()-1;
        if ((x >= 10) || (y >= 10)) {
            System.out.println("Invalid");
        } else if (arr[x][y] == 1) {
            System.out.println("You hit the enemy! And you WON!!!");
        }
    }
}