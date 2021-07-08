class Counter{

	static int cnt = 0;   // new new new  // 0 0 0 // 1 1 1
	
	Counter(){
		cnt++; // 1 2 3 
		System.out.println(cnt);
	}

}
class StaticCounterDemo{	
	public static void main(String[] param) {
		Counter cnt = new Counter();  // 1
		Counter cnt2 = new Counter(); // 2
		Counter cnt3 = new Counter(); // 3
	}
}
// return something 
// lift -> 7th floor 
// G to 3 
// 7 6 5 4 3 2 1 G -> 
// G floor press down 
// LED

// position of lift : static variable

// shared between all floors

