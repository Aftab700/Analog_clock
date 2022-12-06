import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i,j,k,n,p;
			String x;
			String v;
			StringBuffer s =new StringBuffer(5);
	
			
			for(i=0; i<3; )
			{
				System.out.println(" enter 1-add string ,2-replace , 3- delete 4-insert 0-exit ");
				n=sc.nextInt();
				if(n==1){   
				System.out.println("enter string=");
				x=sc.nextLine();
					x=sc.nextLine();
				s.append(x);
				
				System.out.println(" StingBuffer="+s);
				System.out.println(" StingBuffer capacity="+s.capacity());
				System.out.println(" StingBuffer size="+s.length());
				
				
				      i=1;          
				}
				if(n==4){
					System.out.println("enter position");
					p=sc.nextInt();
					System.out.println("enter value");
					v=sc.nextLine();
					v=sc.nextLine();
					s.insert(p,v);
					
				System.out.println(" StingBuffer="+s);
				     	System.out.println(" StingBuffer capacity="+s.capacity());
				System.out.println(" StingBuffer size="+s.length());
				 i=1;          
				      
				}
				if(n==3){
			System.out.println("enter start position");
					j=sc.nextInt();
			System.out.println("enter end position");
					k=sc.nextInt();
					s.delete(j,k);
					System.out.println(" StingBuffer="+s);
				      	System.out.println(" StingBuffer capacity="+s.capacity());
				System.out.println(" StingBuffer size="+s.length());
				    i=1;  
				}
				if(n==2)
				{  
				System.out.println("enter start position");
					j=sc.nextInt();
			System.out.println("enter end position");
					k=sc.nextInt();
					System.out.println("enter value");
					v=sc.nextLine(); 
					v=sc.nextLine();
					s.replace(j,k,v);
					System.out.println(" StingBuffer="+s);
				  	System.out.println(" StingBuffer capacity="+s.capacity());
				System.out.println(" StingBuffer size="+s.length());
				    i=1;  
				}
				
				if(n==0){  i=4;}
			}
			
	}
}