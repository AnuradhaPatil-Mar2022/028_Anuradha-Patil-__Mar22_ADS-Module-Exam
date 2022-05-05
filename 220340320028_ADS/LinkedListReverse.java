public class LinkedListReverse{

    static LinkedListNode head;
   
	static class LinkedListNode
   {
	   int val;
	   LinkedListNode next;
	   
	   LinkedListNode(int no)
	   {
		   val = no;
		   next = null;
	   }
   }
   {
	   LinkedListNode previous = null;
	   LinkedListNode curr = node;
	   LinkedListNode next = null;
	   
	   while(curr != null)
	   {
		   next = curr.next;
		   curr.next = previous;
		   previous = curr;
		   curr = next;
	   }
	   node = previous;
	   return node;
   }
   }
   public static void main(String[] args)
   {
	   LinkedListReverse obj = new LinkedListReverse();
	   listobj.head = new LinkedListNode(1);
	   listobj.head.next = new LinkedListNode(2);
	   listobj.head.next.next = new LinkedListNode(3);
	  
	  System.out.println("The Linked List Before Reversal : ");
	  listobj.printList(head);
	  head = listobj.reverse(head);
	  System.out.println("\n");
	  System.out.println("The Linked List After Reversal : ");
	  listobj.printList(head);
   }
}

	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		