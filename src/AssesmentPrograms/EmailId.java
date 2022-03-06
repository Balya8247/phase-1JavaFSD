package AssesmentPrograms;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;


	public class EmailId {
		public static boolean isValidEmail(String email){
			
			String regex="^(.+)@(.+)$";
			
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(email);
			return matcher.matches();				
		}

		public static void main(String[] args) {
			
			List<String>emails=new ArrayList<String>();
			
			emails.add("Madhukar@example.com");
			emails.add("rajkumar@example.com");
			emails.add("praveen@example.me.org");
			emails.add("Ramesh.bro@example.com");
			emails.add("Sri.krishexample.com");
			emails.add("NTR@.example.com");
			for(String value:emails){
				
				System.out.println("The email address "+value+"is"+(isValidEmail(value)?"valid":"invalid"));
						
			}
			System.out.println("Enter any email address to check");
			Scanner sc = new Scanner(System.in);
			String input=sc.nextLine();
			System.out.println("The Email Address"+input+"is"+(isValidEmail(input)?"valid":"invalid"));

		}

	}


