/*
 * Name: Joseph Li
 * Date: February 1, 2018
 * File: Card.java
 * 
 * Card class which contains numerical and suit data about card
 */
public class Card {
	
	private final int ACE = 1;
	private final int JACK = 11;
	private final int QUEEN = 12;
	private final int KING = 13;
	
	private int val;
	private char suit;
	private String cardName;
	
	public Card(int val, char suit){
		this.val = val;
		this.suit = suit;
		makeName();
	}
	
	public void makeName(){
		int val = getVal();
		
		switch(val){
		case ACE: cardName = "A" + getSuit();
				break;
		case JACK: cardName = "J" + getSuit();
				 break;
		case QUEEN: cardName = "Q" + getSuit();
				 break;
		case KING: cardName = "K" + getSuit();
				 break;
		default: cardName = Integer.toString(val) + getSuit();
		    	 break;
		}
	}
	
	public int getVal(){
		return val;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public String toString(){
		return cardName;
	}

}
