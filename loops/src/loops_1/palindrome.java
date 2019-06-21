package loops_1;

public class palindrome {
	
	public static void main(String[] args)
	{
		int num =434;
		int sum =0;
		int r =0;
		int temp = num;
		while (num>0)
		{
			r= num%10;
			sum=(sum*10)+r;
			num = num/10;
			
		}
		if (temp==sum)
		{
			System.out.println("num is palindrome ");
		}
		else
			 System.out.println("num is not palindrome ");
	}
	

}
