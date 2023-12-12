
package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linked_list.SortedLinkedList;


public class Tester {

	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);

		
		SortedLinkedList sList =new SortedLinkedList();
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(43);
		list.add(75);
		list.add(23);
		list.add(42);
		
		
		
		boolean exit =false ;
		
		while(!exit)
		{
			
				System.out.println("Please select the correct option\n"
						+ "1. for adding a new element.\n"
						+ "2. for addiing a given list such that all the elements are added.\n"
						+ "3. for removing an element from index(First index will be 0 second will 1 and so on..\n"
						+ "4. for printing the list\n"
						+ "5 to exit.");
			
			switch (sc.nextInt())
			{
			case 1:
				System.out.println("Enter the element you want to add.");
				sList.add(sc.nextInt());
				break;
			case 2:
				sList.addAll(list);
				break;
			case 3:
				System.out.println("We have added the list. you can add the index number you want to remove.");
				SortedLinkedList.remove(sList, sc.nextInt());
				break;
			case 4:
				System.out.println("Here is the LinkedList :");
				System.out.println(sList.toString());
				
			default:
				break;
			}

		}
		sc.close();
	}
}


