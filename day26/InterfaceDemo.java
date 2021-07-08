// class extends class
// class implements interface
// interface extends interface

interface Student{
	String getName();
}

interface Demo{
	String getName();
}

interface Charmi extends Student,Demo{  
	// public String getName(){
	// 	return "Charmi";
	// }
	void show();
}
class Sibling implements Charmi{

	public void show(){
		// System.out.println("Show method of Sibling class");
	}

	public String getName(){
		return "Sibling";
	}
}
class Pooja implements Student{ 
	public String getName(){
		return "Pooja";
	}
	public void show(){

	}
}

class Dhara implements Student{ 
	public String getName(){
		return "Dhara";
	}
	public void show(){

	}
}


class Chirag extends Sibling implements Student, Charmi { 
	//class className extends className implements interface(s)Name
	//class className implements interface(s)Name
	public void show(){
		System.out.println("Chirag class");
	}

	public String getName(){
		return "Chirag";
	}
}

class InterfaceDemo{	
	public static void main(String[] param) {
		Charmi c = new Sibling();
		System.out.println(c.getName());

		Pooja p = new Pooja();
		System.out.println(p.getName());
		
		Student d = new Dhara();
		System.out.println(d.getName());

		Chirag ch = new Chirag();
		ch.show();
		System.out.println(ch.getName());
 	}
}