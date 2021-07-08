//day40 throw keyword

class ThrowDemo {
	
	static void pass(int marks){
		if(marks<33){
			throw new ArithmeticException("fail");
			//System.out.println("Fail");
		}else{
			System.out.println("Pass");
		}
	}

	public static void main(String param[]){
		ThrowDemo td = new ThrowDemo();
		td.pass(30);
		System.out.println("EOP");
	}
}
