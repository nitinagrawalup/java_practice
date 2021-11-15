package fundamentals;

import java.util.Scanner;

/*
 * WAP to find the sum of N natural number
 * @author: nitinagrawalup
 * @since: 13Nov,2021
 */
public class program_14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number (till which you want the sum of N natural number) : ");
		int num= sc.nextInt();
		System.out.println(num*(num+1)/2);
		sc.close();

	}

}
