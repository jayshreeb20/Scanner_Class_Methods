package scannerclass;

import java.util.Scanner;

public class ScannerClass_InputMismatchException {
	
	

	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int age =s.nextInt();
		String name=s.next();
		Byte value=s.nextByte();
		short salary=s.nextShort();
		long number=s.nextLong();
		double pie=s.nextDouble();
		float marks=s.nextFloat();
		boolean b=s.nextBoolean();


	}

}
