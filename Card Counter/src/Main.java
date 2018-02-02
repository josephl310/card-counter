/*
 * Name: Joseph Li
 * Date: February 1, 2018
 * File: Main.java
 * 
 * Brings all the classes together and allows user to interact with them
 */

import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	
	static Card[] dealt;
	
	/**
	 * Runs testUser() on forever loop to allow user to keep practicing
	 * until user manually stops it.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		while (true){
			testUser();
		}
	}
	
	/**
	 * Prompts user with messages to use the program
	 */
	private static void testUser(){
		int numToDeal = 0; //how many cards to deal
		int userGuess = 0; //User guess for count
		
		Deck d = new Deck(); 
		Counter c = new Counter();
		
		System.out.print("How many cards would you like to be dealt? ");
		numToDeal = s.nextInt();
		dealt = new Card[numToDeal];
		
		//Dealing and counting cards
		for (int i = 0; i < numToDeal; i++){
			Card card = d.drawCard();
			dealt[i] = card;
			System.out.printf("Card %s is %s\n", i + 1, card);
			c.count(card);
		}
		
		System.out.print("What is the overall count of the deck? ");
		userGuess = s.nextInt();
		
		//User guessing the count
		if (c.getCount() == userGuess){
			System.out.println("Correct. Great Job!\n");
		} else {
			System.out.println("\nSorry, your answer is wrong.");
			System.out.printf("The correct answer is %s. ", c.getCount());
			wrongAnswerMessage();
		}
		
	}
	
	/**
	 * Provides user with in-depth explanation of how to count correctly
	 */
	private static void wrongAnswerMessage(){

	    Counter c = new Counter();
	    
		System.out.println("The count was achieved by these steps: ");
		System.out.printf("Current count: 0\n");
		
		/* Prints the cards again along with their counting value and the 
		   count after each card has been evaluated */
		for (int i = 0; i < dealt.length; i++){
			Card card = dealt[i];
			System.out.printf("Card %s: %s. Count Value: %s. New Count: %s\n",
								i+1, card, c.count(card), c.getCount());
		}
		System.out.printf("Final Count: %s\n\n", c.getCount());
	}

}
