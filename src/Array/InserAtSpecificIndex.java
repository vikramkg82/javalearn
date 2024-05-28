package Array;

public class InserAtSpecificIndex {

    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] newArray = new int[array.length+1];
        int index = 3;
        int value=10;
        int newIndex=0;

        for (int i = 0; i < index; i++) {
            newArray[newIndex++]=array[i];

        }

        newArray[newIndex++]=value;

        for (int i = index; i < array.length ; i++) {

            newArray[newIndex++] =array[i];

        }


        System.out.println("Original Array");
        for(int ele:array){
            System.out.print(ele + " ");
        }

        System.out.println("\n Modifed array:");
        for(int ele:newArray){
            System.out.print(ele + " ");
        }

    }
}
