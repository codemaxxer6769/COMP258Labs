// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;

import java.util.Arrays;

/**
 * Custom collection class that encapsulates an ordinary integer array,
 * providing dynamic growth, element insertion, and gap-closing removal.
 */
public class ArrayManager {

    private int[] items;
    private int count; // Logical size (number of actively used elements)

    // Default constructor: capacity 10, count 0
    public ArrayManager() {
        this.items = new int[10];
        this.count = 0;
    }

    // Constructor with specific capacity
    public ArrayManager(int capacity) {
        this.items = new int[capacity];
        this.count = 0;
    }

    // Constructor initialized with an existing array of values
    public ArrayManager(int[] values) {
        if (values != null) {
            // Set initial capacity to match input or default to 10
            int capacity = Math.max(values.length, 10);
            this.items = new int[capacity];
            System.arraycopy(values, 0, this.items, 0, values.length);
            this.count = values.length;
        } else {
            this.items = new int[10];
            this.count = 0;
        }
    }

    /**
     * Helper method to dynamically double internal array capacity
     * when the physical storage becomes full.
     */
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

    /**
     * Inserts an item at a specific position. Shifts existing elements to the right.
     */
    public void addAt(int n, int pos) throws OutOfBoundsException {
        // Valid positions are from 0 to count (inclusive)
        if (pos < 0 || pos > count) {
            throw new OutOfBoundsException("Invalid position: " + pos + ". Valid range is 0 to " + count + ".");
        }

        ensureCapacity();

        // Tricky Part: Right Shift
        // Shift elements from right to left starting at the end to make a gap at 'pos'
        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }

        items[pos] = n;
        count++;
    }

    /**
     * Removes an item at index pos. Shifts remaining elements left to close the gap.
     */
    public void remove(int pos) throws NoItemsException, OutOfBoundsException {
        if (isEmpty()) {
            throw new NoItemsException("Cannot remove item: The ArrayManager is completely empty.");
        }

        if (pos < 0 || pos >= count) {
            throw new OutOfBoundsException("Invalid position: " + pos + ". Valid index range is 0 to " + (count - 1) + ".");
        }

        // Tricky Part: Left Shift
        // Shift elements left to overwrite the removed item and close gaps
        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        // Clear trailing duplicate and decrease logical count
        items[count - 1] = 0;
        count--;
    }
}