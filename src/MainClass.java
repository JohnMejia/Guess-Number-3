
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Guess the number I'm thinking of.It's between 1-10");
		Scanner tKeyboard = new Scanner(System.in);
		int i = 0 + (int) (Math.random() * 10);
		int tInput = 0;

		do {
			tInput = tKeyboard.nextInt();

			if (tInput == i) {
				System.out.println("You've guessed it!");
			} else if (tInput != i) 
			{
				System.out.println("Wrong.");
				if (tInput < i )
				{
					System.out.println("Too small.");
				}
				else
				{
					System.out.println("Too large.");
				}
			}
		} while (tInput != i);
		
	}

}

