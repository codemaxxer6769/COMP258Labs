/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Instructor tutorial (Gavin), 2nd Sep 2026
package comp258labs;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public abstract class ConsoleFramework {
    
    // Scanner instance used across subclasses for user input
    public Scanner input = new Scanner(System.in);
    
    // Constant used everywhere in the framework for program termination
    public final int QUIT_OPTION = 0;
    
    /** 
     * Template method controlling the core program loop.
     * Marked final so subclasses cannot disrupt the life cycle execution.
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
        
    // Abstract methods that MUST be implemented by any concrete subclass
    public abstract int showMenu();
    public abstract void executeAction(int choice);
    
    // Lifecycle hooks providing default behavior: can be overridden if needed
    public void startProgram() {
        System.out.println("Program starting...");
    }
    
    public void endProgram() {
        System.out.println("Program ended.");
    }
    
    public int getQuitOption() {
        return QUIT_OPTION;
    }
    
    // Framework utility method for robust integer reading and validation
    protected int readInt(String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            input.nextLine(); // Clear invalid input buffer
            System.out.println(prompt);
        }
        int value = input.nextInt();
        input.nextLine(); // Clear leftover newline
        return value;
    }
        
    // Framework utility method for reading text lines
    protected String readString(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
        }
    }


