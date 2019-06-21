package loops_1;

public class fib {
	public static void main(String[] args) {
		int q=0;
		int w=1;
		int e =10;
		System.out.println("Fib series of num");
		for (int i= 1;i<=10;i++)
		{
			System.out.println(q+ "");
			int sum= q+w;
			q = w;
			w=sum;
		}
	}

}
