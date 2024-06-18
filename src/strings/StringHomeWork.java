package strings;

import java.util.Arrays;


/**
 * Check if a string is a palindrome.
 * Reverse the words in a given string.
 * Count the number of uppercase letters in a given string ignoring non alphabetical characters.
 * Find and return the most common letter in a given string.
 * In a given array of Strings, find the longest common prefix.
 * Check if 2 strings are anagrams of each other (below - elbow)
 * Compress a string using the following rule: aaabccc = a3bc3
 */
public class StringHomeWork {

    public static String test = "2owww23aaaaa";

    public static boolean palindrome(){

       char[] charArray= test.toCharArray();
       int start=0;
       int end = charArray.length-1;
        for (int i = 0; i < charArray.length/2; i++) {
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;


        }
        System.out.println(Arrays.toString(charArray));



        return true;
    }



      static public void reverseString() {
          char[] charArray = test.toCharArray();
          int start = 0;
          char tempChar;
          int end = charArray.length - 1;
          for (int i = 0; i < charArray.length / 2; i++) {

              tempChar = charArray[start];
              charArray[start] = charArray[end];
              charArray[end] = tempChar;
              start++;
              end--;

          }
          for (char ele : charArray) {
              System.out.print(ele);
          }


      }


      public static void reverseWords(String str1){


        String []str2 = str1.split(" ");
          for (int i = str2.length-1 ;i >= 0 ; i--) {

               System.out.print(str2[i] + " ");

          }
      }


      public static void numberOfUpperCaseLetter(){
          char[] charArray = test.toCharArray();
          int count=0;
              for (int i = 0; i < test.length(); i++) {
                  if(Character.isAlphabetic((test.charAt(i))) && Character.isUpperCase(test.charAt(i)))
                  {
                      count++;
                  }

              }


              System.out.println("\n NUmber of upper case letter: " + count);
          }

      public static void mostCommonLetter(){
          char[] charArray= test.toCharArray(); //{ b,c,c,d,a,e,f};
          int total=1;
          int countTracker=0;
          char commonLetter=' ';

          for (int i = 0; i < charArray.length; i++) {
              countTracker=0;
              for (int j = 1; j < charArray.length; j++) {
                  if(Character.isAlphabetic(charArray[i])&& Character.isAlphabetic(charArray[j])){
                      if(charArray[i]==charArray[j]){
                          countTracker++;
                          if(countTracker>total){
                            commonLetter=charArray[i];
                            total=countTracker;
                          }
                      }
                  }


              }


          }
          System.out.println("Most common Letter --: " + commonLetter);
      }


      public static void anagram(){

        String str1="belowb";
        String str2="elbobb";

        char [] char1=str1.toCharArray();
        char [] char2=str2.toCharArray();

        if(str1.length()!=str2.length()){
            System.out.println("given string not an anagram");
            return;
        }
         int count=0;
          for (int i = 0; i < str1.length(); i++) {
              for (int j = 0; j < str2.length(); j++) {

                  if (char1[i] == char2[j]) {
                      count = count + 1;
                      char2[j] = ' ';
                      break;
                  }

              }
          }

          if(count==str2.length()){
              System.out.println("given string is an anagram yes");
          }
          else {
              System.out.println("given string is not an anagram");
          }

          }


 public static String longestCommonPrefix(String []str1) {

    String prefixString=" ";

   // if array is empty return
    if(str1.length<1)
    {
       return prefixString;
    }

    //check all element start with the same letter
     for (int i = 0; i < str1.length - 1; i++)
     {
         if (str1[i].charAt(0) != str1[i + 1].charAt(0))
         {
             return prefixString;
         }
     }

     //find the string with the smallest length  and save the string and  its index
     // maximum possible prefix string is the smallest string in the array
     int smallestStringLength = str1[0].length();
     String smallestString = " ";
     int smallestStringIndex = 0;
     for (int i = 1; i < str1.length; i++) {

         if (str1[i].length() < smallestStringLength) {
             smallestStringLength = str1[i].length();
             smallestString = str1[i];
             smallestStringIndex = i;
         }

     }
     //take one element from the string array  and compare letter by letter with the smallest string .
     int total = 0;
     for (int i = 0; i < str1.length; i++)   //get one element from the array
     {
         int counterPrefix = 0;
         for (int j = 1; j <= smallestStringLength; j++)  //compare all the letter in the  smallest string with the string array element;
         {
             if (smallestString.substring(0, j).equals(str1[i].substring(0, j)) && i != smallestStringIndex )
             {
                 counterPrefix++;

             }
         }
         if( (i == 0 || total > counterPrefix) && i!=smallestStringIndex ){
             prefixString = smallestString.substring(0, counterPrefix);
             total=counterPrefix;
         }
     }
     return prefixString;
 }

public static String compressString(String str1)
{
    String str2=" ";
    int count=1;
    for (int i = 0; i < str1.length()-1; i++)
    {
        if(str1.charAt(i) == str1.charAt(i+1))
        {
            count++;
        }
        else{
            if(count >1 )
            {
            str2 = str2 + str1.charAt(i) + count;
            }
            else
            {
                str2 = str2 + str1.charAt(i);
            }
            count=1;
        }
        if(i== (str1.length()-2))
        {
            if(count >1 )
            {
                str2 = str2 + str1.charAt(i) + count;
            }
            else
            {
                str2 = str2 + str1.charAt(i+1);
            }
        }
    }
    return str2;
}




    public static void main(String[] args) {
       /* System.out.println("Entered String is palindrome ?:" + palindrome());
        System.out.println("reverse a string:");
        reverseString();
        numberOfUpperCaseLetter();
        mostCommonLetter();
        anagram();*/

        // reverse the word
        String str1 = "today is good day";
        reverseWords(str1);

        //find the most common prefix
        String[] str2 = {"apple", "application", "app" ,"apx","app"};
        System.out.println("\nLongest common prefix of the given string: "+ longestCommonPrefix(str2));

        //compress a string
        String str3 ="daaabbceccm";
        System.out.println("Compressed String :" + compressString(str3));
    }
}
