import java.util.Scanner;

/**
 * 
 */

/**
 * @author hbm1
 *Lab 12 Rock, Paper, Scissors game
 */
public class RoshamboApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		//1. Prompt player for name 
		System.out.println("Please enter your name:");
		
		//2. Get user input
		String userName = scan.nextLine();
		
		//4. Prompt user to select opponent
		System.out.println("Would you like to play against Rock or Random(rock/random)?");
		
		//5. Get user opponent input
		String opponent = scan.nextLine();
		
		//6. Prompt player to select Rock, Paper, or Scissors
		System.out.println("Select Rock(0), Paper(1), or Scissors(2)");
		
		//7. Get user input
			
		int choice = scan.nextInt();
		int Roshambo = 0;
		String results = "";
		switch (choice) {
		case 0: 
			choice = 0;
			break;
		case 1:
			choice = 1;
			break;
		case 2:
			choice = 2;
			break;
			
		default:
			break;
		}
		
		//8. Display user choice
		System.out.println("Your choice: " + choice);
		
		Player humanPlayer = new HumanPlayer(userName, choice);
		humanPlayer.setName(userName);
		humanPlayer.setRoshambo(choice);
		
		humanPlayer.generateRoshambo();
		
		//9. Display opponents choice
		Player opponentPlayer = null;
		if(opponent.equalsIgnoreCase("rock")) {
			opponentPlayer = new RockPlayer();		
			
		}
		
		else if (opponent.equalsIgnoreCase("random")); {
			opponentPlayer = new RandomPlayer();
			
		}
		
		//10. Display match results
		getResults(humanPlayer, opponentPlayer);
		System.out.println(userName +": " + choice);
		System.out.println(opponentPlayer + ": " + Roshambo);
		System.out.println(getResults);

	}

	private static void getResults(Player humanPlayer, Player opponentPlayer) {
		// need to use some random function to generate random code for 
		// Rock(1), Paper(2), Scissors(3) for each player 
		//i.e. humanPlayer and opponentPlayer 
		while (choice = 0) {
			if (Roshambo = 0) {
				System.out.println("Draw!");
			}
			else if (Roshambo = 1) {
				System.out.println(opponentPlayer + " wins!");
			}
			else {
				System.out.println(userName + " wins");
			}
		while (choice = 1) {
			if(Roshambo = 0) {
				System.out.println(opponentPlayer + " wins!");
			}
			else if (Roshambo = 1) {
				System.out.println("Draw!");
			}
			else {
				System.out.println(userName + " wins!");
			}
		while (choice = 2) {
			if (Roshambo = 0) {
				System.out.println(opponentPlayer + " wins!");
			}
			else if (Roshambo = 1) {
				System.out.println(userName + " wins!");
			}
			else {
				System.out.println("Draw!");
			}
		}
			
			}
			
		}
		
		
	}

}
