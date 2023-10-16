import java.lang.*;
import java.util.Scanner;

class Triangle1
{
	public static void main(String args[])
	{
		int a,b,c;
		float s;
		double Area;
		System.out.println("Enter the sides a,b,c :");
		
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		s =  0.5f*(a+b+c);

		System.out.println("s is "+s);
		
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is "+Area);
	}
}
		
		