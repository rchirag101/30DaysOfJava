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
		// for(start;condition;increment/decrement){
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


		//day14 pattern
		/*
			* 
			* * 
			* * * 
			* * * * 
			* * * * * 
		*/
		for(i=1;i<=5;i++){  
			for(j=1;j<=i;j++){  
				System.out.print("* ");  
			}  
			System.out.println();//new line  
		} 

		/*
			* * * * * * 
			* * * * * 
			* * * * 
			* * * 
			* * 
			*   
		*/ 
		// for(i=1;i<=5;i++){  
		// 	for(j=5;j>=i;j--){  
		// 		System.out.print("* ");  
		// 	}  
		// 	System.out.println();//new line  
		// }  
	}
}