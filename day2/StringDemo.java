class StringDemo{

	public static void main(String[] param){
		//method1
		char[] arrSample = {'E', 'A', 'S', 'Y', 'W', 'E', 'B'};
		// System.out.println(arrSample);
		
		//method2
		String str = new String(arrSample);
		// System.out.println(str);

		//method3
		String myName = "Chirag";
		// System.out.println(myName);
		
		String mySurName = "Ramchandanee";

		//String Concatenation m1
		String name = myName + " " + mySurName;
		// System.out.println(name);

		//String Concatenation m2
		String fullName = myName.concat(" "+mySurName);
		System.out.println("My name is : " +fullName);

		//String length
		int nameLength = fullName.length();
		System.out.println("Length of my name is : "+nameLength);
		System.out.println("index of a is : "+fullName.indexOf('a'));
		System.out.println("index of a after index5 is : "+fullName.indexOf('a',5));
		System.out.println("index of Ch is : "+fullName.indexOf("Ch"));

		System.out.println("Character on 6th index : "+fullName.charAt(6));

		// char space = fullName.charAt(6);
		// System.out.println("Length of space is : "+space);


		//day7


	}

}