package loops_1;

public class factorial {
	public static void main(String[] args) {
		int i, fact=1;
		int num = 5;
		for(i=1;i<=num;i++)
		{
			fact= fact*i;
		}
		System.out.println("factoriial of "+num +" is :"+fact);
	}

}
