class LinkList {
	int data;
	LinkList next;
	
	LinkList(int data){
		this.data = data;
		next = null;
	}
	
	LinkList(){
		data = 0;
		next=null;
	}
	
	void printList(LinkList head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}
}
