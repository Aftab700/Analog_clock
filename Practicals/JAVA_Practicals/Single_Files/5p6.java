class p6{
	public static void t() throws Exception{
			try{
				System.out.println("Exception throw");
				throw new Exception("Exception throw");
			}catch(Exception e){
				System.out.println("Exception rethrow");
				throw e;
			}
		}
	public static void main(String[] args) {
		
		try{
			t();
		}catch(Exception e){
				System.out.println("Exception catch ");
		}
	}
}