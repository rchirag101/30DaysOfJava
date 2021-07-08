class SimpleCounter{

	int cnt = 0;   // new new new  // 0 0 0 // 1 1 1 //instance 
	
	SimpleCounter(){
		cnt++; // 1 1 1 
	}

	void show(){
		System.out.println(cnt);
	}
}

// static method ma non-static access : NO
// non-static ma method ma static variable access : YES

class StaticCounter{

	static int cnt = 0;
	
	// StaticCounter(){
	// 	cnt++; // 1 2 3 
	// }

	static void show(){
		cnt++;
		System.out.println(cnt);
	}

	// static inner class
	static class Inner{
		void innerMethod(){
			System.out.println("\nin inner class value of cnt is : "+cnt);
		}
	}
}
class StaticCounterDemo{	
	// static int a = 10;
	public static void main(String[] param) { 
		
		System.out.println("without static variable");
		SimpleCounter smcnt1 = new SimpleCounter();  // 1
		smcnt1.show();
		SimpleCounter smcnt2 = new SimpleCounter(); // 1
		smcnt2.show();
		SimpleCounter smcnt3 = new SimpleCounter(); // 1
		smcnt3.show();

		System.out.println("\nwith static variable");
		StaticCounter stcnt1 = new StaticCounter();  // 1
		StaticCounter.show();  //Classname.methodName
		// // StaticCounter stcnt2 = new StaticCounter(); // 2
		StaticCounter.show();
		// // StaticCounter stcnt3 = new StaticCounter(); // 3
		StaticCounter.show();

		System.out.println("\nvalue of cnt is : "+StaticCounter.cnt); //Classname.variableName

		StaticCounter.Inner in = new StaticCounter.Inner();
		in.innerMethod();
		// in.show();
		// stcnt1.innerMethod();
	}
}
// return something 
// lift -> 7th floor 
// G to 3 
// 7 6 5 4 3 2 1 G -> 
// G floor press down 
// LED

// position of lift : static variable

// shared between all floors



// OOP concepts : encapsulation:















// There are several reasons for using nested classes, among them:

// It is a way of logically grouping classes that are only used in one place.

// It increases encapsulation.

// Nested classes can lead to more readable and maintainable code.

// Child to parent class connection is simpler as it visually illustrates the variables and methods of each class.