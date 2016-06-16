import java.util.Scanner;

public class runRPS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String option;
		String player;

		System.out.println("What's your name?");
		User player1 = new User(scan.nextLine());

		Cpu1 red = new Cpu1("Red");
		Cpu2 blue = new Cpu2("Blue");

		System.out.println("Who do you want to play against? Red or Blue?");
		player = scan.nextLine();

		do {
			System.out.print("Rock, paper, or scissors?");

			player1.setValue(scan.nextLine().toLowerCase());
			if (player.equals("Red")) {
				player1.setStats(RPS.compareRPS(player1.getValue(),
						red.play(player1.getValue())));
			} else {
				player1.setStats(RPS.compareRPS(player1.getValue(),
						blue.play(player1.getValue())));
			}
			System.out.println("Continue?");
			option = scan.nextLine();
		} while (Character.toLowerCase(option.charAt(0)) == 'y');

		System.out.println(RPS.toString(player1.getName(), player1.getStats()));

		scan.close();
	}

}