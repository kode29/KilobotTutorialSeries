import java.util.Random;

public class BySimpleIMeanSimple {
	static int dieValue;
	public static int counter;

	public static void main(String[] args) {
		rollDie();
	}

	static void rollDie() {
		counter++;
		Random rand = new Random();

		// Assign a random number between 1 and 6 as dieValue
		dieValue = rand.nextInt(6) + 1;

		System.out.println("You rolled a " + dieValue);

		// Check the value against the rules that we set
		testDieValue(dieValue);
	}

	static void testDieValue(int dieValue) {
		if (dieValue <= 2) {
			System.out.println("You lose.");
			System.out.println("You rolled " + counter + " times");
		} else if (dieValue >= 3 || dieValue <= 5) {
			System.out.println(); // spacer
			System.out.println("Rerolling...");
			System.out.println(); // spacer
			rollDie();
		} else if (dieValue == 6) {
			System.out.println("You Win!");
			System.out.println("You rolled " + counter + " times");
		}

	}// end testDieValue
}// end BySimpleIMeanSimple class
