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

	/*
	 * UC-5: validating password
	 */
	public static String validatePassWord(String passWord)
	{
		/*
	         * Rule1: minimum 8 characters
	         * Rule2: minimum 1 upper-case
	         * Rule3: minimum 1 numeric
	         */

		if(Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9!@#$%^&*()_+]{8,}", passWord))
			return "valid";
		else
			return "invalid";
	}

	/*
	 * UC-9: All types of email
	 */
	//adding email to array-list and calling validateEmail method
	public static void addToEmailList(String emailToAdd)
	{
		ArrayList<String> email = new ArrayList<String>();

		email.add(emailToAdd);

		for(int i=0;i<email.size();i++)
		{
			System.out.println(email.get(i)+": "+validateEmail(email.get(i)));
		}
	}

	//main method
	public static void main(String[] args)
	{
		String firstName = "Rahul";
		String lastName = "Shinde";
		long phoneNumber = 918688332960L;
		String passWord = "Anap9P#lesL@d65ef";

		System.out.println("first name: "+validateFirstName(firstName));
		System.out.println("last name: "+validateLastName(lastName));
		System.out.println("phone numbar: "+validatePhoneNumber(Long.toString(phoneNumber)));
		System.out.println("password: "+validatePassWord(passWord));

		//valid email
		addToEmailList("Rahul@gmail.com");
		addToEmailList("Rahul-100@gmail.com");
		addToEmailList("Rahul.100@gmail.com");
		addToEmailList("Rahul-100@Rahul.com");
		addToEmailList("Rahul-100@Rahul.net");
		addToEmailList("Rahul.100@Rahul.com.au");
		addToEmailList("Rahul@1.com");
		addToEmailList("Rahul@gmail.com.com");
		addToEmailList("Rahul+100@yahoo.com");

		//invalid email
		addToEmailList("Rahul@.com.my");
		addToEmailList("Rahul123@gmail.a");
		addToEmailList("Rahul123@.com");
		addToEmailList("Rahul123@.com.com");
		addToEmailList(".Rahul@Rahul.com");
		addToEmailList("Rahul()*@gmail.com");
		addToEmailList("Rahul@%*.com");
		addToEmailList("Rahul..2002@gmail.com");
		addToEmailList("Rahul.@gmail.com");
		addToEmailList("Rahul@Rahul@gmail.com");
		addToEmailList("Rahul@gmail.com.1a");
		addToEmailList("Rahul@gmail.com.aa.au");
	}
}
