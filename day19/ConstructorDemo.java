class ConstructorDemo {

	// accessSpecifier className(params){
	// 	//body
	// }

	// constructor overloading - within a class
	static int a,b;
	// public int ConstructorDemo(){
	// 	a = 25;
	// 	System.out.println("a is :"+a);
	// 	return a;
	// }
	ConstructorDemo(){ //default constructor
		// a = 10;
		// System.out.println(a);
		// System.out.println("ConstructorDemo called");
	}

	// parameterized constructor
	ConstructorDemo(int x,int y){ //formality 
		a = x;
		b = y;
		// System.out.println("Sum of a and b is : "+(a+b));
	}

	// day26 copy constructor // method1
	// ConstructorDemo(ConstructorDemo cd){
	// 	a = cd.a;
	// 	b = cd.b;
	// }
	
	ConstructorDemo(float x,float y){ //formality 
		System.out.println("Sum of x and y is : "+(x+y));
	}
	// return types: void, int, char, String, float, double, short, byte, long, boolean
	// int getA(){

	// }
	void showData(){
		System.out.println("a is : "+a+" and b is : "+b);
	}
	// special method 
	public static void main(String[] param) {
		// ConstructorDemo cdemo = new ConstructorDemo(); //implicitly 
		// ConstructorDemo cdemo1 = new ConstructorDemo(2.5f,1.2f);
		ConstructorDemo cdemo2 = new ConstructorDemo(2,45); //actual
		// ConstructorDemo cdemo5 = new ConstructorDemo();
		// ConstructorDemo copyCon = new ConstructorDemo(cdemo2);
		// cdemo2.showData();
		// copyCon.showData();

		//day26 method2 of  copy constructor
		ConstructorDemo copyCon2 = new ConstructorDemo();
		copyCon2.a = cdemo2.a; //variable = variable Charmi -> name= Charmi Charmi.name Charmi.age Charmi.gender
		copyCon2.b = cdemo2.b;
		cdemo2.showData();
		copyCon2.showData();
		// System.out.println(cdemo.a);
		// int i = cdemo5.getA(); //explicit
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