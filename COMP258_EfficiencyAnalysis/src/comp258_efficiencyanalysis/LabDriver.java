// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List - Algorithm Efficiency

package comp258_efficiencyanalysis;

public class LabDriver {
    public static void main(String[] args) {
        int[] testData = {1, 3, 4, 5, 3, 4, 3, 4, 1, 2, 5, 6};

        System.out.println("--- TESTING ARRAY MANAGER ---");
        ArrayManager arrayManager = new ArrayManager(testData);
        System.out.print("Before removal: ");
        arrayManager.print();

        arrayManager.removeAllOccurrences(4);
        System.out.print("After removeAllOccurrences(4): ");
        arrayManager.print();

        System.out.println("\n--- TESTING LINKED LIST ---");
        LinkedList linkedList = new LinkedList();
        for (int val : testData) {
            linkedList.add(val);
        }
        System.out.print("Before removal: ");
        linkedList.print();

        linkedList.removeAllOccurrences(4);
        System.out.print("After removeAllOccurrences(4): ");
        linkedList.print();
    }
}