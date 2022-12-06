
public class q implements p12{
	public void d1(){
			System.out.println("p1:interface p1 contains i="+i);
		}
    public void d2(){
			System.out.println("p2:interface p2 contains j="+j);
		}
	public static void main(String[] args) {
		q p=new q();
		
         p.d1();
         p.d2();
	}
}
public interface p1{
	int i=100;
	   void d1();
}
public interface p2{
	int j=200;
	   void d2();
}
public interface p12 extends p1,p2{
   
}