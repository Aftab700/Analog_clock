import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1;
		int i=0,n;
		System.out.println("enter string= ");
		s1=sc.nextLine();
		n=s1.length();
		char[]a= new char[n];
		for(i=0;i<n;i++)
		{
			
			a[i]=s1.charAt(i);
			
		}
              System.out.println("Revers string= ");
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		
		
		
	}
}