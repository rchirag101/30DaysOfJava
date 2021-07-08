//day39 finally
import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionDemo {

	public static void main(String param[]){
		Scanner sc = new Scanner(System.in);
	
		int an = 10, b;

		System.out.println("Value of a is : "+ an);
		System.out.println("Enter value of b : ");
	
		try{
	
			b = sc.nextInt(); 
			
			int c = an / b; // 10/0
			System.out.println(c);

			int arr[] = new int[3];

			arr[10] = 4;
			System.out.println(arr[3]);	

			// try{

			// 	arr[10] = 4;
			// 	System.out.println(arr[3]);	

			// }catch(ArrayIndexOutOfBoundsException ai){
			// 	System.out.println("Exception occured in array");
			// }
			// order of catch block
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
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




// nested try
// try with multiple catch