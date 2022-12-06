//  multilevel inheritance and heirarchical inheritance
import java.util.*;
class main{
	public static void main(String[] args) {
		String n1,n2;
		Scanner sc=new Scanner(System.in);
      son s=new son();
      daughter d=new daughter();

      System.out.println("This is son : Enter name = ");
        n1=sc.nextLine();
      System.out.println("This is Daughter : Enter name = ");
        n2=sc.nextLine();
         son s1=new son(n1);
      daughter d1=new daughter(n2);
        
	}
}
public class gfather{
	public void gf(){
		System.out.println("This is Grand Father class");
	}
	
}
public class father extends gfather{
	public void f(){
		System.out.println("This is Father class extends grand father");
	}
}
 public class son extends father{
	
	 
	son(){
		 gf();
         f(); 
		System.out.println("This is son class extends father");
	}
	son(String name){
		  
		System.out.println("This is son : My name is "+name);
		
	}
	
}
public class daughter extends father{
	
	daughter(){
		System.out.println("This is Daughter class extends father");
	}
	daughter(String name){
		
		 
		System.out.println("This is Daughter : My name is "+name);
		
			 
	}


}