/**
 * @author Eugene Henneberry 
 * Object Oriented Programming 
 * CPSC-24500 
 * BlackJack Game.
 */

public class Card {
	// Creates variables for the card and suit
	private Suit cardSuit;
	private Value cardValue;

	// Creates instance of the cards suit
	public enum Suit {
		Clubs, Spades, Diamonds, Hearts
	}

	// Creates instance of the cards value
	public enum Value {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
	}

	// Creates the card.
	public Card(Suit cardSuit, Value cardValue) {
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}

	// Converts the cards value to a string.
	public String toString() {
		return this.cardValue.toString() + " of " + this.cardSuit.toString();
	}

	// Gets the cards value.
	public Value getValue() {
		return this.cardValue;
	}

}
