class p62{
	public static void main(String[] args) {
    t t1=new t();
    t t2=new t();
    t t3=new t();
    t1.setName("Thread-A");
    t2.setName("Thread-B");
    t3.setName("Thread-C");
        System.out.println("Thread-A state-"+ t1.getState());
        System.out.println("Thread-B state-"+t2.getState());
        System.out.println("Thread-C state-"+t3.getState());
     t1.start();
     t2.start();
     t3.start();
      t1.stop();
         System.out.println(t1.getName()+" ID "+ t1.getState());
         t1.resume();
        
       try{ t3.wait(); }catch(Exception e){ }
         System.out.println(t1.getName()+" ID "+ t1.getId());
         System.out.println(t2.getName()+" ID "+ t2.getId());
         System.out.println(t3.getName()+" ID "+ t3.getId());
    System.out.println("currentThread is "+Thread.currentThread());
           System.out.println("Thread-A is Alive "+ t1.isAlive());
        
        
           System.out.println("Thread-A state-"+ t1.getState());
      System.out.println("Thread-B state-"+t2.getState());
      System.out.println("Thread-C state-"+t3.getState());
        
      
        
	}
}

class t extends Thread{
    
  
	public void run(){
    System.out.println(Thread.currentThread().getName()+" state "+ getState());
       System.out.println("creating  "+Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName()+" is running");
       System.out.println(Thread.currentThread().getName()+" in sleep");
      try{ sleep(100); }catch(Exception e){ }
        System.out.println(Thread.currentThread().getName()+" state "+ getState());
       System.out.println(Thread.currentThread().getName()+" is wake up");
      System.out.println(Thread.currentThread().getName()+" state "+ getState());
       
      
	}
}