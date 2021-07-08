abstract class AbstractClass{	

	abstract void getMilk(); //0-100%
	void show(){
		System.out.println("This is instance method of abstract class");
	}
}

abstract class AbstractChildClass extends AbstractClass{

	// void show(){
	// 	// super.getMilk();
	// 	super.show();
	// 	System.out.println("take money\n\n");
	// }	
}

class Sibling extends AbstractChildClass{
	void getMilk(){
		// super.getMilk();
		System.out.println("take money");
		System.out.println("take money");
		System.out.println("go outside");
		System.out.println("go to shop");
		System.out.println("buy milk");
	}	
}

class AbstractDemo{	
	public static void main(String[] param) {
		// parent - parent will not work
		// AbstractClass ac = new AbstractClass();
		// ac.getMilk();

		// AbstractChildClass acc = new AbstractChildClass();
		// acc.getMilk();

		// AbstractClass ac = new AbstractChildClass();
		// ac.getMilk();
		// ac.show();

		Sibling sb  = new Sibling();
		sb.getMilk();

		AbstractClass ab = new Sibling();
		ab.show();
 	}
}

// abstract class/method can be define using abstract keyword
// abstract class does not provide 100% abstraction
// can't create direct object of abstract class