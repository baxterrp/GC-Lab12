import java.util.Scanner;

public class runRPS {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String option;
		String player;

		System.out.println("What's your name?");
		User player1 = new User(scan1.nextLine());

		System.out.println("Who do you want to play against? Red or Blue?");
		player = Validator.getCpuName(scan1, scan1.nextLine());

		Cpu1 red = new Cpu1("Red");
		Cpu2 blue = new Cpu2("Blue");

		do {

			player1.generateRoshambo();

			if (player.equals("Red")) {
				
				

				player1.setStats(RPS.compareRPS(player1.getValue(),
						red.play(player1.getValue())));
			} else {
				player1.setStats(RPS.compareRPS(player1.getValue(),
						blue.play(player1.getValue())));
			}
			
			System.out.println("Continue?");
			option = Validator.getContinue(scan1, scan1.nextLine());

		} while (Character.toLowerCase(option.charAt(0)) == 'y');

		System.out.println(RPS.toString(player1.getName(), player1.getStats()));
		scan1.close();
	}

}