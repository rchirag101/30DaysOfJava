import java.io.*;

class Demo{
	void show() throws IOException{
		// System.out.println("Exception occured");	
		throw new IOException("Exception occured");
	}
}

class ThrowsDemo{
	
	public static void main(String param[]) throws IOException{
		// try{
			Demo d = new Demo();
			d.show();
		// }catch(Exception e){
		// 	System.out.println("Exception handled");	
		// }
		System.out.println("EOP");
	}
}
