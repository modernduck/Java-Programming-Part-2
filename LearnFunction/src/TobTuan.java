import java.util.Scanner;
public class TobTuan {

	public static int findMin(int a, int b, int c) {
		if(a > b) {
			if( b > c) {
				return c;
			}else {
				return b;
			}
		}else if(a < b) {
			if( a > c) {
				return c;
			}else {
				return a;
			}
		}else {
			if( b > c) {
				return c;
			}else {
				return b;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("First number?:");
		int firstInput = number.nextInt();
		System.out.print("second number?:");
		int secondInput = number.nextInt();
		System.out.print("Third number?:");
		int thirdInput = number.nextInt();
		
		int min = findMin(firstInput, secondInput, thirdInput);
		System.out.print("Min number is " + min);
		
	}

}
