package InnerClasses;

public class InnerClassTwo {
	

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			InnerClassTwo ob=new InnerClassTwo ();  
			ob.display();  
			}
		}


