package DynamicArray;

public class Main {
    public static void main(String[] args) {

        MyArray<String> myArray = new MyArray<>();
        myArray.add("hi");
        myArray.add("hello");
        myArray.add("done");
        myArray.add("hello");
        myArray.add("hello");
        System.out.println(myArray.size());
        System.out.println(myArray.get(2));
        System.out.println(myArray);
        myArray.remove(0);
        System.out.println(myArray);
        System.out.println(myArray.contains("ho"));

        myArray.add("kg", 4);
        myArray.remove(0);
        System.out.println(myArray);
        System.out.println(myArray.size());
    }
}
