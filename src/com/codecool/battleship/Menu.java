package com.codecool.battleship;
import java.util.Scanner;
import com.codecool.termlib.*;

public class Menu {


	public static void start(){
		Terminal terminal2 = new Terminal();

		// Color
		Color red = Color.RED;
		Color blue = Color.BLUE;
		Color green = Color.GREEN;
		
		// Get ANSI codes
		String redColor = terminal2.getColor(red);
		String greenColor = terminal2.getColor(green);
		String reset = terminal2.getResetStyle();

		System.out.println(greenColor + "Battleship Game" + reset + "\n");
		System.out.print("1, New Game" + "\n"); 
		System.out.print("2, Exit" + "\n");
		Scanner reader = new Scanner(System.in);
		char clear = reader.next().charAt(0);
		if(clear == '1') {
		    Terminal terminal = new Terminal();
		    terminal.clearScreen();
		}
		
		Terminal terminal = new Terminal();
		terminal.clearScreen();
	}
	public String getPlayer1Name(){
		System.out.print("First player name: ");
		Scanner player1 = new Scanner(System.in);
		String player1Name = player1.nextLine();
		return player1Name;
}
	public String getPlayer2Name(){
		System.out.print("Second player name: ");
		Scanner player2 = new Scanner(System.in);
		String player2Name = player2.nextLine();
		return player2Name;
}
}