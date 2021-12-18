package application;

public class App {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
		}
/* int i = 0; is executed before the code block is first run
 * i < 5; is executed before every iteration of the code block
 * i++; is executed after every iteration of the code block
 */
		
		/* This (;;) is valid, but it's an inifite loop
		 * 
		 
		for(;;) {
			System.out.println("Hello");
		}
		*/
	}
}
