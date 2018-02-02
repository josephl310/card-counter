/*
 * Name: Joseph Li
 * Date: February 1, 2018
 * File: Counter.java
 * 
 * Contains method and variables to count cards
 */

public class Counter {
	
	private final int J = 11;
	private final int Q = 12;
	private final int K = 13;
	private final int A = 1;
	
	private int runningCount = 0;
	
	/**
	 * Constructor. Resets value of runningCount.
	 */
	public Counter(){
		resetCount();
	}
	
	/**
	 * Takes in a Card and returns its value in the hi-lo counting scheme
	 * 
	 * @param c Card to get counting value of
	 * @return Counting value of card
	 */
	public int countVal(Card c){
		int num = c.getVal(); //Stores numerical value of Card
		switch(num){ //returns counting value of Card
			case 2: return 1;
			case 3: return 1;
			case 4: return 1;
			case 5: return 1;
			case 6: return 1;
			case 7: return 0;
			case 8: return 0;
			case 9: return 0;
			case 10: return -1;
			case J: return -1;
			case Q: return -1;
			case K: return -1;
			case A: return -1;
			default: return 0;
		}
	}
	
	/**
	 * Utilize countVal to count Card and update runningCount
	 * 
	 * @param c Card to be counted
	 * @return Counting value of input Card
	 */
	public int count(Card c){
		runningCount += countVal(c);
		return countVal(c);
	}
	
	/**
	 * Resets runningCount;
	 */
	public void resetCount(){
		runningCount = 0;
	}
	
	/**
	 * Getter for runningCount
	 * 
	 * @return value of runningCount
	 */
	public int getCount(){
		return runningCount;
	}
	
	

}
