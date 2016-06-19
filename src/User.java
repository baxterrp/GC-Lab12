import java.util.Scanner;

public class User extends Player {
	Scanner scan = new Scanner(System.in);

	// user constructor
	public User(String name) {
		super(name);
	}

	// setValue for User takes string input
	public RPS play(RPS choice) {
		super.setValue(choice);

		return choice;
	}

	// gets input from user, runs setValue with choice
	public void generateRoshambo() {
		String choice;
		System.out.print("Rock, paper, or scissors?");

		choice = Validator.getAttackChoice(scan, scan.nextLine().toLowerCase());

		if (choice.equals("rock")) {
			play(RPS.ROCK);
		} else if (choice.equals("paper")) {
			play(RPS.PAPER);
		} else if (choice.equals("scissors")) {
			play(RPS.SCISSORS);
		}

	}
}
