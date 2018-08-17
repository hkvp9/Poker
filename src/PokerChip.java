
public class PokerChip {
	
	private String color;
	private int rank; 			//  5, 10, 25, 50
	static String game = "Poker";
	
		public static void main(String args[]){
	
			System.out.println(PokerChip.game);
			PokerChip yellow = new PokerChip();
			System.out.println(yellow.rank);
			System.out.println(yellow.game);
			PokerChip red = new PokerChip();
			red.game = "3 cards";
			System.out.println(PokerChip.game);
	}

}
