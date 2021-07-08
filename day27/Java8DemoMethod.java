interface InDemo{ //100% 
	// default void testMethod(){
	// 	System.out.println("This is test method of InDemo2 interface");
	// }
	void testMethod();
	//if we want body in method of interface then put default keyword
	// default void show(){ 
	// 	System.out.println("This is default method of InDemo class");
	// }
}

interface InDemo2{
	// default void testMethod(){
	// 	System.out.println("This is test method of InDemo2 interface");
	// }
	void testMethod();
	default void show(){ 
		System.out.println("This is default method of InDemo2 class");
	}
}

class Test implements InDemo, InDemo2{ 
	public void testMethod(){
		// super.testMethod();
		System.out.println("This is test method");
	}
	public void show(){
		// super.show();
		System.out.println("This is show method in Test class");
	}
}

class Java8DemoMethod{
	public static void main(String param[]){
		Test t = new Test(); //ref of child class
		t.testMethod();
		t.show();
		// t.show2();
	}
}


// java ma multiple inheritance supported nathi -> interface thi possible chhe 
// abstract/interface no obj. na bane -> we can make obj. but using its child class ref.
// interface ni methods no-body -> we can make it by default keyword 


// we can access methods of interface using obj. of child class

// we can't use super keyword

// jo koi method ne body rakhvi hoy interface ma to default keyword use karvo (Java8)
// in1 - default		in2 - default     same name but not implemented in child class => error
// in1 - default		in2 - default     same name but implemented in child class => no error and access method of child class
// in1 - no-body		in2 - no-body     same name but not implemented in child class => error
// in1 - no-body		in2 - no-body     same name but implemented in child class => no error and access method of child class
// in1 - body		in2 - no-body     same name but implemented in child class => no error and access method of child class
// in1 - no-body		in2 - body     same name but implemented in child class => no error and access method of child class