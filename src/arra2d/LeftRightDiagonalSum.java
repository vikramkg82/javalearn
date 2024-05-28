package arra2d;

public class LeftRightDiagonalSum {

    static int[][] array = {{1, 2, 100}, {4, 5, 6}, {7, 8, 22}};
    //static int[][] array ={{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12},{13,14,15,16}};

    public static void main(String[] args) {
       //left diagonal sum
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    sum+=array[i][j];
                }
            }

        }

        System.out.println("Left Diagonal sum: "+sum);

        //Right diagonal sum
        sum=0;
        for (int i = array.length-1; i>=0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if(j==((array.length)-(i+1))){
                    sum+=array[i][j];
                }
            }

        }
        System.out.println("Right Diagonal sum:" + sum);

    }



}