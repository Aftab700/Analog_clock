class p62{
	public static void main(String[] args) {
    t t =new t();
    Thread t1=new Thread(t);
    Thread t2=new Thread(t);
    Thread t3=new Thread(t);
     t1.start();
     t2.start();
     t3.start();
     
	}
}

class t implements Runnable{
	public void run(){
      for (int i=1;i<=5 ;i++ ) {
			System.out.println(Thread.currentThread().getName()+" : "+i );
		}
	}
}