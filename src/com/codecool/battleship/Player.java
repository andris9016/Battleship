package com.codecool.battleship;

import java.util.*;


public class Player {

    public static void playerInput(int[][] arr) {
        int rowCoordinate , colCoordinate;
        Scanner reader = new Scanner(System.in);
        do {  System.out.println("\nEnter your x coordinate between 1 & 10: ");
            while (!reader.hasNextInt()){
            System.out.println("Give me a number between 1 & 10!!");
            reader.next();
            }
            rowCoordinate = reader.nextInt();
        }while ( rowCoordinate >10 || rowCoordinate < 1);
        do { System.out.print("\nEnter your y coordinate between 1 and 10: ");
            while (!reader.hasNextInt()){
            System.out.println("Give me a number between 1 & 10");
            reader.next();
            }
            colCoordinate = reader.nextInt();
        }while (colCoordinate>10 || colCoordinate<1);
            System.out.println("\nYOUR SHIP is deployed row = " + rowCoordinate + "col  = " + colCoordinate);
        }
     public static void playerTurn(int[][] arr) {
        int rowCoordinate, colCoordinate;
        Scanner reader = new Scanner(System.in);
        do { System.out.println("ATTACK");
             System.out.println("\nEnter your y coordinate between 1 and 10: ");
            while (!reader.hasNextInt() ){
            System.out.println("Give me a number between 1 & 10");
            reader.next();
            }
            rowCoordinate = reader.nextInt();
        }while (rowCoordinate > 10 || rowCoordinate < 1);
        do { System.out.println("ATTACK");
             System.out.println("\nEnter your y coordinate between 1 and 10: ");
            while (!reader.hasNextInt() ){
            System.out.println("Give me a number between 1 & 10");
            reader.next();
            }
            colCoordinate = reader.nextInt();
        }while (colCoordinate>10 || colCoordinate<1);
            colCoordinate = reader.nextInt();
        if (arr[rowCoordinate][colCoordinate] == 1) {
            System.out.println("You hit the enemy! And you WON!!!");
        }
    }
  
}
