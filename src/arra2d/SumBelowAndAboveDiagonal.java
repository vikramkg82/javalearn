package arra2d;

public class SumBelowAndAboveDiagonal {

    public static int[][] arra2d ={{99,2,3},{3,99,5},{6,7,99}};
    //   0    1   2
    // 0 99   2   3
    // 1  3    99  5   i =0 j=1 j=2 ; i=1  j=2 ; i=2
    // 2  6    7   99
    //

    public static int sum=0;
    public static void main(String[] args) {

        if(checkArrayIsNotEmpty()) {
            System.out.println("Sum of the element above the diagonal :" + sumAboveDiagonal());
            System.out.println("Sum of the element below the diagonal :" + sumBelowDiagonal());
            System.out.println("Average of the Array:" + averageOfTheArray());
            //System.out.println("Element of the Array > average are :" + elementAboveTheAverage());  // this one does not work not sure what's wrong here

            System.out.println("Element of the Array > average are ");
            elementAboveTheAverage();
        }
        else
        {
            System.out.println("Array is Empty");
        }

    }


     public  static boolean checkArrayIsNotEmpty(){
        if(arra2d.length>0){
            return true;
        }
        else
        {
            return false;
        }
     }

    public static double averageOfTheArray(){
        int  sum=0;
        int totalEle=0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d.length; j++) {

                sum+=arra2d[i][j];
                totalEle++;
            }

        }
         return (sum/totalEle);
    }

    public  static void elementAboveTheAverage(){
         double average= averageOfTheArray();
         boolean found =false;
        System.out.print('[');
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d.length; j++) {
                if( (arra2d[i][j] > average)){
                    System.out.print(arra2d[i][j]);
                    found=true;
                }
                if(j!=arra2d.length && found==true){
                    System.out.print(",");
                    found=false;
                }
            }
        }
        System.out.print("]");
    }



    public static int sumBelowDiagonal(){
        int sum=0;
        for(int i=0 ; i< arra2d.length;i++)
        {
            for (int j = 0; j < i; j++) {

                sum+=arra2d[i][j];

            }
        }

        return sum;
    }


    public static int sumAboveDiagonal(){

        int sum=0;
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = i+1; j < arra2d.length ; j++) {

                sum+=arra2d[i][j];

            }

        }
        return sum;

    }


}
