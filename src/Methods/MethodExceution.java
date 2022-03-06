package Methods;

public class MethodExceution {


		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			MethodExceution b=new MethodExceution();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
			}


}
