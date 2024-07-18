package NextWordSuggestion;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String texttotrain = "you are , you the , you are , you have , you has , you are , you are ,This is a new string test to test tge word predictor to the perfect let's give it a try ! . What you say? test in , test out test in test in test to very";
        String currentWord = "you";
        int count=2;
        PredictNextWord nextWord = new PredictNextWord(currentWord, count,texttotrain);

        PrintTheNextWord printNExtWord = new PrintTheNextWord(nextWord.getNextWord()); // print the predicated next word to console
        printNExtWord.printNextWord();





    }
}
