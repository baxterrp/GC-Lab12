public abstract class Player {

	private String name;
	private int wins;
	private int losses;
	private int ties;
	private RPS value;

	// constructor for player
	public Player(String name) {
		this.name = name;
	}

	// setStats takes a 3 digit integer array with {w, l, t} format - stores
	// each index in corresponding variable
	public void setStats(int[] score) {
		wins += score[0];
		losses += score[1];
		ties += score[2];
	}

	// get stats returns win, loss, tie variables
	public int[] getStats() {
		int[] stats = { wins, losses, ties };

		return stats;
	}

	// getName
	public String getName() {

		return name;

	}

	// setValue
	public void setValue(RPS value) {
		this.value = value;
	}

	// getValue
	public RPS getValue() {

		return value;

	}

	public abstract RPS play(RPS choice);

	// abstract
	public abstract void generateRoshambo();

}
