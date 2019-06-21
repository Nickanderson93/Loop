package loops_1;

public class swaping {
	public static void main(String[] args) {
		int a=14;
		int b= 76;
		int c;
		System.out.println("before swapping");
		System.out.println("value of a =" +a);
		System.out.println("value of b =" +b);
		
		c=b;
		b=a;
		a=c;
		
		System.out.println("after swapping");
		System.out.println("value of a = " +a);
		System.out.println("value of b =" + b);
	}

}
