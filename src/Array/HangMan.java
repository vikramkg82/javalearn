package Array;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

    static void drawHang(){
        System.out.println("    -------------------------------\n" +
                "   |                               |\n" +
                "   |                               |\n" +
                "   |                               |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "-------");

    }

    static void drawHead(){
        System.out.println("    -------------------------------\n" +
                "   |                               |\n" +
                "   |                               |\n" +

                "   |                               |\n" +
                "   |                               O\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "-------");
    }

    static void drawHand(){
        System.out.println("    -------------------------------\n" +
                "   |                               |\n" +
                "   |                               |\n" +

                "   |                               |\n" +
                "   |                               O \n" +
                "   |                              / \\\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "-------");
    }

    static void drawBody(){

        System.out.println("    -------------------------------\n" +
                "   |                               |\n" +
                "   |                               |\n" +

                "   |                               |\n" +
                "   |                               O\n" +
                "   |                              / \\\n" +
                "   |                               |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "-------");
    }


    static void drawLeg(){
        System.out.println("    -------------------------------\n" +
                "   |                               |\n" +
                "   |                               |\n" +

                "   |                               |\n" +
                "   |                               O\n" +
                "   |                              /|\\\n" +
                "   |                               |\n" +
                "   |                              / \\ \n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "-------");
    }

    //word array

    static  String[] words = {"VOID", "MAIN", "STRING", "SYSTEM", "OUT","PRINT","ARRAY","BOOLEAN","PUBLIC",
                               "BOOLEAN","STATIC","SCANNER","DOUBLE","CLASS","PRIVATE"};

    //helper array declaration

    static char[] hiddenWord ;
    static boolean[] result;
    static char []letterUsed;

    //global variable
    static int totalNumberOfGuess=0; // number of word guess by the player
    static int lifeCount=4; //life for each word guess

    //scanner
    static Scanner input = new Scanner(System.in);


    //initialize the game -->get teh hidden word
    static void initTheGame(){
        Random random = new Random();
        int wordIndex = random.nextInt(words.length);
        hiddenWord = words[wordIndex].toCharArray();
        result = new boolean[hiddenWord.length];
        letterUsed = new char[hiddenWord.length];
        lifeCount = 4;
        System.out.println("\n");

        printTheResult();

    }

 // print he current status of teh guess
    static void printTheResult(){
        System.out.print("WORD:");
        for (int j = 0; j < result.length; j++) {
            if (result[j]) {
                System.out.print(hiddenWord[j]);
            } else {
                System.out.print("_");
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("***************WELCOME TO JAVA HANGMAN GAME*************");
        System.out.println("You need to guess the JAVA keywords in this Game you will get 4 chance to guess for each word");
        initTheGame();
        int letterUsedCount=0;

        while (true) {

            //if all the life used exit the game
            if(lifeCount==0){
                System.out.println("\nyou have used all the life game ends");
                System.out.println("you have guessed " + totalNumberOfGuess + "  word");
                break;
            }
            //System.out.print("\033[H\033[2J");
           // System.out.flush();
            if(letterUsedCount>0){
                System.out.print("\n Letter used are: ");
                for (int i = 0; i < letterUsedCount; i++) {
                    System.out.print(letterUsed[i] + " ");
                }
            }
            System.out.println("\n Number of life you have: " + lifeCount);
            System.out.println(" Please Enter a Character:\n");
            char inputLetter = input.nextLine().toUpperCase().charAt(0);
            letterUsed[letterUsedCount]=inputLetter;
            letterUsedCount++;


            boolean guess = false;

            for (int i = 0; i < hiddenWord.length; i++) {

                if (inputLetter == hiddenWord[i]) {
                    result[i] = true;
                                   }
            }


            for (int i = 0; i < hiddenWord.length; i++) {

                if (inputLetter == hiddenWord[i]) {
                    guess=true;
                    break;
                }
            }


            boolean guesall = true;
            for (int j = 0; j < result.length; j++) {
                if (!result[j]) {
                    guesall = false;
                }

            }


            if (guesall) {
                totalNumberOfGuess++;
                System.out.println("You have won the game");
                System.out.println("you have guessed " + totalNumberOfGuess + "  word");
                System.out.println("Congrats you have guess the word");
                printTheResult();

                System.out.println("\n Do you like to Guess the next word Enter Y:Yes and N for Exit the Game");
                char yesNo =input.nextLine().toUpperCase().charAt(0);
                if(yesNo=='Y'){
                    initTheGame();
                }
                else{
                    break;
                }

            }
            else {

                if (guess) {

                    printTheResult();
                    }


                 else {
                    lifeCount--;
                    printTheResult();
                }
            }

//            if (guess) {
//                for (int j = 0; j < result.length; j++) {
//                    if (result[j]) {
//                        System.out.print(hiddenWord[j]);
//                    } else {
//                        System.out.print("_");
//                    }
//
//                }
//                System.out.println("\nNumber of life remaining" + lifecount);
//                if (lifecount == 4) {
//                    System.out.println("Number of life remaining " + lifecount);
//                } else if (lifecount == 3) {
//
//                    System.out.println("Number of life remaining" + lifecount);
//                } else if (lifecount == 2) {
//                    System.out.println("Number of life remaining" + lifecount);
//                } else if (lifecount == 1) {
//                    System.out.println("Number of life reaming " + lifecount);
//                }
//
//
//            } else {
//                lifecount--;
//
//                if (lifecount == 0) {
//
//                    System.out.println("YOU LOST GAME OVER");
//                    break;
//                } else if (lifecount == 3) {
//                    System.out.println("Number of life remaining " + lifecount);
//                } else if (lifecount == 2) {
//
//                    System.out.println("Number of life remaining" + lifecount);
//                } else if (lifecount == 1) {
//                    System.out.println("Number of life remaining" + lifecount);
//                }
//
//
//            }
//
//
//        }


        }


    }


    }

