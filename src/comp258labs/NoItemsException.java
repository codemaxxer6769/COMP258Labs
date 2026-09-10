// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;
/**
 * Custom exception thrown when attempting to perform removal operations
 * on an empty ArrayManager.
 */
public class NoItemsException extends Exception {
    
    public NoItemsException(String message) {
        super(message);
    }
}