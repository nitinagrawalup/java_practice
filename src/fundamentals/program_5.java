package fundamentals;
import java.util.Scanner;
/*
 * WAP to find the sum of n natural number
 * @author: nitinagrawalup
 * @since: 9Nov,2021
 */
public class program_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter the nth term till which you want the sum of n natural number ");
			int n = sc.nextInt();
			int result=0;
			for(int i=1;i<=n;i++) {
				result+=i;
			}
			System.out.println("Sum natural number till "+n+"="+result);
		
		sc.close();
		
	}

}
