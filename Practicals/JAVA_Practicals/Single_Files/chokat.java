import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number=");
		int n= sc.nextInt();
		
		int i,j,k;
		
		for(i=1;i<=n;i++){
		
			for(j=i; j<=n;j++){
					System.out.print(" ");

			}
			for(k=0;k<i;k++){
				
				System.out.print(" ☆");
			}
			System.out.println("  ");

		}   
		
			for(i=n-1;i>0;i--){
		
			for(j=i; j<=n;j++){
					System.out.print(" ");

			}
			for(k=0;k<i;k++){
				
				System.out.print(" ☆");
			}
			System.out.println("  ");

		}
			
				
	}
}