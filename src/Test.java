import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Random myRandom = new Random();
		Scanner myScanner = new Scanner(System.in);
		
		int playerOne,playerTwo;
		int randomNumber;
		int counter = 3;
		int playerOneCounter = 0,playerTwoCounter = 0, draws = 0;
		String playerOneName,playerTwoName;
		
		System.out.println("Enter Player One Name");
		playerOneName = myScanner.next();
		
		System.out.println("Enter Player Two Name");
		playerTwoName = myScanner.next();
		
			
		do {
			System.out.println("-----------------------------------------------");
			randomNumber = 1 + myRandom.nextInt(10);
			
			System.out.println("Guess my Random number to win $1,000");
			
			System.out.println();
			
			System.out.println("Enter Your guess number "+playerOneName);
			
			playerOne = myScanner.nextInt();
			
			System.out.println("Your Turn "+playerTwoName);
			
			playerTwo = myScanner.nextInt();
			
			if(playerTwo == randomNumber && playerOne == randomNumber) {
				System.out.println("You both got it..DRAW!");
				counter--;
				draws++;
				System.out.println("You have "+counter+" more game(s)");
			}
			
			else if(playerOne == randomNumber) {
				playerOneCounter++;
				System.out.println("Correct "+playerOneName+", You Guessed Right ");
				counter--;
				System.out.println("You have "+counter+" more game(s)");
			}
			else if(playerTwo == randomNumber) {
				System.out.println("Correct "+playerTwoName+", You Guessed Right ");
				playerTwoCounter++;
				counter--;
				System.out.println("You have "+counter+" more game(s)");
			}
			
			else {
				counter--;
				System.out.println("My random Number was "+randomNumber);
				System.out.println("You have "+counter+" more game(s)");
			}
			
		}while(playerOne != 0 && counter!=0);
		
		System.out.println();
		
		System.out.println("Statistics ----------");
		
		System.out.println(playerOneName+" WON "+playerOneCounter+" games ");
		System.out.println(playerTwoName+" WON "+playerTwoCounter+" games ");
		System.out.println("DRAWS "+draws);
		
		if (playerOneCounter > playerTwoCounter) {
			System.out.println(playerOneName+" WINS!");
		}
		else if(playerOneCounter < playerTwoCounter) {
			System.out.println(playerTwoName+" WINS!");
		}
		else {
			System.out.println("AWWWWW its a Draw!");
		}
		
		System.out.println("GAME OVER!");*/
		
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		/*String alphabet = scanner.next().toLowerCase();
		boolean upperCase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
		boolean lowerCase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
		boolean vowels = alphabet.equals("a") || alphabet.equals("e")||alphabet.equals("i")
				|| alphabet.equals("o")|| alphabet.equals("u");
		
		if (vowels) {
			System.out.println("Input is a vowel");
		}
		else if (!(upperCase || lowerCase)) {
			System.out.println("Input is not a letter!");
		}
		else {
			System.out.println("Input is a consonant");
		}*/
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Print Leap Year");
        }
		else {
			System.out.println("Not Print Leap Year");
        }
		
	}
}