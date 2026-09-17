// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List Data Structures

package comp258_linkedlist;

public class LinkedList {
    private ListNode items; // Head node reference
    private ListNode current; // Current position reference
    
    public LinkedList() {
        this.items = null;
        this.current = null;
    }
    
    // Reset current pointer to the start of the list
    public void start() {
        this.current = this.items;
    }
    
    // Return the current node's data
    public Object getCurrent() {
        if (this.current == null) {
            throw new NoItemsException("Cannot get current: List is empty or current is null.");
        }
        return this.current.getData();
    }
    
    // Advance current pointer to the next node
    public boolean advance() {
        if (this.current == null || this.current.nextNode == null) {
            return false;
        }
        this.current = this.current.nextNode;
        return true;
    }
    
    // Add item after current node
    public void addAfter(Object item) {
        ListNode newNode = new ListNode(item);
        if (this.items == null) {
            this.items = newNode;
            this.current = newNode;
        } else {
            if (this.current == null) {
                this.current = this.items;
            }
            newNode.nextNode = this.current.nextNode;
            this.current.nextNode = newNode;
            this.current = newNode;
        }
    }
    
    // Add item before current node
    public void addBefore(Object item) {
        ListNode newNode = new ListNode(item);
        if (this.items == null) {
            this.items = newNode;
            this.current = newNode;
        } else if (this.current == this.items || this.current == null) {
            newNode.nextNode = this.items;
            this.items = newNode;
            this.current = newNode;
        } else {
            ListNode temp = this.items;
            while (temp != null && temp.nextNode != this.current) {
                temp = temp.nextNode;
            }
            if (temp != null) {
                newNode.nextNode = this.current;
                temp.nextNode = newNode;
                this.current = newNode;
            }
        }
    }
    
    // Delete current node and set current to next
    public void deleteCurrent() {
        if (this.items == null || this.current == null) {
            throw new NoItemsException("Cannot delete: List is empty or current item is null.");
        }
        
        if (this.current == this.items) {
            this.items = this.items.nextNode;
            this.current = this.items;
        } else {
            ListNode temp = this.items;
            while (temp != null && temp.nextNode != this.current) {
                temp = temp.nextNode;
            }
            if (temp != null) {
                temp.nextNode = this.current.nextNode;
                this.current = temp.nextNode;
            }
        }
    }
    
    // Retrieve item at specific index
    public Object getItemAt(int index) {
        if (index < 0 || this.items == null) {
            throw new OutOfBoundsException("Invalid index or list is empty: " + index);
        }
        ListNode temp = this.items;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.getData();
            }
            count++;
            temp = temp.nextNode;
        }
        throw new OutOfBoundsException("Index out of bounds: " + index);
    }
    
    // Print all mode items sequentially
    public void print() {
        if (this.items == null) {
            System.out.println("[List is empty]");
            return;
        }
        ListNode temp = this.items;
        System.out.println("List elements: ");
        while (temp != null) {
            if (temp == this.current) {
                System.out.println("[" + temp.getData() + "] ");
            } else {
                System.out.print(temp.getData() + " ");
            }
            temp = temp.nextNode;
        }
        System.out.println();
    }
}