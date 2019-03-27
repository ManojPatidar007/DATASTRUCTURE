
class ListImpl{
	
	Node head;
	public void add(int data){
		if(head==null){
			head=new Node(data);
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=new Node(data);
		
	}
	public void show(){
		if(head!=null){
		Node node=head;
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
		}
		else{
			System.out.println("list is empty");
		}
		
		
	}
	
}