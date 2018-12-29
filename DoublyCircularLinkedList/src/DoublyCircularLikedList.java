
public class DoublyCircularLikedList {
	Node head;
	class Node
	{
		int data;
		Node prev,next;
		Node(int d)
		{
			data=d;
			prev=next=null;
		}
	}
	public static void main(String ar[])
	{
		DoublyCircularLikedList dc=new DoublyCircularLikedList();
		dc.insert(10);
		dc.insert(20);
		dc.insert(30);
		dc.insert(40);
		dc.insert(50);
		dc.insertAtLast(60);
		dc.insertAtFirst(5);
		dc.print();
		
	}
	public void insertAtFirst(int data)
	{
		Node newnode=new Node(data);
		newnode.next=head.prev.next;
		newnode.prev=head.prev;
		head.prev=head.prev.next=newnode;
		head=newnode;
	}
	public void insertAtLast(int data)
	{
		Node newnode=new Node(data);
		newnode.next=head;
		newnode.prev=head.prev;
		head.prev.next=head.prev=newnode;
	}
	public void delete(int data)
	{
		Node tnode=head;
		Node prev=null;
		while((tnode!=null)&&(tnode.data!=data))
		{
			prev=tnode;
			tnode=tnode.next;
		}
		if(tnode.data==data)
		{
			prev.next=tnode.next;
			tnode.next.prev=prev;
		}
	}
	
	public void print()
	{
		Node tnode=head;
		do
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}while(tnode!=head);
		System.out.println();
		Node last=tnode;
		tnode=tnode.prev;
		do
		{
			System.out.println(tnode.data);
			tnode=tnode.prev;
		}while(tnode!=head.prev);
	}
	public void insert(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.prev=head.next=head;
			return;
		}
		Node newnode=new Node(data);
		Node tnode=head;
		while(tnode.next!=head)
		{
			tnode=tnode.next;
		}
		head.prev=newnode;
		newnode.next=head;
		tnode.next=newnode;
		newnode.prev=tnode;
	}
}
