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
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		int k=0;
		for(int c=0;c<n;c++){
		if(a[n-1-c]!=s1.charAt(c)){   k++; };
		}
		System.out.println(" ");
		if(k==0){ System.out.println(" string is Palindrom"); } else{  System.out.println(" string is not Palindrom"); }
	}
}