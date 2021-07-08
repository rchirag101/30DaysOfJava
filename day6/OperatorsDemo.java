class OperatorsDemo{

	public static void main(String[] param){
		
		// Arithmetic : 		+ - * / % ++ --

		int a = 10;
		int b = 20;
		int c;
		c = a + b;  // expression :  operand operator operand
		c = a++; // expression :  operand operator 
		int d;
		d = b--; // expression :  operand operator
		// Relational : returns boolean
			/*
				== (equals to)
				!= (not equals to)
				> 
				<
				>= (greater than or equals to)
				<= (less than or equals to)
			*/
		// Bitwise
			/*
				& bitwise and 
				| bitwise or
				^ bitwise xor
				~ complement
				<< left shift 
				>> right shift
			*/ 
		// int i = 3000;

		// -------------------------------------
		// 128 	64 	32 	16 	8 	4 	2 	1
		// -------------------------------------
		// 0		0	0	0	0	1 	0 	1 = 5 
		// 0		0	0	1	0	1 	0 	0 = 5<<2 -> 20
		// 0		0	0	0	1	0 	1 	0 = 20>>1 -> 10

		int num = 10;

		System.out.println(~num);
		//shortcut
		/*
			Logic of << (left shift operator) 
				value<<bit = value*(2^bit)
				5<<1 is = 5*2^1 = 5*2 = 10 
				5<<2 is = 5*2^2 = 5*4 = 20
				5<<3 is = 5*2^3 = 5*8 = 40
				5<<4 is = 5*2^4 = 5*16 = 80
				5<<5 is = 5*2^5 = 5*32 = 160

			Logic of >> (right shift operator) 
				value>>bit = value/(2^bit)
				5>>1 is = 5/(2^1) = 5/2 = 10 
				5>>2 is = 5/(2^2) = 5/4 = 20
				5>>3 is = 5/(2^3) = 5/8 = 40
				5>>4 is = 5/(2^4) = 5/16 = 80
				5>>5 is = 5/(2^5) = 5/32 = 160


		//illustartion
		int num = 5;
		System.out.println("Original value : "+num);				 
		for(int i = 1;i<11;i++){
			System.out.println("\t"+num+"<<"+i+" is "+(num<<i));				 	
		}

		int num = 5;
		System.out.println("Original value : "+num);				 
		for(int i = 1;i<11;i++){
			System.out.println("\t"+num+">>"+i+" is "+(num>>i));				 	
		}

		*/	

		// int left = i<<2; // 20 
		// System.out.println(left);				 
		// int right = left>>1; // 10
		// System.out.println(right);				 

		// Logical : returns boolean 
				// &&  Logical and
				// || logical or 
				// ! logical not
		
		boolean ab = true;
		boolean cd = true;


		// true = 1
		// false = 0
		// A B A&&B A||B
		// 0 0  0    0
  //  		0 1  0    1
  //  		1 0  0    1
  //  		1 1  1    1


		// a = 11,b = 19
		// if((a>5) && (b>30)) {  // true && true = > true
		// 	System.out.println("Good");
		// }
		// Assignment
		/*
				=
				+= shorthand operators
				-=
				*=
				/=
				%=
				<<=
				>>=
				&=
				|=
				^=
		*/

		// int alpha = 25;
		// alpha = alpha + 5; //overwrite or update
		// alpha += 5; //30 + 5
		// System.out.println(alpha);
	}

}