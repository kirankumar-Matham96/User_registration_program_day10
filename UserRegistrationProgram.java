import java.util.ArrayList;
import java.util.regex.Pattern;


public class UserRegistrationProgram
{
	/*
	 * UC-1: validating first name
	 */
	public static String validateFirstName(String firstName)
	{
		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName))
			return "valid";
		else
			return "invalid";
	}

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		System.out.println("first name: "+validateFirstName(firstName));
	}
}
