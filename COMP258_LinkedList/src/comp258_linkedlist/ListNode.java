// Name: Jiahui Liu (Johnny)
// Course: COMP-258, Data Structures and Frameworks
// Program: Business Information Systems
// Lab: Linked List Data Structures

package comp258_linkedlist;

public class ListNode {
        private Object data;
        public ListNode nextNode;

        public ListNode(Object item) {
            this.data = item;
            this.nextNode = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
}
