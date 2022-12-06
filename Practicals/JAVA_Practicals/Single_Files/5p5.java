class p5{
	public static void main(String[] args) {
		int []a=new int[2];
		a[0]=1;
		a[1]=2;
	  try{
	  	try{
	  		a[3]=4;
	  	}catch(ArrayIndexOutOfBoundsException e2){
	  		System.out.println(e2);
	  	}
	  	a[2]=3/0;
	  	a[1]=1/0; 
	       }
	  	catch(ArithmeticException e){ 
          System.out.println(e);
	  	}
	  	catch(Exception e){
	  	System.out.println(e);
	  }

	  
	}
}