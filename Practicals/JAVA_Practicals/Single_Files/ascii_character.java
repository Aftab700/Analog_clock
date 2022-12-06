import java.util.*;

public class Main {
	public static void main(String[] args) {
		String ch;   int i,j,c=0,s=0,n=0,schar=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char=");
		ch=sc.nextLine();
	      for(i=0;i<ch.length();i++){	j=ch.charAt(i);
	System.out.println("ASCII value of '"+ch.charAt(i)+"' is "+j);}
		for(i=0;i<ch.length();i++){
			if(Character.isDigit(ch.charAt(i))){ n++;  }
			if(Character.isAlphabetic(ch.charAt(i))){ c++;  }
			if(Character.isSpace(ch.charAt(i))){ s++;  }
			schar=ch.length()-n-c-s;
		}
		
		System.out.println("total number is "+n);
		System.out.println("total space is "+s);
		System.out.println("total special char is "+schar);
		System.out.println("total character is "+c);
	}
}