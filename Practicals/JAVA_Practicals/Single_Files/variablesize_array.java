import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int [4][];
		int []n=new int [4];  int i,j,k;
		System.out.println("columns for row 1=");
		n[0]=sc.nextInt();
		System.out.println("columns for row 2=");
		n[1]=sc.nextInt();
		System.out.println("columns for row 3=");
		n[2]=sc.nextInt();
		System.out.println("columns for row 4=");
		n[3]=sc.nextInt();
		a[0]= new int[n[0]];
			a[1]= new int[n[1]];
				a[2]= new int[n[2]];
					a[3]= new int[n[3]];
		
		System.out.println("enter value for 1 row=");
		for(i=0;i<n[0];i++){
			a[0][i]=sc.nextInt();
		} 
		System.out.println("enter value for 2 row=");
		for(i=0;i<n[1];i++){
			a[1][i]=sc.nextInt();
		}
		System.out.println("enter value for 3 row=");
		for(i=0;i<n[2];i++){
			a[2][i]=sc.nextInt();
		}
		System.out.println("enter value for 4 row=");
		for(i=0;i<n[3];i++){
			a[3][i]=sc.nextInt();
		}
		System.out.println("  ");
		for(j=0;j<4;j++){
	        for(k=0;k<n[j];k++){
	        	System.out.print("  "+a[j][k]);
	        }
		System.out.println("   ");
				}
		
		
		
		
	}
}