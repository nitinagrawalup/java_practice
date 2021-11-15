package fundamentals;
import java.util.Scanner;
/*
 * WAP to find the nth term of GP
 * @author : nitinagrawalup
 * @since: 15Nov, 2021
 */
public class program_18 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the first number of GP : ");
			int a = sc.nextInt();
			System.out.println("Enter the second number of GP : ");
			int b= sc.nextInt();
			System.out.println("Enter the term which you want to find of GP : ");
			int n = sc.nextInt();
			double r = (double)b/a;
			double result = a*Math.pow(r, n-1);
			System.out.println("a*r^(n-1)  ="+(int)result);
		sc.close();
		
	}

}
