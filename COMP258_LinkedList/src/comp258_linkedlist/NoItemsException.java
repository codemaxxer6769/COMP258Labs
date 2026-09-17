// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List Data Structures

package comp258_linkedlist;

// Custom exception thrown when attempting operations on an empty list.
public class NoItemsException extends RuntimeException {
    public NoItemsException(String message) {
        super(message);
    }
}