package Array;

public class FindTheSecondLargestInTheArray {

    public static void main(String[] args) {
        int[] array ={-2,-3,0,-5,8};
        //int[] array ={3};
        if(array.length>1){
            int index=0;
            int max = array[0];
            int secondlargest=array[0];
            for (int i = 1; i < array.length; i++) {
                if(max<array[i]);
                 index=i;
            }

            for (int i = 1; i <array.length ; i++) {
                if(index!=i ){

                    if(secondlargest<array[i]){
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
