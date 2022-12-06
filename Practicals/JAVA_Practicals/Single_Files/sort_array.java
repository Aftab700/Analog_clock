import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i,j,n,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("array limit=");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			System.out.println("a["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.println("sorted array in accending order");
		
		for(i=0;i<n;i++){  x=a[i];
			for(j=i;j<n;j++){
				if(a[j]<x){  x=a[j];  a[j]=a[i];   a[i]=x;}
				
			}
			
		}
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}