public class Cpu3 extends Cpu1 {

	public Cpu3(String name) {
		super(name);
	}

	// choses scissors every time
	public void generateRoshambo() {

		super.setValue(RPS.SCISSORS);

	}
}
