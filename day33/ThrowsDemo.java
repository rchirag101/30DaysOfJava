class ThrowsDemo{
	void a() throws ArithmeticException{
		throw new ArithmeticException("Exception occured");
	}
	
	void b(){
		a();
	}
	
	void c(){
		try{
			b();
		}catch(Exception ae){
			System.out.println("cannot divide by 0");
		}	
	}

	public static void main(String param[]){
		ExceptionPropagationDemo epd = new ExceptionPropagationDemo();
		epd.c();
	}
	
}
