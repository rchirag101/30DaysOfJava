//day37
import java.util.Scanner;

class ExceptionDemo {

	public static void main(String param[]){

		try{
			Scanner sc = new Scanner(System.in);
		
			int an = 10, b;

			System.out.println("Value of a is : "+ an);
			System.out.println("Enter value of b : ");
			b = sc.nextInt();
			
			int c = an / b;

			System.out.println(c);
			System.out.println("after exceptionDemo ");

		}
		catch(Exception e){
			System.out.println("Cannot divide by zero");
		}


		



		// int arr[] = new int[3];
		// // we declared array with type of int, and size of 3
		
		// arr[1] = 2;
		// arr[2] = 3;
		// // arr[3] = 4;

		// for(int a : arr){
		// 	System.out.println(a);
		// }



	}
}


// rules 
// code
// syntax 
// program
// ema koik place par error -> truti , bhul, khot etc
// error 
// compile time error
// run time error->Exception

// Exception handling
// try,catch, throw, throws, finally

// try : 
// catch : 

// compile time handle:hard detect:easy
// run time handle:easy detect:hard
