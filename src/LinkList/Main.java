package LinkList;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkList<Integer> myLinkedList = new MyLinkList<>();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.size());
        myLinkedList.add(10,0); //insert at index 0
        System.out.println(myLinkedList.size());
        myLinkedList.printList();
        myLinkedList.add(22,2); //insert at middle
        myLinkedList.printList();
        myLinkedList.add(33,6); // insert at end
        myLinkedList.printList();
        myLinkedList.add(33,9); // out of the index
        myLinkedList.printList();
        myLinkedList.remove(0); //remove first element
        myLinkedList.printList();
        myLinkedList.remove(2); // remove in the middle
        myLinkedList.printList();
        myLinkedList.remove(4); //remove last element
        myLinkedList.printList();
        System.out.println(myLinkedList.conatins(22)); //true
        System.out.println(myLinkedList.conatins(33)); // false

    }



}

