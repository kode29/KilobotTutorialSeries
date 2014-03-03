public class MathLearning {
	// These are class-wide variables
	static double a = 10;
	static double b = 15;
	static double c = 22;

	// Set up a counter
	static double counter = 0; // the "= 0" isn't necessary (since Java already
								// declares it "0" by default), but it helps
								// with documentation

	// "public" means that it can be accessed outside the class
	// "static" means that this belongs to a class, not an instance of a class
	// "void" means that it doesn't return anything
	public static void main(String[] args) {
		// static variables declared inside here can only have "final"
		// declarations

		// These are local variables
		double result;
		double resultTwo;
		double resultThree;
		double resultFour;
		double resultFive;

		// These assign values to the local variables (could have done it above,
		// but the clarification is here)
		result = a + b;
		resultTwo = a - b;
		resultThree = a * c;
		resultFour = c / b; // integer returning c / b, rounded to 0 decimals.
							// changing the declarations to "double" allow for
							// decimals
		resultFive = c % b; // modulator

		// Invoke the blah() method (output) - again, could have done it above,
		// but this is for clarification)
		blah(result);
		blah(resultTwo);
		blah(resultThree);
		blah(resultFour);
		blah(resultFive);
	}

	public static void blah(double output) {
		// Add to the counter
		counter++;

		// output the variable provided to us
		System.out.println("Result " + counter + " is " + output);
	}
}