public enum RPS {
	ROCK, PAPER, SCISSORS;

	public static String compareRPS(RPS player1, RPS player2) {

		String output = "";

		switch (player1) {
		case ROCK:
			if (player2 == PAPER) {
				output = "lose";
			} else if (player2 == SCISSORS) {
				output = "win";
			} else {
				output = "tie";
			}
			break;
		case PAPER:
			if (player2 == ROCK) {
				output = "win";
			} else if (player2 == SCISSORS) {
				output = "lose";
			} else {
				output = "tie";
			}
			break;
		case SCISSORS:
			if (player2 == ROCK) {
				output = "lose";
			} else if (player2 == PAPER) {
				output = "win";
			} else {
				output = "tie";
			}
			break;

		}

		return output;

	}
}
