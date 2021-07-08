class Parent {
	void testMethod(){
		System.out.println("This is test method");
	}
	void show(){ 
		System.out.println("This is show method");
	}
}

class Child extends Parent{
	void show(){ 
		System.out.println("This is show method of Child class");
	}
} 

class InheritanceDemo{
	public static void main(String[] param) {
		Child c = new Child();
		c.show();
		c.testMethod();
	}
}