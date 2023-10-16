import java.lang.*;
import java.util.Scanner;
public class Cuboid 
{
    public static void main(String[] args) 
    {
        int length,breadth,height;
        int totalArea,volume;
	System.out.println("Enter Length Breadth and Height:");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
	totalArea=2*(length*breadth+length*height+breadth*height);
	volume=length*breadth*height;
       	System.out.println("Total area is "+totalArea);
	System.out.println("Total volume is "+volume);
    }
    
}