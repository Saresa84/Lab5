import java.util.Scanner;

public class diceRoll {

	public static void main(String[] args) {
		//open scanner
		Scanner input = new Scanner(System.in);
		int min = 1;
		//app title
		System.out.println("Welcome to the Grand Circus Casino!" + "\n");
		//set keepGoing option for app
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")) {
			System.out.print("How many faces should the dice have?: ");
			int max = input.nextInt();
			int face1= getRandom(min, max);
			int face2= getRandom(min, max);
			//display dice rolls
			System.out.println("Dice Roll:");
			System.out.println(face1 + "\n" + face2);
			//special prompt for craps, snake eyes and box cars
			printMessageForSpecials(face1, face2);
			//prompt to continue
			System.out.print("Continue y/n?: ");
			keepGoing = input.next();
		}
		input.close();
	}
	public static void printMessageForSpecials(int face1, int face2) {
		if (face1 == 1 && face2 == 1){
			System.out.println("You rolled Snake Eyes!");
		}else if (face1 + face2 == 7 || face1 + face2== 11){
			System.out.println("Your rolled Craps!");
		}else if(face1 == 6 && face2 == 6){
			System.out.println("You rolled Box Cars!");
		}
	}
	//method to get random number less than ax enter by user
	public static int getRandom(int min, int max) {
		double randomDecimal = Math.random() * (max - min) + min;
		int random = (int) randomDecimal;
		return random;
	}

}
