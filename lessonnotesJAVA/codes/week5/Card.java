
public class Card {

	private final String face;
	private final String suit; // takim

	public Card(String face, String suit){
		this.face = face;
		this.suit = suit;
	}

	public String toString(){
		return face+" "+suit;
	}
}