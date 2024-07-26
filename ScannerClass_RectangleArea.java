package scannerclass;

import java.util.Scanner;

public class ScannerClass_RectangleArea {

	static Scanner s1=new Scanner(System.in);

	static void RectangleArea()
	{
		System.out.println("Please Enter length"); 
		int L= s1.nextInt();
		int B= s1.nextInt();
		int Area=L*B;
		System.out.println("Area of Rectangle is :" + Area);
	}
	public static void main(String[] args) 
	{
		RectangleArea();
		
		
	}

}
