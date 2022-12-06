
class OutterClass{
		  	int x=5;
		  class InnerClass{
		
			int y=10;
		}
}
public class main{
	public static void main(String[] args) {
	
	
		OutterClass myoutter=new OutterClass();
		OutterClass.InnerClass myinner=myoutter.new InnerClass();  

		
		System.out.println(myoutter.x+myinner.y);
		
		
	}
}
