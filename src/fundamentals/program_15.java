package fundamentals;

import java.util.Scanner;

/*
 * WAP to find the days before N
 * @author: nitinagrawalup
 * @since: 13Nov,2021
 */
public class program_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0 -->Sunday");
		System.out.println("1 -->Monday");
		System.out.println("2 -->Tuesday");
		System.out.println("3 -->Wednesday");
		System.out.println("4 -->Thrusday");
		System.out.println("5 -->Friday");
		System.out.println("6 -->Saturday");
		
		System.out.print("Enter the dth day (0-7):");
		int d = sc.nextInt();
		System.out.print("Enter the number of Days before dth days is :");
		int n = sc.nextInt();
		
		
		n = n%7;
		int result = d-n;
		if(result>=0) {
			System.out.print(result);
		}else {
			System.out.println(7+result);
		}
		sc.close();

	}

}
