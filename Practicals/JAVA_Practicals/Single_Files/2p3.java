import java.io.*;
import java.util.Scanner;
 
class digitsum {
 
  
    static int getSum(int n)
    {
        int sum = 0;
 
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
         System.out.println("Sum of Digits = ");
        return sum;
    }
 
   
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
		System.out.println("a= ");
		int a=sc.nextInt();
 
        System.out.println(getSum(a));
    }
}