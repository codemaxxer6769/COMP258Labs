// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: GIT & Console Application Framework

package comp258labs;


/**
 * Abstract ConsoleProgram framework implementing the Template Method Pattern
 * Controls the primary execution life cycle while delegating menu presentation
 * and action execution to concrete subclasses.
 */
public class COMP258Labs {
    public static void main(String[] args) {
        System.out.println("Welcome to COMP 258");
        System.out.println("Lab 1: Array-based data structures\n");
        
        ConsoleFramework program = new RandomNumberProgram();
        program.run();
    }
}