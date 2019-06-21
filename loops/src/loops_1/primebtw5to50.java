package loops_1;

public class primebtw5to50          // Prime number between 5 to 50
{
public static void main(String[] args)
{

	int i = 5;
	while (i<=50)
	{
		int y=0;
		int a= i/2;
		for (int j =2; i <=a; j++)
		{
			if (i%j ==0)
			{
				y =y+1;
				break;
			}
		}
		
		if (y==0)
		{
			System.out.println(i);
		}
		i++;
	}
}
}
