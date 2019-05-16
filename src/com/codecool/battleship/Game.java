package com.codecool.battleship;

import com.codecool.termlib.*;

public class Game {

    public static void main(String[] args) {
	//Menu startmsg = new Menu();
	//String firstPlayer = startmsg.getPlayer1Name();
	//String secondPlayer = startmsg.getPlayer2Name();	
	//System.out.print(firstPlayer);
	//System.out.print(secondPlayer);

        
        Terminal terminal = new Terminal();
        Color redColor = Color.RED;
	Color greenColor = Color.CYAN;
        String red = terminal.getColor(redColor);
	String green = terminal.getColor(greenColor);
        String reset = terminal.getResetStyle();

        System.out.println("\n              " + red + "**** Welcome to Battle Ships game ****");
        System.out.println("                    Right now, the sea is empty\n" + reset);
        
        Field field1 = new Field();
        Player player1 = new Player();
        int[][] fieldArray1 = field1.makeField();

        
        Field field2 = new Field();
        Player player2 = new Player();
        int[][] fieldArray2 = field1.makeField();

        
        field1.printField(fieldArray1);
        System.out.println(green + "First player" + reset);
        player1.playerInput(fieldArray1);
	terminal.clearScreen();

        
        System.out.println(green + "Second player" + reset);
        player2.playerInput(fieldArray2);
	terminal.clearScreen();

        System.out.println(green + "First player" + reset);
        player1.playerTurn(fieldArray2);
        System.out.println(green + "Second player" + reset);
        player2.playerTurn(fieldArray1);
    }

}
