package com.codecool.battleship;

import com.codecool.termlib.*;

public class Game {

    public static void main(String[] args) {
	Terminal terminal = new Terminal();
		
	Menu startmsg = new Menu();
	startmsg.start();	
	String firstPlayer = startmsg.getPlayer1Name();
	String secondPlayer = startmsg.getPlayer2Name();
	terminal.clearScreen();

        
  
        Color redColor = Color.RED;
        String red = terminal.getColor(redColor);
        String reset = terminal.getResetStyle();

        System.out.println("\n              " + red + "**** Welcome to Battle Ships game "+firstPlayer+ " and " +secondPlayer+ " ****");
        System.out.println("                    Right now, the sea is empty\n" + reset);
        
        Field field1 = new Field();
        Player player1 = new Player();
        int[][] fieldArray1 = field1.makeField();

        
        Field field2 = new Field();
        Player player2 = new Player();
        int[][] fieldArray2 = field1.makeField();

        
        field1.printField(fieldArray1);
        System.out.println(firstPlayer);
        player1.playerInput(fieldArray1);
        field1.printField(fieldArray1);
        
        System.out.println(secondPlayer);
        player2.playerInput(fieldArray2);
        field2.printField(fieldArray2);

        System.out.println(firstPlayer);
        player1.playerTurn(fieldArray2);
        System.out.println(secondPlayer);
        player2.playerTurn(fieldArray1);
    }

}
