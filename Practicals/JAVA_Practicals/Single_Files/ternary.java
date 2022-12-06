import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("a= ");
		int a=sc.nextInt();
		System.out.println("b= ");
		int b=sc.nextInt();
		int c=(a>b) ? a-b : b-a ;
		System.out.println("sub="+c);
	}
}