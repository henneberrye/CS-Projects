//***************************************************************************************
//	Card.java 		CPSC21000-Lab4-Exercise 3		Eugene Henneberry 11/12/2020
//
// 
//***************************************************************************************


import java.util.*;

public class Card {
	// Declaring variables
	private String Suit;
	private String FaceCard;

	// Constructor
	public Card(String Suit, String FaceCard) {
		this.Suit = Suit;
		this.FaceCard = FaceCard;
	}

	// Defines getters and setters
	public String getSuit() {
		return Suit;
	}

	public void setSuit(String Suit) {
		this.Suit = Suit;
	}

	public String getFaceCard() {
		return FaceCard;
	}

	public void setFaceCard(String FaceCard) {
		this.FaceCard = FaceCard;
	}

	// Defines the displayed card
	public String toString() {
		return (FaceCard + " of " + Suit);
	}

	// Defines and initializes the Suits and Face card values
	public static void main(String[] args) {
		String[] Suites = { "Clubs", "Diamonds", "Heats", "Spades", };
		String[] FaceCard = { "A", "2", "3", "4", "5", "6", "7", "8", "10", "J", "Q", "K" };

		// Generates the five random cards
		Random rand = new Random();
		for (int i = 1; i <= 5; i++) {
			Card NewCard = new Card(Suites[rand.nextInt(Suites.length)], FaceCard[rand.nextInt(FaceCard.length)]);
			// Prints out the random cards
			System.out.println(NewCard);
		}
	}
}
