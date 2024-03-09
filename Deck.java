package assignment4;

import java.util.*;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>(); 
	
	public Deck() {
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
		String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
		
		for(String s:suit) { //iterating through the suit array
			for(String v:values) { //iterating through the values array
				cards.add(new Card(s, v)); //creating new Card by passing suit and value and adding to the cards
			}
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards); //collection is a method where methods such as Shuffle, Random etc are available.
	}
	
	public void printDeck() {
		for (Card card:cards) {
			System.out.println(card);
		}
	}
	
	//draws one random card from the deck
	public Card drawOneCard() {
		Random random = new Random();
		int index = random.nextInt(0, 52);
		return this.cards.get(index);
	}
	
	//comparing the suits of the cards
	public boolean sameCard(Card card1, Card card2) {
		if (card1.getSuit() == card2.getSuit()) {
			return true;
		}		
		return false;
	}
	
	//compares the values of 2 cards
	public boolean compareCard(Card card1, Card card2) {
		if (card1.getValue() == card2.getValue()) {
			return true;
		}		
		return false;
	}
	
	//takes in the card (value, number) and returns the index at which it is at the deck
	public int findCard(Card card) {
		for(int i=0; i<52; i++) {
			Card temp = cards.get(i);
	        if (card.getValue().equals(temp.getValue()) && card.getSuit().equals(temp.getSuit())) {
				return i;
			}
		}
		
		return -1;
	}
	
	//a method to deal 5 random cards
	public void dealCards() {
		Random random = new Random();
		for (int i =0; i<5; i++) {
			int index = random.nextInt(0, 52);
			Card card = this.cards.get(index);
			System.out.println(card.toString());
		}
		
	}	
	
	//method to identify if a card is a face card or number card
	public void identifyCard(Card card) {
		String value = card.getValue();
		if (value == "A" || value == "K" || value == "Q" || value == "J") {
			System.out.println("This is a face card.");
			return;
		}		
		System.out.println("This is a number card.");
	}
}
