package fundamentals;

import java.util.Scanner;

/*
 * WAP to print precise format
 * @author : nitinagrawalup
 * @since : 13Nov, 2021
 */
public class program_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first floating point number :");
		float num1 = sc.nextFloat();
		System.out.println("Enter the second floating point number :");
		float num2 = sc.nextFloat();
		System.out.print(num1/num2+" ");
		System.out.format("%.3f", num1/num2);
		sc.close();
		
	}

}
