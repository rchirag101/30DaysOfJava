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
		int a,b;
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
		// for(a =0;a<4;a++){
		// 	// intArray2[a] = intArray1[a];
		// 	// sum = sum + intArray1[a];
		// 	sum += intArray1[a]; //shorthand
		// 	System.out.println("Sum is : "+sum);
		// }
		// System.out.println("Sum is : "+sum);
		// intArray2[] = {5,31,8,90};

		// for(a =0;a<4;a++){
		// 	System.out.println(intArray2[a]);
		// }
		// for(int intArray:intArray1){
		// 	System.out.println(intArray);
		// }


		// day21 : Single Dimensional Array in Java
		// dataType[] arr; (or)  
		// dataType []arr; (or)  
		// dataType arr[];  

		// multi- more than one Dimensional
		// dataType varName[] = new dataType[size];
		// dataType varName[][] = new dataType[rowSize][colSize];
		// dataType varName[][] = {{}};
		// | 1 2 3 |
		// | 4 5 6 |
		// | 7 8 9 |

		//row wise
		int matrix[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};

		int matrix1[][] = new int[3][3];
		int matrix2[][] = new int[3][3];
		// matrix1[0][0] = 1;
		// matrix1[0][1] = 2;
		// matrix1[0][2] = 3;
		// matrix1[1][0] = 1;
		// matrix1[1][0] = 1;
		int cnt = 0;
		for(a = 0;a<3;a++){ //0 1 2 3 4
			for(b=0;b<3;b++){ //0 1 2 3 4
				cnt++;
				matrix1[a][b] = cnt;
			}
		}
		for(a = 0;a<3;a++){ //0 1 2 3 4
			for(b=0;b<3;b++){ //0 1 2 3 4
				System.out.print(" "+matrix1[a][b]);
			}
			System.out.println();	
		}

		// 1 2 3   9 8 7    10 10 10
		// 4 5 6 + 6 5 4 =  10 10 10 
		// 7 8 9   3 2 1    10 10 10 

		System.out.println();	
		int cnt1 = 10;
		for(a = 0;a<3;a++){ 
			for(b=0;b<3;b++){ 
				cnt1--;
				matrix2[a][b] = cnt1;
				System.out.print(" "+matrix2[a][b]);
			}
			System.out.println();
		}

		int matrix3[][] = new int[3][3];	
		// matrix3[][] = matrix1[][] + matrix2[][];
		for(a = 0;a<3;a++){ 
			for(b=0;b<3;b++){ 
				matrix3[a][b] = matrix1[a][b] + matrix2[a][b];
				System.out.print(" "+matrix3[a][b]);
			}
			System.out.println();	
		}

		//task : matrix multliplication

		// jagged array
		int jagArr[][] = new int[3][];
		jagArr[0] = new int[3];  //0th row has 3 columns
        jagArr[1] = new int[4];  
        jagArr[2] = new int[2];


        int count = 0;  
        for (int i=0; i<jagArr.length; i++)  {
            for(int j=0; j<jagArr[i].length; j++){  
                jagArr[i][j] = count++;
            }
        }
        for(int i=0; i<jagArr.length; i++){  
            for (int j=0; j<jagArr[i].length; j++){  
                System.out.print(jagArr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
	}
}
