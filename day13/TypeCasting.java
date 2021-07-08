class TypeCasting{
	public static void main(String[] param){
		// int i = 10;
		// double d = i; //Widening 
		// System.out.println("int variable is : "+i);
		// System.out.println("double variable is : "+d);
		// glass na pani ne tapeli ma nakhvu 

		// double d = 10.25; //narrowing 
		// int i = (int) d; //(type) varibleName
		// System.out.println("double variable is : "+d);
		// System.out.println("int variable is : "+i);
		
		// int a = 65;
		// char c = (char)a; // int to char -> narrowing
		
		char c = '$'; //char to int -> widening
		int a = c;
		System.out.println("char variable is : "+a);

		// tapeli ma pani chhe ene glass ma nakhvu chhe
		// for(int i = 'A';i<='Z';i++){//a b c d ,Z=90
		// 	char x = (char)i;
		// 	System.out.println("int variable is : "+i);
		// 	System.out.println("char variable is : "+x);
		// }

	}
}
