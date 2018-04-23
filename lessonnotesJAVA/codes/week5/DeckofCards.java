import java.security.SecureRandom;

public class DeckofCards {

	Card [] decks;

	public DeckofCards(){
		decks = new Card[52];
		String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
		"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		for (int i=0; i<52; i++) {
			decks[i] = new Card(faces[i%13], suits[i/13]);
			System.out.println((i+1)+". card is "+ decks[i]);
		}
	}

	public void shuffle() {
		SecureRandom random = new SecureRandom();

		Card temp;
		for (int i=0; i<52; i++) {
			temp = decks[i];
			int index = random.nextInt(52); // 0 - 51

			decks[i] = decks[index];
			decks[index] = temp;	
		}
	}

	public void display() {
		for (int i=0; i<52; i++) {
			System.out.println((i+1)+". card is "+ decks[i]);
		}
	}
}