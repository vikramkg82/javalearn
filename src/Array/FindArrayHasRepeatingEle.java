package Array;

public class FindArrayHasRepeatingEle {
    public static void main(String[] args) {

        //int[] array={1,2,3,4};
        //int[] array={1,2,3,4,5,5};
        //int[] array={};
        //int [] array ={1,1};
        int[] array={1,2,3,4,5,6,7,8,9,10,11,1,2,3,4};
        int start=0;
        int end=array.length-1;
        boolean found=false;
        if(array.length>1){
       outerloop:  for(int i = 0; i<array.length; i++){
            for (int j = i+1; j < array.length ; j++) {


                if (array[i] == array[j]) {
                    found = true;
                    break outerloop;
                }
            }
        }
        if(found){
            System.out.println("Array has repeating element");
        }
        else {
            System.out.println("Array don't have any repeating element");
        }
    }else
        {
            System.out.println("Need minimum two element");
        }
}}
