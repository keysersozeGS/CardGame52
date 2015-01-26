package engine;

import java.util.List;

import model.Card;

public abstract class KozMacaGamer {

	protected void enroll() {
		KozMacaGame.getInstance().enroll(this);
	}

	protected abstract int guessTheScore(List<Card> starting);

	protected abstract Card makeYourMove(List<Card> myPlayableCards,
			List<Card> cardsOnTheTable, List<Card> cardsInLastTour);
}
