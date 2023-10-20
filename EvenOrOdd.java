import java.lang.*;
import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String args[])
	{
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		if(n%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}