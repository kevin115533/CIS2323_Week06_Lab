import Yahtzee.*;
import java.util.Scanner;

public class PlayYahtzee{
public static void main(String[] args){
	Yahtzee game = new Yahtzee();
	char cont = 'y';
	Scanner input1 = new Scanner(System.in);
	
	while(cont == 'y'){
		System.out.println("You rolled a: ");
		System.out.println("        " + game.toss());
		System.out.println("What do you want to do ?");
		System.out.println("y - Toss your dice");
		System.out.println("q - Quit game");
		cont = input1.next().charAt(0);
		input1.nextLine();
		
	}
}
}