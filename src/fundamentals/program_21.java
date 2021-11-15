package fundamentals;
import java.util.Scanner;
/*
 * WAP to check the number is even(+ve or -ve) or odd(+ve or -ve)
 * @author : nitinagrawalup
 * @since : 15Nov,2021
 */
public class program_21 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
			System.out.println("Enter a number : ");
			int num = sc.nextInt();
			
			if(num<0) {
				if(num%2==0) {
					System.out.println("Number is even");
				}else {
					System.out.println("Number is odd");
				}
			}else if(num>0) {
				if(num%2==0) {
					System.out.println("Number is even ");
					
				}else {
					System.out.println("Number is odd ");
				}
				
			}else{
				System.out.println("Number is zero");
			}
		
		sc.close();

	}

}
