package loops_1;

import java.util.Scanner;

public class Table_print 
{

	public static void main(String[] args)
	{
		
		 Scanner in = new Scanner(System.in);
		  System.out.println("Table : ");
		  int n = in .nextInt();
		  for (int i = 1; i <= 10; i++) {
		 //  System.out.println(n + "*" + i + " = " + (n * i));
			  System.out.println(+n*i);
	}
	
}
}
//so we do have multiple options to create these type of table progamre