public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread = new Thread() { // create new thread
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello this is thread one");
				}
			}
		};

		Thread threadtwo = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i += 2) {
					System.out.println("hello this is thread two");
				}

			}
		};

		// these two statements are in the main method and begin the two threads
		// now, we start the threads
		thread.start();
		threadtwo.start();
	} // end main
}// end class ThreadDemo
