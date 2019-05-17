package com.codecool.battleship;
import java.util.Scanner;
import com.codecool.termlib.*;

public class Menu {


	public static void start(){
		Terminal terminal2 = new Terminal();
		Game newGame = new Game();
		String[] args = {};
		terminal2.clearScreen();
		// Color
		Color red = Color.RED;
		Color blue = Color.BLUE;
		Color green = Color.GREEN;
		Color yellow = Color.YELLOW;
		
		// Get ANSI codes
		String redColor = terminal2.getColor(red);
		String greenColor = terminal2.getColor(green);
		String yellowColor = terminal2.getColor(yellow);
		String reset = terminal2.getResetStyle();

		System.out.println(greenColor + "\nBattleship Game" + reset + "\n");
		System.out.print(yellowColor + "1, New Game" + reset + "\n" ); 
		System.out.print(yellowColor + "2, Exit" + reset + "\n");
		Scanner reader = new Scanner(System.in);
		char clear = reader.next().charAt(0);
		if(clear == '1') {
		    Terminal terminal = new Terminal();
		    terminal.clearScreen();
		}else if(clear == '2') {
		     System.exit(0);
		}else{
		     newGame.main(args);
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
