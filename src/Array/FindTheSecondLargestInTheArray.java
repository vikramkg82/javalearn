package Array;

public class FindTheSecondLargestInTheArray {

    public static void main(String[] args) {
        //int[] array ={-3,2,10,5};
       // int [] array ={10,1,2,3};
        int [] array={1,2,3,5};
        //int [] array={-2,4,10,5};
        //int[] array ={3};
        if(array.length>1){
            int index=0;
            int max = array[0];
            int secondlargest=Integer.MIN_VALUE;
            for (int i = 1; i < array.length; i++) {
                if(max<array[i])
                { index=i;
                max=array[i];}
            }

            for (int i = 0; i <array.length ; i++) {
                if(index!=i ){

                    if(secondlargest<array[i] && secondlargest<max){
                        secondlargest=array[i];
                    }

                }

            }

            System.out.println("Second largset is:" + secondlargest);

        }
        else {
            System.out.println("Array should have atleast 2 element");
        }
    }

}
