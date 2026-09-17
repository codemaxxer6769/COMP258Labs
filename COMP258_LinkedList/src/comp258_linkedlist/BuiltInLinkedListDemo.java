// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List Data Structures

package comp258_linkedlist;

import java.util.LinkedList;

public class BuiltInLinkedListDemo {
    public static void main(String[] args) {
        // Initialize with initial elements
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(7);
        list.add(25);
        list.add(4);
        list.add(18);
        
        System.out.println("=== Initial State ===");
        printList(list);
        
        // 1. Display the number of items
        System.out.println("\n1. Number of items: " + list.size());
        
        // 2. Display all items
        System.out.println("\n2. All items in list: ");
        displayAll(list);
        
        // 3. Add item
        list.add(30);
        System.out.println("\n3. Add item (30):");
        printList(list);
        
        // 4. Add item at position
        list.add(2, 15);
        System.out.println("\n4. Add item (15) at position 2:");
        printList(list);
        
        // 5. Remove item at position
        list.remove(4); // Removes index 4 (value 4)
        System.out.println("\n5. Remove item at position 4:");
        printList(list);
        
        // 6. Get item at position
        System.out.println("\n6. Get item at position 3: " + list.get(3));
        
        // 7. Replace item at position
        list.set(0, 99);
        System.out.println("\n7. Replace item at position 0 with 99:");
        printList(list);
        
        // 8. Add to front
        list.addFirst(100);
        System.out.println("\n8. Add 100 to front:");
        printList(list);
        
        // 9. Add to end
        list.addLast(200);
        System.out.println("\n9. Add 200 to end:");
        printList(list);
        
        // 10. Remove first
        list.removeFirst();
        System.out.println("\n10. Remove first item:");
        printList(list);
        
        // 11. Remove last
        list.removeLast();
        System.out.println("\n11. Remove last item:");
        printList(list);
        
        System.out.println("\n=== Final Check===");
        System.out.println("Final List: " + list);
        System.out.println("Final Size: " + list.size());
    }
    
    private static void displayAll(LinkedList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    private static void printList(LinkedList<Integer> list) {
        System.out.println("List contents: " + list + " | Size: " + list.size());
    }
}