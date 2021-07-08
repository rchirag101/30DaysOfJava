class FinalMethodDemo{
	int a;
	void show(int a){ //formality
		this.a = a;  //refer
		// a = 5;
		// System.out.println("parent class");
		System.out.println("value of a is : "+a);
	}
}
class FinalMethodDemo2 extends FinalMethodDemo{
	void show(){
		// super.show();
		System.out.println("child class "+super.a);	
	}
}

class FinalDemo{	
	public static void main(String[] param) { 
		// Final keyword 
		// • variable - constants
		// • method
		// • class

		// final variable means constant 
		// final String COLLEGENAME = "MK College";
		// System.out.println(COLLEGENAME);

		// final double PI = 3.14;
		// System.out.println(PI);

		// COLLEGENAME = "GEC"; // it gives an error
		// System.out.println(COLLEGENAME);

		// parent = parent reference - I am dad/mom
		FinalMethodDemo fmd = new FinalMethodDemo();
		fmd.show(50);
		
		// parent = child reference - this is my son/daughter
		// FinalMethodDemo fmd1 = new FinalMethodDemo2();
		// fmd1.show();
		
		// child = child reference - I am chirag 
		// use this approach
		// FinalMethodDemo2 fmd2 = new FinalMethodDemo2();
		// fmd2.show();

		// child = parent reference - he/she is my father/mother 
		// FinalMethodDemo2 fmd3 = new FinalMethodDemo();
		// fmd3.show();
 	}
}


// use of final
// to stop variable value change - variable
// to stop override - method
// to stop inheritance - class