package fundamentals;

import java.util.Scanner;

/*
 * WAP to swap two number
 * @author: nitinagrawalup
 * @since: 13Nov,2021
 */
public class program_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter second number : ");
			int num2 = sc.nextInt();
			System.out.println("Before Swap");
			System.out.println("First number :"+num1);
			System.out.println("Second number : "+num2);
			
			int temp=0;
			temp=num1;
			num1=num2;
			num2=temp;
			System.out.println("After Swap");
			System.out.println("First number :"+num1);
			System.out.println("Second number : "+num2);
			
		sc.close();

	}

}
