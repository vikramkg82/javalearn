package Array;

public class AverageValueOfArrayElement {

    public static void main(String[] args) {

        int [] array = {1,2,4,5,6,8};
        int sum=0 ;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        System.out.println("Average of the array elements:" + sum/ array.length );



    }

}
