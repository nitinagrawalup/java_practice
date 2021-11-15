package fundamentals;

import java.util.Scanner;

/*
 * WAP to take the input using scanner
 * @author: nitinagrawalup
 * @since: 13Nov,2021
 */
public class program_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a boolean number :");
		boolean num1 = sc.nextBoolean();
		System.out.print("Enter a byte number :");
		byte num2 = sc.nextByte();
		System.out.print("Enter a short number :");
		short num3 = sc.nextShort();
		System.out.print("Enter a int number :");
		int num4 = sc.nextInt();
		System.out.print("Enter a char number :");
		char num5 = sc.next().charAt(0);
		System.out.print("Enter a long number :");
		long num6 = sc.nextLong();
		System.out.print("Enter a float number :");
		float num7=sc.nextFloat();
		System.out.print("Enter a double number :");
		double num8 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter a string ");
		String str= sc.nextLine();
		
		System.out.println("_________________________________");
		System.out.println("Boolean -->"+num1);
		System.out.println("Byte -->"+num2);
		System.out.println("Short -->"+num3);
		System.out.println("Int -->"+num4);
		System.out.println("Char -->"+num5);
		System.out.println("Long -->"+num6);
		System.out.println("Float -->"+num7);
		System.out.println("Double -->"+num8);
		System.out.println("String -->"+str);
		
		sc.close();

	}

}
