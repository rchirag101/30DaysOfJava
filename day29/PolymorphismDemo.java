// two types : runtime and compile time

class Parent{
	
	void show(){
		System.out.println("Show method of Parent class");
	}

}

class Child extends Parent{
	
	void show(){
		System.out.println("Show method of child class");
	}

	int show(String name){
		System.out.println("Name is : "+name);
		return 0;
	}
	String show(String name,int a){
		System.out.println("Name is : "+name);
		return "Hello";
	}
}

class PolymorphismDemo{
	public static void main(String param[]){
		Child ch = new Child();
		ch.show();
		ch.show("Chirag");
		// compiler

		Parent p = new Child();
		p.show();
		//JVM
	}
}


// method overloading - same class same method name but return type and parameters are different

// method overiding - different class, method name same, parameters same return type same