import java.util.*;

public class Main {
	
public static int karo(int n) {
			int i;
		for(i=0;i<=n;i++){
			System.out.print("  "+i);
		}
		return n;
	}

		public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number=");
		int n= sc.nextInt();
		 karo( n);
		}
}