class p65{
	public static void main(String[] args) {
		table t=new table();
		t1 t1 =new t1(t);
		t2 t2 =new t2(t);
		t3 t3 =new t3(t);
		
	    t1.start();
		t2.start();
		t3.start();
	}
}
class table{
	synchronized void ptable(int n){
		System.out.println("synchronized methode");
		for (int i=1;i<11 ;i++ ) {
			System.out.println(n*i);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}
			
		}
	}
}
class t1 extends Thread{
	table t;
	t1(table t){
		this.t=t;
	}
	public void run(){
		t.ptable(1);
	}
}
class t2 extends Thread{
	table t;
	t2(table t){
		this.t=t;
	}
	public void run(){
		t.ptable(2);
	}
}
class t3 extends Thread{
	table t;
	t3(table t){
		this.t=t;
	}
	public void run(){
		t.ptable(3);
	}
}