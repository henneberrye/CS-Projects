
/**
 * @author Eugene Henneberry
 *Object Oriented Programming
 *CPSC-24500
 *BlackJack Game.
 */

public class Dealer extends Player {
	
	// Creates a new deck.
	Deck dealerHand = new Deck();
	
	// Blank constructor.
	public Dealer() {
	}
	
	// Method that makes sure the first deck created is shuffled.
	public void shuffle(Deck d) {
		d.shuffledDeck();
	}	
}
