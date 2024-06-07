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




    public static void main(String[] args) {
        System.out.println("Entered String is palindrome ?:" + palindrome());
        System.out.println("reverse a string:");
        reverseString();
        numberOfUpperCaseLetter();
        mostCommonLetter();
        anagram();
    }
}
