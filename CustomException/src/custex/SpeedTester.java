package custex;
import static custex.SpeedValidationRules.*;
import java.text.ParseException;
import java.util.Scanner;
public class SpeedTester {

	public static void main(String[] args) 
	{
		try(Scanner s =new Scanner(System.in))
		{
			System.out.println("Please enter the speed.");
			ValidationRule(s.nextInt());
			System.out.println("Tum to bade heavy driver ho!!!");
	
		
		
			System.out.println("Enter the expiry date of your licence");
			ExpiryDateValidation(s.next());
			System.out.println("Licence not expired!");
		}
		catch(SpeedOutOfRangeException e)
		{
			e.printStackTrace();
		}
		catch(LicenceExpiryException e)
		{
			e.printStackTrace();
		}
		catch (ParseException e )
		
		{
			e.printStackTrace();
		}
	}

}
