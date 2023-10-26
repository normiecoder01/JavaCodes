package tester;

import java.util.HashMap;
import java.util.Scanner;
import static  utils.Utils.*;
import com.app.core.PetsToy;
public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit = false;
			while(!exit)
			{
				try
				{
					HashMap <Integer,PetsToy> toysMap = new HashMap<>();
					
					System.out.println("PLease enter 1 to add new toy, 2 to update stock, 3 to Set a discount, 4 to remove a toy");
					int choice= sc.nextInt();
					{
						switch (choice)
						{
						case 1:
							System.out.println("Please enter the toy name.\n");
							String name = sc.nextLine();
							sc.nextLine();
							System.out.println("How many target species do you want?");
							int arraySize = sc.nextInt();
							String[] species = new String[arraySize];
							for (int i = 0; i<species.length;i++)
							{
								System.out.println("Enter species number " + i);
								species[i] = sc.next();
							}
							System.out.println("Please enter the toy brand, material, stock, stock listing date, price.\n");

							sc.nextLine();
							PetsToy Toy = validateToy(name, species,sc.next(), sc.next(),sc.nextInt(), sc.next(), sc.nextInt()  );
							toysMap.put(Toy.getId(), Toy);
							System.out.println("Toy successfully added. Toy id is " + Toy.getId());
							
							break;
						case 2:
							System.out.println("Enter the toy Id of the Toy, Date of update (YYYY-MM-DD) and the updated stock number.");
							updateStock(sc.nextInt(),sc.next(), sc.nextInt(),toysMap);
							System.out.println("Stock updated sucessfully.");
							break;
						case 3:
							addDiscount(toysMap);
							System.out.println("Discout added to all the toys which are 1 years old.");
							
							break;
						case 4:
							removeToys(toysMap);
							System.out.println("All the toys which were not sold for 9 months have been removed.");
							break;
						}
					}
					
			
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
					System.out.println("Please try again");
				}
			}
		}
	}

}
