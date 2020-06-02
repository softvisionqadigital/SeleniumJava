package practiceString;

public class CountNumCharacter {

	public static void main(String[] args) {
		String string = "Softvision Cognizant";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);
	}

}
