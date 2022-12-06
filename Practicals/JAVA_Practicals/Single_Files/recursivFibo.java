import java.util.*;
public class recursivFibo{
public static int a=1,s=0;
   public static void fibo(int n){
    	if (s==0) {
    		System.out.print(" 0, 1");
    	}
       System.out.print(", "+(a+s));
        if(n>3){
        	 a=s+a;  s=a-s;
        	n--;
        	fibo(n);
        }
       
    }
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println(" number of fibonaci=");
		n=sc.nextInt();
		fibo(n);
	}
}
