package arra2d;

public class SumBelowAndAboveDiagonal {

    public static int[][] arra2d = {{99, 1, 1}, {1, 99, 1}, {1, 1, 99}};
    //     0    1     2
    //---------------
    // 0 | 99     1    1
    // 1 |  1    99    1   i =0 j=1 j=2 ; i=1  j=2 ; i=2
    // 2 |  1     1   99
    //




    public static void main(String[] args) {

        if (checkArrayIsNotEmpty()) {
            System.out.println("Sum of the element above the left diagonal :" + sumAboveLeftDiagonal());
            System.out.println("Sum of the element below the left diagonal :" + sumBelowLeftDiagonal());

            System.out.println("Sum of the element above the Right Diagonal:" + sumAboveTheRightDiagonal());
            System.out.println("Sum of the element below the Right Diagonal:" + sumBelowTheRightDiagonal());
            System.out.println("Average of the Array:" + averageOfTheArray());
            //System.out.println("Element of the Array > average are :" + elementAboveTheAverage());  // this one does not work not sure what's wrong here
            System.out.print("Element of the Array > average are :");
            elementAboveTheAverage();
        } else {
            System.out.println("Array is Empty");
        }

    }

 // check given array is not empty
    public static boolean checkArrayIsNotEmpty() {
        if (arra2d.length > 0) {
            return true;
        } else {
            return false;
        }
    }

// get the averge of the array element
    public static double averageOfTheArray() {
        int sum = 0;
        int totalEle = 0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d.length; j++) {

                sum += arra2d[i][j];
                totalEle++;
            }

        }
        return (sum * 1.0 / totalEle);
    }


//search for element above the average
    public static void elementAboveTheAverage() {
        double average = averageOfTheArray();
        boolean found = false;
        int count = 0;
        System.out.print('[');
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d.length; j++) {
                if ((arra2d[i][j] > average)) {

                    count++;

                    if (count > 1) {
                        System.out.print(",");
                    }
                    System.out.print(arra2d[i][j]);


                }
            }

        }
        System.out.print("]");
    }

    public static int sumBelowLeftDiagonal() {
        int sum = 0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < i; j++) {

                sum += arra2d[i][j];

            }
        }

        return sum;
    }


    public static int sumAboveLeftDiagonal() {

        int sum = 0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = i + 1; j < arra2d.length; j++) {

                sum += arra2d[i][j];

            }

        }
        return sum;
    }

    public  static boolean checkArrayIsSquare() {

        return ((arra2d.length + arra2d[0].length) / 2) == 0;

    }


    public static  int sumAboveTheRightDiagonal(){
        int sum=0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d.length-1-i; j++) {
                sum+=arra2d[i][j];
            }

        }


        return sum;
    }



    public static int sumBelowTheRightDiagonal(){
        int sum=0;

        for (int i = 1; i <arra2d.length; i++) {
            for (int j = arra2d.length-i; j<arra2d.length; j++) {

                sum+=arra2d[i][j];

            }
        }


        return sum;

    }
}



