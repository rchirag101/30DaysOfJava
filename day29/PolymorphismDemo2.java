class Shape{
	int a = 10;
	void draw(){
		System.out.println("drawing in shape class");
	}
}

class Circle extends Shape{
	int a = 20;
	void draw(){
		System.out.println("drawing in Circle class");
	}	
}

class Square extends Shape{
	int a = 30;
	void draw(){
		System.out.println("drawing in Square class");
	}
}

class PolymorphismDemo2{
	public static void main(String param[]){

		/*Shape s;

		s = new Shape();
		s.draw();
		System.out.println(s.a);
		
		s = new Circle();
		s.draw();
		System.out.println(s.a);


		s = new Square();
		s.draw();
		System.out.println(s.a);
*/
		Shape s1 = new Shape();
		s1.draw();
		System.out.println(s1.a);

		Circle c = new Circle();
		c.draw();
		System.out.println(c.a);
		
		Square sq = new Square();
		sq.draw();
		System.out.println(sq.a);
		// dynamic method dispatch
	}
}