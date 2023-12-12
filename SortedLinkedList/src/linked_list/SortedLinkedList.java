package linked_list;

import java.util.List;




public class SortedLinkedList {
private static class Node
{
	private Node next;
	private int data;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
private Node head;

public SortedLinkedList()
{
	this.head = null;
}

public void  add(int dataToAdd)
{
	Node newNode = new Node(dataToAdd);
	
	if(head==null)
	{
		head = newNode;		
		System.out.println(newNode.data + " has been added at head.");
	}
	else if(head.data > dataToAdd)
	{
	newNode.next = head;
	head = newNode;
	
	}
	else
	{
		Node trav = head;
		Node prev = null;
		while(trav!= null)
		{
			if(trav.data<=dataToAdd)
			{
				prev = trav;
				trav = trav.next;	
			}
			else if(trav.data>dataToAdd)
			{
				newNode.next = trav;
				prev.next = newNode;
				break;
			}
			else if(trav.next == null)
			{
				trav.next = newNode;
				break;
			}
			
		}
		
		System.out.println(newNode.data + " has been added.");
	}
}


public void addAll(List<Integer> list)
{
	for(int i = 0; i<list.size(); i++)
	{
		add(list.get(i));
	}
}




public static int remove(SortedLinkedList list, int index) 
{
	int removed = 0;
	
	if (list.head == null)
	{
		System.out.println("No elements in the List. Returning 0.");
		return 0;
	}
	else 
	{
		Node trav = list.head;
		if (index == 0) 
		{
			if (trav.next == null)
			{
				int temp = trav.data;
				list.head = null;
				return temp;
			}
			list.head = trav.next;
			return trav.data;
		} else 
		{
			for (int i = 1; i < index - 1; i++)
				trav = trav.next;
			removed = trav.next.data;
			trav.next = trav.next.next;

		}
		System.out.println(removed +" was removed.");
		return removed;

	}
}

public String toString() 
{
    StringBuilder sb = new StringBuilder();
    Node trav = head;
    
    while (trav != null)
    {
        sb.append(trav.data);
        if (trav.next != null) 
        {
            sb.append(", ");
        }
        trav = trav.next;
    }
    return sb.toString();
}



}
