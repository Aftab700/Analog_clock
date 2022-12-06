class p64{
	public static void main(String[] args) {
		t t1=new t();
		t t2=new t();
		t t3=new t();
         t1.start();
         try{ t1.join();
	      }catch(Exception e){ }
         t2.start();
         t3.start();
	}
}
class t extends Thread{
	public void run(){
		for (int i=1;i<6 ;i++ ) {
			
		System.out.println(Thread.currentThread().getName()+" : "+i);
		try{ sleep(100);
	      }catch(Exception e){ }
		}
    }
}