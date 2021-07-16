import java.util.Scanner;
import java.io.*;

/**
 * @author Eugene Henneberry Object Oriented Programming CPSC-24500 BlackJack
 *         Game.
 */

public class BlackJack {

	/*
	 * Variable Deceleration. Creates Scanner. Creates the playing deck. Creates the
	 * deck that will hold the players hand. Creates the deck that will hold the
	 * dealers Hand.
	 */
	static Scanner userInput = new Scanner(System.in);
	static Deck playingDeck = new Deck();
	static Deck playerDeck = new Deck();
	static Deck dealerDeck = new Deck();
	static boolean gameNotOver = true;
	static boolean roundNotOver = true;

	public static void main(String[] args) throws IOException {

		// Prints out the rules of BlackJack.
		System.out.println("	             Welcome to Blackjack");
		System.out.println(" 	          The Rules of Blackjack are.");
		System.out.println(" * Each player and dealer is dealt two cards. The dealers is dealt one card face down one card face up.");
		System.out.println(" * Face cards are equal to 10 except and Ace. Ace is either 11 or 1. Every other card is equal to the value on the card.");
		System.out.println(" * The  sum of the cards in the hand equal the hands value.");
		System.out.println(" * Players have the option to Hit or Stand. ");
		System.out.println(" * The dealer hits untill their hands sum is greater than or equal to 17.");
		System.out.println(" * To win the player must be dealt BlackJack or have a higher hand sum than the dealer.");
		System.out.println(" * If the player and the dealer end up with the same sum the hand is a push and the player doesn't losse there bet.");
		System.out.println(" * If the player hits BlackJack the payout is 1.5 times the bet. If the player beats the dealer the pay out is the bet doubled.");
		System.out.println("          Good luck my the odds be in your favor \n");

		// Creates the player and dealer objects
		Player myPlayer = new Player();
		Dealer myDealer = new Dealer();

		// Asks the user how much money they want to add to there bank.
		myPlayer.PlayerBank();

		// Variable that holds the user input
		// after they decide if they want to keep playing
		int response;

		// Loop that runs the game
		while (gameNotOver) {

			/*
			 * Checks to make sure that the player has enough money in there bank if the
			 * player doesn't have enough money game prompts the user to add more.
			 */
			if (myPlayer.getBank() >= 0) {
				while (myPlayer.getBank() < 1) {
					myPlayer.PlayerBank();
				}
			}
			// Ask the player to make a bet
			myPlayer.PlayerBet();

			// Creates the Deck.
			playingDeck.makeDeck();

			// Shuffles the deck
			playingDeck.shuffledDeck();

			// Tells the player the dealer is dealing the hand.
			System.out.println("Dealing.....");
			myPlayer.drawHand(playingDeck);
			myDealer.drawHand(playingDeck);

			// Gets the player and the dealers hand's
			playerDeck = myPlayer.getHand();
			dealerDeck = myDealer.getHand();

			// Displays the players Hand.
			System.out.println("Your hand is " + playerDeck.toString());

			// Tells the player the sum of there hand.
			System.out.println("Your hands sum is " + playerDeck.cardTotal());

			// Displays the dealers hand with a card face up and face down.
			System.out.println("Dealers hand is " + dealerDeck.getCard(0).toString() + " Face down card");

			// Checks to see if the player has 21, and pays out at 1.5 the bet.
			// I have this here to check if the player is dealt blackjack.
			// if they are its an auto win.
		
			while (playerDeck.cardTotal() == 21) {
				System.out.println("You Hit BlackJack!!!");
				myPlayer.hitsBlackJack();
				System.out.println("Your bank is now" + myPlayer.getBank());
				roundNotOver = false;
				break;
			}

			System.out.println("(0)Hit or (1)Stand");
			int input = userInput.nextInt();
			// Loop for if the player want's to hit.
			while (input == 0 && roundNotOver) {
				// Calls the hit method in t he player class to draw another card.
				myPlayer.Hit(playingDeck);

				if (playerDeck.cardTotal() == 21) {
					System.out.println("Your Hand is " + playerDeck.toString());
					System.out.println("Your hands sum is " + playerDeck.cardTotal());
					System.out.println("21 !!!");
					myPlayer.Wins();
					System.out.println("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}

				// Checks to see if the players hand is over 21.
				if (playerDeck.cardTotal() > 21) {
					System.out.println("Bust! you went over 21! Hand total: " + playerDeck.cardTotal());
					myPlayer.Bust();
					System.out.println("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}
				// Displays the players new card
				System.out.println("Your new card is " + playerDeck.getCard(playerDeck.deckSize() - 1).toString());
				// Displays the players new Hand.
				System.out.println("Your hand is " + playerDeck.toString());
				// Displays the sum of the players hand.
				System.out.println("Your hand sum is " + playerDeck.cardTotal());
				// Asks the player if they would like to hit again.
				System.out.println("(0)Hit or (1)Stand");
				input = userInput.nextInt();
			}

			while (roundNotOver && input == 1) {
				// Shows the player the both of the dealers cards.
				System.out.println("Dealers hand: " + dealerDeck.toString());

				/*
				 * Checks to see if the dealers card total is less than 17. if the dealers total
				 * is less than 17 the dealer must hit. this needs to keep happening until the
				 * dealers had is 17 or greater.
				 */
				if ((dealerDeck.cardTotal() <= 16)) {
					myDealer.Hit(playingDeck);
					System.out.println("The dealer draws a card: " + dealerDeck.getCard(dealerDeck.deckSize() - 1).toString());
					// Shows the dealers new hand after hitting.
					System.out.println("The dealers hand is: " + dealerDeck.cardTotal());
				}
				// Checks to see if the dealer has 21 as long as the player doesn't.
				if (dealerDeck.cardTotal() == 21 && playerDeck.cardTotal() != 21) {
					System.out.print("The dealer has 21 you lose ");
					myPlayer.Loss();
					System.out.print("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}

				// Checks to see if the dealers card total is over 21 if it is player wins
				// double there bet.
				if ((dealerDeck.cardTotal() > 21)) {
					System.out.println(" Dealer Busts! You Win!");
					myPlayer.Wins();
					System.out.println("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}

				/*
				 * Checks to see if the dealers card sum is greater than the players. if the
				 * dealers card sum is greater and not over 21 the dealer wins and the players
				 * bet is subtracted from there bank.
				 */

				if (dealerDeck.cardTotal() > playerDeck.cardTotal()) {
					System.out.println("The dealers sum is: " + dealerDeck.cardTotal() + "\n Dealer wins!");
					myPlayer.Loss();
					System.out.print("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}

				// Checks for a push.
				if ((dealerDeck.cardTotal() == playerDeck.cardTotal())) {
					System.out.println("Push");
					roundNotOver = false;
					break;
				}
				// Checks if the players card total is greater than the dealer if so pays out
				// the player.
				if ((playerDeck.cardTotal() > dealerDeck.cardTotal())) {
					System.out.println("You Win!");
					myPlayer.Wins();
					System.out.println("Your bank is now $" + myPlayer.getBank());
					roundNotOver = false;
					break;
				}

			}
			// Asks the player if they want to keep playing.
			System.out.println("\nDo you want to continue (0)Yes or (1)No ");
			response = userInput.nextInt();
			while (response == 0) {
				myPlayer.removeCard();
				myDealer.removeCard();
				gameNotOver = true;
				roundNotOver = true;
				break;
			}
			while (response == 1) {
				System.out.println("Thank you for playing!");
				gameNotOver = false;
				roundNotOver = false;
				break;
			}

		}
	}
}
