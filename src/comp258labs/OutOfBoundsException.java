// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;

/**
 * Custom exception thrown when an invalid index/position is accessed
 * or targeted for insertion in ArrayManager.
 */
public class OutOfBoundsException extends Exception {
    
    public OutOfBoundsException(String message) {
        super(message);
    }
}
