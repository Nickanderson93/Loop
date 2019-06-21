package loops_1;

import java.util.Scanner;

public class prime_num 
{
public static void main(String[] args) 
{
	int x,y,z;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	x = s.nextInt();
	y=1;
	z=0;
	
	while (y<=x)
	{
	if((x%y)==0)
	z=z+1;
	y++;
	}
	if (z==2)
	System.out.println(x + " is a prime number");
	else
		System.out.println(x + " is not prime number");
}
}
