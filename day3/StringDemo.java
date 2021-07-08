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
		// System.out.println("My name is : " +fullName);

		//String length
		// int nameLength = fullName.length();
		// System.out.println("Length of my name is : "+nameLength);
		// System.out.println("index of a is : "+fullName.indexOf('a'));
		// System.out.println("index of a after index5 is : "+fullName.indexOf('a',5));
		// System.out.println("index of Ch is : "+fullName.indexOf("Ch"));

		// System.out.println("Character on 6th index : "+fullName.charAt(6));

		// char space = fullName.charAt(6);
		// System.out.println("Length of space is : "+space);

		//day6 task
		char[] space = {fullName.charAt(6)};
		String spaceStr = new String(space);	
		// System.out.println("Length of space is : "+spaceStr.length());

		//day7
		// a = 97
		// A = 65
		// b = 98
		// B = 66
		String s1 = "abc";
		String s2 = "aBc";
		// System.out.println("compareTo method : "+s1.compareTo(s2)); // s1 - s2  97 - 65 = 32
		// System.out.println("compareTo method : "+s2.compareTo(s1)); // s2 - s1  65 - 97 = -32


		String str1 = "JavaScrip";
        String str2 = "javascript";
        String str3 = "javAScRipt";
        String str4 = "JAVASCRIPT";

        // System.out.println("String str1 & str3 Comparing: " + str1.compareTo(str2));
        // System.out.println("String str1 & str4 Comparing: " + str1.compareTo(str4));
        // System.out.println("String str1 & str3 Comparing with Ignore Case : " + str1.compareToIgnoreCase(str3));
        // System.out.println("String str3 & str1 Comparing with Ignore Case : " + str3.compareToIgnoreCase(str1));


        String hName = "Hemant ";
        // System.out.println("hName has he " + hName.contains("he")); //returns boolean
        // System.out.println("hName has He " + hName.contains("He")); //returns boolean
        System.out.println("hName endsWith He " + hName.endsWith("He")); //returns boolean
        System.out.println("hName endsWith   " + hName.endsWith(" ")); //returns boolean

	}

}