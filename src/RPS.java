public enum RPS {
	// rock paper scissr enums
	ROCK, PAPER, SCISSORS;

	// compareRPS takes two enum values, does logic for rock, paper, scissors
	// and returns an int array containing outcome information
	public static int[] compareRPS(RPS player1, RPS player2) {

		// used w/l/t format to store outcome of match in array
		int[] win = { 1, 0, 0 };
		int[] loss = { 0, 1, 0 };
		int[] tie = { 0, 0, 1 };
		int[] output;

		// pass player's choice of enum into switch and apply logic with if/else
		switch (player1) {
		case ROCK:
			if (player2 == PAPER) {
				output = loss;
			} else if (player2 == SCISSORS) {
				output = win;
			} else {
				output = tie;
			}
			break;
		case PAPER:
			if (player2 == ROCK) {
				output = win;
			} else if (player2 == SCISSORS) {
				output = loss;
			} else {
				output = tie;
			}
			break;
		case SCISSORS:
			if (player2 == ROCK) {
				output = loss;
			} else if (player2 == PAPER) {
				output = win;
			} else {
				output = tie;
			}
			break;
		default:
			output = tie;

		}

		return output;

	}

	// toString combines name and getStats for output
	public static String toString(String name, int[] getStats) {
		return name + ", you have " + getStats[0] + " wins, " + getStats[1]
				+ " losses, and " + getStats[2] + " ties.";
	}
}
