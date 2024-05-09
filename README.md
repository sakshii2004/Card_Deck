This Java program simulates a deck of playing cards and provides various functionalities like shuffling the deck, drawing cards, comparing cards, finding specific cards, dealing cards, and identifying card types (number or face card). It consists of three classes: Card, Deck, and Main, each serving distinct purposes to manage and manipulate the deck of cards.

Card:
- This class represents a single playing card with attributes suit and value.
- It provides constructors to initialize a card with suit and value, as well as getter and setter methods for both attributes.
- The toString() method is overridden to return a string representation of the card in the format "<value> of <suit>".
  
Deck:
- The Deck class manages a collection of Card objects to simulate a deck of playing cards.
- It initializes a deck with 52 standard playing cards (4 suits and 13 values each) upon instantiation.
- Functionality includes shuffling the deck, printing the deck, drawing one card randomly, comparing two cards, finding a specific card, dealing 5 cards, and identifying card types.

Main:
- The Main class serves as the entry point for the program and provides a menu-driven interface for interacting with the deck of cards.
- It creates an instance of the Deck class and utilizes its methods based on user input.
- The main method implements a loop to continuously display the menu and handle user choices until the user chooses to exit.

Methods used:

Card class:
- Constructor: Initializes a card with a given suit and value.
- Getter and setter methods for suit and value attributes.
- toString(): Overrides the toString() method to return a string representation of the card.

Deck class:
- Constructor: Initializes a deck with 52 standard playing cards.
- shuffleDeck(): Shuffles the cards in the deck randomly.
- printDeck(): Prints all the cards in the deck.
- drawOneCard(): Draws one random card from the deck.
- sameCard(): Compares the suits of two cards.
- compareCard(): Compares the values of two cards.
- findCard(): Finds the index of a specific card in the deck.
- dealCards(): Deals 5 random cards from the deck.
- identifyCard(): Identifies whether a card is a face card or a number card.

Main class:
- main(): Entry point of the program. Provides a menu-driven interface for interacting with the deck of cards. Handles user inputs and calls appropriate methods from the Deck class based on user choices.
