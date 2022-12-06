class p4{
	public static void main(String[] args) {
		int a,b,c;
		a=55;
		b=0;
         try { c=a/b; }
         catch (ArithmeticException e){
         	System.out.println("ArithmeticException= "+e);
         }

	}
}