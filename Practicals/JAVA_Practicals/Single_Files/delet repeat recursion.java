import java.util.*;

public class Main {
	public static int i=0;
   public static void print(String s){     
  
  if(i-1<s.length()){
 if(s.charAt(i)!=s.charAt(i+1)){  
 System.out.print(s.charAt(i));  i++;  }
  else{  i++;  } }
  if(i+1<s.length()){  print(s); }  
 if(i+1==s.length()){  System.out.print(s.charAt(i));
 i++;
 }
}
	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string=");
		s=sc.nextLine();
		print(s);
		
	}
}