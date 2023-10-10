package point1;

import java.util.Scanner;

public class InputDouble {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		boolean exit =false;
		do{
			System.out.println("Enter a double value.");
			if(s.hasNextDouble())
			{
				double d1 =s.nextDouble();
				System.out.println("Enter a double value.");
				if(s.hasNextDouble())
				{
					double d2 = s.nextDouble();
					System.out.println("Average of the two doubles is " + (d1+d2)/2 );
					exit =true;
				}
			}
			else 
			{
			System.out.println("Invalid Input, Terminating Program.");
			exit =true;	
			}
		}while(!exit);
		// TODO Auto-generated method stub
	s.close();
	}

}
