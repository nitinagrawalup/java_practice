package fundamentals;

import java.util.Scanner;
/*
 * WAP to find the nth term of the AP
 * @author : nitinagrawalup
 * @since : 15Nov, 2021
 */
public class program_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first term of series :");
		int a = sc.nextInt();
		System.out.println("Enter the difference between each term : ");
		int d = sc.nextInt();
		System.out.println("Enter the nth term of series which you want to find :");
		int n = sc.nextInt();
		
		System.out.println("a+(n-1)*d ="+(a+(n-1)*d));
		sc.close();

	}

}
