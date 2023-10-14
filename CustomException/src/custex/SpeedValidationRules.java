package custex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class SpeedValidationRules
{
	public static final int MAX_SPEED;
	public static final int MIN_SPEED;
	public static final SimpleDateFormat sdf;
	
	
	static
	{
		MAX_SPEED = 120;
		MIN_SPEED = 3;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		
	}
	
	public  static void ValidationRule(int speed) throws SpeedOutOfRangeException
	{
		// s = new Scanner(System.in);
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("Marega chutiye!!!");
		if(speed<MIN_SPEED)
			throw new SpeedOutOfRangeException("Tu cycle hi chala le chutiye!!!");
	}

public static void ExpiryDateValidation(String date) throws LicenceExpiryException , ParseException
	{
		Date expiryDate = sdf.parse(date);
	
		Date currDate =new Date();
		
		if(expiryDate.before(currDate))
			throw new LicenceExpiryException("Licence is expired!!!");
		
		
	}

}