package card_testing;

import java.util.ArrayList;

public class card_suffling_test02 {

    private static final int deck_size = 52;

    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for(int i = 0; i < deck_size; i++){
            deck.add(i);
        }
        System.out.println("deck : " + deck);
        
        ArrayList<Integer> shuffled_deck = new ArrayList<Integer>();
        while(deck.size() > 0){
            int index = (int)(Math.random() * deck.size());
            shuffled_deck.add(deck.remove(index));
        }

        System.out.println("shuffled_deck : " + shuffled_deck);

    }
    
// deck : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51]
// shuffled_deck : [43, 13, 7, 20, 34, 29, 33, 38, 27, 24, 32, 50, 28, 17, 47, 19, 30, 25, 48, 46, 8, 51, 12, 26, 3, 49, 10, 21, 4, 44, 2, 15, 18, 0, 23, 37, 11, 6, 42, 9, 41, 14, 22, 35, 5, 16, 31, 36, 45, 40, 39, 1]
}