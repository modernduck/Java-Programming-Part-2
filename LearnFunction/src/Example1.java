
public class Example1 {

	public static void test() {
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
		System.out.println("THIS IS MY FIRST TEST FUNCTION");
	}
	
	public static int findMax(int a, int b) {
		if( a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============testing na kub =======");
		//test();
		int max = findMax(999, 5);
		System.out.println("max is " + max);
	}

}
