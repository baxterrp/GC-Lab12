public enum RPS {
	ROCK, PAPER, SCISSORS;

	public static int[] compareRPS(RPS player1, RPS player2) {

		int[] win = { 1, 0, 0 };
		int[] loss = { 0, 1, 0 };
		int[] tie = { 0, 0, 1 };
		int[] output;

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

	public static String toString(String name, String getStats) {
		return name + ", " + getStats;
	}
}
