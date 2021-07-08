//day39 finally
import java.util.Scanner;
import java.util.InputMismatchException;

class FinallyDemo {

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

			// arr[10] = 4;
			// System.out.println(arr[3]);	

		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error occured in array");	
			// e.printStackTrace();
		}
		finally{ //cleanup, closing connection
			sc.close();
			System.out.println("kai pan karo hu to execute thais j");
		}	

		try{}
		catch(InputMismatchException e){
			// e.printStackTrace();
			System.out.println("Wrong input");	
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Cannot divide by zero");	
		}
		catch(Exception e){
			// e.printStackTrace();
			System.out.println("Some error");	
		}
		
		System.out.println("hello");

	}
}

// try without catch but with finally
// try ma exception then jump to finally
// try ma exception exception handle then go to specific catch
// try success no exception then also go in finally 