package assignment4;

public class Card {
	private String suit;
	private String value;
	
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	//Getters and Setter for suit
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	//Getters and Setter for value
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value+" of "+suit;
	}

}
