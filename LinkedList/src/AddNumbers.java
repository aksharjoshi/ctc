import java.util.Stack;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node num11 = new Node(7);
		
		Node num12 = new Node(1);
		num11.next = num12;
		
		Node num13 = new Node(6);
		num12.next = num13;
		num13.next = null;
		
		Node num21 = new Node(5);
		
		Node num22 = new Node(9);
		num21.next = num22;

		Node num23 = new Node(2);
		num22.next = num23;
		num23.next = null;
		
		Node node = num11;
		
		Stack<Integer> s = new Stack<Integer>();
		
		while(node != null){
			s.add(node.data);
			System.out.println("pushed data: "+node.data);
			node = node.next;
		}
		StringBuilder t1=new StringBuilder();
		
		System.out.println(s.size());
		
		node = num11;
		while(node!=null){
			System.out.println("Node = " + node.data);
			node = node.next;
		}
		
		node = num11;
		
		while(!s.isEmpty()){
			//System.out.println("pop is: "+ s.pop());
			t1.append(s.pop().toString());
		}
		
		node = num21;
		while(node != null){
			s.add(node.data);
			System.out.println("pushed data: "+node.data);
			node = node.next;
		}
		
		StringBuilder t2 = new StringBuilder();
		while(!s.isEmpty()){
			t2.append(s.pop());
		}
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		
		int add = Integer.parseInt(t1.toString()) + Integer.parseInt(t2.toString());
		System.out.println(add);
		
		String res=add+"";
		
		Node[] re = new Node[res.length()];
		System.out.println(res.length());
		for(int i=res.length()-1; i>=0; i--){
			re[i].data = res.charAt(i);
		}
		
		for(int i=0; i<res.length()-1; i++){
			re[i].next = re[i+1];
		}
		
		System.out.println(re);
		
	}

}


class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}
