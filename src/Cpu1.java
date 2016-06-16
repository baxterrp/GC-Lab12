public class Cpu1 extends Player {

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

	public RPS play(RPS choice) {
		generateRoshambo();
		System.out.println(getName() + " chose " + getValue());
		System.out.println("You chose " + choice);

		return getValue();

	}

}
