package competitor;

import java.util.List;

import model.Card;
import engine.KozMacaGamer;

public class DummyGamer extends KozMacaGamer {

	@Override
	protected int guessTheScore(List<Card> starting) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	protected Card makeYourMove(List<Card> myPlayableCards,
			List<Card> cardsOnTheTable, List<Card> cardsInLastTour) {
		// TODO Auto-generated method stub
		return myPlayableCards.get(0);
	}

}
