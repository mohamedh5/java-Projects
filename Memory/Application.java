class Application{
	// for testing StackOverflowError
	//----------------------
	static int count;
	public static void test(){
		count++;
		if(count == 5000000)
			return;
		test();
	}
	// ------------------------
	public static void main(String[] args){
			//---------------
			// test();
			// --------------
			
			// for testing heap alocation with -Xlog:gc*
			Double d = 5555d;
			for(int i=0; i< Integer.MAX_VALUE; i++)
				d = 5555d;
			
			System.out.println("Hello");
	
	
	}
}