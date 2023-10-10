package hotel;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args)
	{	Scanner s = new Scanner (System.in);
		boolean exit = false;
		int bill=0;
		do {
			System.out.println("welcome to the Dosa Palace\nPlease select your choice!\n"
					+ "1.\t Plain Dosa\t\tRs. 100\n"
					+ "2.\t Masala Dosa\t\tRs. 120\n"
					+ "3.\t Cheese Dosa\t\tRs. 140\n"
					+ "4.\t Paper Dosa\t\tRs. 140\n"
					+ "5.\t Cut Dosa\t\tRs. 160\n"
					+ "6.\t Billing");
			
			int choice = s.nextInt();
			while(choice>6)
			{
			System.out.println("Please enter a valid input.");
			System.out.println(
					 "1.\t Plain Dosa\t\tRs. 100\n"
					+ "2.\t Masala Dosa\t\tRs. 120\n"
					+ "3.\t Cheese Dosa\t\tRs. 140\n"
					+ "4.\t Paper Dosa\t\tRs. 140\n"
					+ "5.\t Cut Dosa\t\tRs. 160\n"
					+ "6.\t Billing");
			choice = s.nextInt();
			}
			switch(choice)
			{
			case 1:
				System.out.println("Awesome choice! Here is your Plain Dosa. ");
				bill+= 100;
				break;
			case 2:
				System.out.println("Excellent choice! Here is your Masala Dosa. ");
				bill+= 120;
				break;
			case 3:
				System.out.println("Sure! Here is your Cheese Dosa. ");
				bill+= 140;
				break;
			case 4:
				System.out.println("Definitely! Here is your Paper Dosa. ");
				bill+= 140;
				break;
			case 5:
				System.out.println("Perfect! Here is your Plain Dosa. ");
				bill+= 160;
				break;
			case 6:
				System.out.println("Sure! Your bill is " +bill + " only. Hope you had a great time with us.");
				exit = true;
				
				break;
			}
		}while(!exit);
		
			
			
		s.close();
	}

}
