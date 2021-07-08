abstract class Student{
	abstract String getName();
	void show(){

	}
}

class Charmi extends Student{ 
	String getName(){
		return "Charmi";
	}
}

class Pooja extends Student{ 
	String getName(){
		return "Pooja";
	}
}

class Dhara extends Student{ 
	String getName(){
		return "Dhara";
	}
}

class AbstractDemo2{	
	public static void main(String[] param) {
		Charmi c = new Charmi();
		System.out.println(c.getName());

		Pooja p = new Pooja();
		System.out.println(p.getName());
		
		Dhara d = new Dhara();
		System.out.println(d.getName());
 	}
}
