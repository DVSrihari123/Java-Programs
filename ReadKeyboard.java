import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum is "+c);
	}
}