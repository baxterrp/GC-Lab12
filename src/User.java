public class User extends Player{
	
	public void setValue(String value) {

		if (value.equals("rock")) {
			super.value = RPS.ROCK;
		} else if (value.equals("paper")) {
			super.value = RPS.PAPER;
		} else if (value.equals("scissors")) {
			super.value = RPS.SCISSORS;
		}

	}
}
