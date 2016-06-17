import java.util.Scanner;

public class User extends Player {
	Scanner scan = new Scanner(System.in);

	// user constructor
	public User(String name) {
		super(name);
	}

	// setValue for User takes string input
	public void setValue(String value) {

		if (value.equals("rock")) {
			super.setValue(RPS.ROCK);
		} else if (value.equals("paper")) {
			super.setValue(RPS.PAPER);
		} else if (value.equals("scissors")) {
			super.setValue(RPS.SCISSORS);
		}

	}

	// gets input from user, runs setValue with choice
	public void generateRoshambo() {
		System.out.print("Rock, paper, or scissors?");
		setValue(Validator.getAttackChoice(scan, scan.nextLine().toLowerCase()));

	}
}
