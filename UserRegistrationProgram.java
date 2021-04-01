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

	/*
	 * UC-2: validating last name
	 */
	public static String validateLastName(String lastName)
	{
		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName))
			return "valid";
		else
			return "invalid";
	}

	/*
	 * UC-3: validating email
	 */
	public static String validateEmail(String email)
	{
		if(Pattern.matches("^[-a-zA-Z0-9+]+(.{1}[-a-zA-Z0-9])*@([a-zA-Z0-9]+)(.[a-zA-Z]+)?.[a-zA-Z]{2,}$", email))
			return "valid";
		else
			return "invalid";
	}

	/*
	 * UC-4: validating predefined mobile number
	 */
	public static String validatePhoneNumber(String phoneNumber)
	{
		if(Pattern.matches("^[91]{2}[0-9]{10}",phoneNumber))
			return "valid";
		else
			return "invalid";
	}

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
		long phoneNumber = 918688332960L;

		System.out.println("first name: "+validateFirstName(firstName));
		System.out.println("last name: "+validateLastName(lastName));
		System.out.println("phone numbar: "+validatePhoneNumber(Long.toString(phoneNumber)));
		System.out.println("Rahul@gmail.com: "+validateEmail("Rahul@gmail.com"));
	}
}
