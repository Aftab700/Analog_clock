class p5{
	public static void main(String[] args) {
		base b=new cat();
		base b1=new dog();
		base b2=new lion();
		base b3=new tiger();
		
         b.draw();
          b1.draw();
           b2.draw();
            b3.draw();
		
	}
}
public abstract class base{
	base(){
     
	}
	public abstract void draw();
}
public class cat extends base{  
	cat(){

	   }
 public void draw(){
 	System.out.println("This is cat class");

      }
}
public class dog extends base{
       dog(){

	        }
  public void draw(){
  	System.out.println("This is dog class"); 
       }
}

public class lion extends base{
lion(){ 
     }
  public void draw(){
  	System.out.println("This is lion class");
  	   }
}

public class tiger extends base{
tiger(){  
       }
      public 	void draw(){
  	  System.out.println("This is tiger class");
  	   }

}
