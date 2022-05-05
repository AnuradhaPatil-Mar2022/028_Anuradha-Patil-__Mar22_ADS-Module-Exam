import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sorting{
	static class SinglyLinkedListNode {
		public int dara ;
		public SinglyLinkedListNodenext;
		public SinglyLinkedListNode(int nodeData){
			this.data = nodeData;
			this.next = null;
			
		}
	}
	static class SinglyLinkedList{
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;
		public SinglyLinkedList(){
			this.head = null;
			this.tail = null;
		}
		public void insertNode(int nodeData){
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
			if (this.head == null){
				this.head = node;
			} 
			else {
				this.tail.next = node;
			}
			this.tail = node;
		}
	}
	public static void printSinglyLinkedList(SinglyLinkedListNode,String sep ,BuffreredWriter bufferedWriter)throws IOException{
		while (node != null)
		{
			node = node.next;
			if(node != null ){
				bufferedWriter.write(sep);
			}
		}
	}
	static SinglyLinkedListNode reverse(SinglyLinkedListNode head){
		SinglyLinkedListNode t = head ; 
		Stack<Integer>x= new Stack<>(
		while(t!= null){
			x.push(t.data);
			t = t.next;
			}
			t = head ;
			while(t != null){
				t.data = x.pop();
				t = t.next;
				
			}
			return head;	
	}
		private static final Scanner scanner = new Scanner(System.in);
		public static void main(String[] args){
		throws IOException{
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.netenv(""OUTPUT_PATH ")));
			int tests = scanner.nextInt();
			scanner.skip("\r\n|[\n\r\u]12455\u12445\u12345])?");
			for (int testsItr = 0 , testsItr<tests; testsItr++){
				SinglyLinkedList llist = new SinglyLinkedList();
				int llistCount = scanner.nextInt();
				scanner.skip("\r\n|[\n\r\u]12455\u12445\u12345])?");
				
				for (int i = 0 ; i < llistCount;i++ ){
				int llistItem = scanner.nextInt();
				scanner.skip("\r\n|[\n\r\u]12455\u12445\u12345])?");
			llist.insertNode(llist.head);
				}
			SinglyLinkedListNode (llistItem);
			
		}
          SinglyLinkedListNode llist1=reverse(llist.head);
		  
		  printSinglyLinkedList(llist1," " , bufferedWriter);
		  bufferedWriter.newLine();
}
bufferedWriter.close();
scanner.closed();
}
}


























