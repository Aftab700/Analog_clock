import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i,j,d,k,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter decimal number =");
		d=sc.nextInt();
		
		b=0;

		
		
		for(i=1;d>=1;i=i*10){
			 
			 j=d%2;
			 d=d/2;
			 b=b+(i*j);
			
			
			
		}
		
		System.out.println("Binary="+b);
		
		
		
		
		
		
		
	}
}