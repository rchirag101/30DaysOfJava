class LoopsDemo{
	public static void main(String[] param){
		
		// what is loop? repeating 
		//repeatative
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");

		// Loops
		// 	for, while, do-while
		// for(start;condition;increment/decrement/steps){
		// 	//logic
		// }
		// start = 2017
		// end = 2021

		int i;
		int j;
		// infinite
		// for(i=2017;i<2021;i++){
		// 	for(j=2017;j<2021;j++){
		// 		System.out.println("i is :"+i+" and j is :"+j);
		// 	}
		// }

		// for(i = 2021;i>2017;i--){
		// 	System.out.println("revLife is Good");
		// }


		//day15 pattern
		/*
			* 
			* * 
			* * * 
			* * * * 
			* * * * *
			* * * * * * 
		*/
		/*for(i=1;i<=6;i++){   //row  
			for(j=1;j<=i;j++){  //column
				System.out.print("* ");  
			}  
			System.out.println();//new line  
		} 
*/

/*		System.out.println();
		
		for(i = 1; i<=6;i++){
			for(j = 6; j>=i;j--){
				System.out.print("* ");  
			}
			System.out.println();
		}

*/

/*
			* * * * * *  i = 6; i>=1;i--
			* * * * * 	 j = 6; j>=i;j--	
			* * * * 
			* * * 
			* * 
			*   
		*/ 
/*
		i = 0;
		while(i<5){ //5<5 -> false
			System.out.println(i); 
			i++; 
		}

		System.out.println(); 
		System.out.println("Value of i is : "+i);
		System.out.println(); 
		// i = 0;
		// do-while
		do{ //atleast one time execute the block
			System.out.println(i);  
			i++; 
		}while(i<5); //5<5 -> false*/



		// day16
/*		int ans = 0;
		System.out.println("Table of 10\n");  
		for(int a = 1;a<=10;a++){
			ans = 10*a;
			System.out.println("10 * "+a+" = "+ans);  
		}
*/


		// break and continue
/*		for(int a = 1;a<=10;a++){ //1
			if(a == 5) // 5 
				continue; //skip
			System.out.println(a);
			System.out.println("Hello");

			// else
				// continue; // 1 2 3 4 
		}
		System.out.println("Loop breaked");
*/

/*		i = 0;
		while(i<10){
			i++; 
			if(i == 5)
				continue; 	
			System.out.println(i); 
		}*/

		// switch-case - optimized if-else if - else
		// if(a>5)
		// else if(a==5)
		// else
		int a = 0;
		String name = "Chi";
		switch(a){
			case 0: // case value of variable:
				System.out.println("Switch is on");
				break;
			case 1:
				System.out.println("Switch is off");
				break;
			default:
				System.out.println("Switch-case example");
		}
		System.out.println("outside the Switch-case block");

	}
}