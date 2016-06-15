public class Player {

	private String name;

	protected RPS value;

	public String getName() {

		return name;

	}

	public void setValue(RPS value) {
		this.value = value;
	}

	public RPS getValue() {

		return value;

	}

	public void setName(String name) {

		this.name = name;

	}

	public RPS generateRoshambo() {

		int choice = (int) (Math.random() * 3) + 1;

		switch (choice) {

		case 1:

			return RPS.ROCK;

		case 2:

			return RPS.PAPER;

		case 3:

			return RPS.SCISSORS;

		default:

			return RPS.PAPER;

		}

	}
}
