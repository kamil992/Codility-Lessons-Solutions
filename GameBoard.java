package Codility;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {
    public static void main(String[] args) {
        System.out.println(gameBoard("23A84Q", "K2Q25J"));
    }

    public static int gameBoard(String a, String b){

        Map<String,Integer> cardMap = new HashMap<>();
        cardMap.put("A", 14);
        cardMap.put("K", 13);
        cardMap.put("Q", 12);
        cardMap.put("J", 11);
        cardMap.put("10", 10);
        cardMap.put("9", 9);
        cardMap.put("8", 8);
        cardMap.put("7", 7);
        cardMap.put("6", 6);
        cardMap.put("5", 5);
        cardMap.put("4", 4);
        cardMap.put("3", 3);
        cardMap.put("2", 2);

        int counter = 0;

        for(int i = 0; i < a.length(); i++) {
            int aResult = cardMap.get(a.substring(i,i+1));
            int bResult = cardMap.get(b.substring(i,i+1));

            if(aResult > bResult)
                counter++;
        }

        return counter;
    }
}
