package model;

import model.enums.Suit;
import model.enums.Rank;

public class Card implements Comparable<Card> {
	private Suit suit;
	private Rank rank;
	private boolean trump;

	public Card(Suit suit, Rank rank, boolean trump) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.trump = trump;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public boolean isTrump() {
		return trump;
	}

	public void setTrump(boolean trump) {
		this.trump = trump;
	}


	@Override
	public int compareTo(Card card) {
		
		if(this.getSuit() == Suit.SPADES && 
				card.getSuit() != Suit.SPADES)
		{
			return 1;
		}
		else if(this.getSuit() != Suit.SPADES &&
				card.getSuit() != Suit.SPADES)
		{
			return -1;
		}
		else
		{
			return this.getRank().compareTo(card.getRank());
		}
		
	}

}
