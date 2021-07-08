class ExceptionPropagationDemo{
	
	void a(){
		int a = 12/0;
	}
	
	void b(){
		a();
	}
	
	void c(){
		try{
			b();
		}catch(ArithmeticException ae){
			System.out.println("cannot divide by 0");
		}	
	}

	public static void main(String param[]){
		ExceptionPropagationDemo epd = new ExceptionPropagationDemo();
		epd.c();
	}
}