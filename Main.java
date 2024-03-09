package assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 8) {
        	//options
            System.out.println("\nMenu:");
            System.out.println("1. Shuffle Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Draw One Card");
            System.out.println("4. Compare Two Cards");
            System.out.println("5. Find Card in Deck");
            System.out.println("6. Deal 5 Cards");
            System.out.println("7. Identify Card");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 8) {
                    switch (choice) {
                        case 1:
                        	//shuffle deck
                            deck.shuffleDeck();
                            System.out.println("Deck shuffled.");
                            break;
                            
                        case 2:
                        	//print deck
                            deck.printDeck();
                            break;
                            
                        case 3:
                        	//draw 1 card
                            Card drawnCard = deck.drawOneCard();
                            System.out.println("Drawn Card: " + drawnCard);
                            break;
                            
                        case 4: //compare 2 randomly drawn cards
                            Card card1 = deck.drawOneCard();
                            Card card2 = deck.drawOneCard();
                            System.out.println("Card 1: " + card1);
                            System.out.println("Card 2: " + card2);
                            System.out.println("Suits Match: " + deck.sameCard(card1, card2));
                            System.out.println("Values Match: " + deck.compareCard(card1, card2));
                            break;
                            
                        case 5: //Find specified card in Deck
                        	scanner.nextLine();
                        	System.out.print("Enter the suit of the card: ");
                            String suit = scanner.nextLine();
                            System.out.print("Enter the value of the card: ");
                            String value = scanner.nextLine();
                            Card searchCard = new Card(suit, value);
                            System.out.println(searchCard.getSuit());
                            System.out.println(searchCard.getValue());

                            int index = deck.findCard(searchCard);
                            
                            if (index != -1) {
                                System.out.println("Card found at index: " + index);
                            } 
                            else {
                                System.out.println("Card not found in the deck.");
                            }
                            break;
                            
                        case 6: //deal 5 cards
                            System.out.println("Dealing 5 Cards:");
                            deck.dealCards();
                            break;
                            
                        case 7: //identify if the entered card is a number card or face card
                            System.out.print("Enter the suit of the card: ");
                            String cardSuit = scanner.nextLine();
                            System.out.print("Enter the value of the card: ");
                            String cardValue = scanner.nextLine();
                            Card identifyCard = new Card(cardSuit, cardValue);
                            deck.identifyCard(identifyCard);
                            break;
                            
                        case 8: //Exit the program
                            System.out.println("Exiting the program. . . ");
                            break;
                    }
                } 
                
                //if input is not between 1 to 8
                else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                }
            } 
            
            //if input is not a number 
            else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // consume the invalid input
            }
        }
        //close the scanner
        scanner.close();
    }
}
