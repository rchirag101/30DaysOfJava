class Parent{
	Parent(){ //default 

	}
	Parent(String msg){
		System.out.println(msg);
	}
}
class Child extends Parent{
	Child(String msg){
		super(msg);
		// System.out.println(msg);
	}
}
class InheriteDemo{
	public static void main(String param[]){
		Child c = new Child("Hello");
	}
}