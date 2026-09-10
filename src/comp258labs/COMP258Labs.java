// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;

/**
 * Main entry point for COMP 258.
 * Executes Lab 1 (ArrayList demo and ArrayManager driver).
 */
public class COMP258Labs {

    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("             Welcome to COMP 258 Labs              ");
        System.out.println("===================================================");
        
        // --- PREVIOUS ASSIGNMENT (Preserved in repository) ---
        // ConsoleFramework frameworkDemo = new RandomNumberProgram();
        // frameworkDemo.run();

        // --- LAB 1: INDEX-BASED DATA STRUCTURES ---
        
        // Part 1: ArrayList Demonstration
        ArrayListLab.runDemo();
        
        // Part 2: Custom ArrayManager Driver
        ConsoleFramework lab1Driver = new ArrayManagerProgram();
        lab1Driver.run();
    }
}