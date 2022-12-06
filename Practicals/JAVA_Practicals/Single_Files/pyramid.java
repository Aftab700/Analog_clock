import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("n=");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++){
			
				for(j=0;j<n-i;j++){
						System.out.print(" ");  
				}  
				for(k=i;k>0;k--){
				System.out.print("* ");
		
	}
	System.out.println( " ");
	}
}
}