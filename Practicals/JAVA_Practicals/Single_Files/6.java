import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("a= ");
		int a=sc.nextInt();
		System.out.println("b= ");
		int b=sc.nextInt();
		int c=(a>b) ? a-b : b-a ;
		System.out.println("sub="+c);

 if (false && true && true) {
            System.out.println("This output will not be printed");
        }
        else {
 
            System.out.println("This output got printed actually,  due to AND(&&) Operator short circuit");
        }
  if (true || false || false) {    
            System.out.println(" This output got printed actually,  due to OR(||) Operator short circuit");
        }
        else {
            System.out.println("This output will not be printed");
        }
 


	}
}

