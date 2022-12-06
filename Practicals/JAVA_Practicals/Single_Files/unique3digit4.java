import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d[]=new int[4],i,k,k1=0,i1=0,j1=0,l=0,l1=0,j;
		
		System.out.println("enter d1=");
		d[0]=sc.nextInt();
		System.out.println("enter d2=");
		d[1]=sc.nextInt();
		System.out.println("enter d3=");
		d[2]=sc.nextInt();
		System.out.println("enter d4=");
		d[3]=sc.nextInt();
		for(i=0;i<2;i++){
		 
		 for(j=0;j<2;j++){
		 		j1=k1+1;
		 	for(k=0;k<6;   ){
		 
		 		if(i1>3){  i1=0;}	
		 				
		 
		 		if(j1>3){  j1=0;}	
		 		
		 {
		 System.out.print( d[k1]);
		 
		 }    
		      
		       {
		 	 System.out.print(  d[j1] );
		 	 
		 }   
		 
		      
		   	if(i1==k1){  i1++;}	
		 						if(i1==j1){  i1++;}
		 						 	if(i1>3){  i1=0;}    {
		 	 	 System.out.print( d[i1] );
			
			
		 }
		   
		   if(k%2!=0){ j1++; }
		   i1++;
		 						
		 	if(k==5){ k1++;  l++; }
		    
		 System.out.println(" ");
		 k++;
		}
		 }
	  	}
		System.out.println("total uniqeu number = 24");
		
		
	}
}