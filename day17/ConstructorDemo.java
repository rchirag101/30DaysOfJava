class ConstructorDemo {

	// accessSpecifier className(params){
	// 	//body
	// }

	// constructor overloading - within a class
	static int a,b;
	public ConstructorDemo(){ //default constructor
		a = 10;
		System.out.println(a);
		// System.out.println("ConstructorDemo called");
	}

	// parameterized constructor
	public ConstructorDemo(int x,int y){ //formality 
		a = x;
		b = y;
		System.out.println("Sum of a and b is : "+(a+b));
	}
	public ConstructorDemo(float x,float y){ //formality 
		System.out.println("Sum of x and y is : "+(x+y));
	}
	// special method 
	public static void main(String[] param) {
		ConstructorDemo cdemo = new ConstructorDemo();
		ConstructorDemo cdemo1 = new ConstructorDemo(2.5f,1.2f);
		ConstructorDemo cdemo2 = new ConstructorDemo(2,45); //actual
		// System.out.println(cdemo.a);
	}

	// 1) no return no arg
	// 2) with return no arg
	// 3) with return with arg
	// 4) no return with arg



}  


/*
	1) same name as class name
	2) special type of method
	3) to construct class varibles 
	4) called at time of object creation
*/