// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: GIT & Console Application Framework

package comp258labs;

import java.util.Random;

/** 
 * Application class extending the ConsoleFramework
 * Manages an array of 20 random integers and provides search/replace features.
 */
public class RandomNumberProgram extends ConsoleFramework {
    
    // Requirement: exactly 20 integer elements stored internally
    private final int[] numbers = new int[20];
    private final Random random = new Random();
    
    // Overriding the startProgram() hook to set up the array
    @Override
    public void startProgram() {
        System.out.println("================================================");
        System.out.println("    Random Number Array Manager (COMP258)       ");
        System.out.println("================================================");
        
        // Populate the array with random numbers from 1 to 10 inclusive
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }
        System.out.println("Array populated with 20 random numbers (1-10).\n");
    }
    
    // Overriding the endProgram() hook to clean up/say goodbye
    @Override
    public void endProgram() {
        System.out.println("\nThank you for using the Array Manager. Program terminated.");
    }
    
    @Override
    public int showMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Print Numbers");
        System.out.println("2. Search");
        System.out.println("3. Find and Replace");
        System.out.println(QUIT_OPTION + ". Quit");
        return readInt("Select an option: ");
    }
    
    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1 -> printNumbers();
            case 2 -> searchNumbers();
            case 3 -> findAndReplace();
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
    
    /** 
     * Helper method to search for a value in the array.
     * @param target the integer value to search for
     * @return Zero-based index of first occurrence, or -1 if not found.
     */
    private int findFirstOccurrence(int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i; // Internal 0-based index
            }
        }
        return -1; // Standard internal indicator for missing value
    }
    
    private void printNumbers() {
        System.out.println("\n--- Current Array Elements ---");
        for (int i = 0; i < numbers.length; i++) {
            // Display positions to user as 1-based (i + 1) while accessing 0-based index
            System.out.printf("Position %2d: %d%n", (i+1), numbers[i]);
        }
    }
    
    private void searchNumbers() {
        int target = readInt("\nEnter a number to search for: ");
        int index = findFirstOccurrence(target);
        
        if (index != -1) {
            // Present 1-based human position
            System.out.printf("%d was first found at position %d.%n", target, (index + 1));
        } else {
            System.out.printf("%d was not found in the array %n", target);
        }
    }
    
    private void findAndReplace() { 
        int target = readInt("\nEnter a value to find: ");
        int index = findFirstOccurrence(target);
        
        if (index != -1) {
            int replacement = readInt("Enter replacement value: ");
            numbers[index] = replacement;
            System.out.printf("%d at position %d was replaced with %d.%n",
                                       target, (index + 1), replacement);
        } else {
            System.out.printf("%d was not found. No replacement made.%n, target");
        }
    }
}
