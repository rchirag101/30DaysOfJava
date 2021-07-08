class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

class MyExceptionDemo{
	public static void main(String param[]){
		int marks; 
		marks = 12;
		try{
			if(marks<33){
				throw new MyException("Fail");
			}else{
				System.out.println("Pass");	
			}
		}catch(MyException me){
			System.out.println(me.getMessage());
			System.out.println("Exception Occured");
		}finally{
			System.out.println("Finally block");
		}
	}	
}