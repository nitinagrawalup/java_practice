package fundamentals;

import java.util.Scanner;
/*
 * WAP to find the last digit of a number
 * @author: nitinagrawalup
 * @since : 15Nov, 2021
 */
public class program_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num= sc.nextInt();
		int absoulte =Math.abs(num);
		int ans= absoulte%10;
		System.out.println("Last digit of "+num+"is :"+ans);
		sc.close();

	}

}
