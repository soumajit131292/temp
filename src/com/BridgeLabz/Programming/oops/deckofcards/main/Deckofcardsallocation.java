package com.BridgeLabz.Programming.oops.deckofcards.main;

import com.BridgeLabz.Programming.oops.deckofcards.service.DeckOfCardsInter;
import com.BridgeLabz.Programming.oops.deckofcards.service.DeckofCardsInt;

public class Deckofcardsallocation {

	public static void main(String[] args) {

		DeckOfCardsInter cards=new DeckofCardsInt();
		cards.initialize();
		cards.shuffling();
		cards.display();

		
		

	}

}
