class ProjectData{
	// //static block
	// static{ //run before main method
	// 	System.out.println("Static block");
	// }

	int enroll;
	String nameOfStu;
	static String project = "Java";  //one time memory allocation

	ProjectData(int en, String name){
		enroll = en;
		nameOfStu = name; 
	}

	void showData(){
		System.out.println("Enroll is : "+enroll+" Name is : "+nameOfStu+" Project is : "+project);
	}

}
class StaticDemo{	
	// static int a;
	// static{ //run before main method - call when class load
	// 	a = 10;
	// 	// System.out.println("Static block");
	// }
	public static void main(String[] param) {

		// day28 static keyword - one time memory allocation
		// 1) variable - class variables
		// 2) class
		// 3) method - class methods
		// 4) block
		
		// System.out.println(a);

		ProjectData pd = new ProjectData(1,"Charmi"); // new memory alloacte
		pd.showData();
		ProjectData pd1 = new ProjectData(2,"Pooja");
		pd1.showData();
		ProjectData pd2 = new ProjectData(3,"Dhara");
		pd2.showData();
	}
}