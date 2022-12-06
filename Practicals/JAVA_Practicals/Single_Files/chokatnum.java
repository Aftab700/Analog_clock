import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number=");
		int n= sc.nextInt();
		
		int i,j,b,k;
		
		for(i=1;i<=n;i++){
		
			for(j=0; j<i;j++){
					System.out.print("  ");

			}
			
				for(b=i;b<=n;b++){
				
				System.out.print(" "+b);
				}
			
			
			System.out.println("  ");

		}   
		
			
				for(i=n;i>0;i--){
		
			for(j=n; j>n-i;j--){
					System.out.print("  ");

			}
			
				for(b=i;b<=n;b++){
				
				System.out.print(" "+b);
				}
			
			
			System.out.println("  ");

		}   
				
	}
}