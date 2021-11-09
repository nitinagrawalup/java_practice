package fundamentals;

import java.util.Scanner;

/*
 * WAP to find the last digit of number
 * @author: nitinagrawalup
 * @since:9Nov,2021
 */
public class program_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
			int last_digit=(num%10);
			System.out.println("Last digit of"+num+"="+last_digit);
		sc.close();

	}

}
