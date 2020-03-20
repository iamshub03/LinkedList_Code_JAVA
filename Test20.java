//create an automated linked list and 
//display it
import java.util.*;
class Node{
	int values;
	Node next;
	Node(int c)
	{
		values=c;
		next=null;
	}
	Node()
	{}
}
class Test20
{
	static Node head,last;
	public static void createList()
	{
		Scanner in= new Scanner(System.in);
		Node t;
		if(head==null)
		{
		int b=in.nextInt();	
		head=new Node(b);
		head.next=null;
		last=head;
		}
		else
		{
			t= new Node();
			t.values=in.nextInt();
			t.next=null;
			last.next=t;
			last=t;
		}
	}
	public static void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.values+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Press 1 for new node, 0 to exit:");
		int d=in.nextInt();
		while(d==1)
		{
		createList();
		System.out.print("Press 1 for new node, 0 to exit:");
		d=in.nextInt();
		}
		display();
	}
}
