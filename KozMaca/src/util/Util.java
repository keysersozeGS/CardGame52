package util;

import java.util.Random;

import model.Card;

/**
* Includes util methods for KozMaca
*
* @author  Onur BAYSAN
* @version 1.0
* @since   2015-02-03 
*/
public class Util
{
	
	/*
	 * FisherÐYates method to shuffle the deck
	 */
	static void Shuffle(Card[] deck)
	{
		Random rndm = new Random();
		int count = deck.length;
		
		for(int i = count-1; i>0; i--)
		{
			int index = rndm.nextInt(i + 1);
			
			Card tmp = deck[index];
			deck[index] = deck[i];
			deck[i] = tmp;
		}
	}
	
	
	
}
