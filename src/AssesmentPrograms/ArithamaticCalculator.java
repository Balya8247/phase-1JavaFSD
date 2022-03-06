package AssesmentPrograms;

	import java.util.Scanner;

	public class ArithamaticCalculator {
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose a number 1 for substration 2 for addition3 for multiplication and 4 for division");
			int value=sc.nextInt();
			
			if(value==1){
				System.out.println("Enter a Number");
			
			int m=sc.nextInt();
			System.out.println("Enter another number");
			int n=sc.nextInt();
			System.out.println("Answer is"+sub(m,n));
					
		}
		
		else if(value==2){
			System.out.println("Enter a number");
			
			int m=sc.nextInt();
			System.out.println("Enter another number");
			int n=sc.nextInt();
			System.out.println("Answer is"+add(m,n));
		}
		else if(value==3){
			System.out.println("Enter a Number");
			int m=sc.nextInt();
			System.out.println("Enter the Another number");
			int n=sc.nextInt();
			System.out.println("Answer is"+mul(m,n));
			
		}
		else if(value==4){
			System.out.println("Enter a Number");
			
			int m=sc.nextInt();
			System.out.println("Enter a another Number");
			int n=sc.nextInt();
			System.out.println("Answer is"+div(m,n));
			
		}
		else{
			System.out.println("choose 1 or 2 or 3");
		}

		}


	public static int sub(int m,int n){
		int a;
		a=m-n;
		return a;
		
		
	}
	public static int add(int m,int n){
		
		int a;
		a=m+n;
		return a;
	}
	public static int mul(int m,int n){
		int a;
		a=m*n;
		return a;
	}
	public static int div(int m,int n){
		
		int a;
		a=m/n;
		return a;
	}
		
	}
		

		


