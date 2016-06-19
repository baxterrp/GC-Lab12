import java.util.Scanner;

public class runRPS {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String option;
		String player;

		System.out.println("What's your name?");
		User player1 = new User(scan1.nextLine());

		System.out
				.println("Who do you want to play against? Red, Blue, or Green?");
		player = Validator.getCpuName(scan1, scan1.nextLine());

		Player player2 = null;

		if (player == "Red") {
			player2 = new Cpu1("Red");
		} else if (player == "Blue") {
			player2 = new Cpu2("Blue");
		} else {
			player2 = new Cpu3("Green");
		}

		do {

			player1.generateRoshambo();

			player1.setStats(RPS.compareRPS(player1.getValue(),
					player2.play(player1.getValue())));
			System.out.println("Continue?");

			option = Validator.getContinue(scan1, scan1.nextLine());

		} while (Character.toLowerCase(option.charAt(0)) == 'y');

		// running rps.toString passing it name and getStats
		System.out.println(RPS.toString(player1.getName(), player1.getStats()));
		scan1.close();
	}

}