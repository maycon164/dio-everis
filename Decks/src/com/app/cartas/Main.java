package com.app.cartas;

import com.app.cartas.model.DeckOfCard;

public class Main {

    public static void main(String[] args) {
        DeckOfCard decks = new DeckOfCard();
        decks.showCards();
        decks.shuffle();
    }

}
