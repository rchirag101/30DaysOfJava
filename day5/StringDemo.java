class StringDemo{

	public static void main(String[] param){
		//String creation
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

		// day7
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
        // System.out.println("hName endsWith He " + hName.endsWith("He")); //returns boolean
        // System.out.println("hName endsWith   " + hName.endsWith(" ")); //returns boolean

		// day8 String methods cont.
        // System.out.println("replaceAll method demo : " + hName.replaceAll("He","Shri"));
        // String newHName = hName.replaceAll("He","Shri");
        // System.out.println(hName);
        // System.out.println(newHName);

        //Case convert 
        String yourName = "Charmi Patel";
        // String lowerCaseYourName = yourName.toLowerCase(); // addition +
        // String upperCaseYourName = yourName.toUpperCase(); // minus -
        // System.out.println("yourName in lowercase: " + lowerCaseYourName);
        // System.out.println("yourName in lowercase: " + upperCaseYourName);
        // String subYourName = yourName.substring(3,6); // 1,6
        // String subYourName = yourName.substring(1,yourName.length()); // 1,6
        String subYourName = yourName.substring(yourName.indexOf("e")); 
        // System.out.println("part of string is : " + subYourName);


		/*
	        Y char -> "" 
	        Y String -> ""
	        Y char -> ''
	        N String -> ''
        */

		// day9  
		// trim method	        
	    // String nonTrimmedStr = " ABCD "; 
	    // String trimmedStr = nonTrimmedStr.trim();
     //    System.out.println("Non Trimmed string is : " + nonTrimmedStr);
     //    System.out.println("Trimmed string is : " + trimmedStr);
     //    System.out.println("Length of Non Trimmed string is : " + nonTrimmedStr.length());
     //    System.out.println("Length of Trimmed string is : " + trimmedStr.length());
	
        //equals method
		String string1 = "abc";
		String string2 = "abc";
		String string3 = new String("abc");

        System.out.println("String string1 & string3 Comparing: " + string1.compareTo(string3));
        System.out.println("String string1 & string2 Comparing: " + (string1==string2));
        System.out.println("String string1 & string3 Comparing: " + string1.equals(string3));


		String clgName = "MK";
		String myClgName = "MK";
		String thisClgName = "MK";


		// String numStr = "We have a number that is: "+ "1234"+"5678";
		// String numStr2 = "We have a number that is: "+ (1234 + 5678);
		// System.out.println(numStr);
		// System.out.println(numStr2);

	}

}