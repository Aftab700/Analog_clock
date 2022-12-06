

class main{
	public static void main(String[] args) {
		/*inner class to access variable with both*/
	//	Scanner sc=new Scanner(System.in);
        outter out=new outter();
        outter.inner inr=out.new inner();
       
        System.out.println("outter variable a="+inr.o());
         
          
        System.out.println("inner variable b="+inr.d());

	}  
}
public class outter{
   int a=7;
  
	public class inner{
     int b=4;
    public int d(){
     return b; 
      }  public int o() {
      
     return a;
     } 
	}
}
