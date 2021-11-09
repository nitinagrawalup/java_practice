package fundamentals;
import java.util.Scanner;
import java.lang.Math;
/*
 * WAP to find the nth term of GP
 * @author: nitinagrawalup
 * @since:9Nov,2021
 */
public class program_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first term of GP : ");
		int a = sc.nextInt();
		System.out.println("Enter the ratio between terms : ");
		int r=sc.nextInt();
		System.out.print("Enter the nth term whose value you want to find in GP");
		int n= sc.nextInt();
		int result=0;
		result=a*(int)(Math.pow(r,n-1));
		System.out.println(	"a*(r^(n-1))="+a+"*"+"("+r+"^("+(n-1)+") -->"+result);
		sc.close();
	}

}
