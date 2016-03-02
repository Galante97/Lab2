package pokerBase;

import java.util.ArrayList;

public class HandScore {

	private int HandStrength;
	private int HiHand;
	private int LoHand;
	private ArrayList<Card> Kickers = new ArrayList<Card>();

	public HandScore() {}

	public HandScore(int handStrength, int hiHand, int loHand, ArrayList<Card> kickers) {
		super();
		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
		Kickers = kickers;
	}

	
	
	
}
