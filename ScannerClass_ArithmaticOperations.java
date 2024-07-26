package scannerclass;


import java.util.Scanner;

public class ScannerClass_ArithmaticOperations

{
	 static Scanner s1=new Scanner(System.in);
	 
	 static void add()
	 {
		System.out.println("Addition Please Enter Value of a"); 
		int a= s1.nextInt();
		System.out.println("Please Enter Value of b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("The sum of a and b is-->"+sum);
	 }
	 
	 static void sub()
	 {
		System.out.println("Subtraction Enter Value of a"); 
		int a= s1.nextInt();
		System.out.println("Please Enter Value of b");
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("The subtraction of a and b is-->"+sub);
	 }
	 
	 static void mul()
	 {
		System.out.println("Multiplication Please Enter Value of a"); 
		int a= s1.nextInt();
		System.out.println("Please Enter Value of b");
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("The product of a and b is-->"+mul);
	 }
	 
	 static void division()
	 {
		System.out.println("Division Please Enter Value of a"); 
		int a= s1.nextInt();
		System.out.println("Please Enter Value of b");
		int b=s1.nextInt();
		int div=a/b;
		System.out.println("The div of a and b is-->"+ div);
	 }
	 
	 static void modulus()
	 {
		System.out.println("Modulus Please Enter Value of a"); 
		int a= s1.nextInt();
		System.out.println("Please Enter Value of b");
		int b=s1.nextInt();
		int mod=a%b;
		System.out.println("The mod of a and b is-->"+ mod);
	 }

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		division();
		modulus();
	}

}
