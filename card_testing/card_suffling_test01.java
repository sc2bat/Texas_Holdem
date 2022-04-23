package card_testing;

import java.util.ArrayList;

public class card_suffling_test01 {

    public static void main(String[] args) {

        ArrayList<String> cardNumber = new ArrayList<String>();
        
        for(int i = 0; i < 13; i++){
            String a = String.valueOf(i + 1);
            switch(a){
                case "1": a = "A";
                    break;
                case "11": a = "J";
                    break;
                case "12": a = "Q";
                    break;
                case "13": a = "K";
                    break;
            }
            cardNumber.add(i, a);
        }
        System.out.println(cardNumber);
    }
    
}