import java.util.Random;

public class CoinTossSwitch {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomInt = rand.nextInt(2); // it shouldn't go above 1, since it
											// has a max of 2 #'s, starting from
											// 0 (0, 1)

		System.out.println(randomInt);

		switch (randomInt) {
		case 0:
			System.out.println("Tails!");
			break;
		case 1:
			System.out.println("Heads!");
			break;
		case 2:
			System.out.println("Your system is broken.");
			break;
		}// end switch
	}// end main
}// end class CoinTossSwitch
