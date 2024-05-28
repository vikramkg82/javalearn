package Array;

import java.sql.SQLOutput;

public class CommonElementBetweenTwoIntArray {
    public static void main(String[] args) {

        int[] array1 = {0,1,5,4};
        int[] array2 = {0,1,5,4};
        int totalCommonEle = 0; // number of common element between the array

        if (array1.length > array2.length) {     // depending on the number of element in the array choose larger array to compare with the smaller array
            int[] commonArray = new int[array2.length];  // array to hold the common element
            int zeroCount = 0;
            int indexOfCA = 0;                              // index for common element
            for (int i = 0; i < array1.length; i++) {           // lager array
                for (int j = 0; j < array2.length; j++) {     // smaller array

                    if (array1[i] == array2[j]) {                // elements are equal
                                        if(array1[i]==0){  //to check if the 2 array has zero as common element so that we can add that in the end to common array
                                            zeroCount++;
                                        }
                        for (int k = 0; k < commonArray.length; k++) {  // check if that element already in the common array.

                            if (commonArray[k] != array1[i]) {        // if element not present in the common array add it


                                commonArray[indexOfCA] = array1[i];
                                indexOfCA++;
                                totalCommonEle++;
                            }
                            break;

                        }

                    }


                }

            }


        if(zeroCount>0){
            commonArray[totalCommonEle]=0; //if bot hte array contains the zero add that zero here.
            totalCommonEle++;
        }
        System.out.println("Common Element in the Array");
        for (int i = 0; i < totalCommonEle; i++) {
            System.out.print(commonArray[i] + " ");

        }
    }
        else

    {
        int[] commonArray = new int[array1.length];
        int indexOfCA = 0;
        int zeroCount=0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {

                if (array2[i] == array1[j]) {
                    if(array2[i]==0){
                        zeroCount++;
                    }

                    for (int k = 0; k < commonArray.length; k++) {

                        if (commonArray[k] != array2[i]) {
                            commonArray[indexOfCA] = array2[i];
                            indexOfCA++;
                            totalCommonEle++;
                        }
                        break;

                    }


                }

            }

        }
        if(zeroCount>0){
            commonArray[totalCommonEle]=0;
            totalCommonEle++;
        }
        System.out.println("Common Element in the Array");
        for (int i = 0; i < totalCommonEle; i++) {
            System.out.print(commonArray[i] + " ");

        }

    }

}
    }


