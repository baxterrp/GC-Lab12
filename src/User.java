public class User extends Player {

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

	public void generateRoshambo() {
		;
	}
}
