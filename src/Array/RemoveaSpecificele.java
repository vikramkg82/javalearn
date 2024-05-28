package Array;

public class RemoveaSpecificele{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int eleRemoveIndex=3;
        boolean found=false;
        int[] newArray =new int[array.length-1];
        int index=0;
        //int eleRemove=9;

        if(array.length>0){
            if (eleRemoveIndex >= 0 && eleRemoveIndex < array.length) {


                for (int i = 0; i < eleRemoveIndex; i++) {

                    newArray[index++]=array[i];

                }

                for (int i = eleRemoveIndex+1; i < array.length ; i++) {

                    newArray[index++] =array[i];
                }

            }

            System.out.println("Given array");
            for(int ele :array){
                System.out.print(ele +" ");
            }

            System.out.println("\n Array after removing the element at index: " + eleRemoveIndex);
            for(int elm:newArray){
                System.out.print(elm + " ");
            }


        }

    }
}
