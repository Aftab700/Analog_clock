
class p61{
	public static void main(String[] args) {
		t1 t1=new t1();
		t2 t2=new t2();
        Thread t=new Thread(t2);
        t1.start();
        t.start();
	}
}
class t1 extends Thread{
	public void run(){
       System.out.println("Thread created by extending Thread class");
	}
}
class t2 implements Runnable{
	public void run(){
       System.out.println("Thread created by implimenting Runnable interface");
	}
}