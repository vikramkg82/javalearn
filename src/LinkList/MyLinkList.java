package LinkList;

public class MyLinkList<T> {

    private Node<T> head;

    public void add(T elem) {

        Node<T> newElem = new Node<>(elem); // creating the new node with the data
        if (head == null) {
            head = newElem;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newElem;
        }
    }


    public int size() {
        int counter = 0;
        Node<T> temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }


    public T get(int index) {
        Node<T> temp = head;
        int counter = 0;
        while (temp != null) {
            if (counter == index) {
                return temp.data;
            }
            temp = temp.next;
            counter++;
        }

        return null;
    }

    public void add(T elem, int index) {
        Node<T> newelem = new Node<>(elem);
        Node<T> temp = head;
        int counter = 0;
        if (temp == null && index == 0) //if no element in the list and ask to insert at 0th index
        {
            head = newelem;
            return;
        }
        while (temp != null) // traverse the link list
        {
            if (index == 0) // if ask is to insert at index 0
            {
                newelem.next = head;
                head = newelem;
                return;
            } else if (index == (counter + 1))  //it  also insert at  index+1 position that is to end of the list .
            {
                if (temp.next == null) {  // if the element is the last element in the list ;
                    temp.next = newelem;
                    return;
                }
                newelem.next = temp.next;
                temp.next = newelem;
                return;
            }
            temp = temp.next; // traverse to the next node
            counter++;   // move the counter
        }
    }
    public void printList() {
        Node<T> temp = head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


    public void remove(int index) {
        Node<T> temp = head;
        int counter = 0;
        if (index == 0) {
            head = head.next;
            temp.next = null;
            return;
        }
        while (temp != null) {
            if ((counter + 1) == index) {
                if ((temp.next).next == null) {
                    temp.next = null;
                    return;
                } else {
                    temp.next = temp.next.next;
                    return;
                }
            }
            temp = temp.next;
            counter++;
        }
    }

    public boolean conatins(T elem)
    {
        Node<T> temp = head;
        System.out.println();
        while (temp != null)
        {
            if (temp.data == elem)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


}
