/*
 * Name: Joseph Li
 * Date: February 1, 2018
 * File: Deck.java
 * 
 * Contains methods to create, draw from, and shuffle deck
 */

import java.util.ArrayList;

public class Deck {
	
	private final int VAL_PICKER = 13; //Number of different numerical values
	private final int SUIT_PICKER = 4; //Number of suits
	private final int DECK_SIZE = 52; //Max number of cards in deck
	
	private int[] values = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
	private char[] suits = new char[]{'C', 'D', 'H', 'S'};
	
	public ArrayList<Card> deck = new ArrayList<Card>(DECK_SIZE);
	
	public Deck(){
		populateDeck(); //Make new deck
	}
	
	/**
	 * Fill deck with cards
	 */
	public void populateDeck(){
		for (int i = 0; i < VAL_PICKER; i++){
			for (int j = 0; j < SUIT_PICKER; j++){
				deck.add(new Card(values[i], suits[j]));
			}		
		}
	}
	
	/**
	 * Randomly select card from deck. Removes need for a shuffle method
	 * 
	 * @return Card randomly selected from deck
	 */
	public Card drawCard(){
		int index = (int) (Math.random() * deck.size());
		return deck.remove(index);
	}
	
	/**
	 * Prints the remaining Cards in the deck.
	 */
	public void showDeck(){
		for (int i = 0; i < deck.size(); i++){
			System.out.print(deck.get(i) + " ");
		}
	}
	
}
