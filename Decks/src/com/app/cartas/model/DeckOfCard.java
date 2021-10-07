package com.app.cartas.model;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private final int NUMBER_OF_CARDS = 52;

    private final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCard() {

        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suit[count / 13]);

        }
    }

    public void showCards(){
        Arrays.asList(deck).forEach(System.out::println);
    }

}
