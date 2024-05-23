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

    static int readNumber(){
        System.out.println("Please Enter a Number:");
         int number = ConsoleInput().nextInt();
         return  number;
     }
    public static void main(String[] args) {


        boolean flag=true;
        while(flag){

            System.out.println("Choose the one of the operation from below menu:");
            System.out.println("1-->given number is a palindrome or not ");
            System.out.println("2-->sumOfDigits");
            System.out.println("3-->reverse number");
            System.out.println("4-->factorail of a number");
            System.out.println("5-->arm strong number");
            System.out.println("6-->perfect number");
            System.out.println("7-->prime number");
            System.out.println("8-->fibonachi series");
            System.out.println("9->find previous primenumber ");
            System.out.println("10--->draw shape");
            System.out.println("0-->to exit");

            int number=readNumber();
            if(number==1){
                palindrome();
            }else if(number==2){
                sumOfDigit();
            }else if(number==3){
                reverseNumber();
            }else if(number==4){
                factorialOfNumber();
            }else if(number==5){
                armStrongNumber();
            }else if(number==6){
                perfectNumber();
            }else if(number==7){
                primeNumber();
            }else if(number==8){
                fibonacci();
            }else if(number==9){
                findPrevPrime();
            }else if(number==10){
                drawShapes();
            }else if(number==0){
                flag =false;
            }
        }

         //palindrome();
         //sumOfDigit();
         //reverseNumber();
         //factorialOfNumber();
         //armStrongNumber();
         //perfectNumber();
           //primeNumber();
        //fibonacci();
        //findPrevPrime();
        //drawShapes();








    }


    //      Check if a given number is a palindrome
    static void palindrome(){
        int number = readNumber();
        int orginalNumber=number;
        int reverseNumber = 0;
        while (number != 0) {

            reverseNumber = ((reverseNumber * 10) + number % 10);
            number = number / 10;

        }

        if(reverseNumber==orginalNumber){
            System.out.println("number is palindrome");
        }

        else{
            System.out.println("NUmber is not palindrome");
        }

    }




    // sum of the digit

    static void sumOfDigit() {

      int number = ConsoleInput().nextInt();
      int sum=0;
      while((number!=0)){
          sum = sum+(number%10);
          number=number/10;


      }
        System.out.println(sum);
    }

// reverse a number

    static void reverseNumber(){
        int number = readNumber();
       int reverseNumber = 0;
        while (number != 0) {

            reverseNumber = ((reverseNumber * 10) + number % 10);
            number = number / 10;

        }

        System.out.println("Reverse of the number: "+ reverseNumber);
    }


    //factorial of a number

    static void factorialOfNumber(){
        int number = readNumber();
        int factorial = 1;
        if(number >0) {

            for (int i = 1; i <= number; i++) {
                factorial *= i;

            }

            System.out.println("Factorial of the number" + number + " is" + factorial);
        }
        else
            {
                System.out.println("NUmber should be >0");
            }


        }


       // check a number is armstrong

      static void armStrongNumber(){

        int number =readNumber();
        int sum=0;
        int originalNUmber = number;
        while(number!=0){

             int reminder = number%10;
             sum += (reminder*reminder*reminder);
             number =number/10;

        }
        if(sum==originalNUmber){
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not a armstrong number");
        }


    }


    // perfect number

    static void perfectNumber(){
        int number= readNumber();
        int sum=1;
        for (int i = 2; i <= number/2 ; i++) {

            if((number%i)==0){
                sum+=i;
            }

        }
        if(sum==number){
            System.out.println("Number is perfectNumber");
        }
        else{
            System.out.println("NUmber is not a perfect number");
        }
    }


    //prime number

    static void primeNumber(){
        int number = readNumber();
        boolean found =false;
        for (int i = 2; i <= number/2 ; i++) {

            if(number%i == 0){
                found = true;
            }

        }

        if(found==false){
            System.out.println("Entered number is a prime number");
        }

        else{
            System.out.println("Number isn ot a prime number");
        }
    }



    static  void fibonacci(){
        int number = readNumber();  //0,1,1,2,3,5,8,13
         int firstNumber=0;
         int secondNumber=1;
        System.out.print(firstNumber + ",");
        System.out.print(secondNumber);//0
        for (int i = 3; i < number; i++) {
            secondNumber = firstNumber+secondNumber;
            if(secondNumber>number){

                break;
            }
            firstNumber=secondNumber-firstNumber;
            System.out.print("," + secondNumber );


        }

    }


    static void findPrevPrime(){

        // 11 -->
        // 3 5 7 11 13 -
        // 1 2 3 4 56 7 8 9 10 11 12 13 14 15 16 18 19 20
        // 15

        int number = readNumber();
        boolean prime=true;
        while(number>2) {
            // if the number is even  decrement the number by one .
            if (number % 2 == 0) {
                number--;
            }
            for (int j = 2; j <=number/2 ; j++) {
                if((number % j) == 0){
                    prime=false;
                }
            }
            // if we find the number is not a prime number to check the next number set the flag to true and decrement the number
            if(!prime){
                prime=true;
                number--;
            }
            else
                break;  //if the number is not divsible by any break it.
        }
        if(prime){
            System.out.println(number);
        }
    }

    static void drawShapes() {
        int number = readNumber();


        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ****  i=0   j: 0-->3
        //  ***  i=1   j: 1-->3
        //   **  i=2   j: 2--3
        //    *  i=3   j->3
        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j > i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         /* XX*XX   i=0 j 0--4 j -->0 --x 1 --x 2 * 3 X 4 X
            X***X   i=1 j 0--4   0 -x 1 -* 2-* 3-* 4-X
            *****
 X***X   i=3
            XX*XX
*/
        for (int i = 0; i < number; i++) {
            if (i <= number / 2) {
                int start = (number / 2) - i;
                int end = (number / 2) + i;
                for (int j = 0; j < number; j++) {
                    if (j == start && start <= end) {
                        System.out.print("*");
                        start++;
                    } else {
                        System.out.print("X");
                    }
                }
                System.out.println();
            } else {
                int start = i - (number / 2);
                int end = number - (start + 1);
                for (int j = 0; j < number; j++) {
                    if (j == start && start <= end) {
                        System.out.print("*");
                        start++;
                    } else {
                        System.out.print("X");
                    }
                }
                System.out.println();

            }

        }
    }



    }



