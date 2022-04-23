package Holdem;

public class Card {

    private String rank, suit;
    
    private static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = {"Diamond", "Heart", "Clover", "Spade"};

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }

    public static String rank_String(int __rank){
        return ranks[__rank];
    }
    public static String suit_String(int __suit){
        return suits[__suit];
    }

    public @Override String toString(){
        return rank + "of" + suit;
    }
}


// https://codereview.stackexchange.com/questions/1382/texas-holdem-in-java