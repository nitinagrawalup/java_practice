package fundamentals;
import java.util.Scanner;
/* WAP to swap two number
 	@author: nitinagrawalup
 	@since : 09Nov,2021
 */
public class program_1 {
	public static void swap(int a, int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapping inside 'swap function'");
		System.out.println("a-->"+a+" b-->"+b);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int num1= sc.nextInt();
		System.out.print("Enter the second number :");
		int num2=sc.nextInt();
		
		swap(num1,num2);
		System.out.println("Value outside 'swap function'");
		System.out.println("num1-->"+num1+" num2-->"+num2);
		
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Swapping value inside main function");
		System.out.println("num1-->"+num1+" num2-->"+num2);
		sc.close();
	}

}
