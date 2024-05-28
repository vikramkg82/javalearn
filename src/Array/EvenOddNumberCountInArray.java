package Array;

import java.sql.SQLOutput;

public class EvenOddNumberCountInArray {
    public static void main(String[] args) {

        int[] array ={2,9,7,6,-7,10,0};

        if(array.length>0){  // check array is empty or not
            int evenNumberCount=0;
            int oddNUmberCount=0;
            for(int ele:array){
                if(ele%2==0){
                    evenNumberCount++;
                }
                else
                {
                    oddNUmberCount++;
                }
            }

            System.out.println("Even number count: " + evenNumberCount);
            System.out.println("Odd number count: " + oddNUmberCount);

        }
        else {
            System.out.println("Array is empty");
        }
    }
}
