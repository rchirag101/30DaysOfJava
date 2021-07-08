class SuperHuman{
	void showSuper(){
		System.out.println("This is SuperHuman class");
	}
}
class Human extends SuperHuman{
	String name; 
	String gender;

	Human(String n){
		name = n;
		System.out.println("This is constructor");
	}
	// ambiguity
	Human(String name,String gender){
		this("Hello"); //call current class constructor
		// name = "Hello";
		//this.name = name;
		this.gender = gender;
	}
	void showName(){
		System.out.println("Name is : "+name);
	}
	void showData(){
		// super.showName();
		// showName(); or this.showName();
		System.out.println("Gender of "+name+" is : "+gender);
	}

}
class ThisDemo{	
	public static void main(String[] param) {
		Human h1 = new Human("Chirag","Male"); // h1.name,h1.gender - object  
		h1.showData();
		h1.showSuper();

		// SuperHuman sh = new SuperHuman();
		// sh.showSuper();
		// Human h2 = new Human("Hemant","Male");
		// h2.showData();
		// Human h3 = new Human("Charmi");
		// h3.showName();
 	}
}

// Here is given the 6 usage of java this keyword.

// this can be used to refer current class instance variable.
// this can be used to invoke current class method (implicitly)
// this() can be used to invoke current class constructor.
// this can be passed as an argument in the method call.
// this can be passed as argument in the constructor call.
// this can be used to return the current class instance from the method.