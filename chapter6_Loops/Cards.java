package chapter6_Loops;

public class Cards {

	public static void main(String[] args) {
		// Task: Print a deck of cards

		String[] cards = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A" };
		String[] colors = { "spade", "club", "heart", "diamond" };

		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				System.out.println(cards[j] + " " + colors[i]);
			}
		}
	}

}
