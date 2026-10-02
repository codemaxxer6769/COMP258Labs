// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List - Algorithm Efficiency

package comp258_efficiencyanalysis;

import java.util.Arrays;

/**
 * Custom collection class that encapsulates an ordinary integer array,
 * providing dynamic growth, element insertion, and gap-closing removal.
 */
public class ArrayManager {

    private int[] items;
    private int count; // Logical size (number of actively used elements)

    public ArrayManager() {
        this.items = new int[10];
        this.count = 0;
    }

    public ArrayManager(int capacity) {
        this.items = new int[capacity];
        this.count = 0;
    }

    public ArrayManager(int[] values) {
        if (values != null) {
            int capacity = Math.max(values.length, 10);
            this.items = new int[capacity];
            System.arraycopy(values, 0, this.items, 0, values.length);
            this.count = values.length;
        } else {
            this.items = new int[10];
            this.count = 0;
        }
    }

    private void ensureCapacity() {
        if (count >= items.length) {
            int newCapacity = items.length * 2;
            items = Arrays.copyOf(items, newCapacity);
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[ Collection is empty ]");
            return;
        }
        System.out.print("ArrayManager items: [ ");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    public void add(int n) {
        ensureCapacity();
        items[count] = n;
        count++;
    }

    public void addAt(int n, int pos) throws OutOfBoundsException {
        if (pos < 0 || pos > count) {
            throw new OutOfBoundsException("Invalid position: " + pos + ". Valid range is 0 to " + count + ".");
        }
        ensureCapacity();
        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }
        items[pos] = n;
        count++;
    }

    public void remove(int pos) throws NoItemsException, OutOfBoundsException {
        if (isEmpty()) {
            throw new NoItemsException("Cannot remove item: The ArrayManager is completely empty.");
        }
        if (pos < 0 || pos >= count) {
            throw new OutOfBoundsException("Invalid position: " + pos + ". Valid index range is 0 to " + (count - 1) + ".");
        }
        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        items[count - 1] = 0;
        count--;
    }

    /**
     * Removes all occurrences of the specified Object from the integer array.
     * Part 1 Lab Requirement.
     * 
     * @param o The object/value to remove from the array collection.
     */
    public void removeAllOccurrences(Object o) {
        if (o == null || isEmpty()) {
            return;
        }

        if (o instanceof Number) {
            int target = ((Number) o).intValue();
            int writeIndex = 0;

            for (int readIndex = 0; readIndex < count; readIndex++) {
                if (items[readIndex] != target) {
                    items[writeIndex] = items[readIndex];
                    writeIndex++;
                }
            }

            for (int i = writeIndex; i < count; i++) {
                items[i] = 0;
            }
            count = writeIndex;
        }
    }
}