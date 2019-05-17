package com.codecool.battleship;

import java.util.Scanner;
import com.codecool.termlib.*;




public class Player {

    public static void playerInput(int[][] arr) {

        int x, y;

	// set colors 
	Terminal terminal = new Terminal();
	Color magentaColor = Color.MAGENTA;
	Color redColor = Color.RED;
	Color greenColor = Color.GREEN;

	// Get ANSI codes
	String magenta = terminal.getColor(magentaColor);
	String red = terminal.getColor(redColor);
	String green = terminal.getColor(greenColor);
        String reset = terminal.getResetStyle();


        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter your " + magenta + "Row" + reset + " coordinate to place your Ship: \n ");
        x = reader.nextInt()-1;
        System.out.print("\nEnter your " + magenta + "Column" + reset + " coordinate to place your Ship: \n");
        y = reader.nextInt()-1;
        while((x >= 10) || (y >= 10)) {
            System.out.println(red + "\nInvalid coordinates!\n" + reset);
            System.out.print("\nEnter your " + magenta + "Row" + reset + " coordinate to place your Ship: \n ");
            x = reader.nextInt()-1;
            System.out.print("\nEnter your " + magenta + "Column" + reset + " coordinate to place your Ship: \n ");
            y = reader.nextInt()-1;
        }
        if (arr[x][y] == 1) {
            System.out.println(red + "This field is not Empty" + reset);
        } else {
            arr[x][y] = 1;
        }
    }

    public static void playerTurn(int[][] arr) {
        int x, y;

	// set colors 
	Terminal terminal = new Terminal();
	Color magentaColor = Color.MAGENTA;
	Color redColor = Color.RED;
	Color yellowColor = Color.YELLOW;
	Color greenColor = Color.GREEN;

	// Get ANSI codes
	String magenta = terminal.getColor(magentaColor);
	String red = terminal.getColor(redColor);
	String yellow = terminal.getColor(yellowColor);
	String green = terminal.getColor(greenColor);
        String reset = terminal.getResetStyle();


        Scanner reader = new Scanner(System.in);
        System.out.println(red + "\n	ATTACK!!!" + reset);
        System.out.print("\nEnter your " + magenta + "Row" + reset + " coordinate: \n ");
        x = reader.nextInt()-1;
        System.out.print("\nEnter your " + magenta + "Column" + reset + " coordinate: \n");
        y = reader.nextInt()-1;
        if ((x >= 10) || (y >= 10)) {
            System.out.println(red + "\nInvalid coordinates!\n" + reset);
        } else if(arr[x][y] == 0){
		arr[x][y] = 2;
		
	} else if (arr[x][y] == 1) {
            System.out.println(green + "You hit the enemy! And you WON!!!" + reset);
	    System.exit(0);	
        }
    }

    
}
