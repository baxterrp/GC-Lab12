public class Cpu1 extends Player {

	// Cpu constructor
	public Cpu1(String name) {
		super(name);
	}

	// generate random number 1, 2, 3 setValue to choice
	public void generateRoshambo() {

		int choice = (int) (Math.random() * 3) + 1;

		switch (choice) {

		case 1:

			setValue(RPS.ROCK);
			break;

		case 2:

			setValue(RPS.PAPER);
			break;

		case 3:

			setValue(RPS.SCISSORS);
			break;

		}

	}

	// play runs generateRoshambo - takes choice and outputs cpu and your
	// options - uses {w, l, t} array to decide winner, returns cpu's choice
	public RPS play(RPS choice) {
		generateRoshambo();
		System.out.println(getName() + " chose " + getValue());
		System.out.println("You chose " + choice);

		int[] status = RPS.compareRPS(choice, getValue());

		if (status[0] == 1) {
			System.out.println("You won!");
		} else if (status[1] == 1) {
			System.out.println(getName() + " wins!");
		} else {
			System.out.println("Tied!");
		}

		return getValue();

	}

}
