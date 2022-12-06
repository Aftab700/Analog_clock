// anonymous inner class 
class p6
{
	public static void main(String[] args)
	{
		an obj=new an()
		{
			public void getan()
			{
				System.out.println("name="+s);
				System.out.println("age="+n);
				
			}

		};
		  obj.getan();

	}
}
public abstract class an
{   
     int n=22;
     String s="anonymous";
     public abstract void getan();
      
}