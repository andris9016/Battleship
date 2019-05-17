package com.codecool.battleship;

import com.codecool.termlib.*;

public class Game {

    public static void main(String[] args) {
	Menu startmsg = new Menu();
	startmsg.start();
	Terminal terminal = new Terminal();
	String firstPlayer = startmsg.getPlayer1Name();
	terminal.clearScreen();
	String secondPlayer = startmsg.getPlayer2Name();
	terminal.clearScreen();

        
        
        Color redColor = Color.RED;
	Color greenColor = Color.CYAN;
        String red = terminal.getColor(redColor);
	String green = terminal.getColor(greenColor);
        String reset = terminal.getResetStyle();
	System.out.println("\n         " + red + "**** Welcome to Battle Ships game " + firstPlayer + " and " +secondPlayer+" ****");
        System.out.println("                    \n" + reset);

        
        
        Field field1 = new Field();
        Player player1 = new Player();
        int[][] fieldArray1 = field1.makeField();

        
        Field field2 = new Field();
        Player player2 = new Player();
        int[][] fieldArray2 = field2.makeField();

        //place shiips
	
        field1.printField(fieldArray1);
        System.out.println(green + firstPlayer + reset);
        player1.playerInput(fieldArray1);
	terminal.clearScreen();
	
	field2.printField(fieldArray2);
        System.out.println(green + secondPlayer + reset);
        player2.playerInput(fieldArray2);
	terminal.clearScreen();
	
	while (true){
		//attack Player One
		field2.printField(fieldArray2);
		System.out.println(green + firstPlayer + reset);
		player1.playerTurn(fieldArray2);
		terminal.clearScreen();
		try {
         		System.out.println(red + "MISSED" + reset);
			Thread.sleep(2000);
         	
		} catch(InterruptedException ex) {

		}
		terminal.clearScreen();
		
		//attack Player Two
		field1.printField(fieldArray1);
		System.out.println(green + secondPlayer + reset);
		player2.playerTurn(fieldArray1);
		terminal.clearScreen();
		try {
         		System.out.println(red + "MISSED" + reset);
			Thread.sleep(2000);
         	
		} catch(InterruptedException ex) {

		}
		terminal.clearScreen();
	}

	
    }

}
