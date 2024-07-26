package scannerclass;

import java.util.Scanner;

public class ScannerClass_CircumferenceCircle 
{
	static Scanner s1=new Scanner (System.in);
	
	static void Circumference_Of_Circle ()
	{
		System.out.println("Please Enter Radius");
		int r=s1.nextInt();
		double circumference=2*3.14*r;
		System.out.println("Circumference of Circle is-->" + circumference);
	}
	public static void main(String[] args) 
	{
		Circumference_Of_Circle();
	}

}
