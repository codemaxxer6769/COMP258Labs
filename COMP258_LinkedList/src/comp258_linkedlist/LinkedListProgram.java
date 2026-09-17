// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List Data Structures

package comp258_linkedlist;

public class LinkedListProgram extends ConsoleProgram {
    private final LinkedList list = new LinkedList();
    
    @Override
    public int showMenu() {
        System.out.println("\n===== LINKED LIST MENU =====");
        System.out.println("1. Add Before");
        System.out.println("2. Add After");
        System.out.println("3. Print");
        System.out.println("4. Get Current");
        System.out.println("5. Get Item At");
        System.out.println("6. Delete Current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("9. Exit");
        return readInt("Select an option (1-9): ");
    }
    
    @Override
    public void executeAction (int choice) {
        try {
            switch (choice) {
                case 1 -> {
                    int valBefore = readInt("Enter integer to add before current: ");
                    list.addBefore(valBefore);
                    System.out.println("Added " + valBefore + " before current.");
                }
                case 2 -> {
                    int valAfter = readInt("Enter integer to read after current: ");
                    list.addAfter(valAfter);
                    System.out.println("Added " + valAfter + " after current.");
                }
                case 3 -> list.print();
                case 4 -> System.out.println("Current Item: " + list.getCurrent());
                case 5 -> {
                    int idx = readInt("Enter index position: ");
                    System.out.println("Item at index " + idx + ": " + list.getItemAt(idx));
                }
                case 6 -> {
                    list.deleteCurrent();
                    System.out.println("Current item deleted.");
                }
                case 7 -> {
                    boolean moved = list.advance();
                    if (moved) {
                        System.out.println("Advanced to next item. New current: " + list.getCurrent());
                    } else {
                        System.out.println("Could not advance (already at last item or list is empty).");
                    }
                }
                case 8 -> {
                    list.start();
                    System.out.println("Reset current pointer to the start of the list.");
                }
                default -> System.out.println("Invalid selection. Try again.");
            }
        } catch (NoItemsException | OutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        LinkedListProgram program = new LinkedListProgram();
        program.run();
    }
}