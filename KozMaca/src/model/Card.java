package model;

import model.enums.Symbol;

public class Card {
	private Symbol symbol;
	private Number number;
	private boolean trump;

	public Card(Symbol symbol, Number number, boolean trump) {
		super();
		this.symbol = symbol;
		this.number = number;
		this.trump = trump;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public boolean isTrump() {
		return trump;
	}

	public void setTrump(boolean trump) {
		this.trump = trump;
	}

}
