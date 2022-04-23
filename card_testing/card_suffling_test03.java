package card_testing;

import java.util.ArrayList;

public class card_suffling_test03 {

    private static final int deck_size = 52;

    private static int player_num = 2;
    private static int player_hand_num = 2;
    private static int player_max = 8;

    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for(int i = 0; i < deck_size; i++){
            deck.add(i);
        }
        ArrayList<Integer> shuffled_deck = new ArrayList<Integer>();
        while(deck.size() > 0){
            int index = (int)(Math.random() * deck.size());
            shuffled_deck.add(deck.remove(index));
        }

        player_num = 2;

        int[] player_A = {};
        int[] player_B = {};
        for(int i = 0; i < player_num; i++){
            player_A[i] = shuffled_deck.remove(i * 2);
            player_B[i] = shuffled_deck.remove(i * 2 + 1);
        }

        System.out.println(player_A);
        System.out.println(player_B);
    }
}