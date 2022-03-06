package InnerClasses;

public class InnerClassOne {
	

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClassOne obj=new InnerClassOne();
			InnerClassOne.Inner in=obj.new Inner();  
			in.hello();  
		}
	}




