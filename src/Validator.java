import java.util.Scanner;

public class Validator {
	public static String getCpuName(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("Red") && !ans.equalsIgnoreCase("Blue")) {
			System.out
					.println("Invalid input. You must choose \"Red\" or \"Blue\"");
			ans = scan.nextLine();
		}
		return ans;
	}

	public static String getAttackChoice(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("Rock") && !ans.equalsIgnoreCase("Paper")
				&& !ans.equalsIgnoreCase("Scissors")) {
			System.out
					.println("Invalid input. You must choose \"Rock\" or \"Paper\" or \"Scissors\"");
			ans = scan.nextLine();
		}
		return ans;
	}

	public static String getContinue(Scanner scan, String ans) {
		while (Character.toLowerCase(ans.charAt(0)) != 'y'
				&& Character.toLowerCase(ans.charAt(0)) != 'n') {
			System.out.println("Invalid input. You must choose \"y\" or \"n\"");
			ans = scan.nextLine();
		}
		return ans;
	}

}