package Array;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] array={-1,2,4,0,5};

        if(array.length>0){

            int min =array[0]; // init the min with the first element of the array;

            for(int ele:array){
                if(min>ele){
                    min=ele;
                }
            }
            System.out.println("Minimum element in the array: " + min);
        }


    }
}
