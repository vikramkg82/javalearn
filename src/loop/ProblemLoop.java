package loop;
//
//Printing Patterns:
//
//Problem: Print various patterns using loops.
//        Example: Print a pyramid pattern, a square pattern, or a diamond pattern using nested loops.
//Sum of Digits:
//
//Problem: Find the sum of digits of a given number.
//        Example: For input 123, the output should be 6 (1+2+3).
//Factorial:
//
//Problem: Calculate the factorial of a given number.
//        Example: For input 5, the output should be 120 (54321).
//Fibonacci Series:
//
//Problem: Generate the Fibonacci series up to a given number.
//        Example: For input 8, the output should be 0, 1, 1, 2, 3, 5, 8.

//Prime Numbers:
//
//Problem: Check if a given number is prime or not.
//        Example: For input 7, the output should be true.
//Reverse a Number:
//
//Problem: Reverse a given number.
//Example: For input 123, the output should be 321.

//Palindrome:
//
//Problem: Check if a given number is a palindrome.
//Example: For input 121, the output should be true.
//Count Vowels and Consonants:
//
//Problem: Count the number of vowels and consonants in a given string.
//        Example: For input "hello", the output should be 2 vowels and 3 consonants.
//Armstrong Number:
//
//Problem: Check if a given number is an Armstrong number.
//        Example: For input 153, the output should be true.
//Perfect Number:
//
//Problem: Check if a given number is a perfect number.
//        Example: For input 28, the output should be true.


import java.util.Scanner;

public class ProblemLoop {

    static Scanner ConsoleInput(){
        Scanner console = new Scanner(System.in);
        return console;
     }
    public static void main(String[] args) {

        // sum of the digit

      int number = ConsoleInput().nextInt();;
        System.out.println(number);

        System.out.println(number/10);
        System.out.println(number%10 );
        System.out.println((number>>2)>>2>>2>>2);
        System.out.println(number<<2);


    }
}
