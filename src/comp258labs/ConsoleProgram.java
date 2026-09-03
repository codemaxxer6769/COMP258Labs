// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: GIT & Console Application Framework

package comp258labs;

import java.util.Scanner;

/**
 * Abstract ConsoleProgram framework implementing the Template Method Pattern
 * Controls the primary execution life cycle while delegating menu presentation
 * and action execution to concrete subclasses.
 */

// Concrete classes in Java: extend an abstract class or implement an interface, and can be instantiated
// (create objects directly from them).
public abstract class ConsoleProgram {
    
    // Scanner instance for reading console inputs
    protected Scanner input = new Scanner(System.in);
    
    // Constant used universally across the framework for program termination
    protected static final int QUIT_OPTION = 0;
    
    /**
      * Template method defining the core application execution flow.
      * Marked final so subclasses cannot override the execution structure
      */
    public final void run() {
        startProgram();
        int choice;
        do {
            choice = showMenu();
            if (choice != QUIT_OPTION) {
                executeAction(choice);
            }
        } while (choice != QUIT_OPTION);
        endProgram();
        }
    
        // Abstract methods required to be implemented by any concrete subclass
        public abstract int showMenu();
        public abstract void executeAction(int choice);
        
        // Hook methods providing default behavior; can be optionally overridden
        public void startProgram() {
            System.out.println("Program starting...");
        }
        
        public void endProgram() {
            System.out.println("Program ended.");
        }
        
        public int getQuitOption() {
            return QUIT_OPTION;
        }
        
        // Utility methods provided by the framework for robust console input handling
        protected int readInt(String prompt) {
            System.out.println(prompt);
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid whole number..");
                input.nextLine(); // Clear invalid input
                System.out.println(prompt);
            }
            int value = input.nextInt();
            input.nextLine(); // Consume newline character
            return value;
        }
        
        protected String readString(String prompt) {
            System.out.println(prompt);
            return input.nextLine();
        }
    }
