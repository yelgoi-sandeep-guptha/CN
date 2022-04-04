package M2.L17;

public class DynamicArray {

    private int[] data;
    private int nextElementIndex;

    public DynamicArray() {
        data = new int[3];
        nextElementIndex = 0;
    }

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public int get(int i) {
        if (i < 0 || i >= nextElementIndex) {
            return -1;
        }
        return data[i];
    }

    public void add(int elem) {
        if (nextElementIndex == data.length) {
            doubleCapaciy();
        }
        data[nextElementIndex++] = elem;
    }

    public void doubleCapaciy() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public void set(int i, int elem) {
        if (i >= nextElementIndex) {
            return;
        }
        data[i] = elem;
    }

    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }
        return data[--nextElementIndex];
    }

    public void fun() {
        System.out.println("Array is " + isEmpty());
        System.out.println("Size " + size());
    }

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        for (int i = 1; i < 9; i++) {
            d.add(i * 2);
        }
        System.out.println("The size of the array is : " + d.size());
        System.out.println("Element at index 2 is: " + d.get(2));
        d.set(2, 41);
        System.out.println("The elements in the array :");
        while (!d.isEmpty()) {
            System.out.print(d.removeLast() + " ");
        }
    }
}