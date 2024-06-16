


class ListNode {
   int val;
   ListNode next;

   // Constructor to initialize the node with a value
   ListNode(int val) {
       this.val = val;
       this.next = null;
   }

}

class addTwoNumber {
   // Helper function to handle recursion with carry
   private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry) {
       // Base case: if both lists are null and no carry left, return null
       if (l1 == null && l2 == null && carry == 0) {
           return null;
       }

       // Calculate current digit sum and carry over
       int sum = carry;
       if (l1 != null) {
           sum += l1.val;
           l1 = l1.next;
       }
       if (l2 != null) {
           sum += l2.val;
           l2 = l2.next;
       }

       // Create new node with the sum's last digit
       ListNode currentNode = new ListNode(sum % 10);

       // Recursive call for next digits and carry
       currentNode.next = addTwoNumbersRecursive(l1, l2, sum / 10);

       return currentNode;
   }

   // Function to add two numbers represented by linked lists using recursion
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       return addTwoNumbersRecursive(l1, l2, 0);
   }

   public static void main(String[] args) {
       addTwoNumber sol = new addTwoNumber();

       // Creating first linked list
       ListNode l1 = new ListNode(2);
       l1.next = new ListNode(4);
       l1.next.next = new ListNode(3);

       // Creating second linked list
       ListNode l2 = new ListNode(5);
       l2.next = new ListNode(6);
       l2.next.next = new ListNode(4);

       // Adding two linked lists
       ListNode result = sol.addTwoNumbers(l1, l2);

       // Printing the result
       while (result != null) {
           System.out.print(result.val + " ");
           result = result.next;
       }
   }
}

    

