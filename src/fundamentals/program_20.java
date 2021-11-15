package fundamentals;
import java.util.Scanner;
/*
 * WAP to find the sum of n terms
 * @author: nitinagrawalup
 * @since: 15Nov, 2021
 */
public class program_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = sc.nextInt();
			
			if(num<0) {
				System.out.print("Error!!!");
				sc.close();
				return;
			}else {
				System.out.println(num*(num+1)/2);
			}
		sc.close();

	}

}
