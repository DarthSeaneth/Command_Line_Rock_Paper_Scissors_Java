import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	static Scanner console = new Scanner(System.in);
	static Random random = new Random();
	static int wins = 0;
	static int losses = 0;
	static int ties = 0;
	static String choice;
	public static void main(String[] args) {
		System.out.println("Would you like to play Rock, Paper, Scissors? (y/n)");
		choice = console.next();
		while (!(choice.equals("n")) && !(choice.equals("y"))) {
			System.out.println("Invalid input; please try again");
			System.out.println("Would you like to play Rock, Paper, Scissors? (y/n)");
			choice = console.next();
		}
		while (!(choice.equals("n")) && choice.equals("y")) {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			String userInput = getUserInput();
			String computerInput = getComputerInput();
			System.out.println("Your opponent chose " + computerInput);
			getScore(userInput, computerInput);
			printScore();
			System.out.println("Would you like to play again? (y/n)");
			choice = console.next();
			while (!(choice.equals("n")) && !(choice.equals("y"))) {
				System.out.println("Invalid input; please try again");
				System.out.println("Would you like to play again? (y/n)");
				choice = console.next();
			}
		}
	}
	public static String getUserInput() {
		System.out.println("Please choose your option (Rock, Paper, or Scissors):");
		String x = console.next();
		x = x.toLowerCase();
		while((!(x.equals("rock"))) && (!(x.equals("paper"))) && (!x.equals("scissors"))) {
			System.out.println("Invalid input; please try again");
			x = console.next();
			x = x.toLowerCase();
		}
		System.out.println("You chose " + x);
		return x;
	}
	public static String getComputerInput() {
		int y = random.nextInt(3);
		if (y == 0) {
			return "rock";
		}
		else if (y == 1) {
			return "paper";
		}
		else {
			return "scissors";
		}
	}
	public static int getScore(String x, String y) {
		if (x.equals(y)) {
			System.out.println("It is a tie!");
			ties ++;
			return ties;
		}
		else if(x.equals("rock") && y.equals("paper")) {
			System.out.println("Your opponent won this round!");
			losses ++;
			return losses;
		}
		else if (x.equals("rock") && (y.equals("scissors"))){
			System.out.println("You won this round!");
			wins ++;
			return wins;
		}
		else if (x.equals("paper") && (y.equals("rock"))) {
			System.out.println("You won this round!");
			wins ++;
			return wins;
		}
		else if (x.equals("paper") && y.equals("paper")) {
			System.out.println("It is a tie!");
			ties ++;
			return ties;
		}
		else if (x.equals("paper") && y.equals("scissors")) {
			System.out.println("Your opponent won this round!");
			losses ++;
			return losses;
		}
		else if (x.equals("scissors") && y.equals("rock")) {
			System.out.println("Your opponet won this round!");
			losses ++;
			return losses;
		}
		else if (x.equals("scissors") && y.equals("paper")) {
			System.out.println("You won this round!");
			wins ++ ;
			return wins;
		}
		else {
			System.out.println("It is a tie!");
			ties ++;
			return ties;
		}
	}
	public static void printScore() {
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Ties: " + ties);
	}
}