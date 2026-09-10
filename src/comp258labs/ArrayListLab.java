// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;

import java.util.ArrayList;

/**
 * Demonstrates basic operations on Java's built-in ArrayList<Integer>
 * as required in Part 1 of Lab 1.
 */
public class ArrayListLab {
    
    public static void runDemo() {
        System.out.println("===================================================");
        System.out.println("          PART 1: ArrayList Demonstration          ");
        System.out.println("===================================================");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add initial values: 12, 7, 25, 4, 18
        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);
        
        // 1. Display number of items
        System.out.println("1. Total items in ArrayList: " + numbers.size());
        
        // 2. Loop to display items
        System.out.println("2. Current items (via loop): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 3. Add 30 to the end
        numbers.add(30);
        System.out.println("3. Added 30 to end -> " + numbers);
        
        // 4. Insert 15 at index 2
        numbers.add(2, 15);
        System.out.println("4. Inserted 15 at index 2 -> " + numbers);
        
        // 5. Remove item at index 4
        numbers.remove(4);
        System.out.println("5. Removed item at index 4 -> " + numbers);
        
        // 6. Display item stored at index 3
        System.out.println("6. Item stored at index 3: " + numbers.get(3));
        
        // 7. Change item at index 0 to 100
        numbers.set(0, 100);
        System.out.println("7. Set index 0 to 100 -> " + numbers);
        
        // 8. Display completed ArrayList
        System.out.println("8. Completed ArrayList final state: " + numbers + "\n");
    }
}