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

	public void setStats(int[] score) {
		wins += score[0];
		losses += score[1];
		ties += score[2];
	}

	public String getStats() {
		return "you have " + wins + " win(s), " + losses + " loss(es), " + ties
				+ " tie(s).";
	}

	public void setName(String name) {

		this.name = name;

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
	
}
