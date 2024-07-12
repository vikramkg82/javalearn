package DynamicArray;

public class MyArray<E> {
    private static final int INIT_SIZE = 5;
    private static final int SIZE_INCREASE = 5;
    private E[] data;
    private int size;

    public MyArray() {

        this.data = (E[]) new Object[INIT_SIZE];
        this.size = 0;
    }

    public void add(E element) {
        if (size == data.length) {
            extendArray();
        }
        data[size] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else
            return null;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i != size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }


    public void remove(int index) {
        if (index >= 0 && index < size) {
            E[] temp = (E[]) new Object[size];
            int counter = 0;
            for (int i = 0; i < size; i++) {
                if (index != i) {
                    temp[counter] = data[i];
                    counter++;
                }
            }
            size--;
            data = temp;
        } else {
            System.out.println("Index out of Bound");
        }
    }

    public boolean contains(E elem) {
        for (int i = 0; i < size; i++) {
            if (data[i] == elem) {
                return true;
            }

        }
        return false;
    }

    public void add(E elem, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of Bound");
        } else {
            if (size == data.length) {
                extendArray();
            }

            if (size == index) {
                data[size] = elem;
                size++;

            } else {
                E[] temp = (E[]) new Object[data.length];
                int counter = 0;
                for (int i = 0; i < size; i++) {
                    if (index == i) {
                        temp[counter] = elem;
                        temp[++counter] = data[i];
                        counter++;
                    } else {
                        temp[counter] = data[i];
                        counter++;
                    }
                }
                data = temp;
                size++;
            }
        }
    }


    private void extendArray() {
        E[] temp = (E[]) new Object[data.length + SIZE_INCREASE];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

}

