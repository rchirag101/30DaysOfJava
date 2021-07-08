import java.util.Scanner;

class ScannerDemo{
	
	public static void main(String[] param){
		
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter your name : ");
		String name = sc.next(); //object.method
		// String name = sc.nextLine();	 //object.method

		System.out.println("Entered name is : "+name);

	}
}
