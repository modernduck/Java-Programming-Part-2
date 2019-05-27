import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		
		for(int i = 0; i < 5 ; i ++) {
			System.out.print("Height in m?:");
			float a = number.nextFloat();
			float height = a * 100;
			System.out.println("Your height is " + height + "cm.");
		}
		
	}

}
