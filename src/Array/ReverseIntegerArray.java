package Array;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1}; // 0 ,1 ,2 3,4 ,5
        if(array.length> 0){
            int start =0;
            int end = array.length-1;
            int temp;

            for (int i = 0; i <array.length/2; i++) {

                 temp=array[start];
                 array[start]=array[end];
                 array[end]=temp;
                 start++;
                 end--;

            }

            for(int ele:array){
                System.out.print(ele + " ");
            }



        }
    }
}
