import java.lang.*;
import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
		
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a age :");
		age =sc.nextInt();
		if(age<45 && age>15)
		{
			System.out.println("young");
		}
		else if(age>46 && age<100)
		{
			System.out.println("Old");
		}
		else
		{
			System.out.println("Child");
		}
	}
}