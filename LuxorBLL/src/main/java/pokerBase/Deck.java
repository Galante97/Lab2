package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

/**
 * 
 * @author James
 *
 */
public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];
				Card NewCard = new Card(SuitValue, RankValue, (13));
				deckCards.add(NewCard);
				// 13 LINE IS NOT DONE, LINE 17
			}

		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw() {
		return deckCards.remove(0);
	}	
	
}
