import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		int i,m,n,j,k,x=0,r,v;
		Scanner sc=new Scanner(System.in);
		System.out.println("row=");
		m=sc.nextInt();
			System.out.println("column=");
		n=sc.nextInt();
		int a[][]=new int [m][n];
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
				
			}
			
		}
			for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print("   "+a[i][j]);
				
			}
			System.out.println(" ");
		}
		for(r=0;r<3;){ 
		System.out.println(" ");
		System.out.println("enter 1-search 0-exit=");
		v=sc.nextInt();
	if(v==1){	System.out.println("search=");
		k=sc.nextInt();
			for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(a[i][j]==k){    System.out.print("match found " + 
				                                    "a["+i+"]["+j+"]="+ a[i][j] );
				                   x=1;             }
				
			}
			
		}
		if(x!=1){ System.out.println("no match found");  }
	}else if(v==0){ r=5;}else{ 
	System.out.println("invalid input"); }
		}
	}
}