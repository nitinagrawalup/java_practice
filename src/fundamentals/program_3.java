package fundamentals;
import java.util.Scanner;
/*
 * WAP to find the nth term of AP
 * @author: nitinagrawalup
 * @since: 9Nov,2021
 */
public class program_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the first number of A.P. :");
			int a= sc.nextInt();
			System.out.print("Enter the difference between each term of A.P series :");
			int d =sc.nextInt();
			System.out.print("Enter the nth term whose value you want to find in A.P. :");
			int n=sc.nextInt();
			int result= a+(n-1)*d;
			System.out.println("a+(n-1)*d ="+a+"+"+"("+(n-1)+")"+"*"+d+"-->"+result);
		sc.close();

	}

}
