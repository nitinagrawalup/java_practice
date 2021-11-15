package fundamentals;

import java.util.Scanner;
/*
 * WAP to check the number is even or odd
 * @author: nitinagrawalup
 * @since : 15Nov, 2021
 */
public class program_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
		sc.close();

	}

}
