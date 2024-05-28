package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CommonElementBetweenTwoIntArray {
    public static void main(String[] args) {

        int[] array1 = {0,1,5,4,8};
        int[] array2 = {0,1,5,0,4,1,8,9};
        int totalCommonEle = 0; // number of common element between the array
        int [] commonElement= new int[(Math.min(array1.length, array2.length))];



        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]==array2[j]){

                    boolean alreadyExists=false;
                    for (int k = 0; k < totalCommonEle; k++) {
                        if(array1[i] == commonElement[k]){
                            alreadyExists=true;
                            break;
                        }
                    }
                    if(!alreadyExists){
                        commonElement[totalCommonEle++]=array1[i];
                    }
                    break;
                    
                }

            }
            
        }


        System.out.println(Arrays.toString(commonElement));
     
}
    }


