// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258_efficiencyanalysis;
/**
 * Custom exception thrown when attempting to perform removal operations
 * on an empty ArrayManager.
 */
public class NoItemsException extends RuntimeException {
    public NoItemsException(String message) {
        super(message);
    }
}