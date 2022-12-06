import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pt;
		System.out.println("enter text = ");
		pt=sc.nextLine();
		int i,n,j,k;
		System.out.println("enter ceaser shift= ");
		j=sc.nextInt();
		n=pt.length();
		char ct[]=new char[n];
		char out[]=new char[n];
	/* encrypt*/
	System.out.println(" encryption ");
		for(i=0;i<n;i++){
		
				ct[i]=pt.charAt(i);
			
			for(k=0;k<j;k++){
				ct[i]++; 
				if(ct[i]=='{'){ ct[i]='a';}
			}
			
		}
		System.out.println(" Cipher text =");
		for(i=0;i<n;i++){
			System.out.print(ct[i]);
		}
		/* decrypt */
		System.out.println("  ");
		System.out.println(" decryption ");
		
			for(i=0;i<n;i++){
		
				out[i]=ct[i];
			
			for(k=0;k<j;k++){
				
					if(out[i]=='a' ){ out[i]='z';}else{ out[i]--; }
				
			}
			
		}
		System.out.println(" plain text =");
		for(i=0;i<n;i++){
			System.out.print(out[i]);
		}
		
	}
}