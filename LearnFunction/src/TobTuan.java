import java.util.Scanner;
import java.lang.Math;
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
	
	public static int findMinAdvance(int a, int b, int c) {
		int min1 = Math.min(a, b);
		int min2 = Math.min(min1, c);
		return min2;
	}
	
	public static int findMaxAdvance(int a, int b ,int c) {
		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		return max2;
	}
	
	public static int power2(int base) {
		return base * base;
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
		
		int min = findMinAdvance(firstInput, secondInput, thirdInput);
		int max = findMaxAdvance(firstInput, secondInput, thirdInput);
		System.out.println("Min number is " + min + " max number is " + max);
		System.out.print("Demonstrate power2() what's base number?:");
		int inputBase = number.nextInt();
		int answer = power2(inputBase);
		System.out.print("power2(" + inputBase + ") is " + answer);
	}

}
