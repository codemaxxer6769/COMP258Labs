// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Lab 1 - Index Based Data Structures

package comp258labs;

/**
 * Driver program extending ConsoleFramework to interactively test ArrayManager.
 */
public class ArrayManagerProgram extends ConsoleFramework {
    
    private ArrayManager manager;
    
    @Override
    public void startProgram() {
        System.out.println("===================================================");
        System.out.println("         PART 2: ArrayManager Driver Test          ");
        System.out.println("===================================================");
        
        // Initialize ArrayManager with 9 starting integers
        int[] initialValues = {5, 10, 15, 20, 25, 30, 35, 40, 45};
        manager = new ArrayManager(initialValues);
        
        System.out.println("ArrayManager initialized with 9 starting integers.");
    }
    
    @Override
    public int showMenu() {
        System.out.println("\n------------ MAIN MENU --------------");
        System.out.println("1. Display number of items");
        System.out.println("2. Display all items");
        System.out.println("3. Add an item");
        System.out.println("4. Add an item at a position");
        System.out.println("5. Remove an item");
        System.out.println(QUIT_OPTION + ". Exit");
        
        return readInt("Select an option (0-5): ");
    }
    
    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Number of items: " + manager.size());
                break;
            case 2:
                manager.print();
                break;
            case 3:
                int valToAdd = readInt("Enter integer to add to end: ");
                manager.add(valToAdd);
                System.out.println("Item added successfully");
                break;
            case 4:
                int valToInsert = readInt("Enter integer to insert: ");
                int posToInsert = readInt("Enter index position: ");
                try {
                    manager.addAt(valToInsert, posToInsert);
                    System.out.println("Item inserted successfully at index " + posToInsert + ".");
                } catch (OutOfBoundsException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 5:
                int posToRemove = readInt("Enter index position to remove: ");
                try {
                    manager.remove(posToRemove);
                    System.out.println("Item at index " + posToRemove + " removed successfully.");
                } catch (NoItemsException | OutOfBoundsException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
    
    @Override
    public void endProgram() {
        System.out.println("Exiting ArrayManager Driver. Goodbye!");
    }
}
