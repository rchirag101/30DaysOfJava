class ArrayDemo {
	public static void main(String[] param) {
		// what is an array? : multiple elements store karva mate 
		// variable ? 
		// group of elements whose data type is same
		// int a = 10;
		// int b = 20;
		// int c = 30;
		// int d = 40;

		// class of students 
		// everyone has name
		// charmi pooja dhara...
		// 60 students
		// teacher 60 names
		// name1 = ''
		// name2 = ''
		// name60 = ''
		// GTU -> enrollments 171360116007 171360116008 easy

		// dataType varName[] = new dataType[size];
		
		// char[] arrSample = {'E', 'A', 'S', 'Y', 'W', 'E', 'B'};
		int a;
		//method1
		int intArray1[] = {5,31,8,90};
		//method2
		int intArray2[] = new int[4]; // declaration //by default = 0
		// intArray2[0] = 10; //pattern 10 20 30 40 -> 
		intArray2[1] = 20;
		// intArray2[2] = 30;
		intArray2[3] = 40;
		// 5 + 31 + 8 + 90 =
		int sum = 0;
		for(a =0;a<4;a++){
			// intArray2[a] = intArray1[a];
			// sum = sum + intArray1[a];
			sum += intArray1[a]; //shorthand
			System.out.println("Sum is : "+sum);
		}
		// System.out.println("Sum is : "+sum);
		// intArray2[] = {5,31,8,90};

		for(a =0;a<4;a++){
			System.out.println(intArray2[a]);
		}
		// for(int intArray:intArray1){
		// 	System.out.println(intArray);
		// }
	}
}
