

public class methodOverloading{
		int v1,v2,v3;
		
		methodOverloading(int a,int b,int c){
			v1=a;v2=b;v3=c;
			System.out.println("methodOverloading"+a+b+c);
		}
		methodOverloading(int a1){
			v1=a1;
			System.out.println("methodOverloading"+a1);
		}
		public void d(){
		
		}
	public static void main(String args[]) {
		int a,b,c;
		
		a=4; b=2;c=3;
         methodOverloading m1=new methodOverloading(a,b,c);
         methodOverloading m2=new methodOverloading(7);
         m1.d();
         m2.d();


		


	}
}
