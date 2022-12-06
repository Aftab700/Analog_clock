import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s1; 
		int i,s=0,c=0,sch=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string=");
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)== ' '){ s++; }else 
if(s1.charAt(i)>= 'a'&&s1.charAt(i)<='z'||s1.charAt(i)>= 'A'&&s1.charAt(i)<='Z'){ c++; }else	if(s1.charAt(i)>= '0'&&s1.charAt(i)<='9'){ n++; }else{ sch++; }
		}
		System.out.println("number of space in string is "+s);
		System.out.println("number of character in string is "+c);
		System.out.println("number of special character in string is "+sch);
		System.out.println("number of digits in string is "+n);
	}
}