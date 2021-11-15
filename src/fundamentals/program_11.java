package fundamentals;
import java.util.Scanner;
/*
 * WAP to perform explicit type conversion
 * @author : nitinagrawalup
 * @since : 13Nov, 2021
 */
public class program_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		float b;
		double c;
		long l;
		byte d;
		
		System.out.println("Enter a integer number :");
		a = sc.nextInt();
		System.out.println("Enter a float number :");
		b = sc.nextFloat();
		System.out.println("Enter a double number :");
		c = sc.nextDouble();
		System.out.println("Enter a long number :");
		l = sc.nextLong();
		System.out.println("Enter a byte number :");
		d = sc.nextByte();
		
		double p,q,r,m;
		p = c/b;
		q=(double)b/a; //more precise than q= (double)(b/a)
		r=c/a;
		m=r+l;
		int s = (int)(a/d);
		
		System.out.println("p -->"+p);
		System.out.println("q -->"+q);
		System.out.println("r -->"+r);
		System.out.println("m -->"+m);
		System.out.println("s -->"+s);
		
		sc.close();
	}

}
