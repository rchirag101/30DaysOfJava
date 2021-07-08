class ConditionDemo{
	public static void main(String[] param){
		boolean check = false;
		// if(check = true){
		// 	System.out.println("Inside if");
		// }
		// System.out.println(check);
		// if(check == false){
		// 	System.out.println("Inside if");
		// }

		int num = 11;
		int num2;
		// if(num == 5){
		// 	num2 = 12;
		// }else{
		// 	num2 = 20;
		// }	

		//ternary operator 	?: shorthand for if-else
		// var = condition?ifTrue:ifFalse;
		// num2 = (num == 5)?12:20;
		// System.out.println(num2);

		// if-else if else
		// if(num == 5){ //rajbhog then bring it 
		// 	System.out.println("value is 5");
		// }else if(num == 10){ //if not rajbhog then casata
		// 	System.out.println("value is 10");
		// }else{ //if not rajbhog and not casata then bring vanilla
		// 	System.out.println("value is no 5 or 10");
		// }

		int sscPr = 80;
		int hscPr = 60;

		//day13

		if(sscPr <60){
			System.out.println("now let's check hsc marks");
			if(hscPr>55){
				System.out.println("you are eligible");
			}else{
				System.out.println("your scc marks are good but hsc marks are not good");
			}
		}else{
			System.out.println("you are not eligible");
		}

	}
}