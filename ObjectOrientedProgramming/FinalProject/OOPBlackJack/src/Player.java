import java.util.Scanner;

/**
 * @author Eugene Henneberry 
 * Object Oriented Programming 
 * CPSC-24500
 * BlackJack Game.
 */
class Player {
	// Variable deceleration.
	private double playerBank;
	private int playerBet;
	private String playerName;
	private Deck hand = new Deck();
	static Scanner playerInput = new Scanner(System.in);

	// Player constructor.
	public Player() {

	}

	// Method that gets the players hand
	public Deck getHand() {
		return hand;
	}

	// Method that removes a card from the hand
	public Deck removeCard() {
		this.hand.clearHand();
		return this.hand;
	}

	// Method that prints out the hand
	public void printHand() {
		for (int i = 0; i < this.hand.deckSize(); i++) {
			System.out.println(this.hand.getCard(i));
		}
	}

	// Setter to set a hand.
	public void setHand(Deck hand) {
		this.hand = hand;
	}

	// Creates the player's hand.
	public void drawHand(Deck playingDeck) {
		this.hand.drawCard(playingDeck);
		this.hand.drawCard(playingDeck);
	}

	// Method for the player to hit.
	public void Hit(Deck playingDeck) {
		this.hand.drawCard(playingDeck);
	}

	// Method for the player to add money to there bank.
	public int PlayerBank() {

		int count = 0;
		do {
			if (count > 0) {
				System.out.println("Enter a postive number");
			}
			try {
				System.out.println("How much money would you like to add to your bank? ");
				this.playerBank = playerInput.nextInt();
			} catch (Exception ex) {
				System.out.println("Please ender a dollar amount");
				this.playerBank = 0;
				count = -1;
			}
			count++;
			playerInput.nextLine();
		} while (this.playerBank <= 0);
		return (int) this.playerBank;
	}

	// Method that asks the player to place a bet.
	public int PlayerBet() {
		int maxBet = (int) this.playerBank;
		int count = 0;
		do {
			if (count > 0) {
				System.out.println("You can't cover the bet");
			}
			try {
				System.out.println("Please Place your bet! This round is about to start ");
				this.playerBet = playerInput.nextInt();
			} catch (Exception ex) {
				this.playerBet = maxBet + 5;
			}
			count++;
			playerInput.nextLine();
		} while (this.playerBet > maxBet || this.playerBet < 0);
		return this.playerBet;
	}

	// Gets the players money.
	public int getBank() {
		return (int) this.playerBank;
	}

	// Method that calculates how much money the player losses if they bust
	public void Bust() {
		this.playerBank -= this.playerBet;
	}

	// Method that calculates the pay out when the player wins
	public void Wins() {
		this.playerBank += this.playerBet;
	}

	// Method that calculates how much money the player losses if they bust
	public void Loss() {
		this.playerBank -= this.playerBet;
	}

	// Method that calculates the pay out if the player hits BlackJack.
	public void hitsBlackJack() {
		this.playerBank += this.playerBet * 1.5;
	}

	// Setter to set the players bank.
	public void setplayerBank(int playerBank) {
		this.playerBank = playerBank;
	}

	// Getter that gets the players bet
	public int getBet() {
		return this.playerBet;
	}

	// Setter that sets the player bet
	public void setPlayerBet(int playerBet) {
		this.playerBet = playerBet;
	}

	// Getter that gets the players name.
	public String getPlayerName() {
		return playerName;
	}

	// Setter that sets the player name.
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}
