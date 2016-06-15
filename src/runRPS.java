import java.util.Scanner;

public class runRPS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Rock, paper, or scissors?");
		String option = scan.nextLine();

		User player1 = new User();
		Player player2 = new User();
		player1.setValue(option);
		player2.setValue(player2.generateRoshambo());
		System.out.println(player2.value);

		System.out.println(RPS.compareRPS(player1.value, player2.value));
	}
}