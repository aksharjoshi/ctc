import java.util.Stack;

//import LinkList.Node;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList head = new LinkList();
		LinkList head1;
		int len = 0;
		head.next = new LinkList(1);
		len++;
		head.next.next = new LinkList(2);
		len++;
		head.next.next.next = new LinkList(3);
		len++;
		head.next.next.next.next = new LinkList(2);
		len++;
		head.next.next.next.next.next = new LinkList(1);
		len++;
		
		System.out.println(len);
		boolean pali = checkPalindrome(head.next,len);
		
		if(pali)
			System.out.println("List is palindrome");
		else
			System.out.println("List is not palindrome");
		/*
		list.head1 = new Node(7);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(6);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);
		System.out.print("First List is ");*/
		//list.printList(head1);
	}

	private static boolean checkPalindrome(LinkList head, int len) {
		// TODO Auto-generated method stub
		LinkList slow, fast,node;
		slow = fast = node = head;
		
		while(fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		System.out.println("head: ");
		slow.printList(head);
		
		System.out.println("Slow: ");
		slow.printList(slow);
		
		Stack<Integer> s = new Stack<Integer>();
		boolean yes = true;
		
		while(node != slow){
			s.push(node.data);
			node = node.next;
		}
		
		if(len%2 != 0){
			slow = slow.next;
		}
			
		while(!s.isEmpty()){
			System.out.println(s.peek());
			if(s.pop() != (Integer)slow.data){
				yes = false;
			}
			slow = slow.next;
		}
/*		while(slow.next != null){
			if(slow.data != node.data)
				return false;
			
			node = node.next;
			node = node.next;
		}
		/*System.out.println("fast: ");
		slow.printList(fast);
		*/
		return yes;
	}
}
