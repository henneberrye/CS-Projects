
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eugene Henneberry 
 * Object Oriented Programming 
 * CPSC-24500 
 * BlackJack Game.
 */

public class Deck {
	// Creates an array list
	private ArrayList<Card> cards;

	// Creates the deck object to operate on.
	public Deck() {
		this.cards = new ArrayList<Card>();
	}

	// Add cards to the deck.
	public void makeDeck() {
		// Generate cards for the deck
		for (Card.Suit getSuit : Card.Suit.values()) {
			for (Card.Value getValue : Card.Value.values()) {
				// Adds cards to the deck.
				this.cards.add(new Card(getSuit, getValue));
			}
		}
	}

	// Used to convert and print out the deck.
	public String toString() {
		// Sets variables
		String cardList = "";
		// for loop that prints out the deck.
		for (Card newCard : this.cards) {
			cardList += "\n" + newCard.toString();
		}
		return cardList;
	}

	// The shuffle method.
	public void shuffledDeck() {
		// Array list to hold a temp Deck.
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		ArrayList<Card> tempShuffleDeck = new ArrayList<Card>();
		// Loop that adds cards to the tempShuffleDeck
		for (Card c : this.cards) {
			tempShuffleDeck.add(c);
		}
		// Clears the this.cards arrayList so we can re-populate it with 6 shuffled
		// decks.
		this.cards = new ArrayList<>();

		// Random generator used to pick a random card.
		Random newRand = new Random();
		int shuffleIndex = 0;
		int deckSize = tempShuffleDeck.size();
		for (int x = 0; x < 5; x++) {

			for (int i = 0; i < deckSize; i++) {
				// Generates a random number using the rand.nextInt((max - min) + 1) - min
				// formula.
				shuffleIndex = newRand.nextInt((tempShuffleDeck.size() - 1 - 0) + 1) + 0;
				// Adds the random card into the tempDeck deck.
				tempDeck.add(tempShuffleDeck.get(shuffleIndex));
				// Removes the picked card from the original deck.
				tempShuffleDeck.remove(shuffleIndex);
			}
			// Sets the this.cards variable to the new deck
			// we're going to add each tempDeck element from the arrayList to this.cards.
			// We're also going to re-populate
			// tempShuffleDeck with all the cards again so we can shuffle the deck
			for (Card c : tempDeck) {
				// we have to re-populate our temporary array with cards again so we can iterate
				// through them again.
				tempShuffleDeck.add(c);
				// this.cards will be our 'running list'. It will store all the data we have in
				// tempDeck list
				this.cards.add(c);
			}
			// we clear temp list out again so we can start fresh
			tempDeck.clear();
		}
	}
	// Method to clear the hand.
	public void clearHand() {
		int handSize = this.deckSize();
		for (int i = 0; i < handSize; i++) {
			this.cards.remove(0);
		}
	}

	// Method to remove a card from the deck
	public void removeCard(int i) {
		this.cards.remove(0);
		this.cards.remove(1);
	}

	// Method to get a card from the deck.
	public Card getCard(int i) {
		return this.cards.get(i);
	}

	// Method to add a card.
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}

	// Method to draw a card from the Deck.
	public void drawCard(Deck drawnFromDeck) {
		this.cards.add(drawnFromDeck.getCard(0));
		drawnFromDeck.removeCard(0);
	}

	// Method that gets the deck size.
	public int deckSize() {
		return this.cards.size();

	}

	// Method to calculate the cards value
	public int cardTotal() {
		int totalCardValue = 0;
		int aces = 0;

		// Every cards numerical value.
		for (Card aCard : this.cards) {
			switch (aCard.getValue()) {
			case Two:
				totalCardValue += 2;
				break;
			case Three:
				totalCardValue += 3;
				break;
			case Four:
				totalCardValue += 4;
				break;
			case Five:
				totalCardValue += 5;
				break;
			case Six:
				totalCardValue += 6;
				break;
			case Seven:
				totalCardValue += 7;
				break;
			case Eight:
				totalCardValue += 8;
				break;
			case Nine:
				totalCardValue += 9;
				break;
			case Ten:
				totalCardValue += 10;
				break;
			case Jack:
				totalCardValue += 10;
				break;
			case Queen:
				totalCardValue += 10;
				break;
			case King:
				totalCardValue += 10;
				break;
			case Ace:
				aces += 1;
				break;
			}
		}
		// Determines the card total with an Ace.
		for (int i = 0; i < aces; i++) {
			// If the players card total is greater than 10 set ace to 1.
			if (totalCardValue > 11) {
				totalCardValue += 1;
			}
			// If the players total is less than 10 set ace to 11.
			else {
				totalCardValue += 11;
			}
		}
		return totalCardValue;
	}
}
