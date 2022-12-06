
class p67{
     public static Object Lock1=new Object();
     public static Object Lock2=new Object();
     public static Object Lock3=new Object();
	public static void main(String[] args) {
      t1 t1=new t1();
	  t2 t2=new t2();
	  t3 t3=new t3();
      System.out.println(" Deadlock condition ");
	  t1.start();
	  t2.start();
	  t3.start();
	}

private static class t1 extends Thread{
		
	
	public void run(){
	
                
               synchronized (Lock1){
               	System.out.println(Thread.currentThread().getName()+" is holding s1");
               
               try{sleep(200);}catch(Exception e){}
               	System.out.println(Thread.currentThread().getName()+" is waiting for s2");

                synchronized (Lock2){
               	System.out.println(Thread.currentThread().getName()+" is holding s1 and s2 Process complete");
               }
             }
	}
}
private static class t2 extends Thread{
	
	public void run(){
	             

               synchronized (Lock2) {
               	System.out.println(Thread.currentThread().getName()+" is holding s2");
               
               try{sleep(20);}catch(Exception e){}
               	System.out.println(Thread.currentThread().getName()+" is waiting for s3");

                synchronized (Lock3){
               	System.out.println(Thread.currentThread().getName()+" is holding s3 and s2 Process complete");
               }
            }
	}
}
private static class t3 extends Thread{
	
	public void run(){
	             

               synchronized (Lock3) {
               	System.out.println(Thread.currentThread().getName()+" is holding s3");
               
               try{sleep(20);}catch(Exception e){}
               	System.out.println(Thread.currentThread().getName()+" is waiting for s1");

                synchronized (Lock1){
               	System.out.println(Thread.currentThread().getName()+" is holding s1 and s3 Process complete");
               }
            }
	}
}
}